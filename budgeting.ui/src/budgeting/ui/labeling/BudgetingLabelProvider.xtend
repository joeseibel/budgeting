package budgeting.ui.labeling

import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.IncomeCategory
import budgeting.budgeting.Month
import budgeting.budgeting.Year
import budgeting.services.BudgetingGrammarAccess
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.jface.viewers.StyledString.Styler
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.xtext.ui.label.StylerFactory

import static extension budgeting.BudgetingUtil.calculateAmount

class BudgetingLabelProvider extends DefaultEObjectLabelProvider {
	val static Styler RED_STYLER = [foreground = Display.^default.getSystemColor(SWT.COLOR_RED)]
	
	val Styler italicRedStyler
	
	@Inject
	IValueConverterService converterService
	@Inject
	BudgetingGrammarAccess grammarAccess
	
	@Inject
	new(AdapterFactoryLabelProvider delegate, StylerFactory stylerFactory) {
		super(delegate)
		italicRedStyler = stylerFactory.createXtextStyleAdapterStyler(new TextStyle => [
			style = SWT.ITALIC
			color = new RGB(255, 0, 0)
		])
	}
	
	def StyledString text(ExpenseCategory expenseCategory) {
		new StyledString(expenseCategory.name, RED_STYLER)
	}
	
	def String text(Year year) {
		year.name.toString
	}
	
	def String text(Month month) {
		month.name.literal
	}
	
	def Object text(BudgetAmountEntry budgetAmountEntry) {
		switch category : budgetAmountEntry.category {
			case category.eIsProxy: "<unknown>: " + budgetAmountEntry.amount.toDollar
			IncomeCategory: category.name + ": " + budgetAmountEntry.amount.toDollar
			ExpenseCategory: new StyledString(category.name + ": ").append(budgetAmountEntry.amount.toDollar, RED_STYLER)
		}
	}
	
	def StyledString text(BudgetFactorEntry budgetFactorEntry) {
		val amount = budgetFactorEntry.calculateAmount
		val prefix = new StyledString((budgetFactorEntry.category.name ?: "<unknown>") + ": ")
		if (amount.present) {
			prefix.append(amount.asLong.toDollar, italicRedStyler)
		} else {
			prefix.append('''«budgetFactorEntry.baseEntry?.category?.name ?: "<unknown>"» * «budgetFactorEntry.factor»''', RED_STYLER)
		}
	}
	
	def Object text(ActualAmountEntry actualAmountEntry) {
		switch category : actualAmountEntry.category {
			case category.eIsProxy: "<unknown>: " + actualAmountEntry.amount.toDollar
			IncomeCategory: category.name + ": " + actualAmountEntry.amount.toDollar
			ExpenseCategory: new StyledString(category.name + ": ").append(actualAmountEntry.amount.toDollar, RED_STYLER)
		}
	}
	
	def StyledString text(ActualTransactionEntry actualTransactionEntry) {
		new StyledString((actualTransactionEntry.category.name ?: "<unknown>") + ": ").append(actualTransactionEntry.transactions.fold(0L, [$0 + $1.amount]).toDollar, italicRedStyler)
	}
	
	def private toDollar(long amount) {
		converterService.toString(amount, grammarAccess.dollarRule.name)
	}
}