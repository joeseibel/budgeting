package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.ActualAmountEntry
import budgeting.budgeting.ActualTransactionEntry
import budgeting.budgeting.BudgetAmountEntry
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.BudgetingFile
import budgeting.budgeting.CardTransaction
import budgeting.budgeting.CashTransaction
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.IncomeCategory
import budgeting.budgeting.Library
import budgeting.budgeting.MonthEnum
import budgeting.budgeting.Year
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals
import static extension org.junit.Assert.assertNull
import static extension org.junit.Assert.assertTrue

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class ParserTest {
	@Inject
	extension ParseHelper<BudgetingFile>
	@Inject
	extension ValidationTestHelper
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Test
	def void testEmptyLibrary() {
		'''
			library lib1 {
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSetProvider.get) as Library => [
			assertNoIssues
			"lib1".assertEquals(name)
			categories.empty.assertTrue
		]
	}
	
	@Test
	def void testLibrary() {
		'''
			library lib1 {
				income income1
				income income2
				expense expense1
				expense expense2 ["pattern1"]
				expense expense3 ["pattern2", "pattern3", "pattern4"]
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSetProvider.get) as Library => [
			assertNoIssues
			"lib1".assertEquals(name)
			5.assertEquals(categories.size)
			categories.get(0) as IncomeCategory => [
				"income1".assertEquals(name)
			]
			categories.get(1) as IncomeCategory => [
				"income2".assertEquals(name)
			]
			categories.get(2) as ExpenseCategory => [
				"expense1".assertEquals(name)
				patterns.empty.assertTrue
			]
			categories.get(3) as ExpenseCategory => [
				"expense2".assertEquals(name)
				1.assertEquals(patterns.size)
				"pattern1".assertEquals(patterns.head)
			]
			categories.get(4) as ExpenseCategory => [
				"expense3".assertEquals(name)
				3.assertEquals(patterns.size)
				"pattern2".assertEquals(patterns.get(0))
				"pattern3".assertEquals(patterns.get(1))
				"pattern4".assertEquals(patterns.get(2))
			]
		]
	}
	
	@Test
	def void testEmptyYear() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
			}
		'''.parse(resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			"lib1".assertEquals(library.name)
			months.empty.assertTrue
		]
	}
	
	@Test
	def void testMonthEnum() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
				january budget {
				} actual {
				}
				
				february budget {
				} actual {
				}
				
				march budget {
				} actual {
				}
				
				april budget {
				} actual {
				}
				
				may budget {
				} actual {
				}
				
				june budget {
				} actual {
				}
				
				july budget {
				} actual {
				}
				
				august budget {
				} actual {
				}
				
				september budget {
				} actual {
				}
				
				october budget {
				} actual {
				}
				
				november budget {
				} actual {
				}
				
				december budget {
				} actual {
				}
			}
		'''.parse(resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			"lib1".assertEquals(library.name)
			12.assertEquals(months.size)
			MonthEnum.JANUARY.assertEquals(months.get(0).name)
			MonthEnum.FEBRUARY.assertEquals(months.get(1).name)
			MonthEnum.MARCH.assertEquals(months.get(2).name)
			MonthEnum.APRIL.assertEquals(months.get(3).name)
			MonthEnum.MAY.assertEquals(months.get(4).name)
			MonthEnum.JUNE.assertEquals(months.get(5).name)
			MonthEnum.JULY.assertEquals(months.get(6).name)
			MonthEnum.AUGUST.assertEquals(months.get(7).name)
			MonthEnum.SEPTEMBER.assertEquals(months.get(8).name)
			MonthEnum.OCTOBER.assertEquals(months.get(9).name)
			MonthEnum.NOVEMBER.assertEquals(months.get(10).name)
			MonthEnum.DECEMBER.assertEquals(months.get(11).name)
		]
	}
	
	@Test
	def void testYear() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				expense expense1
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
				january budget {
				} actual {
				}
				
				february budget {
					income1: 12.34
					expense1: income1 * 0.2
				} actual {
					income1: 98.76
					expense1 {
						cash 11.22
						cash 33.44 on 4
						card 55.66 on 6 from "store1"
					}
				}
			}
		'''.parse(resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			"lib1".assertEquals(library.name)
			2.assertEquals(months.size)
			months.get(0) => [
				MonthEnum.JANUARY.assertEquals(name)
				budgetEntries.empty.assertTrue
				actualEntries.empty.assertTrue
			]
			months.get(1) => [
				MonthEnum.FEBRUARY.assertEquals(name)
				2.assertEquals(budgetEntries.size)
				budgetEntries.get(0) as BudgetAmountEntry => [
					"income1".assertEquals(category.name)
					1234L.assertEquals(amount)
				]
				budgetEntries.get(1) as BudgetFactorEntry => [
					"expense1".assertEquals(category.name)
					"income1".assertEquals(baseEntry.category.name)
					0.2.assertEquals(factor, 0.0)
				]
				2.assertEquals(actualEntries.size)
				actualEntries.get(0) as ActualAmountEntry => [
					"income1".assertEquals(category.name)
					9876L.assertEquals(amount)
				]
				actualEntries.get(1) as ActualTransactionEntry => [
					"expense1".assertEquals(category.name)
					3.assertEquals(transactions.size)
					transactions.get(0) as CashTransaction => [
						1122L.assertEquals(amount)
						day.assertNull
					]
					transactions.get(1) as CashTransaction => [
						3344L.assertEquals(amount)
						4.assertEquals(day)
					]
					transactions.get(2) as CardTransaction => [
						5566L.assertEquals(amount)
						6.assertEquals(day)
						"store1".assertEquals(from)
					]
				]
			]
		]
	}
}