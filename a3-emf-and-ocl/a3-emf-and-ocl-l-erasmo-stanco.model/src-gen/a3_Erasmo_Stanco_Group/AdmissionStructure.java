/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admission Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram <em>Erasmus Program</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess <em>Application Process</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getRequierements <em>Requierements</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAdmissionStructure()
 * @model
 * @generated
 */
public interface AdmissionStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Erasmus Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erasmus Program</em>' container reference.
	 * @see #setErasmusProgram(ErasmusProgram)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAdmissionStructure_ErasmusProgram()
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure
	 * @model opposite="admissionStructure" required="true" transient="false"
	 * @generated
	 */
	ErasmusProgram getErasmusProgram();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram <em>Erasmus Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasmus Program</em>' container reference.
	 * @see #getErasmusProgram()
	 * @generated
	 */
	void setErasmusProgram(ErasmusProgram value);

	/**
	 * Returns the value of the '<em><b>Application Process</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Process</em>' containment reference.
	 * @see #setApplicationProcess(ApplicationProcess)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAdmissionStructure_ApplicationProcess()
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure
	 * @model opposite="admissionStructure" containment="true" required="true"
	 * @generated
	 */
	ApplicationProcess getApplicationProcess();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess <em>Application Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Process</em>' containment reference.
	 * @see #getApplicationProcess()
	 * @generated
	 */
	void setApplicationProcess(ApplicationProcess value);

	/**
	 * Returns the value of the '<em><b>Requierements</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.Requirement}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requierements</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAdmissionStructure_Requierements()
	 * @see a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure
	 * @model opposite="admissionStructure" containment="true" required="true"
	 * @generated
	 */
	EList<Requirement> getRequierements();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.Results}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Results#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAdmissionStructure_Results()
	 * @see a3_Erasmo_Stanco_Group.Results#getAdmissionStructure
	 * @model opposite="admissionStructure" containment="true"
	 * @generated
	 */
	EList<Results> getResults();

} // AdmissionStructure
