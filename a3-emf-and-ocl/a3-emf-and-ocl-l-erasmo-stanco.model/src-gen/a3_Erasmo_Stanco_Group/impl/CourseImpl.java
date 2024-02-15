/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import a3_Erasmo_Stanco_Group.Course;
import a3_Erasmo_Stanco_Group.University;

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

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.CourseImpl#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.CourseImpl#getCourseCredits <em>Course Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.CourseImpl#getUniversity <em>University</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaculty() <em>Faculty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculty()
	 * @generated
	 * @ordered
	 */
	protected static final String FACULTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaculty() <em>Faculty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculty()
	 * @generated
	 * @ordered
	 */
	protected String faculty = FACULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCredits() <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int COURSE_CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCourseCredits() <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredits()
	 * @generated
	 * @ordered
	 */
	protected int courseCredits = COURSE_CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CODE, oldCourseCode, courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_NAME, oldCourseName, courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFaculty() {
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaculty(String newFaculty) {
		String oldFaculty = faculty;
		faculty = newFaculty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.COURSE__FACULTY, oldFaculty, faculty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCourseCredits() {
		return courseCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCredits(int newCourseCredits) {
		int oldCourseCredits = courseCredits;
		courseCredits = newCourseCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CREDITS, oldCourseCredits, courseCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University getUniversity() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY) return null;
		return (University)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUniversity, A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject)newUniversity).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES, University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY, newUniversity, newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidCourseCredits(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Course::ValidCourseCredits";
		try {
			/**
			 *
			 * inv ValidCourseCredits:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.courseCredits > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, A3_Erasmo_Stanco_GroupPackage.Literals.COURSE___VALID_COURSE_CREDITS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ int courseCredits = this.getCourseCredits();
				final /*@NonInvalid*/ IntegerValue BOXED_courseCredits = ValueUtil.integerValueOf(courseCredits);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_courseCredits, A3_Erasmo_Stanco_GroupTables.INT_0).booleanValue();
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.UNIVERSITY__COURSES, University.class, msgs);
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CODE:
				return getCourseCode();
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_NAME:
				return getCourseName();
			case A3_Erasmo_Stanco_GroupPackage.COURSE__FACULTY:
				return getFaculty();
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CREDITS:
				return getCourseCredits();
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CODE:
				setCourseCode((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_NAME:
				setCourseName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__FACULTY:
				setFaculty((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CREDITS:
				setCourseCredits((Integer)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CODE:
				setCourseCode(COURSE_CODE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_NAME:
				setCourseName(COURSE_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__FACULTY:
				setFaculty(FACULTY_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CREDITS:
				setCourseCredits(COURSE_CREDITS_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CODE:
				return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_NAME:
				return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
			case A3_Erasmo_Stanco_GroupPackage.COURSE__FACULTY:
				return FACULTY_EDEFAULT == null ? faculty != null : !FACULTY_EDEFAULT.equals(faculty);
			case A3_Erasmo_Stanco_GroupPackage.COURSE__COURSE_CREDITS:
				return courseCredits != COURSE_CREDITS_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.COURSE__UNIVERSITY:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case A3_Erasmo_Stanco_GroupPackage.COURSE___VALID_COURSE_CREDITS__DIAGNOSTICCHAIN_MAP:
				return ValidCourseCredits((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (courseCode: ");
		result.append(courseCode);
		result.append(", courseName: ");
		result.append(courseName);
		result.append(", faculty: ");
		result.append(faculty);
		result.append(", courseCredits: ");
		result.append(courseCredits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
