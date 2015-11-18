/**
 */
package budgeting.budgeting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.Category#isIncome <em>Income</em>}</li>
 *   <li>{@link budgeting.budgeting.Category#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject
{
  /**
   * Returns the value of the '<em><b>Income</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Income</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Income</em>' attribute.
   * @see #setIncome(boolean)
   * @see budgeting.budgeting.BudgetingPackage#getCategory_Income()
   * @model
   * @generated
   */
  boolean isIncome();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Category#isIncome <em>Income</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Income</em>' attribute.
   * @see #isIncome()
   * @generated
   */
  void setIncome(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see budgeting.budgeting.BudgetingPackage#getCategory_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Category#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Category
