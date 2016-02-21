package budgeting.tests

import budgeting.BudgetingInjectorProvider
import budgeting.budgeting.BudgetFactorEntry
import budgeting.budgeting.BudgetingFile
import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.Library
import budgeting.budgeting.MonthEnum
import budgeting.budgeting.Year
import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.IScopeProvider
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(BudgetingInjectorProvider)
class ScopingTest {
	@Inject
	extension ParseHelper<BudgetingFile>
	@Inject
	extension ValidationTestHelper
	@Inject
	extension IScopeProvider
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Test
	def void testLibraryReference() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			library lib2 {
			}
		'''.parse(URI.createURI("lib2." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			assertScope(BudgetingPackage.eINSTANCE.year_Library, #["lib1", "lib2"])
		]
	}
	
	@Test
	def void testCategoryReference() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				income income2
				expense expense1
				expense expense2
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
				january budget {
					income1: 11.22
					expense1: income1 * 1
				} actual {
					income1: 89.10
					expense1: 33.44
					expense2 {
						cash 55.66
					}
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			months.head => [
				MonthEnum.JANUARY.assertEquals(name)
				val expectedCategories = #["income1", "income2", "expense1", "expense2"]
				budgetEntries.get(0) => [
					"income1".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.budgetEntry_Category, expectedCategories)
				]
				budgetEntries.get(1) => [
					"expense1".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.budgetEntry_Category, expectedCategories)
				]
				actualEntries.get(0) => [
					"income1".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.actualEntry_Category, expectedCategories)
				]
				actualEntries.get(1) => [
					"expense1".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.actualEntry_Category, expectedCategories)
				]
				actualEntries.get(2) => [
					"expense2".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.actualEntry_Category, expectedCategories)
				]
			]
		]
	}
	
	@Test
	def void testBaseEntryReference() {
		val resourceSet = resourceSetProvider.get
		'''
			library lib1 {
				income income1
				income income2
				expense expense1
				expense expense2
			}
		'''.parse(URI.createURI("lib1." + fileExtension), resourceSet) as Library => [
			assertNoIssues
		]
		'''
			2016 uses lib1 {
				january budget {
					income1: 11.22
					income2: income1 * 0.1
					expense1: income1 * 1.1
				} actual {
				}
			}
		'''.parse(URI.createURI("2016." + fileExtension), resourceSet) as Year => [
			assertNoIssues
			2016.assertEquals(name)
			months.head => [
				MonthEnum.JANUARY.assertEquals(name)
				val expectedEntries = #["income1", "income2", "expense1"]
				budgetEntries.get(1) as BudgetFactorEntry => [
					"income2".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.budgetFactorEntry_BaseEntry, expectedEntries)
				]
				budgetEntries.get(2) as BudgetFactorEntry => [
					"expense1".assertEquals(category.name)
					assertScope(BudgetingPackage.eINSTANCE.budgetFactorEntry_BaseEntry, expectedEntries)
				]
			]
		]
	}
	
	def private assertScope(EObject context, EReference reference, Iterable<String> expected) {
		expected.sort.join(", ").assertEquals(context.getScope(reference).allElements.map[name].sort.join(", "))
	}
}