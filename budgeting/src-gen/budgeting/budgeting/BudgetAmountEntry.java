/**
 */
package budgeting.budgeting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Amount Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.BudgetAmountEntry#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getBudgetAmountEntry()
 * @model
 * @generated
 */
public interface BudgetAmountEntry extends BudgetEntry
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
   * @see budgeting.budgeting.BudgetingPackage#getBudgetAmountEntry_Amount()
   * @model
   * @generated
   */
  long getAmount();

  /**
   * Sets the value of the '{@link budgeting.budgeting.BudgetAmountEntry#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(long value);

} // BudgetAmountEntry
