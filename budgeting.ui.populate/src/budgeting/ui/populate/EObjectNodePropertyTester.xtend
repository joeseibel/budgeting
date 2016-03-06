package budgeting.ui.populate

import budgeting.budgeting.BudgetingPackage
import org.eclipse.core.expressions.PropertyTester
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode

class EObjectNodePropertyTester extends PropertyTester {
	override test(Object receiver, String property, Object[] args, Object expectedValue) {
		switch receiver {
			EObjectNode case property == "isMonth": receiver.EClass == BudgetingPackage.eINSTANCE.month
			default: false
		}
	}
}