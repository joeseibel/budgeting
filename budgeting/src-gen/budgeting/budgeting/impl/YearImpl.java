/**
 */
package budgeting.budgeting.impl;

import budgeting.budgeting.BudgetingPackage;
import budgeting.budgeting.Library;
import budgeting.budgeting.Month;
import budgeting.budgeting.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link budgeting.budgeting.impl.YearImpl#getName <em>Name</em>}</li>
 *   <li>{@link budgeting.budgeting.impl.YearImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link budgeting.budgeting.impl.YearImpl#getMonths <em>Months</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends BudgetingFileImpl implements Year
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final int NAME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected int name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected Library library;

  /**
   * The cached value of the '{@link #getMonths() <em>Months</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonths()
   * @generated
   * @ordered
   */
  protected EList<Month> months;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YearImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BudgetingPackage.Literals.YEAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(int newName)
  {
    int oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BudgetingPackage.YEAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library getLibrary()
  {
    if (library != null && library.eIsProxy())
    {
      InternalEObject oldLibrary = (InternalEObject)library;
      library = (Library)eResolveProxy(oldLibrary);
      if (library != oldLibrary)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetingPackage.YEAR__LIBRARY, oldLibrary, library));
      }
    }
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library basicGetLibrary()
  {
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLibrary(Library newLibrary)
  {
    Library oldLibrary = library;
    library = newLibrary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BudgetingPackage.YEAR__LIBRARY, oldLibrary, library));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Month> getMonths()
  {
    if (months == null)
    {
      months = new EObjectContainmentEList<Month>(Month.class, this, BudgetingPackage.YEAR__MONTHS);
    }
    return months;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BudgetingPackage.YEAR__MONTHS:
        return ((InternalEList<?>)getMonths()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BudgetingPackage.YEAR__NAME:
        return getName();
      case BudgetingPackage.YEAR__LIBRARY:
        if (resolve) return getLibrary();
        return basicGetLibrary();
      case BudgetingPackage.YEAR__MONTHS:
        return getMonths();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BudgetingPackage.YEAR__NAME:
        setName((Integer)newValue);
        return;
      case BudgetingPackage.YEAR__LIBRARY:
        setLibrary((Library)newValue);
        return;
      case BudgetingPackage.YEAR__MONTHS:
        getMonths().clear();
        getMonths().addAll((Collection<? extends Month>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BudgetingPackage.YEAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BudgetingPackage.YEAR__LIBRARY:
        setLibrary((Library)null);
        return;
      case BudgetingPackage.YEAR__MONTHS:
        getMonths().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BudgetingPackage.YEAR__NAME:
        return name != NAME_EDEFAULT;
      case BudgetingPackage.YEAR__LIBRARY:
        return library != null;
      case BudgetingPackage.YEAR__MONTHS:
        return months != null && !months.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //YearImpl
