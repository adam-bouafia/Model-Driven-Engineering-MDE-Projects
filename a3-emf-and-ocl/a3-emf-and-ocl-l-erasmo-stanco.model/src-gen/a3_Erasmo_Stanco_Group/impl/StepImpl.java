/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.ApplicationProcess;
import a3_Erasmo_Stanco_Group.Step;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.StepImpl#getStepName <em>Step Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.StepImpl#getStepDescription <em>Step Description</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.StepImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.StepImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.StepImpl#getApplicationProcess <em>Application Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The default value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected String stepName = STEP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepDescription() <em>Step Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepDescription() <em>Step Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepDescription()
	 * @generated
	 * @ordered
	 */
	protected String stepDescription = STEP_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStepName() {
		return stepName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepName(String newStepName) {
		String oldStepName = stepName;
		stepName = newStepName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.STEP__STEP_NAME, oldStepName, stepName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStepDescription() {
		return stepDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepDescription(String newStepDescription) {
		String oldStepDescription = stepDescription;
		stepDescription = newStepDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.STEP__STEP_DESCRIPTION, oldStepDescription, stepDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.STEP__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.STEP__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProcess getApplicationProcess() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS) return null;
		return (ApplicationProcess)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationProcess(ApplicationProcess newApplicationProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplicationProcess, A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationProcess(ApplicationProcess newApplicationProcess) {
		if (newApplicationProcess != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS && newApplicationProcess != null)) {
			if (EcoreUtil.isAncestor(this, newApplicationProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplicationProcess != null)
				msgs = ((InternalEObject)newApplicationProcess).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS, ApplicationProcess.class, msgs);
			msgs = basicSetApplicationProcess(newApplicationProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS, newApplicationProcess, newApplicationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplicationProcess((ApplicationProcess)otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				return basicSetApplicationProcess(null, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS, ApplicationProcess.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_NAME:
				return getStepName();
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_DESCRIPTION:
				return getStepDescription();
			case A3_Erasmo_Stanco_GroupPackage.STEP__START_DATE:
				return getStartDate();
			case A3_Erasmo_Stanco_GroupPackage.STEP__END_DATE:
				return getEndDate();
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				return getApplicationProcess();
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_NAME:
				setStepName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_DESCRIPTION:
				setStepDescription((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__START_DATE:
				setStartDate((Date)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__END_DATE:
				setEndDate((Date)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				setApplicationProcess((ApplicationProcess)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_NAME:
				setStepName(STEP_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_DESCRIPTION:
				setStepDescription(STEP_DESCRIPTION_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				setApplicationProcess((ApplicationProcess)null);
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
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_NAME:
				return STEP_NAME_EDEFAULT == null ? stepName != null : !STEP_NAME_EDEFAULT.equals(stepName);
			case A3_Erasmo_Stanco_GroupPackage.STEP__STEP_DESCRIPTION:
				return STEP_DESCRIPTION_EDEFAULT == null ? stepDescription != null : !STEP_DESCRIPTION_EDEFAULT.equals(stepDescription);
			case A3_Erasmo_Stanco_GroupPackage.STEP__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case A3_Erasmo_Stanco_GroupPackage.STEP__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS:
				return getApplicationProcess() != null;
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
		result.append(" (stepName: ");
		result.append(stepName);
		result.append(", stepDescription: ");
		result.append(stepDescription);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //StepImpl
