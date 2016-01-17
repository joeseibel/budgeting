package budgeting.validation

import budgeting.budgeting.BudgetingPackage
import budgeting.budgeting.Library
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
}