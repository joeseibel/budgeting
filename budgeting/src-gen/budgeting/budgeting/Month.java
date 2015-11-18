/**
 */
package budgeting.budgeting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.Month#getName <em>Name</em>}</li>
 *   <li>{@link budgeting.budgeting.Month#getBudgetEntries <em>Budget Entries</em>}</li>
 *   <li>{@link budgeting.budgeting.Month#getActualEntries <em>Actual Entries</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getMonth()
 * @model
 * @generated
 */
public interface Month extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link budgeting.budgeting.MonthEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see budgeting.budgeting.MonthEnum
   * @see #setName(MonthEnum)
   * @see budgeting.budgeting.BudgetingPackage#getMonth_Name()
   * @model
   * @generated
   */
  MonthEnum getName();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Month#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see budgeting.budgeting.MonthEnum
   * @see #getName()
   * @generated
   */
  void setName(MonthEnum value);

  /**
   * Returns the value of the '<em><b>Budget Entries</b></em>' containment reference list.
   * The list contents are of type {@link budgeting.budgeting.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Budget Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Budget Entries</em>' containment reference list.
   * @see budgeting.budgeting.BudgetingPackage#getMonth_BudgetEntries()
   * @model containment="true"
   * @generated
   */
  EList<Entry> getBudgetEntries();

  /**
   * Returns the value of the '<em><b>Actual Entries</b></em>' containment reference list.
   * The list contents are of type {@link budgeting.budgeting.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual Entries</em>' containment reference list.
   * @see budgeting.budgeting.BudgetingPackage#getMonth_ActualEntries()
   * @model containment="true"
   * @generated
   */
  EList<Entry> getActualEntries();

} // Month
