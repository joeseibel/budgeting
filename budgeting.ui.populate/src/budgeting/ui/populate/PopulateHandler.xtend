package budgeting.ui.populate

import budgeting.BudgetingUtil
import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.CardTransaction
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Month
import budgeting.budgeting.Year
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.List
import org.apache.commons.csv.CSVParser
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.window.Window
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode
import org.eclipse.xtext.util.concurrent.IUnitOfWork

import static extension java.lang.Integer.parseInt
import static extension org.eclipse.emf.ecore.util.EcoreUtil.getURI
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
			new ModelInfo(month.name.toString.toFirstUpper, year.name, year.library.categories.filter(ExpenseCategory).filter[
				!(month.actualEntries.findFirst[entry | entry.category == it] instanceof ActualAmountEntry)
			].map[URI -> name].toList)
		]
		
		val fileDialog = new FileDialog(event.activeShell, SWT.OPEN.bitwiseOr(SWT.APPLICATION_MODAL))
		fileDialog.filterExtensions = #["*.csv"]
		val fileName = fileDialog.open
		if (fileName != null) {
			try {
				switch parseResult : selectedOutlineNode.readOnly[parseCardFile(fileName, it as Month, modelInfo.year)] {
					String: MessageDialog.openError(event.activeShell, "Multiple Matches", parseResult)
					List<DialogTransaction>: if (parseResult.empty) {
						MessageDialog.openError(event.activeShell, "No Transactions", '''No cleared transactions for «modelInfo.monthName» «modelInfo.year» found in file.''')
					} else if (new PopulateDialog(event.activeShell, modelInfo.monthName, modelInfo.year, parseResult, modelInfo.categories).open == Window.OK) {
						populate(parseResult, selectedOutlineNode)
					}
				}
			} catch (IOException e) {
				MessageDialog.openError(event.activeShell, "IOException", e.message)
			}
		}
		null
	}
	
	override protected parseCardFileImpl(CSVParser parser, Month selectedMonth, int selectedYear) throws IOException {
		val filtered = parser.records.filter[get(STATUS_FIELD) == CLEARED_VALUE && !get(DEBIT_FIELD).empty && {
			val dateArray = get(DATE_FIELD).split("/")
			dateArray.head.parseInt == selectedMonth.name.ordinal + 1 && dateArray.last.parseInt == selectedYear
		}]
		try {
			filtered.map[
				val day = get(DATE_FIELD).split("/").get(1).parseInt
				val from = get(DESCRIPTION_FIELD).firstLine
				val amount = get(DEBIT_FIELD).toDollar
				
				val entryWithExistingTransaction = selectedMonth.actualEntries.filter(ActualTransactionEntry).findFirst[
					transactions.filter(CardTransaction).exists[it.day == day && it.from == from && it.amount == amount]
				]
				if (entryWithExistingTransaction == null) {
					val expenseCategories = selectedMonth.getContainerOfType(Year).library.categories.filter(ExpenseCategory)
					val matchingPatterns = new LinkedHashMap(expenseCategories.toInvertedMap[patterns.filter[from.matches(it)].toList].filter[category, patterns | !patterns.empty])
					if (matchingPatterns.empty) {
						new DialogTransaction(day, from, amount)
					} else if (matchingPatterns.size == 1) {
						new DialogTransaction(day, from, amount, matchingPatterns.keySet.head, false)
					} else {
						throw new MatchesMultiplePatternsException('''
							"«from»" matches multiple patterns:
								«FOR entry : matchingPatterns.entrySet»«FOR pattern : entry.value»
								«entry.key.name»: "«pattern»"«ENDFOR»«ENDFOR»''')
					}
				} else {
					new DialogTransaction(day, from, amount, entryWithExistingTransaction.category, true)
				}
			].toList
		} catch (MatchesMultiplePatternsException e) {
			e.message
		}
	}
	
	def private static populate(List<DialogTransaction> parseResult, EObjectNode selectedOutlineNode) {
		val transactionsByCategory = parseResult.filter[!alreadyEntered && category.key != null].groupBy[category.key]
		selectedOutlineNode.document.modify([XtextResource it |
			val month = resourceSet.getEObject(selectedOutlineNode.EObjectURI, true) as Month
			transactionsByCategory.forEach[categoryURI, transactions |
				val category = resourceSet.getEObject(categoryURI, true) as ExpenseCategory
				val entry = month.actualEntries.filter(ActualTransactionEntry).findFirst[it.category == category] ?: BudgetingFactory.eINSTANCE.createActualTransactionEntry => [
					it.category = category
					month.actualEntries += it
				]
				entry.transactions += transactions.map[toCardTransaction]
				val unsorted = new ArrayList(entry.transactions)
				entry.transactions.clear
				entry.transactions += unsorted.sortWith(BudgetingUtil.TRANSACTION_COMPARATOR)
			]
		] as IUnitOfWork.Void<XtextResource>)
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
		val int year
		val List<Pair<URI, String>> categories
	}
	
	private static class MatchesMultiplePatternsException extends RuntimeException {
		new(String message) {
			super(message)
		}
	}
}