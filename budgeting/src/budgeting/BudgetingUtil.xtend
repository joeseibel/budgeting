package budgeting

import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import java.util.OptionalLong

import static extension java.lang.Math.round

class BudgetingUtil {
	def static OptionalLong calculateAmount(BudgetFactorEntry budgetEntry) {
		val factorEntries = newArrayList(budgetEntry)
		var cycleFound = false
		while (!cycleFound && !factorEntries.last.baseEntry.eIsProxy && factorEntries.last.baseEntry instanceof BudgetFactorEntry) {
			if (factorEntries.contains(factorEntries.last.baseEntry)) {
				cycleFound = true
			} else {
				factorEntries += factorEntries.last.baseEntry as BudgetFactorEntry
			}
		}
		if (cycleFound || factorEntries.last.baseEntry.eIsProxy) {
			OptionalLong.empty
		} else {
			val totalFactor = factorEntries.map[factor].product
			val amount = totalFactor * (factorEntries.last.baseEntry as BudgetAmountEntry).amount
			OptionalLong.of(amount.round)
		}
	}
	
	def static Double product(Iterable<Double> iterable) {
		iterable.reduce[$0 * $1]
	}
}