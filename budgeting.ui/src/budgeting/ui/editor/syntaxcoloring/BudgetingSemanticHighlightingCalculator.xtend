package budgeting.ui.editor.syntaxcoloring

import budgeting.budgeting.ActualEntry
import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.ExpenseCategory
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor

class BudgetingSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	override protected highlightElement(EObject object, IHighlightedPositionAcceptor acceptor) {
		switch object {
			ExpenseCategory: {
				highlightFeature(acceptor, object, BudgetingPackage.eINSTANCE.category_Name, BudgetingHighlightingConfiguration.EXPENSE_ID)
				true
			}
			BudgetAmountEntry case object.category instanceof ExpenseCategory: {
				highlightFeature(acceptor, object, BudgetingPackage.eINSTANCE.budgetEntry_Category, BudgetingHighlightingConfiguration.EXPENSE_ID)
				true
			}
			BudgetFactorEntry: {
				if (object.category instanceof ExpenseCategory) {
					highlightFeature(acceptor, object, BudgetingPackage.eINSTANCE.budgetEntry_Category, BudgetingHighlightingConfiguration.EXPENSE_ID)
				}
				if (object.baseEntry?.category instanceof ExpenseCategory) {
					highlightFeature(acceptor, object, BudgetingPackage.eINSTANCE.budgetFactorEntry_BaseEntry, BudgetingHighlightingConfiguration.EXPENSE_ID)
				}
				true
			}
			ActualEntry: {
				if (object.category instanceof ExpenseCategory) {
					highlightFeature(acceptor, object, BudgetingPackage.eINSTANCE.actualEntry_Category, BudgetingHighlightingConfiguration.EXPENSE_ID)
				}
				true
			}
			default: false
		}
	}
}