/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.Location;
import a3_Erasmo_Stanco_Group.University;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.LocationImpl#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.LocationImpl#getCityName <em>City Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.LocationImpl#getUniversity <em>University</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getCountryName() <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryName() <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected String countryName = COUNTRY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCityName() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityName() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected String cityName = CITY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryName() {
		return countryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryName(String newCountryName) {
		String oldCountryName = countryName;
		countryName = newCountryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.LOCATION__COUNTRY_NAME, oldCountryName, countryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCityName() {
		return cityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityName(String newCityName) {
		String oldCityName = cityName;
		cityName = newCityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.LOCATION__CITY_NAME, oldCityName, cityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniversity, A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject)newUniversity).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION, University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY, newUniversity, newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUniversity((University)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				return basicSetUniversity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION, University.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__COUNTRY_NAME:
				return getCountryName();
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__CITY_NAME:
				return getCityName();
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				return getUniversity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__COUNTRY_NAME:
				setCountryName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__CITY_NAME:
				setCityName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				setUniversity((University)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__COUNTRY_NAME:
				setCountryName(COUNTRY_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__CITY_NAME:
				setCityName(CITY_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				setUniversity((University)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__COUNTRY_NAME:
				return COUNTRY_NAME_EDEFAULT == null ? countryName != null : !COUNTRY_NAME_EDEFAULT.equals(countryName);
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__CITY_NAME:
				return CITY_NAME_EDEFAULT == null ? cityName != null : !CITY_NAME_EDEFAULT.equals(cityName);
			case A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY:
				return getUniversity() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (countryName: ");
		result.append(countryName);
		result.append(", cityName: ");
		result.append(cityName);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
