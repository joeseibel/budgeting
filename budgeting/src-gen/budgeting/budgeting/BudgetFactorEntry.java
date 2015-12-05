/**
 */
package budgeting.budgeting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Factor Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.BudgetFactorEntry#getBaseEntry <em>Base Entry</em>}</li>
 *   <li>{@link budgeting.budgeting.BudgetFactorEntry#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getBudgetFactorEntry()
 * @model
 * @generated
 */
public interface BudgetFactorEntry extends BudgetEntry
{
  /**
   * Returns the value of the '<em><b>Base Entry</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Entry</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Entry</em>' reference.
   * @see #setBaseEntry(BudgetEntry)
   * @see budgeting.budgeting.BudgetingPackage#getBudgetFactorEntry_BaseEntry()
   * @model
   * @generated
   */
  BudgetEntry getBaseEntry();

  /**
   * Sets the value of the '{@link budgeting.budgeting.BudgetFactorEntry#getBaseEntry <em>Base Entry</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Entry</em>' reference.
   * @see #getBaseEntry()
   * @generated
   */
  void setBaseEntry(BudgetEntry value);

  /**
   * Returns the value of the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' attribute.
   * @see #setFactor(double)
   * @see budgeting.budgeting.BudgetingPackage#getBudgetFactorEntry_Factor()
   * @model
   * @generated
   */
  double getFactor();

  /**
   * Sets the value of the '{@link budgeting.budgeting.BudgetFactorEntry#getFactor <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' attribute.
   * @see #getFactor()
   * @generated
   */
  void setFactor(double value);

} // BudgetFactorEntry
