/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.ActualAmountEntry;
import budgeting.budgeting.ActualEntry;
import budgeting.budgeting.ActualTransactionEntry;
import budgeting.budgeting.BudgetAmountEntry;
import budgeting.budgeting.BudgetEntry;
import budgeting.budgeting.BudgetFactorEntry;
import budgeting.budgeting.BudgetingFactory;
import budgeting.budgeting.BudgetingFile;
import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.CardTransaction;
import budgeting.budgeting.CashTransaction;
import budgeting.budgeting.Category;
import budgeting.budgeting.ExpenseCategory;
import budgeting.budgeting.IncomeCategory;
import budgeting.budgeting.Library;
import budgeting.budgeting.Month;
import budgeting.budgeting.MonthEnum;
import budgeting.budgeting.Transaction;
import budgeting.budgeting.Year;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BudgetingPackageImpl extends EPackageImpl implements BudgetingPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass budgetingFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yearEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass budgetEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass incomeCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expenseCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass budgetAmountEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass budgetFactorEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualAmountEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualTransactionEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cashTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardTransactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum monthEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see budgeting.budgeting.BudgetingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BudgetingPackageImpl()
  {
    super(eNS_URI, BudgetingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BudgetingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BudgetingPackage init()
  {
    if (isInited) return (BudgetingPackage)EPackage.Registry.INSTANCE.getEPackage(BudgetingPackage.eNS_URI);

    // Obtain or create and register package
    BudgetingPackageImpl theBudgetingPackage = (BudgetingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BudgetingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BudgetingPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBudgetingPackage.createPackageContents();

    // Initialize created meta-data
    theBudgetingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBudgetingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BudgetingPackage.eNS_URI, theBudgetingPackage);
    return theBudgetingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBudgetingFile()
  {
    return budgetingFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibrary()
  {
    return libraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLibrary_Name()
  {
    return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLibrary_Categories()
  {
    return (EReference)libraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory()
  {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCategory_Name()
  {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYear()
  {
    return yearEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYear_Name()
  {
    return (EAttribute)yearEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getYear_Library()
  {
    return (EReference)yearEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getYear_Months()
  {
    return (EReference)yearEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonth()
  {
    return monthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonth_Name()
  {
    return (EAttribute)monthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonth_BudgetEntries()
  {
    return (EReference)monthEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonth_ActualEntries()
  {
    return (EReference)monthEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBudgetEntry()
  {
    return budgetEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBudgetEntry_Category()
  {
    return (EReference)budgetEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualEntry()
  {
    return actualEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActualEntry_Category()
  {
    return (EReference)actualEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransaction()
  {
    return transactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Amount()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Day()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncomeCategory()
  {
    return incomeCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpenseCategory()
  {
    return expenseCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpenseCategory_Patterns()
  {
    return (EAttribute)expenseCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBudgetAmountEntry()
  {
    return budgetAmountEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudgetAmountEntry_Amount()
  {
    return (EAttribute)budgetAmountEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBudgetFactorEntry()
  {
    return budgetFactorEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBudgetFactorEntry_BaseEntry()
  {
    return (EReference)budgetFactorEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudgetFactorEntry_Factor()
  {
    return (EAttribute)budgetFactorEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualAmountEntry()
  {
    return actualAmountEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActualAmountEntry_Amount()
  {
    return (EAttribute)actualAmountEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualTransactionEntry()
  {
    return actualTransactionEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActualTransactionEntry_Transactions()
  {
    return (EReference)actualTransactionEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCashTransaction()
  {
    return cashTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCardTransaction()
  {
    return cardTransactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCardTransaction_From()
  {
    return (EAttribute)cardTransactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMonthEnum()
  {
    return monthEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingFactory getBudgetingFactory()
  {
    return (BudgetingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    budgetingFileEClass = createEClass(BUDGETING_FILE);

    libraryEClass = createEClass(LIBRARY);
    createEAttribute(libraryEClass, LIBRARY__NAME);
    createEReference(libraryEClass, LIBRARY__CATEGORIES);

    categoryEClass = createEClass(CATEGORY);
    createEAttribute(categoryEClass, CATEGORY__NAME);

    yearEClass = createEClass(YEAR);
    createEAttribute(yearEClass, YEAR__NAME);
    createEReference(yearEClass, YEAR__LIBRARY);
    createEReference(yearEClass, YEAR__MONTHS);

    monthEClass = createEClass(MONTH);
    createEAttribute(monthEClass, MONTH__NAME);
    createEReference(monthEClass, MONTH__BUDGET_ENTRIES);
    createEReference(monthEClass, MONTH__ACTUAL_ENTRIES);

    budgetEntryEClass = createEClass(BUDGET_ENTRY);
    createEReference(budgetEntryEClass, BUDGET_ENTRY__CATEGORY);

    actualEntryEClass = createEClass(ACTUAL_ENTRY);
    createEReference(actualEntryEClass, ACTUAL_ENTRY__CATEGORY);

    transactionEClass = createEClass(TRANSACTION);
    createEAttribute(transactionEClass, TRANSACTION__AMOUNT);
    createEAttribute(transactionEClass, TRANSACTION__DAY);

    incomeCategoryEClass = createEClass(INCOME_CATEGORY);

    expenseCategoryEClass = createEClass(EXPENSE_CATEGORY);
    createEAttribute(expenseCategoryEClass, EXPENSE_CATEGORY__PATTERNS);

    budgetAmountEntryEClass = createEClass(BUDGET_AMOUNT_ENTRY);
    createEAttribute(budgetAmountEntryEClass, BUDGET_AMOUNT_ENTRY__AMOUNT);

    budgetFactorEntryEClass = createEClass(BUDGET_FACTOR_ENTRY);
    createEReference(budgetFactorEntryEClass, BUDGET_FACTOR_ENTRY__BASE_ENTRY);
    createEAttribute(budgetFactorEntryEClass, BUDGET_FACTOR_ENTRY__FACTOR);

    actualAmountEntryEClass = createEClass(ACTUAL_AMOUNT_ENTRY);
    createEAttribute(actualAmountEntryEClass, ACTUAL_AMOUNT_ENTRY__AMOUNT);

    actualTransactionEntryEClass = createEClass(ACTUAL_TRANSACTION_ENTRY);
    createEReference(actualTransactionEntryEClass, ACTUAL_TRANSACTION_ENTRY__TRANSACTIONS);

    cashTransactionEClass = createEClass(CASH_TRANSACTION);

    cardTransactionEClass = createEClass(CARD_TRANSACTION);
    createEAttribute(cardTransactionEClass, CARD_TRANSACTION__FROM);

    // Create enums
    monthEnumEEnum = createEEnum(MONTH_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    libraryEClass.getESuperTypes().add(this.getBudgetingFile());
    yearEClass.getESuperTypes().add(this.getBudgetingFile());
    incomeCategoryEClass.getESuperTypes().add(this.getCategory());
    expenseCategoryEClass.getESuperTypes().add(this.getCategory());
    budgetAmountEntryEClass.getESuperTypes().add(this.getBudgetEntry());
    budgetFactorEntryEClass.getESuperTypes().add(this.getBudgetEntry());
    actualAmountEntryEClass.getESuperTypes().add(this.getActualEntry());
    actualTransactionEntryEClass.getESuperTypes().add(this.getActualEntry());
    cashTransactionEClass.getESuperTypes().add(this.getTransaction());
    cardTransactionEClass.getESuperTypes().add(this.getTransaction());

    // Initialize classes and features; add operations and parameters
    initEClass(budgetingFileEClass, BudgetingFile.class, "BudgetingFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Categories(), this.getCategory(), null, "categories", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getYear_Name(), ecorePackage.getEInt(), "name", null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getYear_Library(), this.getLibrary(), null, "library", null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getYear_Months(), this.getMonth(), null, "months", null, 0, -1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monthEClass, Month.class, "Month", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMonth_Name(), this.getMonthEnum(), "name", null, 0, 1, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMonth_BudgetEntries(), this.getBudgetEntry(), null, "budgetEntries", null, 0, -1, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMonth_ActualEntries(), this.getActualEntry(), null, "actualEntries", null, 0, -1, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(budgetEntryEClass, BudgetEntry.class, "BudgetEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBudgetEntry_Category(), this.getCategory(), null, "category", null, 0, 1, BudgetEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualEntryEClass, ActualEntry.class, "ActualEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActualEntry_Category(), this.getCategory(), null, "category", null, 0, 1, ActualEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransaction_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(incomeCategoryEClass, IncomeCategory.class, "IncomeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expenseCategoryEClass, ExpenseCategory.class, "ExpenseCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpenseCategory_Patterns(), ecorePackage.getEString(), "patterns", null, 0, -1, ExpenseCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(budgetAmountEntryEClass, BudgetAmountEntry.class, "BudgetAmountEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBudgetAmountEntry_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, BudgetAmountEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(budgetFactorEntryEClass, BudgetFactorEntry.class, "BudgetFactorEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBudgetFactorEntry_BaseEntry(), this.getBudgetEntry(), null, "baseEntry", null, 0, 1, BudgetFactorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBudgetFactorEntry_Factor(), ecorePackage.getEDouble(), "factor", null, 0, 1, BudgetFactorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualAmountEntryEClass, ActualAmountEntry.class, "ActualAmountEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActualAmountEntry_Amount(), ecorePackage.getELong(), "amount", null, 0, 1, ActualAmountEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualTransactionEntryEClass, ActualTransactionEntry.class, "ActualTransactionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActualTransactionEntry_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, ActualTransactionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cashTransactionEClass, CashTransaction.class, "CashTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cardTransactionEClass, CardTransaction.class, "CardTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardTransaction_From(), ecorePackage.getEString(), "from", null, 0, 1, CardTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(monthEnumEEnum, MonthEnum.class, "MonthEnum");
    addEEnumLiteral(monthEnumEEnum, MonthEnum.JANUARY);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.FEBRUARY);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.MARCH);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.APRIL);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.MAY);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.JUNE);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.JULY);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.AUGUST);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.SEPTEMBER);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.OCTOBER);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.NOVEMBER);
    addEEnumLiteral(monthEnumEEnum, MonthEnum.DECEMBER);

    // Create resource
    createResource(eNS_URI);
  }

} //BudgetingPackageImpl
