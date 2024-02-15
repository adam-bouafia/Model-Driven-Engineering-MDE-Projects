/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associate Partner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.AssociatePartner#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.AssociatePartner#getType <em>Type</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram <em>Erasmus Program</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAssociatePartner()
 * @model
 * @generated
 */
public interface AssociatePartner extends EObject {
	/**
	 * Returns the value of the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Name</em>' attribute.
	 * @see #setPartnerName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAssociatePartner_PartnerName()
	 * @model
	 * @generated
	 */
	String getPartnerName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getPartnerName <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Name</em>' attribute.
	 * @see #getPartnerName()
	 * @generated
	 */
	void setPartnerName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link a3_Erasmo_Stanco_Group.PartnerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.PartnerType
	 * @see #setType(PartnerType)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAssociatePartner_Type()
	 * @model
	 * @generated
	 */
	PartnerType getType();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.PartnerType
	 * @see #getType()
	 * @generated
	 */
	void setType(PartnerType value);

	/**
	 * Returns the value of the '<em><b>Erasmus Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAssociatePartners <em>Associate Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erasmus Program</em>' container reference.
	 * @see #setErasmusProgram(ErasmusProgram)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getAssociatePartner_ErasmusProgram()
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getAssociatePartners
	 * @model opposite="associatePartners" transient="false"
	 * @generated
	 */
	ErasmusProgram getErasmusProgram();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram <em>Erasmus Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasmus Program</em>' container reference.
	 * @see #getErasmusProgram()
	 * @generated
	 */
	void setErasmusProgram(ErasmusProgram value);

} // AssociatePartner
