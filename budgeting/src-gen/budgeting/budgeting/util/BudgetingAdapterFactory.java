/**
 */
package budgeting.budgeting.util;

import budgeting.budgeting.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see budgeting.budgeting.BudgetingPackage
 * @generated
 */
public class BudgetingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BudgetingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BudgetingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BudgetingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BudgetingSwitch<Adapter> modelSwitch =
    new BudgetingSwitch<Adapter>()
    {
      @Override
      public Adapter caseBudgetingFile(BudgetingFile object)
      {
        return createBudgetingFileAdapter();
      }
      @Override
      public Adapter caseLibrary(Library object)
      {
        return createLibraryAdapter();
      }
      @Override
      public Adapter caseCategory(Category object)
      {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseYear(Year object)
      {
        return createYearAdapter();
      }
      @Override
      public Adapter caseMonth(Month object)
      {
        return createMonthAdapter();
      }
      @Override
      public Adapter caseBudgetEntry(BudgetEntry object)
      {
        return createBudgetEntryAdapter();
      }
      @Override
      public Adapter caseActualEntry(ActualEntry object)
      {
        return createActualEntryAdapter();
      }
      @Override
      public Adapter caseTransaction(Transaction object)
      {
        return createTransactionAdapter();
      }
      @Override
      public Adapter caseEntry(Entry object)
      {
        return createEntryAdapter();
      }
      @Override
      public Adapter caseBudgetAmountEntry(BudgetAmountEntry object)
      {
        return createBudgetAmountEntryAdapter();
      }
      @Override
      public Adapter caseBudgetFactorEntry(BudgetFactorEntry object)
      {
        return createBudgetFactorEntryAdapter();
      }
      @Override
      public Adapter caseActualAmountEntry(ActualAmountEntry object)
      {
        return createActualAmountEntryAdapter();
      }
      @Override
      public Adapter caseActualTransactionEntry(ActualTransactionEntry object)
      {
        return createActualTransactionEntryAdapter();
      }
      @Override
      public Adapter caseCashTransaction(CashTransaction object)
      {
        return createCashTransactionAdapter();
      }
      @Override
      public Adapter caseCardTransaction(CardTransaction object)
      {
        return createCardTransactionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.BudgetingFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.BudgetingFile
   * @generated
   */
  public Adapter createBudgetingFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Library
   * @generated
   */
  public Adapter createLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Category
   * @generated
   */
  public Adapter createCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Year <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Year
   * @generated
   */
  public Adapter createYearAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Month <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Month
   * @generated
   */
  public Adapter createMonthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.BudgetEntry <em>Budget Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.BudgetEntry
   * @generated
   */
  public Adapter createBudgetEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.ActualEntry <em>Actual Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.ActualEntry
   * @generated
   */
  public Adapter createActualEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Transaction
   * @generated
   */
  public Adapter createTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.Entry
   * @generated
   */
  public Adapter createEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.BudgetAmountEntry <em>Budget Amount Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.BudgetAmountEntry
   * @generated
   */
  public Adapter createBudgetAmountEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.BudgetFactorEntry <em>Budget Factor Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.BudgetFactorEntry
   * @generated
   */
  public Adapter createBudgetFactorEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.ActualAmountEntry <em>Actual Amount Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.ActualAmountEntry
   * @generated
   */
  public Adapter createActualAmountEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.ActualTransactionEntry <em>Actual Transaction Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.ActualTransactionEntry
   * @generated
   */
  public Adapter createActualTransactionEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.CashTransaction <em>Cash Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.CashTransaction
   * @generated
   */
  public Adapter createCashTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link budgeting.budgeting.CardTransaction <em>Card Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see budgeting.budgeting.CardTransaction
   * @generated
   */
  public Adapter createCardTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BudgetingAdapterFactory
