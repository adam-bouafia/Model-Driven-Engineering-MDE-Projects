/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.University#getCredits <em>Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.University#getUniversityName <em>University Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.University#getErasmusProgram <em>Erasmus Program</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.University#getCourses <em>Courses</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.University#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidCredits'"
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity_Credits()
	 * @model required="true"
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.University#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>University Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University Name</em>' attribute.
	 * @see #setUniversityName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity_UniversityName()
	 * @model
	 * @generated
	 */
	String getUniversityName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.University#getUniversityName <em>University Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University Name</em>' attribute.
	 * @see #getUniversityName()
	 * @generated
	 */
	void setUniversityName(String value);

	/**
	 * Returns the value of the '<em><b>Erasmus Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getUniversities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erasmus Program</em>' container reference.
	 * @see #setErasmusProgram(ErasmusProgram)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity_ErasmusProgram()
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getUniversities
	 * @model opposite="universities" transient="false"
	 * @generated
	 */
	ErasmusProgram getErasmusProgram();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.University#getErasmusProgram <em>Erasmus Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasmus Program</em>' container reference.
	 * @see #getErasmusProgram()
	 * @generated
	 */
	void setErasmusProgram(ErasmusProgram value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.Course}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Course#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity_Courses()
	 * @see a3_Erasmo_Stanco_Group.Course#getUniversity
	 * @model opposite="university" containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Location#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getUniversity_Location()
	 * @see a3_Erasmo_Stanco_Group.Location#getUniversity
	 * @model opposite="university" containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.University#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.credits &lt;= 60'"
	 * @generated
	 */
	boolean ValidCredits(DiagnosticChain diagnostics, Map<Object, Object> context);

} // University
