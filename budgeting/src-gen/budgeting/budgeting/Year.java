/**
 */
package budgeting.budgeting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.Year#getName <em>Name</em>}</li>
 *   <li>{@link budgeting.budgeting.Year#getLibrary <em>Library</em>}</li>
 *   <li>{@link budgeting.budgeting.Year#getMonths <em>Months</em>}</li>
 * </ul>
 *
 * @see budgeting.budgeting.BudgetingPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends BudgetingFile
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(int)
   * @see budgeting.budgeting.BudgetingPackage#getYear_Name()
   * @model
   * @generated
   */
  int getName();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Year#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(int value);

  /**
   * Returns the value of the '<em><b>Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Library</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library</em>' reference.
   * @see #setLibrary(Library)
   * @see budgeting.budgeting.BudgetingPackage#getYear_Library()
   * @model
   * @generated
   */
  Library getLibrary();

  /**
   * Sets the value of the '{@link budgeting.budgeting.Year#getLibrary <em>Library</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library</em>' reference.
   * @see #getLibrary()
   * @generated
   */
  void setLibrary(Library value);

  /**
   * Returns the value of the '<em><b>Months</b></em>' containment reference list.
   * The list contents are of type {@link budgeting.budgeting.Month}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Months</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Months</em>' containment reference list.
   * @see budgeting.budgeting.BudgetingPackage#getYear_Months()
   * @model containment="true"
   * @generated
   */
  EList<Month> getMonths();

} // Year
