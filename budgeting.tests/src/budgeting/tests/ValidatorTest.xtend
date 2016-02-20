package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.BudgetingFile
import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.Library
import budgeting.budgeting.Year
import budgeting.validation.BudgetingValidator
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.validation.ValidatorTester
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class ValidatorTest {
	@Inject
	extension ParseHelper<BudgetingFile>
	@Inject
	extension ValidationTestHelper
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
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
			assertAll(AssertableDiagnostics.warning(null, 'Duplicate pattern "pattern1"'),
				AssertableDiagnostics.warning(null, 'Duplicate pattern "pattern1"'),
				AssertableDiagnostics.warning(null, 'Duplicate pattern "pattern4"'),
				AssertableDiagnostics.warning(null, 'Duplicate pattern "pattern4"')
			)
		]
	}
	
	@Test
	def void testCheckPatternDuplicatedInMultipleCategories() {
		'''
			library lib1 {
				expense expense1 ["pattern1"]
				expense expense2 ["pattern1"]
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSetProvider.get) as Library => [
			2.assertEquals(validate.size)
			categories.head.assertError(BudgetingPackage.eINSTANCE.expenseCategory, null, 'Pattern "pattern1" found in multiple categories')
			categories.last.assertError(BudgetingPackage.eINSTANCE.expenseCategory, null, 'Pattern "pattern1" found in multiple categories')
		]
	}
	
	@Test
	def void testCheckYearName() {
		'''
			2016 uses lib1 {
			}
		'''.parse => [
			tester.validate(it) => [
				assertDiagnosticsCount(1)
				assertError(null, '"2016" does not match filename "__synthetic0"')
			]
		]
	}
	
	@Test
	def void testCheckYearNameRange() {
		'''
			5 uses lib1 {
			}
		'''.parse(URI.createURI("5." + fileExtension), resourceSetProvider.get) => [
			tester.validate(it) => [
				assertDiagnosticsCount(1)
				assertWarning(null, 'Check year "5". It seems to be too early')
			]
		]
		
		val futureYear = java.time.Year.now.value + 10
		'''
			«futureYear» uses lib1 {
			}
		'''.parse(URI.createURI(futureYear + "." + fileExtension), resourceSetProvider.get) => [
			tester.validate(it) => [
				assertDiagnosticsCount(1)
				assertWarning(null, '''Check year "«futureYear»". It seems to be too late''')
			]
		]
	}
	
	@Test
	def void testCheckDuplicateMonths() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet)
		'''
			2016 uses lib1 {
				january budget {
				} actual {
				}
				
				january budget {
				} actual {
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			2.assertEquals(validate.size)
			months.head.assertError(BudgetingPackage.eINSTANCE.month, null, 'Duplicate month "january"')
			months.last.assertError(BudgetingPackage.eINSTANCE.month, null, 'Duplicate month "january"')
		]
	}
	
	@Test
	def void testCheckMonthOrdering() {
		'''
			2016 uses lib1 {
				february budget {
				} actual {
				}
				
				january budget {
				} actual {
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSetProvider.get) => [
			tester.validate(it) => [
				assertDiagnosticsCount(1)
				assertWarning(null, "Month entries are out of order")
			]
		]
	}
	
	@Test
	def void testCheckActualEntriesInFutureMonth() {
		val futureYear = java.time.Year.now.value + 1
		'''
			«futureYear» uses lib1 {
				december budget {
				} actual {
					expense1: 10.00
				}
			}
		'''.parse(URI.createURI(futureYear + "." + fileExtension), resourceSetProvider.get) as Year => [
			months.head => [
				tester.validate(it) => [
					assertDiagnosticsCount(1)
					assertError(null, '"december" contains actual entries even though it is in the future')
				]
			]
		]
	}
}