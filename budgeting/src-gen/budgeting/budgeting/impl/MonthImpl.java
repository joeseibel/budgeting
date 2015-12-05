/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.ActualEntry;
import budgeting.budgeting.BudgetEntry;
import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.Month;
import budgeting.budgeting.MonthEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Month</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.impl.MonthImpl#getName <em>Name</em>}</li>
 *   <li>{@link budgeting.budgeting.impl.MonthImpl#getBudgetEntries <em>Budget Entries</em>}</li>
 *   <li>{@link budgeting.budgeting.impl.MonthImpl#getActualEntries <em>Actual Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonthImpl extends MinimalEObjectImpl.Container implements Month
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final MonthEnum NAME_EDEFAULT = MonthEnum.JANUARY;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected MonthEnum name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBudgetEntries() <em>Budget Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBudgetEntries()
   * @generated
   * @ordered
   */
  protected EList<BudgetEntry> budgetEntries;

  /**
   * The cached value of the '{@link #getActualEntries() <em>Actual Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualEntries()
   * @generated
   * @ordered
   */
  protected EList<ActualEntry> actualEntries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonthImpl()
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
    return BudgetingPackage.Literals.MONTH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthEnum getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(MonthEnum newName)
  {
    MonthEnum oldName = name;
    name = newName == null ? NAME_EDEFAULT : newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BudgetingPackage.MONTH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BudgetEntry> getBudgetEntries()
  {
    if (budgetEntries == null)
    {
      budgetEntries = new EObjectContainmentEList<BudgetEntry>(BudgetEntry.class, this, BudgetingPackage.MONTH__BUDGET_ENTRIES);
    }
    return budgetEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActualEntry> getActualEntries()
  {
    if (actualEntries == null)
    {
      actualEntries = new EObjectContainmentEList<ActualEntry>(ActualEntry.class, this, BudgetingPackage.MONTH__ACTUAL_ENTRIES);
    }
    return actualEntries;
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
      case BudgetingPackage.MONTH__BUDGET_ENTRIES:
        return ((InternalEList<?>)getBudgetEntries()).basicRemove(otherEnd, msgs);
      case BudgetingPackage.MONTH__ACTUAL_ENTRIES:
        return ((InternalEList<?>)getActualEntries()).basicRemove(otherEnd, msgs);
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
      case BudgetingPackage.MONTH__NAME:
        return getName();
      case BudgetingPackage.MONTH__BUDGET_ENTRIES:
        return getBudgetEntries();
      case BudgetingPackage.MONTH__ACTUAL_ENTRIES:
        return getActualEntries();
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
      case BudgetingPackage.MONTH__NAME:
        setName((MonthEnum)newValue);
        return;
      case BudgetingPackage.MONTH__BUDGET_ENTRIES:
        getBudgetEntries().clear();
        getBudgetEntries().addAll((Collection<? extends BudgetEntry>)newValue);
        return;
      case BudgetingPackage.MONTH__ACTUAL_ENTRIES:
        getActualEntries().clear();
        getActualEntries().addAll((Collection<? extends ActualEntry>)newValue);
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
      case BudgetingPackage.MONTH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BudgetingPackage.MONTH__BUDGET_ENTRIES:
        getBudgetEntries().clear();
        return;
      case BudgetingPackage.MONTH__ACTUAL_ENTRIES:
        getActualEntries().clear();
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
      case BudgetingPackage.MONTH__NAME:
        return name != NAME_EDEFAULT;
      case BudgetingPackage.MONTH__BUDGET_ENTRIES:
        return budgetEntries != null && !budgetEntries.isEmpty();
      case BudgetingPackage.MONTH__ACTUAL_ENTRIES:
        return actualEntries != null && !actualEntries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MonthImpl
