package budgeting.validation

import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Library
import budgeting.budgeting.Year
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException
import org.eclipse.xtext.validation.Check

class BudgetingValidator extends AbstractBudgetingValidator {
	@Check
	def void checkLibraryName(Library library) {
		val libName = library.name
		val fileName = library.eResource.URI.trimFileExtension.lastSegment
		if (libName != fileName) {
			error('''"«libName»" does not match filename "«fileName»"''', BudgetingPackage.eINSTANCE.library_Name)
		}
	}
	
	@Check
	def void checkPatternValidity(ExpenseCategory expense) {
		expense.patterns.forEach[pattern, index | try {
			Pattern.compile(pattern)
		} catch (PatternSyntaxException e) {
			error("Invalid pattern: " + e.description, BudgetingPackage.eINSTANCE.expenseCategory_Patterns, index)
		}]
	}
	
	@Check
	def void checkDuplicatePatterns(ExpenseCategory expense) {
		val duplicates = expense.patterns.indexed.groupBy[value].filter[pattern, pairs | pairs.size > 1]
		duplicates.mapValues[map[key]].forEach[pattern, indicies | indicies.forEach[index |
			warning("Duplicate pattern '" + pattern + "'", BudgetingPackage.eINSTANCE.expenseCategory_Patterns, index)
		]]
	}
	
	@Check
	def void checkPatternDuplicatedInMultipleCategories(Library library) {
		val expenseCategories = library.categories.filter(ExpenseCategory)
		val patternsAndCategories = expenseCategories.map[category | category.patterns.toSet.map[pattern | pattern -> category]].flatten
		val multiples = patternsAndCategories.groupBy[key].filter[pattern, pairs | pairs.size > 1]
		multiples.mapValues[map[value]].forEach[pattern, categories | categories.forEach[category | category.patterns.indexed.filter[value == pattern].forEach[
			error('''Pattern '«pattern»' found in multiple categories''', category, BudgetingPackage.eINSTANCE.expenseCategory_Patterns, key)
		]]]
	}
	
	@Check
	def void checkYearName(Year year) {
		val yearName = year.name
		val fileName = year.eResource.URI.trimFileExtension.lastSegment
		if (yearName.toString != fileName) {
			error('''"«yearName»" does not match filename "«fileName»"''', BudgetingPackage.eINSTANCE.year_Name)
		}
	}
}