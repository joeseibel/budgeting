package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.services.BudgetingGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class ValueConverterTest {
	@Inject
	IValueConverterService valueConverter
	@Inject
	BudgetingGrammarAccess grammarAccess
	
	@Test
	def void testValidToValue() {
		123L.assertEquals(valueConverter.toValue("1.23", grammarAccess.dollarRule.name, null))
		100L.assertEquals(valueConverter.toValue("1.00", grammarAccess.dollarRule.name, null))
	}
	
	@Test(expected=ValueConverterException)
	def void testTooLittleDigits() {
		valueConverter.toValue("1.0", grammarAccess.dollarRule.name, null)
	}
	
	@Test(expected=ValueConverterException)
	def void testTooManyDigits() {
		valueConverter.toValue("1.000", grammarAccess.dollarRule.name, null)
	}
	
	@Test
	def void testToString() {
		"1.23".assertEquals(valueConverter.toString(123L, grammarAccess.dollarRule.name))
		"0.00".assertEquals(valueConverter.toString(0L, grammarAccess.dollarRule.name))
		"0.01".assertEquals(valueConverter.toString(1L, grammarAccess.dollarRule.name))
		"0.10".assertEquals(valueConverter.toString(10L, grammarAccess.dollarRule.name))
		"1.00".assertEquals(valueConverter.toString(100L, grammarAccess.dollarRule.name))
	}
}