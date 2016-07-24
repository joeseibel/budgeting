package budgeting.ui.views.summary

import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.Category
import budgeting.budgeting.MonthEnum
import budgeting.budgeting.Year
import java.util.OptionalLong
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.layout.TableColumnLayout
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.ColumnWeightData
import org.eclipse.jface.viewers.IStructuredContentProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IPartListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IXtextDocument

import static extension budgeting.BudgetingUtil.sum
import static extension budgeting.ui.BudgetingUiUtil.toDollar
import static extension org.eclipse.emf.ecore.util.EcoreUtil.getURI

class SummaryView extends ViewPart {
	TableViewer viewer
	
	val partListener = new IPartListener {
		override partActivated(IWorkbenchPart part) {
			if (part instanceof IEditorPart) {
				updateInput(part)
			}
		}
		
		override partBroughtToTop(IWorkbenchPart part) {
		}
		
		override partClosed(IWorkbenchPart part) {
		}
		
		override partDeactivated(IWorkbenchPart part) {
			if (part instanceof IEditorPart) {
				viewer.input = null
			}
		}
		
		override partOpened(IWorkbenchPart part) {
		}
	}
	
	override createPartControl(Composite parent) {
		val composite = new Composite(parent, SWT.NONE)
		val columnLayout = new TableColumnLayout
		composite.layout = columnLayout
		
		viewer = new TableViewer(composite)
		
		new TableViewerColumn(viewer, SWT.LEFT) => [column |
			columnLayout.setColumnData(column.column, new ColumnWeightData(1))
			column.labelProvider = new ColumnLabelProvider {
				override getText(Object element) {
					val document = viewer.input as IXtextDocument
					val categoryURI = element as URI
					document.readOnly[
						val category = resourceSet.getEObject(categoryURI, true) as Category
						category.name
					]
				}
			}
		]
		
		MonthEnum.values.forEach[monthEnum |
			new TableViewerColumn(viewer, SWT.RIGHT) => [column |
				columnLayout.setColumnData(column.column, new ColumnWeightData(1))
				column.column.text = monthEnum.name()
				column.labelProvider = new ColumnLabelProvider {
					override getText(Object element) {
						val document = viewer.input as IXtextDocument
						val tableCategoryURI = element as URI
						val amount = document.readOnly[
							val tableCategory = resourceSet.getEObject(tableCategoryURI, true) as Category
							val year = contents.head as Year
							val monthEntry = year.months.findFirst[name == monthEnum]
							val actualEntry = monthEntry?.actualEntries?.findFirst[category == tableCategory]
							switch actualEntry {
								ActualAmountEntry: OptionalLong.of(actualEntry.amount)
								ActualTransactionEntry: OptionalLong.of(actualEntry.transactions.map[amount].sum)
								default: OptionalLong.empty
							}
						]
						
						if (amount.present) {
							amount.asLong.toDollar
						} else {
							""
						}
					}
				}
			]
		]
		
		viewer.contentProvider = new IStructuredContentProvider {
			override getElements(Object inputElement) {
				val document = inputElement as IXtextDocument
				val categoryURIs = document?.readOnly[
					val library = (contents.head as Year)?.library
					library?.categories?.map[URI]
				]
				categoryURIs ?: emptyList
			}
		}
		
		viewer.table.headerVisible = true
		viewer.table.linesVisible = true
		
		updateInput(site.page.activeEditor)
		
		site.page.addPartListener(partListener)
	}
	
	override setFocus() {
		viewer.table.setFocus
	}
	
	override dispose() {
		site.page.removePartListener(partListener)
		super.dispose
	}
	
	def private updateInput(IEditorPart activeEditor) {
		viewer.input = if (activeEditor instanceof XtextEditor) {
			val activeDocument = activeEditor.document
			if (activeDocument.readOnly[contents.head instanceof Year]) {
				activeDocument
			}
		}
	}
}