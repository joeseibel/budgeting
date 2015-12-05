/**
 */
package budgeting.budgeting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.ActualEntry#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getActualEntry()
 * @model
 * @generated
 */
public interface ActualEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see budgeting.budgeting.BudgetingPackage#getActualEntry_Category()
   * @model
   * @generated
   */
  Category getCategory();

  /**
   * Sets the value of the '{@link budgeting.budgeting.ActualEntry#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Category value);

} // ActualEntry
