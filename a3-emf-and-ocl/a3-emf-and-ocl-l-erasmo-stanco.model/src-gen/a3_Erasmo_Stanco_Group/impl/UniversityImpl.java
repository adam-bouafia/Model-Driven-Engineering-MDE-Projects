/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import a3_Erasmo_Stanco_Group.Course;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.Location;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl#getUniversityName <em>University Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl#getErasmusProgram <em>Erasmus Program</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected int credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniversityName() <em>University Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversityName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIVERSITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniversityName() <em>University Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversityName()
	 * @generated
	 * @ordered
	 */
	protected String universityName = UNIVERSITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(int newCredits) {
		int oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversityName(String newUniversityName) {
		String oldUniversityName = universityName;
		universityName = newUniversityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__UNIVERSITY_NAME, oldUniversityName, universityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErasmusProgram getErasmusProgram() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM) return null;
		return (ErasmusProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErasmusProgram(ErasmusProgram newErasmusProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newErasmusProgram, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasmusProgram(ErasmusProgram newErasmusProgram) {
		if (newErasmusProgram != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM && newErasmusProgram != null)) {
			if (EcoreUtil.isAncestor(this, newErasmusProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newErasmusProgram != null)
				msgs = ((InternalEObject)newErasmusProgram).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES, ErasmusProgram.class, msgs);
			msgs = basicSetErasmusProgram(newErasmusProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM, newErasmusProgram, newErasmusProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<Course>(Course.class, this, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES, A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.LOCATION__UNIVERSITY, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidCredits(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "University::ValidCredits";
		try {
			/**
			 *
			 * inv ValidCredits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.credits <= 60
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY___VALID_CREDITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int credits = this.getCredits();
				final /*@NonInvalid*/ IntegerValue BOXED_credits = ValueUtil.integerValueOf(credits);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_credits, A3_Erasmo_Stanco_GroupTables.INT_60).booleanValue();
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetErasmusProgram((ErasmusProgram)otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION, null, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				return basicSetErasmusProgram(null, msgs);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				return basicSetLocation(null, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__UNIVERSITIES, ErasmusProgram.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__CREDITS:
				return getCredits();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__UNIVERSITY_NAME:
				return getUniversityName();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				return getErasmusProgram();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				return getCourses();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				return getLocation();
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__CREDITS:
				setCredits((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__UNIVERSITY_NAME:
				setUniversityName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				setLocation((Location)newValue);
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__UNIVERSITY_NAME:
				setUniversityName(UNIVERSITY_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)null);
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				getCourses().clear();
				return;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				setLocation((Location)null);
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__UNIVERSITY_NAME:
				return UNIVERSITY_NAME_EDEFAULT == null ? universityName != null : !UNIVERSITY_NAME_EDEFAULT.equals(universityName);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__ERASMUS_PROGRAM:
				return getErasmusProgram() != null;
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES:
				return courses != null && !courses.isEmpty();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__LOCATION:
				return location != null;
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
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY___VALID_CREDITS__DIAGNOSTICCHAIN_MAP:
				return ValidCredits((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (credits: ");
		result.append(credits);
		result.append(", universityName: ");
		result.append(universityName);
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
