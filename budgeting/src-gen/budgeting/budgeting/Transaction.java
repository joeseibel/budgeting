/**
 */
package budgeting.budgeting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.Transaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link budgeting.budgeting.Transaction#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(long)
   * @see budgeting.budgeting.BudgetingPackage#getTransaction_Amount()
   * @model
   * @generated
   */
  long getAmount();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Transaction#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(long value);

  /**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(int)
   * @see budgeting.budgeting.BudgetingPackage#getTransaction_Day()
   * @model
   * @generated
   */
  int getDay();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Transaction#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
  void setDay(int value);

} // Transaction
