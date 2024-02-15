/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.Scholarship;
import a3_Erasmo_Stanco_Group.ScholarshipType;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scholarship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl#getTuitionFee <em>Tuition Fee</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl#getTravelGrant <em>Travel Grant</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl#getAllowance <em>Allowance</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl#getErasmusProgram <em>Erasmus Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScholarshipImpl extends MinimalEObjectImpl.Container implements Scholarship {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ScholarshipType TYPE_EDEFAULT = ScholarshipType.PROGRAM_COUNTRY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ScholarshipType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTuitionFee() <em>Tuition Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuitionFee()
	 * @generated
	 * @ordered
	 */
	protected static final int TUITION_FEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTuitionFee() <em>Tuition Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuitionFee()
	 * @generated
	 * @ordered
	 */
	protected int tuitionFee = TUITION_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelGrant() <em>Travel Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelGrant()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAVEL_GRANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTravelGrant() <em>Travel Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelGrant()
	 * @generated
	 * @ordered
	 */
	protected int travelGrant = TRAVEL_GRANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowance() <em>Allowance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowance()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOWANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllowance() <em>Allowance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowance()
	 * @generated
	 * @ordered
	 */
	protected int allowance = ALLOWANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScholarshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScholarshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ScholarshipType newType) {
		ScholarshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTuitionFee() {
		return tuitionFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuitionFee(int newTuitionFee) {
		int oldTuitionFee = tuitionFee;
		tuitionFee = newTuitionFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TUITION_FEE, oldTuitionFee, tuitionFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTravelGrant() {
		return travelGrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTravelGrant(int newTravelGrant) {
		int oldTravelGrant = travelGrant;
		travelGrant = newTravelGrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TRAVEL_GRANT, oldTravelGrant, travelGrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAllowance() {
		return allowance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowance(int newAllowance) {
		int oldAllowance = allowance;
		allowance = newAllowance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ALLOWANCE, oldAllowance, allowance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErasmusProgram getErasmusProgram() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM) return null;
		return (ErasmusProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErasmusProgram(ErasmusProgram newErasmusProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newErasmusProgram, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasmusProgram(ErasmusProgram newErasmusProgram) {
		if (newErasmusProgram != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM && newErasmusProgram != null)) {
			if (EcoreUtil.isAncestor(this, newErasmusProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newErasmusProgram != null)
				msgs = ((InternalEObject)newErasmusProgram).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS, ErasmusProgram.class, msgs);
			msgs = basicSetErasmusProgram(newErasmusProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM, newErasmusProgram, newErasmusProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidAllowance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Scholarship::ValidAllowance";
		try {
			/**
			 *
			 * inv ValidAllowance:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.allowance >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP___VALID_ALLOWANCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int allowance = this.getAllowance();
				final /*@NonInvalid*/ IntegerValue BOXED_allowance = ValueUtil.integerValueOf(allowance);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_allowance, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
	public boolean ValidTuitionFee(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Scholarship::ValidTuitionFee";
		try {
			/**
			 *
			 * inv ValidTuitionFee:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.tuitionFee >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP___VALID_TUITION_FEE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int tuitionFee = this.getTuitionFee();
				final /*@NonInvalid*/ IntegerValue BOXED_tuitionFee = ValueUtil.integerValueOf(tuitionFee);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_tuitionFee, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
	public boolean ValidTravelGrant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Scholarship::ValidTravelGrant";
		try {
			/**
			 *
			 * inv ValidTravelGrant:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.travelGrant >= 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP___VALID_TRAVEL_GRANT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int travelGrant = this.getTravelGrant();
				final /*@NonInvalid*/ IntegerValue BOXED_travelGrant = ValueUtil.integerValueOf(travelGrant);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_travelGrant, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetErasmusProgram((ErasmusProgram)otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				return basicSetErasmusProgram(null, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__SCHOLARSHIPS, ErasmusProgram.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TYPE:
				return getType();
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TUITION_FEE:
				return getTuitionFee();
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TRAVEL_GRANT:
				return getTravelGrant();
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ALLOWANCE:
				return getAllowance();
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				return getErasmusProgram();
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TYPE:
				setType((ScholarshipType)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TUITION_FEE:
				setTuitionFee((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TRAVEL_GRANT:
				setTravelGrant((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ALLOWANCE:
				setAllowance((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TUITION_FEE:
				setTuitionFee(TUITION_FEE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TRAVEL_GRANT:
				setTravelGrant(TRAVEL_GRANT_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ALLOWANCE:
				setAllowance(ALLOWANCE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)null);
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TYPE:
				return type != TYPE_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TUITION_FEE:
				return tuitionFee != TUITION_FEE_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__TRAVEL_GRANT:
				return travelGrant != TRAVEL_GRANT_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ALLOWANCE:
				return allowance != ALLOWANCE_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP__ERASMUS_PROGRAM:
				return getErasmusProgram() != null;
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
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP___VALID_ALLOWANCE__DIAGNOSTICCHAIN_MAP:
				return ValidAllowance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP___VALID_TUITION_FEE__DIAGNOSTICCHAIN_MAP:
				return ValidTuitionFee((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP___VALID_TRAVEL_GRANT__DIAGNOSTICCHAIN_MAP:
				return ValidTravelGrant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(", tuitionFee: ");
		result.append(tuitionFee);
		result.append(", travelGrant: ");
		result.append(travelGrant);
		result.append(", allowance: ");
		result.append(allowance);
		result.append(')');
		return result.toString();
	}

} //ScholarshipImpl
