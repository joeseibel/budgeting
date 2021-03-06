/*
 * generated by Xtext
 */
package budgeting.ui.quickfix

import budgeting.BudgetingUtil
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Year
import budgeting.validation.BudgetingValidator
import java.util.ArrayList
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

class BudgetingQuickfixProvider extends DefaultQuickfixProvider {
	@Fix(BudgetingValidator.DUPLICATE_PATTERNS)
	def void removeDuplicatePatterns(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove Duplicate Patterns", null, null, [element, context | element as ExpenseCategory => [
			val distinctPatterns = patterns.toSet
			patterns.clear
			patterns += distinctPatterns
		]])
	}
	
	@Fix(BudgetingValidator.MONTHS_OUT_OF_ORDER)
	def void orderMonths(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Order Months", null, null, [element, context | element as Year => [
			val unsorted = new ArrayList(months)
			months.clear
			months += unsorted.sortBy[name]
		]])
	}
	
	@Fix(BudgetingValidator.TRANSACTIONS_OUT_OF_ORDER)
	def void orderTransactions(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Order Transactions", null, null, [element, context | element as ActualTransactionEntry => [
			val unsorted = new ArrayList(transactions)
			transactions.clear
			transactions += unsorted.sortWith(BudgetingUtil.TRANSACTION_COMPARATOR)
		]])
	}
}