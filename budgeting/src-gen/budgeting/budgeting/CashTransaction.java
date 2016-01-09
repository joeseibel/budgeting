/**
 */
package budgeting.budgeting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.CashTransaction#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getCashTransaction()
 * @model
 * @generated
 */
public interface CashTransaction extends Transaction
{
  /**
   * Returns the value of the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Day</em>' attribute.
   * @see #setDay(Integer)
   * @see budgeting.budgeting.BudgetingPackage#getCashTransaction_Day()
   * @model
   * @generated
   */
  Integer getDay();

  /**
   * Sets the value of the '{@link budgeting.budgeting.CashTransaction#getDay <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Day</em>' attribute.
   * @see #getDay()
   * @generated
   */
  void setDay(Integer value);

} // CashTransaction
