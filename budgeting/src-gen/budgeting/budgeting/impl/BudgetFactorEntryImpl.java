/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.BudgetEntry;
import budgeting.budgeting.BudgetFactorEntry;
import budgeting.budgeting.BudgetingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Factor Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.impl.BudgetFactorEntryImpl#getBaseEntry <em>Base Entry</em>}</li>
 *   <li>{@link budgeting.budgeting.impl.BudgetFactorEntryImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetFactorEntryImpl extends BudgetEntryImpl implements BudgetFactorEntry
{
  /**
   * The cached value of the '{@link #getBaseEntry() <em>Base Entry</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseEntry()
   * @generated
   * @ordered
   */
  protected BudgetEntry baseEntry;

  /**
   * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected static final double FACTOR_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected double factor = FACTOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BudgetFactorEntryImpl()
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
    return BudgetingPackage.Literals.BUDGET_FACTOR_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetEntry getBaseEntry()
  {
    if (baseEntry != null && baseEntry.eIsProxy())
    {
      InternalEObject oldBaseEntry = (InternalEObject)baseEntry;
      baseEntry = (BudgetEntry)eResolveProxy(oldBaseEntry);
      if (baseEntry != oldBaseEntry)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY, oldBaseEntry, baseEntry));
      }
    }
    return baseEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetEntry basicGetBaseEntry()
  {
    return baseEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseEntry(BudgetEntry newBaseEntry)
  {
    BudgetEntry oldBaseEntry = baseEntry;
    baseEntry = newBaseEntry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY, oldBaseEntry, baseEntry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(double newFactor)
  {
    double oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BudgetingPackage.BUDGET_FACTOR_ENTRY__FACTOR, oldFactor, factor));
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
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY:
        if (resolve) return getBaseEntry();
        return basicGetBaseEntry();
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__FACTOR:
        return getFactor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY:
        setBaseEntry((BudgetEntry)newValue);
        return;
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__FACTOR:
        setFactor((Double)newValue);
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
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY:
        setBaseEntry((BudgetEntry)null);
        return;
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__FACTOR:
        setFactor(FACTOR_EDEFAULT);
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
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__BASE_ENTRY:
        return baseEntry != null;
      case BudgetingPackage.BUDGET_FACTOR_ENTRY__FACTOR:
        return factor != FACTOR_EDEFAULT;
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
    result.append(" (factor: ");
    result.append(factor);
    result.append(')');
    return result.toString();
  }

} //BudgetFactorEntryImpl
