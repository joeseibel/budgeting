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
   * The feature id for the '<em><b>Income</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__INCOME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = 1;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 2;

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
   * The meta object id for the '{@link budgeting.budgeting.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.impl.EntryImpl
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 5;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__CATEGORY = 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__AMOUNT = 1;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link budgeting.budgeting.MonthEnum <em>Month Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see budgeting.budgeting.MonthEnum
   * @see budgeting.budgeting.impl.BudgetingPackageImpl#getMonthEnum()
   * @generated
   */
  int MONTH_ENUM = 6;


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
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Category#isIncome <em>Income</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Income</em>'.
   * @see budgeting.budgeting.Category#isIncome()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Income();

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
   * Returns the meta object for class '{@link budgeting.budgeting.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see budgeting.budgeting.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the reference '{@link budgeting.budgeting.Entry#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see budgeting.budgeting.Entry#getCategory()
   * @see #getEntry()
   * @generated
   */
  EReference getEntry_Category();

  /**
   * Returns the meta object for the attribute '{@link budgeting.budgeting.Entry#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see budgeting.budgeting.Entry#getAmount()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Amount();

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
     * The meta object literal for the '<em><b>Income</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__INCOME = eINSTANCE.getCategory_Income();

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
     * The meta object literal for the '{@link budgeting.budgeting.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see budgeting.budgeting.impl.EntryImpl
     * @see budgeting.budgeting.impl.BudgetingPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY__CATEGORY = eINSTANCE.getEntry_Category();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__AMOUNT = eINSTANCE.getEntry_Amount();

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
