package budgeting.ui.populate

import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.CardTransaction
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
package class DialogTransaction {
	val int day
	val String from
	val long amount
	//TODO: Store URI instead of String
	String category
	
	def CardTransaction toCardTransaction() {
		BudgetingFactory.eINSTANCE.createCardTransaction => [
			it.amount = amount
			it.day = day
			it.from = from
		]
	}
}