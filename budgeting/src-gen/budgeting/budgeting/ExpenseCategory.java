/**
 */
package budgeting.budgeting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expense Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.ExpenseCategory#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getExpenseCategory()
 * @model
 * @generated
 */
public interface ExpenseCategory extends Category
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' attribute list.
   * @see budgeting.budgeting.BudgetingPackage#getExpenseCategory_Patterns()
   * @model unique="false"
   * @generated
   */
  EList<String> getPatterns();

} // ExpenseCategory
