/**
 */
package budgeting.budgeting;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see budgeting.budgeting.BudgetingFactory
 * @model kind="package"
 * @generated
 */
public interface BudgetingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "budgeting";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Budgeting.budgeting";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "budgeting";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BudgetingPackage eINSTANCE = budgeting.budgeting.impl.BudgetingPackageImpl.init();

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.BudgetingFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.BudgetingFileImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetingFile()
   * @generated
   */
  int BUDGETING_FILE = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGETING_FILE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.LibraryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = BUDGETING_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__CATEGORIES = BUDGETING_FILE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = BUDGETING_FILE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.CategoryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = 0;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.YearImpl <em>Year</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.YearImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getYear()
   * @generated
   */
  int YEAR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR__NAME = BUDGETING_FILE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR__LIBRARY = BUDGETING_FILE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Months</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR__MONTHS = BUDGETING_FILE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Year</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR_FEATURE_COUNT = BUDGETING_FILE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.MonthImpl <em>Month</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.MonthImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getMonth()
   * @generated
   */
  int MONTH = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH__NAME = 0;

  /**
   * The feature id for the '<em><b>Budget Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH__BUDGET_ENTRIES = 1;

  /**
   * The feature id for the '<em><b>Actual Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH__ACTUAL_ENTRIES = 2;

  /**
   * The number of structural features of the '<em>Month</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.BudgetEntryImpl <em>Budget Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.BudgetEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetEntry()
   * @generated
   */
  int BUDGET_ENTRY = 5;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_ENTRY__CATEGORY = 0;

  /**
   * The number of structural features of the '<em>Budget Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.ActualEntryImpl <em>Actual Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.ActualEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualEntry()
   * @generated
   */
  int ACTUAL_ENTRY = 6;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_ENTRY__CATEGORY = 0;

  /**
   * The number of structural features of the '<em>Actual Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.TransactionImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 7;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__AMOUNT = 0;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__DAY = 1;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.IncomeCategoryImpl <em>Income Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.IncomeCategoryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getIncomeCategory()
   * @generated
   */
  int INCOME_CATEGORY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOME_CATEGORY__NAME = CATEGORY__NAME;

  /**
   * The number of structural features of the '<em>Income Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCOME_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.ExpenseCategoryImpl <em>Expense Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.ExpenseCategoryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getExpenseCategory()
   * @generated
   */
  int EXPENSE_CATEGORY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_CATEGORY__NAME = CATEGORY__NAME;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_CATEGORY__PATTERNS = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expense Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPENSE_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.BudgetAmountEntryImpl <em>Budget Amount Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.BudgetAmountEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetAmountEntry()
   * @generated
   */
  int BUDGET_AMOUNT_ENTRY = 10;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_AMOUNT_ENTRY__CATEGORY = BUDGET_ENTRY__CATEGORY;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_AMOUNT_ENTRY__AMOUNT = BUDGET_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Budget Amount Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_AMOUNT_ENTRY_FEATURE_COUNT = BUDGET_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.BudgetFactorEntryImpl <em>Budget Factor Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.BudgetFactorEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetFactorEntry()
   * @generated
   */
  int BUDGET_FACTOR_ENTRY = 11;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_FACTOR_ENTRY__CATEGORY = BUDGET_ENTRY__CATEGORY;

  /**
   * The feature id for the '<em><b>Base Entry</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_FACTOR_ENTRY__BASE_ENTRY = BUDGET_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_FACTOR_ENTRY__FACTOR = BUDGET_ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Budget Factor Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_FACTOR_ENTRY_FEATURE_COUNT = BUDGET_ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.ActualAmountEntryImpl <em>Actual Amount Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.ActualAmountEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualAmountEntry()
   * @generated
   */
  int ACTUAL_AMOUNT_ENTRY = 12;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_AMOUNT_ENTRY__CATEGORY = ACTUAL_ENTRY__CATEGORY;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_AMOUNT_ENTRY__AMOUNT = ACTUAL_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actual Amount Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_AMOUNT_ENTRY_FEATURE_COUNT = ACTUAL_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.ActualTransactionEntryImpl <em>Actual Transaction Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.ActualTransactionEntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualTransactionEntry()
   * @generated
   */
  int ACTUAL_TRANSACTION_ENTRY = 13;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_TRANSACTION_ENTRY__CATEGORY = ACTUAL_ENTRY__CATEGORY;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS = ACTUAL_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actual Transaction Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_TRANSACTION_ENTRY_FEATURE_COUNT = ACTUAL_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.CashTransactionImpl <em>Cash Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.CashTransactionImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCashTransaction()
   * @generated
   */
  int CASH_TRANSACTION = 14;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASH_TRANSACTION__AMOUNT = TRANSACTION__AMOUNT;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASH_TRANSACTION__DAY = TRANSACTION__DAY;

  /**
   * The number of structural features of the '<em>Cash Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASH_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link budgeting.budgeting.impl.CardTransactionImpl <em>Card Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.CardTransactionImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCardTransaction()
   * @generated
   */
  int CARD_TRANSACTION = 15;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARD_TRANSACTION__AMOUNT = TRANSACTION__AMOUNT;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARD_TRANSACTION__DAY = TRANSACTION__DAY;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARD_TRANSACTION__FROM = TRANSACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Card Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARD_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link budgeting.budgeting.MonthEnum <em>Month Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.MonthEnum
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getMonthEnum()
   * @generated
   */
  int MONTH_ENUM = 16;


  /**
   * Returns the meta object for class '{@link budgeting.budgeting.BudgetingFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see budgeting.budgeting.BudgetingFile
   * @generated
   */
  EClass getBudgetingFile();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see budgeting.budgeting.Library
   * @generated
   */
  EClass getLibrary();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Library#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see budgeting.budgeting.Library#getName()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_Name();

  /**
   * Returns the meta object for the containment reference list '{@link budgeting.budgeting.Library#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Categories</em>'.
   * @see budgeting.budgeting.Library#getCategories()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Categories();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see budgeting.budgeting.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Category#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see budgeting.budgeting.Category#getName()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Name();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.Year <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Year</em>'.
   * @see budgeting.budgeting.Year
   * @generated
   */
  EClass getYear();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Year#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see budgeting.budgeting.Year#getName()
   * @see #getYear()
   * @generated
   */
  EAttribute getYear_Name();

  /**
   * Returns the meta object for the reference '{@link budgeting.budgeting.Year#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Library</em>'.
   * @see budgeting.budgeting.Year#getLibrary()
   * @see #getYear()
   * @generated
   */
  EReference getYear_Library();

  /**
   * Returns the meta object for the containment reference list '{@link budgeting.budgeting.Year#getMonths <em>Months</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Months</em>'.
   * @see budgeting.budgeting.Year#getMonths()
   * @see #getYear()
   * @generated
   */
  EReference getYear_Months();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.Month <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Month</em>'.
   * @see budgeting.budgeting.Month
   * @generated
   */
  EClass getMonth();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Month#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see budgeting.budgeting.Month#getName()
   * @see #getMonth()
   * @generated
   */
  EAttribute getMonth_Name();

  /**
   * Returns the meta object for the containment reference list '{@link budgeting.budgeting.Month#getBudgetEntries <em>Budget Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Budget Entries</em>'.
   * @see budgeting.budgeting.Month#getBudgetEntries()
   * @see #getMonth()
   * @generated
   */
  EReference getMonth_BudgetEntries();

  /**
   * Returns the meta object for the containment reference list '{@link budgeting.budgeting.Month#getActualEntries <em>Actual Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actual Entries</em>'.
   * @see budgeting.budgeting.Month#getActualEntries()
   * @see #getMonth()
   * @generated
   */
  EReference getMonth_ActualEntries();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.BudgetEntry <em>Budget Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Budget Entry</em>'.
   * @see budgeting.budgeting.BudgetEntry
   * @generated
   */
  EClass getBudgetEntry();

  /**
   * Returns the meta object for the reference '{@link budgeting.budgeting.BudgetEntry#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see budgeting.budgeting.BudgetEntry#getCategory()
   * @see #getBudgetEntry()
   * @generated
   */
  EReference getBudgetEntry_Category();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.ActualEntry <em>Actual Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Entry</em>'.
   * @see budgeting.budgeting.ActualEntry
   * @generated
   */
  EClass getActualEntry();

  /**
   * Returns the meta object for the reference '{@link budgeting.budgeting.ActualEntry#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see budgeting.budgeting.ActualEntry#getCategory()
   * @see #getActualEntry()
   * @generated
   */
  EReference getActualEntry_Category();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see budgeting.budgeting.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Transaction#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see budgeting.budgeting.Transaction#getAmount()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Amount();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Transaction#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see budgeting.budgeting.Transaction#getDay()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Day();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.IncomeCategory <em>Income Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Income Category</em>'.
   * @see budgeting.budgeting.IncomeCategory
   * @generated
   */
  EClass getIncomeCategory();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.ExpenseCategory <em>Expense Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expense Category</em>'.
   * @see budgeting.budgeting.ExpenseCategory
   * @generated
   */
  EClass getExpenseCategory();

  /**
   * Returns the meta object for the attribute list '{@link budgeting.budgeting.ExpenseCategory#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Patterns</em>'.
   * @see budgeting.budgeting.ExpenseCategory#getPatterns()
   * @see #getExpenseCategory()
   * @generated
   */
  EAttribute getExpenseCategory_Patterns();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.BudgetAmountEntry <em>Budget Amount Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Budget Amount Entry</em>'.
   * @see budgeting.budgeting.BudgetAmountEntry
   * @generated
   */
  EClass getBudgetAmountEntry();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.BudgetAmountEntry#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see budgeting.budgeting.BudgetAmountEntry#getAmount()
   * @see #getBudgetAmountEntry()
   * @generated
   */
  EAttribute getBudgetAmountEntry_Amount();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.BudgetFactorEntry <em>Budget Factor Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Budget Factor Entry</em>'.
   * @see budgeting.budgeting.BudgetFactorEntry
   * @generated
   */
  EClass getBudgetFactorEntry();

  /**
   * Returns the meta object for the reference '{@link budgeting.budgeting.BudgetFactorEntry#getBaseEntry <em>Base Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Entry</em>'.
   * @see budgeting.budgeting.BudgetFactorEntry#getBaseEntry()
   * @see #getBudgetFactorEntry()
   * @generated
   */
  EReference getBudgetFactorEntry_BaseEntry();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.BudgetFactorEntry#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factor</em>'.
   * @see budgeting.budgeting.BudgetFactorEntry#getFactor()
   * @see #getBudgetFactorEntry()
   * @generated
   */
  EAttribute getBudgetFactorEntry_Factor();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.ActualAmountEntry <em>Actual Amount Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Amount Entry</em>'.
   * @see budgeting.budgeting.ActualAmountEntry
   * @generated
   */
  EClass getActualAmountEntry();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.ActualAmountEntry#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see budgeting.budgeting.ActualAmountEntry#getAmount()
   * @see #getActualAmountEntry()
   * @generated
   */
  EAttribute getActualAmountEntry_Amount();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.ActualTransactionEntry <em>Actual Transaction Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Transaction Entry</em>'.
   * @see budgeting.budgeting.ActualTransactionEntry
   * @generated
   */
  EClass getActualTransactionEntry();

  /**
   * Returns the meta object for the containment reference list '{@link budgeting.budgeting.ActualTransactionEntry#getTransactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transactions</em>'.
   * @see budgeting.budgeting.ActualTransactionEntry#getTransactions()
   * @see #getActualTransactionEntry()
   * @generated
   */
  EReference getActualTransactionEntry_Transactions();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.CashTransaction <em>Cash Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cash Transaction</em>'.
   * @see budgeting.budgeting.CashTransaction
   * @generated
   */
  EClass getCashTransaction();

  /**
   * Returns the meta object for class '{@link budgeting.budgeting.CardTransaction <em>Card Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Card Transaction</em>'.
   * @see budgeting.budgeting.CardTransaction
   * @generated
   */
  EClass getCardTransaction();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.CardTransaction#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see budgeting.budgeting.CardTransaction#getFrom()
   * @see #getCardTransaction()
   * @generated
   */
  EAttribute getCardTransaction_From();

  /**
   * Returns the meta object for enum '{@link budgeting.budgeting.MonthEnum <em>Month Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Month Enum</em>'.
   * @see budgeting.budgeting.MonthEnum
   * @generated
   */
  EEnum getMonthEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BudgetingFactory getBudgetingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.BudgetingFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.BudgetingFileImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetingFile()
     * @generated
     */
    EClass BUDGETING_FILE = eINSTANCE.getBudgetingFile();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.LibraryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getLibrary()
     * @generated
     */
    EClass LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__CATEGORIES = eINSTANCE.getLibrary_Categories();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.CategoryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.YearImpl <em>Year</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.YearImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getYear()
     * @generated
     */
    EClass YEAR = eINSTANCE.getYear();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute YEAR__NAME = eINSTANCE.getYear_Name();

    /**
     * The meta object literal for the '<em><b>Library</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference YEAR__LIBRARY = eINSTANCE.getYear_Library();

    /**
     * The meta object literal for the '<em><b>Months</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference YEAR__MONTHS = eINSTANCE.getYear_Months();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.MonthImpl <em>Month</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.MonthImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getMonth()
     * @generated
     */
    EClass MONTH = eINSTANCE.getMonth();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONTH__NAME = eINSTANCE.getMonth_Name();

    /**
     * The meta object literal for the '<em><b>Budget Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONTH__BUDGET_ENTRIES = eINSTANCE.getMonth_BudgetEntries();

    /**
     * The meta object literal for the '<em><b>Actual Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONTH__ACTUAL_ENTRIES = eINSTANCE.getMonth_ActualEntries();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.BudgetEntryImpl <em>Budget Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.BudgetEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetEntry()
     * @generated
     */
    EClass BUDGET_ENTRY = eINSTANCE.getBudgetEntry();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUDGET_ENTRY__CATEGORY = eINSTANCE.getBudgetEntry_Category();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.ActualEntryImpl <em>Actual Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.ActualEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualEntry()
     * @generated
     */
    EClass ACTUAL_ENTRY = eINSTANCE.getActualEntry();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_ENTRY__CATEGORY = eINSTANCE.getActualEntry_Category();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.TransactionImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__AMOUNT = eINSTANCE.getTransaction_Amount();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__DAY = eINSTANCE.getTransaction_Day();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.IncomeCategoryImpl <em>Income Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.IncomeCategoryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getIncomeCategory()
     * @generated
     */
    EClass INCOME_CATEGORY = eINSTANCE.getIncomeCategory();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.ExpenseCategoryImpl <em>Expense Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.ExpenseCategoryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getExpenseCategory()
     * @generated
     */
    EClass EXPENSE_CATEGORY = eINSTANCE.getExpenseCategory();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPENSE_CATEGORY__PATTERNS = eINSTANCE.getExpenseCategory_Patterns();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.BudgetAmountEntryImpl <em>Budget Amount Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.BudgetAmountEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetAmountEntry()
     * @generated
     */
    EClass BUDGET_AMOUNT_ENTRY = eINSTANCE.getBudgetAmountEntry();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET_AMOUNT_ENTRY__AMOUNT = eINSTANCE.getBudgetAmountEntry_Amount();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.BudgetFactorEntryImpl <em>Budget Factor Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.BudgetFactorEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getBudgetFactorEntry()
     * @generated
     */
    EClass BUDGET_FACTOR_ENTRY = eINSTANCE.getBudgetFactorEntry();

    /**
     * The meta object literal for the '<em><b>Base Entry</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUDGET_FACTOR_ENTRY__BASE_ENTRY = eINSTANCE.getBudgetFactorEntry_BaseEntry();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET_FACTOR_ENTRY__FACTOR = eINSTANCE.getBudgetFactorEntry_Factor();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.ActualAmountEntryImpl <em>Actual Amount Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.ActualAmountEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualAmountEntry()
     * @generated
     */
    EClass ACTUAL_AMOUNT_ENTRY = eINSTANCE.getActualAmountEntry();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_AMOUNT_ENTRY__AMOUNT = eINSTANCE.getActualAmountEntry_Amount();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.ActualTransactionEntryImpl <em>Actual Transaction Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.ActualTransactionEntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getActualTransactionEntry()
     * @generated
     */
    EClass ACTUAL_TRANSACTION_ENTRY = eINSTANCE.getActualTransactionEntry();

    /**
     * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS = eINSTANCE.getActualTransactionEntry_Transactions();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.CashTransactionImpl <em>Cash Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.CashTransactionImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCashTransaction()
     * @generated
     */
    EClass CASH_TRANSACTION = eINSTANCE.getCashTransaction();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.impl.CardTransactionImpl <em>Card Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.CardTransactionImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getCardTransaction()
     * @generated
     */
    EClass CARD_TRANSACTION = eINSTANCE.getCardTransaction();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARD_TRANSACTION__FROM = eINSTANCE.getCardTransaction_From();

    /**
     * The meta object literal for the '{@link budgeting.budgeting.MonthEnum <em>Month Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.MonthEnum
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getMonthEnum()
     * @generated
     */
    EEnum MONTH_ENUM = eINSTANCE.getMonthEnum();

  }

} //BudgetingPackage
