package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.BudgetingFactory
import budgeting.budgeting.BudgetingFile
import budgeting.budgeting.Library
import budgeting.budgeting.MonthEnum
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class SerializerTest {
	@Inject
	extension ISerializer
	@Inject
	extension ParseHelper<BudgetingFile>
	@Inject
	FileExtensionProvider extensionProvider
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	XtextResourceSet resourceSet
	
	@Before
	def void createResourceSet() {
		resourceSet = resourceSetProvider.get
	}
	
	@Test
	def void testEmptyLibrary() {
		'''
			library lib1 {
			}'''.assertSerialize(BudgetingFactory.eINSTANCE.createLibrary => [
				name = "lib1"
			])
	}
	
	@Test
	def void testLibrary() {
		'''
			library lib1 {
				income income1
				income income2
				expense expense1
				expense expense2 ["pattern1"]
				expense expense3 [
					"pattern1",
					"pattern2",
					"pattern3"
				]
			}'''.assertSerialize(BudgetingFactory.eINSTANCE.createLibrary => [
				name = "lib1"
				categories += BudgetingFactory.eINSTANCE.createIncomeCategory => [
					name = "income1"
				]
				categories += BudgetingFactory.eINSTANCE.createIncomeCategory => [
					name = "income2"
				]
				categories += BudgetingFactory.eINSTANCE.createExpenseCategory => [
					name = "expense1"
				]
				categories += BudgetingFactory.eINSTANCE.createExpenseCategory => [
					name = "expense2"
					patterns += "pattern1"
				]
				categories += BudgetingFactory.eINSTANCE.createExpenseCategory => [
					name = "expense3"
					patterns += #["pattern1", "pattern2", "pattern3"]
				]
			])
	}
	
	@Test
	def void testEmptyYear() {
		'''
			2016 uses lib1 {
			}'''.assertSerialize(BudgetingFactory.eINSTANCE.createYear => [
				name = 2016
				library = '''
					library lib1 {
					}
				'''.parse(resourceSet) as Library
			])
	}
	
	@Test
	def void testMonthEnum() {
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
			}'''.assertSerialize(BudgetingFactory.eINSTANCE.createYear => [
				name = 2016
				library = '''
					library lib1 {
					}
				'''.parse(resourceSet) as Library
				months += MonthEnum.values.map[monthEnum | BudgetingFactory.eINSTANCE.createMonth => [name = monthEnum]]
			])
	}
	
	@Test
	def void testYear() {
		val lib1 = '''
			library lib1 {
				income income1
				expense expense1
			}
		'''.parse(resourceSet) as Library
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
			}'''.assertSerialize(BudgetingFactory.eINSTANCE.createYear => [
				name = 2016
				library = lib1
				months += BudgetingFactory.eINSTANCE.createMonth => [
					name = MonthEnum.JANUARY
				]
				months += BudgetingFactory.eINSTANCE.createMonth => [
					name = MonthEnum.FEBRUARY
					val income1BudgetEntry = BudgetingFactory.eINSTANCE.createBudgetAmountEntry => [
						category = lib1.categories.head
						amount = 1234L
					]
					budgetEntries += income1BudgetEntry
					budgetEntries += BudgetingFactory.eINSTANCE.createBudgetFactorEntry => [
						category = lib1.categories.last
						baseEntry = income1BudgetEntry
						factor = 0.2
					]
					actualEntries += BudgetingFactory.eINSTANCE.createActualAmountEntry => [
						category = lib1.categories.head
						amount = 9876L
					]
					actualEntries += BudgetingFactory.eINSTANCE.createActualTransactionEntry => [
						category = lib1.categories.last
						transactions += BudgetingFactory.eINSTANCE.createCashTransaction => [
							amount = 1122L
						]
						transactions += BudgetingFactory.eINSTANCE.createCashTransaction => [
							amount = 3344L
							day = 4
						]
						transactions += BudgetingFactory.eINSTANCE.createCardTransaction => [
							amount = 5566L
							day = 6
							from = "store1"
						]
					]
				]
			])
	}
	
	def private assertSerialize(CharSequence expected, EObject eobj) {
		resourceSet.createResource(computeUnusedUri).contents += eobj
		expected.toString.assertEquals(eobj.serialize)
	}
	
	//Copied from ResourceHelper because it is not public
	def private computeUnusedUri() {
		(0 .. Integer.MAX_VALUE).map[URI.createURI('''__synthetic«it».«extensionProvider.primaryFileExtension»''')].findFirst[resourceSet.getResource(it, false) == null]
	}
}