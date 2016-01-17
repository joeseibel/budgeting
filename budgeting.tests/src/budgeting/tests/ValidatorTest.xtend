package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.BudgetingFile
import budgeting.validation.BudgetingValidator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
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
	def void testLibraryName() {
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
}