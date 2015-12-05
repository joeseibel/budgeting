/**
 */
package budgeting.budgeting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Transaction Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.ActualTransactionEntry#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getActualTransactionEntry()
 * @model
 * @generated
 */
public interface ActualTransactionEntry extends ActualEntry
{
  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link budgeting.budgeting.Transaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see budgeting.budgeting.BudgetingPackage#getActualTransactionEntry_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // ActualTransactionEntry
