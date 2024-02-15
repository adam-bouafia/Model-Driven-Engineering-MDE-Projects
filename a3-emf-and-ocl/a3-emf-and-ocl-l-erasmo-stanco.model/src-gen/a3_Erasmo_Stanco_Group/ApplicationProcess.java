/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure <em>Admission Structure</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getApplicationProcess()
 * @model
 * @generated
 */
public interface ApplicationProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Admission Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admission Structure</em>' container reference.
	 * @see #setAdmissionStructure(AdmissionStructure)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getApplicationProcess_AdmissionStructure()
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess
	 * @model opposite="applicationProcess" required="true" transient="false"
	 * @generated
	 */
	AdmissionStructure getAdmissionStructure();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure <em>Admission Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admission Structure</em>' container reference.
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	void setAdmissionStructure(AdmissionStructure value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.Step}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Step#getApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getApplicationProcess_Steps()
	 * @see a3_Erasmo_Stanco_Group.Step#getApplicationProcess
	 * @model opposite="applicationProcess" containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // ApplicationProcess
