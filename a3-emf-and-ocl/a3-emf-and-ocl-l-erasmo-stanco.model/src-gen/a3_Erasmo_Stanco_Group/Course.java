/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Course#getFaculty <em>Faculty</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Course#getCourseCredits <em>Course Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Course#getUniversity <em>University</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCourseCredits'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' attribute.
	 * @see #setFaculty(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse_Faculty()
	 * @model
	 * @generated
	 */
	String getFaculty();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Course#getFaculty <em>Faculty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' attribute.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(String value);

	/**
	 * Returns the value of the '<em><b>Course Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Credits</em>' attribute.
	 * @see #setCourseCredits(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse_CourseCredits()
	 * @model required="true"
	 * @generated
	 */
	int getCourseCredits();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Course#getCourseCredits <em>Course Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Credits</em>' attribute.
	 * @see #getCourseCredits()
	 * @generated
	 */
	void setCourseCredits(int value);

	/**
	 * Returns the value of the '<em><b>University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' container reference.
	 * @see #setUniversity(University)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getCourse_University()
	 * @see a3_Erasmo_Stanco_Group.University#getCourses
	 * @model opposite="courses" required="true" transient="false"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Course#getUniversity <em>University</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' container reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.courseCredits &gt; 0'"
	 * @generated
	 */
	boolean ValidCourseCredits(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Course
