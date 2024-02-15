/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.DegreeLevel;
import a3_Erasmo_Stanco_Group.DegreeRequirement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Degree Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl#getDegreeName <em>Degree Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl#getFieldOfStudy <em>Field Of Study</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeRequirementImpl extends RequirementImpl implements DegreeRequirement {
	/**
	 * The default value of the '{@link #getDegreeName() <em>Degree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegreeName() <em>Degree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeName()
	 * @generated
	 * @ordered
	 */
	protected String degreeName = DEGREE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldOfStudy() <em>Field Of Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfStudy()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_OF_STUDY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldOfStudy() <em>Field Of Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfStudy()
	 * @generated
	 * @ordered
	 */
	protected String fieldOfStudy = FIELD_OF_STUDY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DegreeLevel LEVEL_EDEFAULT = DegreeLevel.BACHELOR;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected DegreeLevel level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDegreeName() {
		return degreeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegreeName(String newDegreeName) {
		String oldDegreeName = degreeName;
		degreeName = newDegreeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__DEGREE_NAME, oldDegreeName, degreeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldOfStudy(String newFieldOfStudy) {
		String oldFieldOfStudy = fieldOfStudy;
		fieldOfStudy = newFieldOfStudy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__FIELD_OF_STUDY, oldFieldOfStudy, fieldOfStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(DegreeLevel newLevel) {
		DegreeLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__DEGREE_NAME:
				return getDegreeName();
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__FIELD_OF_STUDY:
				return getFieldOfStudy();
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__LEVEL:
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
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__DEGREE_NAME:
				setDegreeName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__FIELD_OF_STUDY:
				setFieldOfStudy((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__LEVEL:
				setLevel((DegreeLevel)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__DEGREE_NAME:
				setDegreeName(DEGREE_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__FIELD_OF_STUDY:
				setFieldOfStudy(FIELD_OF_STUDY_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__LEVEL:
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
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__DEGREE_NAME:
				return DEGREE_NAME_EDEFAULT == null ? degreeName != null : !DEGREE_NAME_EDEFAULT.equals(degreeName);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__FIELD_OF_STUDY:
				return FIELD_OF_STUDY_EDEFAULT == null ? fieldOfStudy != null : !FIELD_OF_STUDY_EDEFAULT.equals(fieldOfStudy);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT__LEVEL:
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
		result.append(" (degreeName: ");
		result.append(degreeName);
		result.append(", fieldOfStudy: ");
		result.append(fieldOfStudy);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //DegreeRequirementImpl
