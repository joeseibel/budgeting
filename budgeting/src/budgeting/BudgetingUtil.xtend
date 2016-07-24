package budgeting

import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.CardTransaction
import budgeting.budgeting.CashTransaction
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Month
import budgeting.budgeting.Transaction
import java.util.Comparator
import java.util.OptionalLong

import static extension java.lang.Math.round

class BudgetingUtil {
	val public static Comparator<Transaction> TRANSACTION_COMPARATOR = [a, b |
		val bDay = b.day
		switch aDay : a.day {
			case null: switch bDay {
				case null: 0
				default: -1
			}
			case bDay == null: 1
			default: aDay.compareTo(bDay)
		}
	]
	
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
	
	def static OptionalLong getBudgetSum(Month month) {
		val amount = month.budgetEntries.map[
			val entryAmount = switch it {
				BudgetAmountEntry: OptionalLong.of(amount)
				BudgetFactorEntry: calculateAmount
			}
			if (category instanceof ExpenseCategory && entryAmount.present) {
				OptionalLong.of(-entryAmount.asLong)
			} else {
				entryAmount
			}
		]
		if (amount.forall[present]) {
			OptionalLong.of(amount.map[asLong].sum)
		} else {
			OptionalLong.empty
		}
	}
	
	def static long getActualSum(Month month) {
		val amounts = month.actualEntries.map[
			val entryAmount = switch it {
				ActualAmountEntry: amount
				ActualTransactionEntry: transactions.map[amount].sum
			}
			if (category instanceof ExpenseCategory) {
				-entryAmount
			} else {
				entryAmount
			}
		]
		amounts.sum
	}
	
	def static long sum(Iterable<Long> iterable) {
		iterable.fold(0L, [$0 + $1])
	}
	
	def private static double product(Iterable<Double> iterable) {
		iterable.fold(1.0, [$0 * $1])
	}
	
	def private static getDay(Transaction transaction) {
		switch transaction {
			CashTransaction: transaction.day
			CardTransaction: transaction.day
		}
	}
}