package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.BudgetingFile
import budgeting.validation.BudgetingValidator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class ValidatorTest {
	@Inject
	extension ParseHelper<BudgetingFile>
	
	@Inject
	ValidatorTester<BudgetingValidator> tester
	
	@Test
	def void testCheckLibraryName() {
		'''
			library lib1 {
			}
		'''.parse => [
			tester.validate(it) => [
				assertDiagnosticsCount(1)
				assertError(null, '"lib1" does not match filename "__synthetic0"')
			]
		]
	}
	
	@Test
	def void testCheckPatternValidity() {
		tester.validate(BudgetingFactory.eINSTANCE.createExpenseCategory => [
			patterns += "("
		]) => [
			assertDiagnosticsCount(1)
			assertError(null, "Invalid pattern: Unclosed group")
		]
	}
	
	@Test
	def void testCheckDuplicatePatterns() {
		tester.validate(BudgetingFactory.eINSTANCE.createExpenseCategory => [
			patterns += #["pattern1", "pattern2", "pattern1", "pattern3", "pattern4", "pattern4"]
		]) => [
			assertDiagnosticsCount(4)
			assertAll(AssertableDiagnostics.warning(null, "Duplicate pattern 'pattern1'"),
				AssertableDiagnostics.warning(null, "Duplicate pattern 'pattern1'"),
				AssertableDiagnostics.warning(null, "Duplicate pattern 'pattern4'"),
				AssertableDiagnostics.warning(null, "Duplicate pattern 'pattern4'")
			)
		]
	}
}