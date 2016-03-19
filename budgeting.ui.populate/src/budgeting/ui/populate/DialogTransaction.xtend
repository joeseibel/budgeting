package budgeting.ui.populate

import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.CardTransaction
import budgeting.budgeting.Category
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors

import static extension org.eclipse.emf.ecore.util.EcoreUtil.getURI

@Accessors
package class DialogTransaction {
	val int day
	val String from
	val long amount
	val boolean alreadyEntered
	Pair<URI, String> category
	
	new(int day, String from, long amount) {
		this.day = day
		this.from = from
		this.amount = amount
		alreadyEntered = false
	}
	
	new(int day, String from, long amount, Category category, boolean alreadyEntered) {
		this.day = day
		this.from = from
		this.amount = amount
		this.category = category.URI -> category.name
		this.alreadyEntered = alreadyEntered
	}
	
	def CardTransaction toCardTransaction() {
		BudgetingFactory.eINSTANCE.createCardTransaction => [
			it.amount = amount
			it.day = day
			it.from = from
		]
	}
}