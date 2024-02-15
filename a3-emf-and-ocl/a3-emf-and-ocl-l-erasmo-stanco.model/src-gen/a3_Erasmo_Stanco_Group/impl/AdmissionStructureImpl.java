/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.ApplicationProcess;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.Requirement;
import a3_Erasmo_Stanco_Group.Results;

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
 * An implementation of the model object '<em><b>Admission Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl#getErasmusProgram <em>Erasmus Program</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl#getApplicationProcess <em>Application Process</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl#getRequierements <em>Requierements</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdmissionStructureImpl extends MinimalEObjectImpl.Container implements AdmissionStructure {
	/**
	 * The cached value of the '{@link #getApplicationProcess() <em>Application Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationProcess()
	 * @generated
	 * @ordered
	 */
	protected ApplicationProcess applicationProcess;

	/**
	 * The cached value of the '{@link #getRequierements() <em>Requierements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequierements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requierements;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Results> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmissionStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErasmusProgram getErasmusProgram() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM) return null;
		return (ErasmusProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErasmusProgram(ErasmusProgram newErasmusProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newErasmusProgram, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasmusProgram(ErasmusProgram newErasmusProgram) {
		if (newErasmusProgram != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM && newErasmusProgram != null)) {
			if (EcoreUtil.isAncestor(this, newErasmusProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newErasmusProgram != null)
				msgs = ((InternalEObject)newErasmusProgram).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, ErasmusProgram.class, msgs);
			msgs = basicSetErasmusProgram(newErasmusProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM, newErasmusProgram, newErasmusProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProcess getApplicationProcess() {
		return applicationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationProcess(ApplicationProcess newApplicationProcess, NotificationChain msgs) {
		ApplicationProcess oldApplicationProcess = applicationProcess;
		applicationProcess = newApplicationProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS, oldApplicationProcess, newApplicationProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationProcess(ApplicationProcess newApplicationProcess) {
		if (newApplicationProcess != applicationProcess) {
			NotificationChain msgs = null;
			if (applicationProcess != null)
				msgs = ((InternalEObject)applicationProcess).eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE, ApplicationProcess.class, msgs);
			if (newApplicationProcess != null)
				msgs = ((InternalEObject)newApplicationProcess).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS__ADMISSION_STRUCTURE, ApplicationProcess.class, msgs);
			msgs = basicSetApplicationProcess(newApplicationProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS, newApplicationProcess, newApplicationProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequierements() {
		if (requierements == null) {
			requierements = new EObjectContainmentWithInverseEList<Requirement>(Requirement.class, this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS, A3_Erasmo_Stanco_GroupPackage.REQUIREMENT__ADMISSION_STRUCTURE);
		}
		return requierements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Results> getResults() {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<Results>(Results.class, this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS, A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE);
		}
		return results;
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetErasmusProgram((ErasmusProgram)otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				if (applicationProcess != null)
					msgs = ((InternalEObject)applicationProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS, null, msgs);
				return basicSetApplicationProcess((ApplicationProcess)otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequierements()).basicAdd(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				return basicSetErasmusProgram(null, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				return basicSetApplicationProcess(null, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				return ((InternalEList<?>)getRequierements()).basicRemove(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, ErasmusProgram.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				return getErasmusProgram();
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				return getApplicationProcess();
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				return getRequierements();
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				return getResults();
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				setApplicationProcess((ApplicationProcess)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				getRequierements().clear();
				getRequierements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Results>)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)null);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				setApplicationProcess((ApplicationProcess)null);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				getRequierements().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				getResults().clear();
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
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM:
				return getErasmusProgram() != null;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
				return applicationProcess != null;
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
				return requierements != null && !requierements.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				return results != null && !results.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdmissionStructureImpl
