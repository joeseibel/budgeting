/**
 */
package budgeting.budgeting.util;

import budgeting.budgeting.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see budgeting.budgeting.BudgetingPackage
 * @generated
 */
public class BudgetingSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BudgetingPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BudgetingPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BudgetingPackage.BUDGETING_FILE:
      {
        BudgetingFile budgetingFile = (BudgetingFile)theEObject;
        T result = caseBudgetingFile(budgetingFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.LIBRARY:
      {
        Library library = (Library)theEObject;
        T result = caseLibrary(library);
        if (result == null) result = caseBudgetingFile(library);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.YEAR:
      {
        Year year = (Year)theEObject;
        T result = caseYear(year);
        if (result == null) result = caseBudgetingFile(year);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.MONTH:
      {
        Month month = (Month)theEObject;
        T result = caseMonth(month);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.BUDGET_ENTRY:
      {
        BudgetEntry budgetEntry = (BudgetEntry)theEObject;
        T result = caseBudgetEntry(budgetEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.ACTUAL_ENTRY:
      {
        ActualEntry actualEntry = (ActualEntry)theEObject;
        T result = caseActualEntry(actualEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.TRANSACTION:
      {
        Transaction transaction = (Transaction)theEObject;
        T result = caseTransaction(transaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.ENTRY:
      {
        Entry entry = (Entry)theEObject;
        T result = caseEntry(entry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.BUDGET_AMOUNT_ENTRY:
      {
        BudgetAmountEntry budgetAmountEntry = (BudgetAmountEntry)theEObject;
        T result = caseBudgetAmountEntry(budgetAmountEntry);
        if (result == null) result = caseBudgetEntry(budgetAmountEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.BUDGET_FACTOR_ENTRY:
      {
        BudgetFactorEntry budgetFactorEntry = (BudgetFactorEntry)theEObject;
        T result = caseBudgetFactorEntry(budgetFactorEntry);
        if (result == null) result = caseBudgetEntry(budgetFactorEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.ACTUAL_AMOUNT_ENTRY:
      {
        ActualAmountEntry actualAmountEntry = (ActualAmountEntry)theEObject;
        T result = caseActualAmountEntry(actualAmountEntry);
        if (result == null) result = caseActualEntry(actualAmountEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.ACTUAL_TRANSACTION_ENTRY:
      {
        ActualTransactionEntry actualTransactionEntry = (ActualTransactionEntry)theEObject;
        T result = caseActualTransactionEntry(actualTransactionEntry);
        if (result == null) result = caseActualEntry(actualTransactionEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.CASH_TRANSACTION:
      {
        CashTransaction cashTransaction = (CashTransaction)theEObject;
        T result = caseCashTransaction(cashTransaction);
        if (result == null) result = caseTransaction(cashTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BudgetingPackage.CARD_TRANSACTION:
      {
        CardTransaction cardTransaction = (CardTransaction)theEObject;
        T result = caseCardTransaction(cardTransaction);
        if (result == null) result = caseTransaction(cardTransaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBudgetingFile(BudgetingFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLibrary(Library object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Year</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYear(Year object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Month</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonth(Month object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Budget Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Budget Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBudgetEntry(BudgetEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualEntry(ActualEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransaction(Transaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntry(Entry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Budget Amount Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Budget Amount Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBudgetAmountEntry(BudgetAmountEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Budget Factor Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Budget Factor Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBudgetFactorEntry(BudgetFactorEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Amount Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Amount Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualAmountEntry(ActualAmountEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Transaction Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Transaction Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualTransactionEntry(ActualTransactionEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cash Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cash Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCashTransaction(CashTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Card Transaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Card Transaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardTransaction(CardTransaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BudgetingSwitch
