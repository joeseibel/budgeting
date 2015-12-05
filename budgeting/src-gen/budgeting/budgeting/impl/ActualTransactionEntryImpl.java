/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.ActualTransactionEntry;
import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Transaction Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.impl.ActualTransactionEntryImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualTransactionEntryImpl extends ActualEntryImpl implements ActualTransactionEntry
{
  /**
   * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactions()
   * @generated
   * @ordered
   */
  protected EList<Transaction> transactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActualTransactionEntryImpl()
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
    return BudgetingPackage.Literals.ACTUAL_TRANSACTION_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transaction> getTransactions()
  {
    if (transactions == null)
    {
      transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS);
    }
    return transactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS:
        return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS:
        return getTransactions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS:
        getTransactions().clear();
        getTransactions().addAll((Collection<? extends Transaction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS:
        getTransactions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS:
        return transactions != null && !transactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActualTransactionEntryImpl
