/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BudgetingFactoryImpl extends EFactoryImpl implements BudgetingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BudgetingFactory init()
  {
    try
    {
      BudgetingFactory theBudgetingFactory = (BudgetingFactory)EPackage.Registry.INSTANCE.getEFactory(BudgetingPackage.eNS_URI);
      if (theBudgetingFactory != null)
      {
        return theBudgetingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BudgetingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BudgetingPackage.BUDGETING_FILE: return createBudgetingFile();
      case BudgetingPackage.LIBRARY: return createLibrary();
      case BudgetingPackage.CATEGORY: return createCategory();
      case BudgetingPackage.YEAR: return createYear();
      case BudgetingPackage.MONTH: return createMonth();
      case BudgetingPackage.BUDGET_ENTRY: return createBudgetEntry();
      case BudgetingPackage.ACTUAL_ENTRY: return createActualEntry();
      case BudgetingPackage.TRANSACTION: return createTransaction();
      case BudgetingPackage.INCOME_CATEGORY: return createIncomeCategory();
      case BudgetingPackage.EXPENSE_CATEGORY: return createExpenseCategory();
      case BudgetingPackage.BUDGET_AMOUNT_ENTRY: return createBudgetAmountEntry();
      case BudgetingPackage.BUDGET_FACTOR_ENTRY: return createBudgetFactorEntry();
      case BudgetingPackage.ACTUAL_AMOUNT_ENTRY: return createActualAmountEntry();
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY: return createActualTransactionEntry();
      case BudgetingPackage.CASH_TRANSACTION: return createCashTransaction();
      case BudgetingPackage.CARD_TRANSACTION: return createCardTransaction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BudgetingPackage.MONTH_ENUM:
        return createMonthEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BudgetingPackage.MONTH_ENUM:
        return convertMonthEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingFile createBudgetingFile()
  {
    BudgetingFileImpl budgetingFile = new BudgetingFileImpl();
    return budgetingFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library createLibrary()
  {
    LibraryImpl library = new LibraryImpl();
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory()
  {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Year createYear()
  {
    YearImpl year = new YearImpl();
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Month createMonth()
  {
    MonthImpl month = new MonthImpl();
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetEntry createBudgetEntry()
  {
    BudgetEntryImpl budgetEntry = new BudgetEntryImpl();
    return budgetEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualEntry createActualEntry()
  {
    ActualEntryImpl actualEntry = new ActualEntryImpl();
    return actualEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncomeCategory createIncomeCategory()
  {
    IncomeCategoryImpl incomeCategory = new IncomeCategoryImpl();
    return incomeCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpenseCategory createExpenseCategory()
  {
    ExpenseCategoryImpl expenseCategory = new ExpenseCategoryImpl();
    return expenseCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetAmountEntry createBudgetAmountEntry()
  {
    BudgetAmountEntryImpl budgetAmountEntry = new BudgetAmountEntryImpl();
    return budgetAmountEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetFactorEntry createBudgetFactorEntry()
  {
    BudgetFactorEntryImpl budgetFactorEntry = new BudgetFactorEntryImpl();
    return budgetFactorEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualAmountEntry createActualAmountEntry()
  {
    ActualAmountEntryImpl actualAmountEntry = new ActualAmountEntryImpl();
    return actualAmountEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualTransactionEntry createActualTransactionEntry()
  {
    ActualTransactionEntryImpl actualTransactionEntry = new ActualTransactionEntryImpl();
    return actualTransactionEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CashTransaction createCashTransaction()
  {
    CashTransactionImpl cashTransaction = new CashTransactionImpl();
    return cashTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardTransaction createCardTransaction()
  {
    CardTransactionImpl cardTransaction = new CardTransactionImpl();
    return cardTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthEnum createMonthEnumFromString(EDataType eDataType, String initialValue)
  {
    MonthEnum result = MonthEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMonthEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingPackage getBudgetingPackage()
  {
    return (BudgetingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BudgetingPackage getPackage()
  {
    return BudgetingPackage.eINSTANCE;
  }

} //BudgetingFactoryImpl
