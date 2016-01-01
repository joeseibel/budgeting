package budgeting.resource

import budgeting.budgeting.ActualEntry
import budgeting.budgeting.BudgetEntry
import budgeting.budgeting.BudgetingPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DefaultLocationInFileProvider

class BudgetingLocationInFileProvider extends DefaultLocationInFileProvider {
	override protected getIdentifierFeature(EObject obj) {
		switch obj {
			BudgetEntry: BudgetingPackage.eINSTANCE.budgetEntry_Category
			ActualEntry: BudgetingPackage.eINSTANCE.actualEntry_Category
			default: super.getIdentifierFeature(obj)
		}
	}
}