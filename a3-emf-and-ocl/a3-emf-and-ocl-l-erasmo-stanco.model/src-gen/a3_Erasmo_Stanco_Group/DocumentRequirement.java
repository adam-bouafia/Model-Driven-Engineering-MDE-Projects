/**
 */
package a3_Erasmo_Stanco_Group;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDocumentName <em>Document Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDocumentRequirement()
 * @model
 * @generated
 */
public interface DocumentRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Name</em>' attribute.
	 * @see #setDocumentName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDocumentRequirement_DocumentName()
	 * @model
	 * @generated
	 */
	String getDocumentName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDocumentName <em>Document Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Name</em>' attribute.
	 * @see #getDocumentName()
	 * @generated
	 */
	void setDocumentName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDocumentRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DocumentRequirement
