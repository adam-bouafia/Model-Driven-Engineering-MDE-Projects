/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.ApplicationProcess;
import a3_Erasmo_Stanco_Group.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl#getAdmissionStructure <em>Admission Structure</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationProcessImpl extends MinimalEObjectImpl.Container implements ApplicationProcess {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.APPLICATION_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionStructure getAdmissionStructure() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE) return null;
		return (AdmissionStructure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmissionStructure(AdmissionStructure newAdmissionStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdmissionStructure, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdmissionStructure(AdmissionStructure newAdmissionStructure) {
		if (newAdmissionStructure != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE && newAdmissionStructure != null)) {
			if (EcoreUtil.isAncestor(this, newAdmissionStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdmissionStructure != null)
				msgs = ((InternalEObject)newAdmissionStructure).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS, AdmissionStructure.class, msgs);
			msgs = basicSetAdmissionStructure(newAdmissionStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE, newAdmissionStructure, newAdmissionStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<Step>(Step.class, this, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS, A3_Erasmo_Stanco_GroupPackage.STEP__APPLICATION_PROCESS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdmissionStructure((AdmissionStructure)otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				return basicSetAdmissionStructure(null, msgs);
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS, AdmissionStructure.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				return getAdmissionStructure();
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				return getSteps();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				setAdmissionStructure((AdmissionStructure)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				setAdmissionStructure((AdmissionStructure)null);
				return;
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				getSteps().clear();
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
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE:
				return getAdmissionStructure() != null;
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__STEPS:
				return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationProcessImpl
