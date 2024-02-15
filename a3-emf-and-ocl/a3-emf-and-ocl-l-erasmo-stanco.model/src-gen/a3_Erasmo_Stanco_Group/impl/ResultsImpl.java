/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.Results;

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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl#getYear <em>Year</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl#getTotalAdmitted <em>Total Admitted</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl#getScholarshipsAwarded <em>Scholarships Awarded</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl#getAdmittedStudents <em>Admitted Students</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl#getAdmissionStructure <em>Admission Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsImpl extends MinimalEObjectImpl.Container implements Results {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAdmitted() <em>Total Admitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAdmitted()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_ADMITTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalAdmitted() <em>Total Admitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAdmitted()
	 * @generated
	 * @ordered
	 */
	protected int totalAdmitted = TOTAL_ADMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getScholarshipsAwarded() <em>Scholarships Awarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScholarshipsAwarded()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHOLARSHIPS_AWARDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScholarshipsAwarded() <em>Scholarships Awarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScholarshipsAwarded()
	 * @generated
	 * @ordered
	 */
	protected int scholarshipsAwarded = SCHOLARSHIPS_AWARDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdmittedStudents() <em>Admitted Students</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittedStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> admittedStudents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.RESULTS__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalAdmitted() {
		return totalAdmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAdmitted(int newTotalAdmitted) {
		int oldTotalAdmitted = totalAdmitted;
		totalAdmitted = newTotalAdmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.RESULTS__TOTAL_ADMITTED, oldTotalAdmitted, totalAdmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScholarshipsAwarded() {
		return scholarshipsAwarded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScholarshipsAwarded(int newScholarshipsAwarded) {
		int oldScholarshipsAwarded = scholarshipsAwarded;
		scholarshipsAwarded = newScholarshipsAwarded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.RESULTS__SCHOLARSHIPS_AWARDED, oldScholarshipsAwarded, scholarshipsAwarded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAdmittedStudents() {
		if (admittedStudents == null) {
			admittedStudents = new EDataTypeUniqueEList<String>(String.class, this, A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMITTED_STUDENTS);
		}
		return admittedStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionStructure getAdmissionStructure() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE) return null;
		return (AdmissionStructure)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmissionStructure(AdmissionStructure newAdmissionStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdmissionStructure, A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdmissionStructure(AdmissionStructure newAdmissionStructure) {
		if (newAdmissionStructure != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE && newAdmissionStructure != null)) {
			if (EcoreUtil.isAncestor(this, newAdmissionStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdmissionStructure != null)
				msgs = ((InternalEObject)newAdmissionStructure).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS, AdmissionStructure.class, msgs);
			msgs = basicSetAdmissionStructure(newAdmissionStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE, newAdmissionStructure, newAdmissionStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidTotalAdmitted(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Results::ValidTotalAdmitted";
		try {
			/**
			 *
			 * inv ValidTotalAdmitted:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.totalAdmitted >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS___VALID_TOTAL_ADMITTED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int totalAdmitted = this.getTotalAdmitted();
				final /*@NonInvalid*/ IntegerValue BOXED_totalAdmitted = ValueUtil.integerValueOf(totalAdmitted);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_totalAdmitted, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
	@Override
	public boolean ValidScholarshipsAwarded(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Results::ValidScholarshipsAwarded";
		try {
			/**
			 *
			 * inv ValidScholarshipsAwarded:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.scholarshipsAwarded >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS___VALID_SCHOLARSHIPS_AWARDED__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int scholarshipsAwarded = this.getScholarshipsAwarded();
				final /*@NonInvalid*/ IntegerValue BOXED_scholarshipsAwarded = ValueUtil.integerValueOf(scholarshipsAwarded);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_scholarshipsAwarded, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
	@Override
	public boolean ValidYear(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Results::ValidYear";
		try {
			/**
			 *
			 * inv ValidYear:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.year > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS___VALID_YEAR__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int year = this.getYear();
				final /*@NonInvalid*/ IntegerValue BOXED_year = ValueUtil.integerValueOf(year);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_year, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS, AdmissionStructure.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__YEAR:
				return getYear();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__TOTAL_ADMITTED:
				return getTotalAdmitted();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__SCHOLARSHIPS_AWARDED:
				return getScholarshipsAwarded();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMITTED_STUDENTS:
				return getAdmittedStudents();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__YEAR:
				setYear((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__TOTAL_ADMITTED:
				setTotalAdmitted((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__SCHOLARSHIPS_AWARDED:
				setScholarshipsAwarded((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMITTED_STUDENTS:
				getAdmittedStudents().clear();
				getAdmittedStudents().addAll((Collection<? extends String>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__TOTAL_ADMITTED:
				setTotalAdmitted(TOTAL_ADMITTED_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__SCHOLARSHIPS_AWARDED:
				setScholarshipsAwarded(SCHOLARSHIPS_AWARDED_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMITTED_STUDENTS:
				getAdmittedStudents().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__YEAR:
				return year != YEAR_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__TOTAL_ADMITTED:
				return totalAdmitted != TOTAL_ADMITTED_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__SCHOLARSHIPS_AWARDED:
				return scholarshipsAwarded != SCHOLARSHIPS_AWARDED_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMITTED_STUDENTS:
				return admittedStudents != null && !admittedStudents.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS__ADMISSION_STRUCTURE:
				return getAdmissionStructure() != null;
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
			case A3_Erasmo_Stanco_GroupPackage.RESULTS___VALID_TOTAL_ADMITTED__DIAGNOSTICCHAIN_MAP:
				return ValidTotalAdmitted((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case A3_Erasmo_Stanco_GroupPackage.RESULTS___VALID_SCHOLARSHIPS_AWARDED__DIAGNOSTICCHAIN_MAP:
				return ValidScholarshipsAwarded((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case A3_Erasmo_Stanco_GroupPackage.RESULTS___VALID_YEAR__DIAGNOSTICCHAIN_MAP:
				return ValidYear((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (year: ");
		result.append(year);
		result.append(", totalAdmitted: ");
		result.append(totalAdmitted);
		result.append(", scholarshipsAwarded: ");
		result.append(scholarshipsAwarded);
		result.append(", admittedStudents: ");
		result.append(admittedStudents);
		result.append(')');
		return result.toString();
	}

} //ResultsImpl
