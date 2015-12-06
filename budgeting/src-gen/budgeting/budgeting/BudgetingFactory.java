/**
 */
package budgeting.budgeting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see budgeting.budgeting.BudgetingPackage
 * @generated
 */
public interface BudgetingFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BudgetingFactory eINSTANCE = budgeting.budgeting.impl.BudgetingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  BudgetingFile createBudgetingFile();

  /**
   * Returns a new object of class '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library</em>'.
   * @generated
   */
  Library createLibrary();

  /**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
  Category createCategory();

  /**
   * Returns a new object of class '<em>Year</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Year</em>'.
   * @generated
   */
  Year createYear();

  /**
   * Returns a new object of class '<em>Month</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Month</em>'.
   * @generated
   */
  Month createMonth();

  /**
   * Returns a new object of class '<em>Budget Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Budget Entry</em>'.
   * @generated
   */
  BudgetEntry createBudgetEntry();

  /**
   * Returns a new object of class '<em>Actual Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Entry</em>'.
   * @generated
   */
  ActualEntry createActualEntry();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Income Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Income Category</em>'.
   * @generated
   */
  IncomeCategory createIncomeCategory();

  /**
   * Returns a new object of class '<em>Expense Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expense Category</em>'.
   * @generated
   */
  ExpenseCategory createExpenseCategory();

  /**
   * Returns a new object of class '<em>Budget Amount Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Budget Amount Entry</em>'.
   * @generated
   */
  BudgetAmountEntry createBudgetAmountEntry();

  /**
   * Returns a new object of class '<em>Budget Factor Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Budget Factor Entry</em>'.
   * @generated
   */
  BudgetFactorEntry createBudgetFactorEntry();

  /**
   * Returns a new object of class '<em>Actual Amount Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Amount Entry</em>'.
   * @generated
   */
  ActualAmountEntry createActualAmountEntry();

  /**
   * Returns a new object of class '<em>Actual Transaction Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Transaction Entry</em>'.
   * @generated
   */
  ActualTransactionEntry createActualTransactionEntry();

  /**
   * Returns a new object of class '<em>Cash Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cash Transaction</em>'.
   * @generated
   */
  CashTransaction createCashTransaction();

  /**
   * Returns a new object of class '<em>Card Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Card Transaction</em>'.
   * @generated
   */
  CardTransaction createCardTransaction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BudgetingPackage getBudgetingPackage();

} //BudgetingFactory
