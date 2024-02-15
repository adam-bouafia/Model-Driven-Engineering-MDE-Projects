/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.AssociatePartner;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.Scholarship;
import a3_Erasmo_Stanco_Group.University;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erasmus Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getUniversities <em>Universities</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getScholarships <em>Scholarships</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getAssociatePartners <em>Associate Partners</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl#getAdmissionStructure <em>Admission Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErasmusProgramImpl extends MinimalEObjectImpl.Container implements ErasmusProgram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected int totalCredits = TOTAL_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUniversities() <em>Universities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversities()
	 * @generated
	 * @ordered
	 */
	protected EList<University> universities;

	/**
	 * The cached value of the '{@link #getScholarships() <em>Scholarships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScholarships()
	 * @generated
	 * @ordered
	 */
	protected EList<Scholarship> scholarships;

	/**
	 * The cached value of the '{@link #getAssociatePartners() <em>Associate Partners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatePartners()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociatePartner> associatePartners;

	/**
	 * The cached value of the '{@link #getAdmissionStructure() <em>Admission Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionStructure()
	 * @generated
	 * @ordered
	 */
	protected AdmissionStructure admissionStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErasmusProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalCredits() {
		return totalCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCredits(int newTotalCredits) {
		int oldTotalCredits = totalCredits;
		totalCredits = newTotalCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__TOTAL_CREDITS, oldTotalCredits, totalCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<University> getUniversities() {
		if (universities == null) {
			universities = new EObjectContainmentWithInverseEList<University>(University.class, this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM);
		}
		return universities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scholarship> getScholarships() {
		if (scholarships == null) {
			scholarships = new EObjectContainmentWithInverseEList<Scholarship>(Scholarship.class, this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM);
		}
		return scholarships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociatePartner> getAssociatePartners() {
		if (associatePartners == null) {
			associatePartners = new EObjectContainmentWithInverseEList<AssociatePartner>(AssociatePartner.class, this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS, A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM);
		}
		return associatePartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionStructure getAdmissionStructure() {
		return admissionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmissionStructure(AdmissionStructure newAdmissionStructure, NotificationChain msgs) {
		AdmissionStructure oldAdmissionStructure = admissionStructure;
		admissionStructure = newAdmissionStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, oldAdmissionStructure, newAdmissionStructure);
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
	public void setAdmissionStructure(AdmissionStructure newAdmissionStructure) {
		if (newAdmissionStructure != admissionStructure) {
			NotificationChain msgs = null;
			if (admissionStructure != null)
				msgs = ((InternalEObject)admissionStructure).eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM, AdmissionStructure.class, msgs);
			if (newAdmissionStructure != null)
				msgs = ((InternalEObject)newAdmissionStructure).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__ERASMUS_PROGRAM, AdmissionStructure.class, msgs);
			msgs = basicSetAdmissionStructure(newAdmissionStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, newAdmissionStructure, newAdmissionStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidTotalCredits(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ErasmusProgram::ValidTotalCredits";
		try {
			/**
			 *
			 * inv ValidTotalCredits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.totalCredits > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM___VALID_TOTAL_CREDITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int totalCredits = this.getTotalCredits();
				final /*@NonInvalid*/ IntegerValue BOXED_totalCredits = ValueUtil.integerValueOf(totalCredits);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_totalCredits, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUniversities()).basicAdd(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScholarships()).basicAdd(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociatePartners()).basicAdd(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				if (admissionStructure != null)
					msgs = ((InternalEObject)admissionStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, null, msgs);
				return basicSetAdmissionStructure((AdmissionStructure)otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				return ((InternalEList<?>)getUniversities()).basicRemove(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				return ((InternalEList<?>)getScholarships()).basicRemove(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				return ((InternalEList<?>)getAssociatePartners()).basicRemove(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				return basicSetAdmissionStructure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__NAME:
				return getName();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__TOTAL_CREDITS:
				return getTotalCredits();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				return getUniversities();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				return getScholarships();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				return getAssociatePartners();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				return getAdmissionStructure();
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
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__NAME:
				setName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__TOTAL_CREDITS:
				setTotalCredits((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				getUniversities().clear();
				getUniversities().addAll((Collection<? extends University>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				getScholarships().clear();
				getScholarships().addAll((Collection<? extends Scholarship>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				getAssociatePartners().clear();
				getAssociatePartners().addAll((Collection<? extends AssociatePartner>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				setAdmissionStructure((AdmissionStructure)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__TOTAL_CREDITS:
				setTotalCredits(TOTAL_CREDITS_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				getUniversities().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				getScholarships().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				getAssociatePartners().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				setAdmissionStructure((AdmissionStructure)null);
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
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__TOTAL_CREDITS:
				return totalCredits != TOTAL_CREDITS_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES:
				return universities != null && !universities.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS:
				return scholarships != null && !scholarships.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS:
				return associatePartners != null && !associatePartners.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ADMISSION_STRUCTURE:
				return admissionStructure != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM___VALID_TOTAL_CREDITS__DIAGNOSTICCHAIN_MAP:
				return ValidTotalCredits((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", totalCredits: ");
		result.append(totalCredits);
		result.append(')');
		return result.toString();
	}

} //ErasmusProgramImpl
