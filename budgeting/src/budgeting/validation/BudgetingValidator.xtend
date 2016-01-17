package budgeting.validation

import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.ExpenseCategory
import budgeting.budgeting.Library
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
}