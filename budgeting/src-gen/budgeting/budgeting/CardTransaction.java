/**
 */
package budgeting.budgeting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.CardTransaction#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getCardTransaction()
 * @model
 * @generated
 */
public interface CardTransaction extends Transaction
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see budgeting.budgeting.BudgetingPackage#getCardTransaction_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link budgeting.budgeting.CardTransaction#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

} // CardTransaction
