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
import budgeting.budgeting.ActualTransactionEntry

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
			assertAll(AssertableDiagnostics.warning(BudgetingValidator.DUPLICATE_PATTERNS, 'Duplicate pattern "pattern1"'),
				AssertableDiagnostics.warning(BudgetingValidator.DUPLICATE_PATTERNS, 'Duplicate pattern "pattern1"'),
				AssertableDiagnostics.warning(BudgetingValidator.DUPLICATE_PATTERNS, 'Duplicate pattern "pattern4"'),
				AssertableDiagnostics.warning(BudgetingValidator.DUPLICATE_PATTERNS, 'Duplicate pattern "pattern4"')
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
				assertWarning(BudgetingValidator.MONTHS_OUT_OF_ORDER, "Month entries are out of order")
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
		'''.parse as Year => [
			tester.validate(months.head) => [
				assertDiagnosticsCount(1)
				assertError(null, '"december" contains actual entries even though it is in the future')
			]
		]
	}
	
	@Test
	def void testCheckDuplicateBudgetEntries() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				income income2
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet)
		'''
			2016 uses lib1 {
				january budget {
					income1: 1.00
					income2: 2.00
					income2: income1 * 3
				} actual {
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			2.assertEquals(validate.size)
			months.head => [
				budgetEntries.get(1).assertError(BudgetingPackage.eINSTANCE.budgetEntry, null, 'Duplicate budget entry for category "income2"')
				budgetEntries.get(2).assertError(BudgetingPackage.eINSTANCE.budgetEntry, null, 'Duplicate budget entry for category "income2"')
			]
		]
	}
	
	@Test
	def void testCheckDuplicateActualEntries() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				expense expense1
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet)
		'''
			2016 uses lib1 {
				january budget {
				} actual {
					expense1: 1.00
					expense1 {
						cash 2.00
					}
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			2.assertEquals(validate.size)
			months.head => [
				actualEntries.get(0).assertError(BudgetingPackage.eINSTANCE.actualEntry, null, 'Duplicate actual entry for category "expense1"')
				actualEntries.get(1).assertError(BudgetingPackage.eINSTANCE.actualEntry, null, 'Duplicate actual entry for category "expense1"')
			]
		]
	}
	
	@Test
	def void testCheckCyclicBudgetFactorDependency() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				income income2
			}
		'''.parse(resourceSet)
		'''
			2016 uses lib1 {
				january budget {
					income1: income2 * 1
					income2: income1 * 1
				} actual {
				}
			}
		'''.parse(resourceSet) as Year => [
			months.head => [
				tester.validate(budgetEntries.get(0)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Cycle detected for budget entry "income1"')
				]
				tester.validate(budgetEntries.get(1)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Cycle detected for budget entry "income2"')
				]
			]
		]
	}
	
	@Test
	def void testCheckDayRange() {
		'''
			2016 uses lib1 {
				february budget {
				} actual {
					expense1 {
						cash 1.00 on 0
						cash 1.00 on 100
						cash 1.00 on 30
						card 1.00 on 0 from "store1"
						card 1.00 on 100 from "store2"
						card 1.00 on 30 from "store3"
					}
				}
			}
		'''.parse as Year => [
			months.head.actualEntries.head as ActualTransactionEntry => [
				tester.validate(transactions.get(0)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "0" is out of range')
				]
				tester.validate(transactions.get(1)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "100" is out of range')
				]
				tester.validate(transactions.get(2)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "30" is out of range')
				]
				tester.validate(transactions.get(3)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "0" is out of range')
				]
				tester.validate(transactions.get(4)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "100" is out of range')
				]
				tester.validate(transactions.get(5)) => [
					assertDiagnosticsCount(1)
					assertError(null, 'Day "30" is out of range')
				]
			]
		]
	}
	
	@Test
	def void testCheckTransactionEntryIsExpense() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
			}
		'''.parse(resourceSet)
		'''
			2016 uses lib1 {
				january budget {
				} actual {
					income1 {
						cash 1.00
					}
					expense1 {
						cash 1.00
					}
				}
			}
		'''.parse(resourceSet) as Year => [
			months.head => [
				tester.validate(actualEntries.get(0)) => [
					assertDiagnosticsCount(1)
					assertError(null, '"income1" is not an expense category')
				]
				tester.validate(actualEntries.get(1)) => [
					assertDiagnosticsCount(0)
				]
			]
		]
	}
	
	@Test
	def void testCheckTransactionOrdering() {
		'''
			2016 uses lib1 {
				january budget {
				} actual {
					expense1 {
						cash 1.00 on 20
						card 1.00 on 10 from "store1"
					}
				}
			}
		'''.parse as Year => [
			tester.validate(months.head.actualEntries.head) => [
				assertDiagnosticsCount(1)
				assertError(BudgetingValidator.TRANSACTIONS_OUT_OF_ORDER, "Transactions are out of order")
			]
		]
	}
	
	@Test
	def void testCheckZeroSumBudget() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				expense expense1
				expense expense2
				expense expense3
				expense expense4
			}
		'''.parse(resourceSet)
		'''
			2016 uses lib1 {
				january budget {
					income1: 100.00
					expense1: income1 * 0.1
					expense2: expense1 * 0.5
					expense3: expense2 * 0.2
					expense4: 10.00
				} actual {
				}
			}
		'''.parse(resourceSet) as Year => [
			tester.validate(months.head) => [
				assertDiagnosticsCount(1)
				assertError(null, "Sum of budget entries is 74.00")
			]
		]
	}
	
	@Test
	def void testCheckZeroSumActual() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				expense expense1
				expense expense2
			}
		'''.parse(resourceSet)
		'''
			2016 uses lib1 {
				january budget {
				} actual {
					income1: 100.00
					expense1: 12.34
					expense2 {
						cash 56.78
						cash 90.12 on 5
						card 34.56 on 6 from "store1"
					}
				}
			}
		'''.parse(resourceSet) as Year => [
			tester.validate(months.head) => [
				assertDiagnosticsCount(1)
				assertError(null, "Sum of actual entries in past month is -93.80")
			]
		]
	}
}