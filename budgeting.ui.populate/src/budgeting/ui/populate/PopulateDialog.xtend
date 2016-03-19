package budgeting.ui.populate

import java.text.NumberFormat
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.jface.dialogs.TitleAreaDialog
import org.eclipse.jface.layout.TableColumnLayout
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ColumnPixelData
import org.eclipse.jface.viewers.ColumnWeightData
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor
import org.eclipse.jface.viewers.EditingSupport
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Shell

package class PopulateDialog extends TitleAreaDialog {
	val static INTEGER_FORMAT = NumberFormat.instance
	val static DECIMAL_FORMAT = NumberFormat.instance => [
		minimumIntegerDigits = 2
		maximumIntegerDigits = 2
	]
	val static Pair<URI, String> DO_NOT_ENTER_CATEGORY = null -> "DO NOT ENTER"
	
	val String month
	val int year
	val List<DialogTransaction> transactions
	val List<Pair<URI, String>> categories
	
	new(Shell parentShell, String month, int year, List<DialogTransaction> transactions, List<Pair<URI, String>> categories) {
		super(parentShell)
		this.month = month
		this.year = year
		this.transactions = transactions
		this.categories = (categories + #[DO_NOT_ENTER_CATEGORY]).toList
	}
	
	override protected isResizable() {
		true
	}
	
	override isHelpAvailable() {
		false
	}
	
	override protected getInitialSize() {
		new Point(convertHorizontalDLUsToPixels(500), convertVerticalDLUsToPixels(300))
	}
	
	override protected configureShell(Shell newShell) {
		super.configureShell(newShell)
		newShell.text = "Credit Card Transactions"
	}
	
	override create() {
		super.create
		title = '''Transactions for «month» «year»'''
		validate
	}
	
	override protected createDialogArea(Composite parent) {
		super.createDialogArea(parent) as Composite => [
			initializeDialogUnits
			new Composite(it, SWT.NONE) => [
				layoutData = new GridData(SWT.FILL, SWT.FILL, true, true)
				val tableColumnLayout = new TableColumnLayout
				layout = tableColumnLayout
				new TableViewer(it, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION)) => [tableViewer |
					new TableViewerColumn(tableViewer, SWT.LEFT) => [
						column.text = "Day"
						tableColumnLayout.setColumnData(column, new ColumnPixelData(convertHorizontalDLUsToPixels(12), true, true))
						labelProvider = new ColumnLabelProvider {
							override getText(Object element) {
								(element as DialogTransaction).day.toString
							}
							
							override getForeground(Object element) {
								if ((element as DialogTransaction).alreadyEntered) {
									shell.display.getSystemColor(SWT.COLOR_GRAY)
								}
							}
						}
					]
					new TableViewerColumn(tableViewer, SWT.RIGHT) => [
						column.text = "Amount"
						tableColumnLayout.setColumnData(column, new ColumnPixelData(convertHorizontalDLUsToPixels(24), true, true))
						labelProvider = new ColumnLabelProvider {
							override getText(Object element) {
								val amount = (element as DialogTransaction).amount
								INTEGER_FORMAT.format(amount / 100) + "." + DECIMAL_FORMAT.format(amount % 100)
							}
							
							override getForeground(Object element) {
								if ((element as DialogTransaction).alreadyEntered) {
									shell.display.getSystemColor(SWT.COLOR_GRAY)
								}
							}
						}
					]
					new TableViewerColumn(tableViewer, SWT.LEFT) => [
						column.text = "Category"
						tableColumnLayout.setColumnData(column, new ColumnPixelData(convertHorizontalDLUsToPixels(56), true, true))
						labelProvider = new ColumnLabelProvider {
							override getText(Object element) {
								(element as DialogTransaction).category?.value
							}
							
							override getForeground(Object element) {
								if ((element as DialogTransaction).alreadyEntered) {
									shell.display.getSystemColor(SWT.COLOR_GRAY)
								}
							}
						}
						editingSupport = new EditingSupport(tableViewer) {
							override protected canEdit(Object element) {
								!(element as DialogTransaction).alreadyEntered
							}
							
							override protected getCellEditor(Object element) {
								new ComboBoxViewerCellEditor(tableViewer.table, SWT.READ_ONLY) => [
									contentProvider = ArrayContentProvider.instance
									labelProvider = new LabelProvider {
										override getText(Object element) {
											(element as Pair<URI, String>).value
										}
									}
									input = categories
								]
							}
							
							override protected getValue(Object element) {
								(element as DialogTransaction).category
							}
							
							override protected setValue(Object element, Object value) {
								(element as DialogTransaction).category = value as Pair<URI, String>
								tableViewer.update(element, null)
								validate
							}
						}
					]
					new TableViewerColumn(tableViewer, SWT.LEFT) => [
						column.text = "From"
						tableColumnLayout.setColumnData(column, new ColumnWeightData(1, true))
						labelProvider = new ColumnLabelProvider {
							override getText(Object element) {
								(element as DialogTransaction).from
							}
							
							override getForeground(Object element) {
								if ((element as DialogTransaction).alreadyEntered) {
									shell.display.getSystemColor(SWT.COLOR_GRAY)
								}
							}
						}
					]
					tableViewer.contentProvider = ArrayContentProvider.instance
					tableViewer.input = transactions
					tableViewer.table.linesVisible = true
					tableViewer.table.headerVisible = true
				]
			]
		]
	}
	
	def private validate() {
		errorMessage = if (transactions.exists[category == null]) {
			"Category must be set"
		}
		getButton(IDialogConstants.OK_ID).enabled = errorMessage == null
	}
}