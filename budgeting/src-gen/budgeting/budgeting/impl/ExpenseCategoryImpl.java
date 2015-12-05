/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.ExpenseCategory;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expense Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.impl.ExpenseCategoryImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpenseCategoryImpl extends CategoryImpl implements ExpenseCategory
{
  /**
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected EList<String> patterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpenseCategoryImpl()
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
    return BudgetingPackage.Literals.EXPENSE_CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPatterns()
  {
    if (patterns == null)
    {
      patterns = new EDataTypeEList<String>(String.class, this, BudgetingPackage.EXPENSE_CATEGORY__PATTERNS);
    }
    return patterns;
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
      case BudgetingPackage.EXPENSE_CATEGORY__PATTERNS:
        return getPatterns();
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
      case BudgetingPackage.EXPENSE_CATEGORY__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends String>)newValue);
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
      case BudgetingPackage.EXPENSE_CATEGORY__PATTERNS:
        getPatterns().clear();
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
      case BudgetingPackage.EXPENSE_CATEGORY__PATTERNS:
        return patterns != null && !patterns.isEmpty();
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
    result.append(" (patterns: ");
    result.append(patterns);
    result.append(')');
    return result.toString();
  }

} //ExpenseCategoryImpl
