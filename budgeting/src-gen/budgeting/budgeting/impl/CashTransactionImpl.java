/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.CashTransaction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CashTransactionImpl extends TransactionImpl implements CashTransaction
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CashTransactionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BudgetingPackage.Literals.CASH_TRANSACTION;
  }

} //CashTransactionImpl
