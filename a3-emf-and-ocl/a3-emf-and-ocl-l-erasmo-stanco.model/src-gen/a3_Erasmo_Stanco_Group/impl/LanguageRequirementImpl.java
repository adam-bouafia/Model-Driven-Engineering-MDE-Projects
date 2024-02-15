/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.LanguageLevel;
import a3_Erasmo_Stanco_Group.LanguageRequirement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl#getLanguageName <em>Language Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageRequirementImpl extends RequirementImpl implements LanguageRequirement {
	/**
	 * The default value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected String languageName = LANGUAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageLevel LEVEL_EDEFAULT = LanguageLevel.A1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LanguageLevel level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageName(String newLanguageName) {
		String oldLanguageName = languageName;
		languageName = newLanguageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LANGUAGE_NAME, oldLanguageName, languageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(LanguageLevel newLevel) {
		LanguageLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LANGUAGE_NAME:
				return getLanguageName();
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LEVEL:
				return getLevel();
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
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LANGUAGE_NAME:
				setLanguageName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LEVEL:
				setLevel((LanguageLevel)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LANGUAGE_NAME:
				setLanguageName(LANGUAGE_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LANGUAGE_NAME:
				return LANGUAGE_NAME_EDEFAULT == null ? languageName != null : !LANGUAGE_NAME_EDEFAULT.equals(languageName);
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT__LEVEL:
				return level != LEVEL_EDEFAULT;
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
		result.append(" (languageName: ");
		result.append(languageName);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //LanguageRequirementImpl
