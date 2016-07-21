package budgeting.ui

import budgeting.services.BudgetingGrammarAccess
import budgeting.ui.internal.BudgetingActivator
import org.eclipse.xtext.conversion.IValueConverterService

class BudgetingUiUtil {
	val static INJECTOR = BudgetingActivator.instance.getInjector(BudgetingActivator.BUDGETING_BUDGETING)
	val static CONVERTER_SERVICE = INJECTOR.getInstance(IValueConverterService)
	val static GRAMMAR_ACCESS = INJECTOR.getInstance(BudgetingGrammarAccess)
	
	def static String toDollar(long amount) {
		CONVERTER_SERVICE.toString(amount, GRAMMAR_ACCESS.dollarRule.name)
	}
}