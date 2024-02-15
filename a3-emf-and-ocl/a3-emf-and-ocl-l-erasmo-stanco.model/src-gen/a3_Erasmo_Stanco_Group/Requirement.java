/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure <em>Admission Structure</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Admission Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getRequierements <em>Requierements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admission Structure</em>' container reference.
	 * @see #setAdmissionStructure(AdmissionStructure)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getRequirement_AdmissionStructure()
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getRequierements
	 * @model opposite="requierements" required="true" transient="false"
	 * @generated
	 */
	AdmissionStructure getAdmissionStructure();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure <em>Admission Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admission Structure</em>' container reference.
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	void setAdmissionStructure(AdmissionStructure value);

} // Requirement
