/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Results#getYear <em>Year</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Results#getTotalAdmitted <em>Total Admitted</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Results#getScholarshipsAwarded <em>Scholarships Awarded</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Results#getAdmittedStudents <em>Admitted Students</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Results#getAdmissionStructure <em>Admission Structure</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidYear'"
 * @generated
 */
public interface Results extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Results#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Total Admitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Admitted</em>' attribute.
	 * @see #setTotalAdmitted(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults_TotalAdmitted()
	 * @model required="true"
	 * @generated
	 */
	int getTotalAdmitted();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Results#getTotalAdmitted <em>Total Admitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Admitted</em>' attribute.
	 * @see #getTotalAdmitted()
	 * @generated
	 */
	void setTotalAdmitted(int value);

	/**
	 * Returns the value of the '<em><b>Scholarships Awarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scholarships Awarded</em>' attribute.
	 * @see #setScholarshipsAwarded(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults_ScholarshipsAwarded()
	 * @model required="true"
	 * @generated
	 */
	int getScholarshipsAwarded();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Results#getScholarshipsAwarded <em>Scholarships Awarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scholarships Awarded</em>' attribute.
	 * @see #getScholarshipsAwarded()
	 * @generated
	 */
	void setScholarshipsAwarded(int value);

	/**
	 * Returns the value of the '<em><b>Admitted Students</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admitted Students</em>' attribute list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults_AdmittedStudents()
	 * @model
	 * @generated
	 */
	EList<String> getAdmittedStudents();

	/**
	 * Returns the value of the '<em><b>Admission Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admission Structure</em>' container reference.
	 * @see #setAdmissionStructure(AdmissionStructure)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getResults_AdmissionStructure()
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getResults
	 * @model opposite="results" required="true" transient="false"
	 * @generated
	 */
	AdmissionStructure getAdmissionStructure();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Results#getAdmissionStructure <em>Admission Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admission Structure</em>' container reference.
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	void setAdmissionStructure(AdmissionStructure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.totalAdmitted &gt;= 0'"
	 * @generated
	 */
	boolean ValidTotalAdmitted(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.scholarshipsAwarded &gt;= 0'"
	 * @generated
	 */
	boolean ValidScholarshipsAwarded(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.year &gt; 0'"
	 * @generated
	 */
	boolean ValidYear(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Results
