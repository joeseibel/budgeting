package budgeting.ui.populate

import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Month
import budgeting.budgeting.Year
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader
import java.util.List
import org.apache.commons.csv.CSVParser
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode

import static extension java.lang.Integer.parseInt
import static extension org.eclipse.ui.handlers.HandlerUtil.getActiveShell
import static extension org.eclipse.ui.handlers.HandlerUtil.getCurrentSelection
import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

class PopulateHandler extends AbstractPopulateHandler {
	val static STATUS_FIELD = "Status"
	val static DATE_FIELD = "Date"
	val static DESCRIPTION_FIELD = "Description"
	val static DEBIT_FIELD = "Debit"
	val static CLEARED_VALUE = "Cleared"
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val selectedOutlineNode = (event.currentSelection as IStructuredSelection).firstElement as EObjectNode
		val modelInfo = selectedOutlineNode.readOnly[
			val month = it as Month
			val year = month.getContainerOfType(Year)
			new ModelInfo(month.name.toString.toFirstUpper, month.name.ordinal + 1, year.name, year.library.categories.filter(ExpenseCategory).map[name].toList)
		]
		
		val fileDialog = new FileDialog(event.activeShell, SWT.OPEN.bitwiseOr(SWT.APPLICATION_MODAL))
		fileDialog.filterExtensions = #["*.csv"]
		val fileName = fileDialog.open
		if (fileName != null) {
			try {
				val transactions = parseCardFile(fileName, modelInfo.monthNumber, modelInfo.year)
				if (transactions.empty) {
					MessageDialog.openError(event.activeShell, "No Transactions", '''No cleared transactions for «modelInfo.monthName» «modelInfo.year» found in file.''')
				} else {
					val dialog = new PopulateDialog(event.activeShell, modelInfo.monthName, modelInfo.year, transactions, modelInfo.categoryNames)
					dialog.open
				}
			} catch (IOException e) {
				MessageDialog.openError(event.activeShell, "IOException", e.message)
			}
		}
		null
	}
	
	override protected parseCardFileImpl(CSVParser parser, int selectedMonth, int selectedYear) throws IOException {
		val filtered = parser.records.filter[get(STATUS_FIELD) == CLEARED_VALUE && !get(DEBIT_FIELD).empty && {
			val dateArray = get(DATE_FIELD).split("/")
			dateArray.head.parseInt == selectedMonth && dateArray.last.parseInt == selectedYear
		}]
		filtered.map[new DialogTransaction(get(DATE_FIELD).split("/").get(1).parseInt, get(DESCRIPTION_FIELD).firstLine, get(DEBIT_FIELD).toDollar)].toList
	}
	
	def private static toDollar(String s) {
		Long.parseUnsignedLong(new StringBuilder(s).deleteCharAt(s.indexOf(".")).toString)
	}
	
	def private static getFirstLine(String s) {
		val reader = new BufferedReader(new StringReader(s))
		val firstLine = reader.readLine
		reader.close
		firstLine
	}
	
	@FinalFieldsConstructor
	private static class ModelInfo {
		val String monthName
		val int monthNumber
		val int year
		val List<String> categoryNames
	}
}