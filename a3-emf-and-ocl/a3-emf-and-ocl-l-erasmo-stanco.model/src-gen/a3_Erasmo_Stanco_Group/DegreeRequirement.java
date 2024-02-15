/**
 */
package a3_Erasmo_Stanco_Group;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getDegreeName <em>Degree Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getFieldOfStudy <em>Field Of Study</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDegreeRequirement()
 * @model
 * @generated
 */
public interface DegreeRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Degree Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree Name</em>' attribute.
	 * @see #setDegreeName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDegreeRequirement_DegreeName()
	 * @model
	 * @generated
	 */
	String getDegreeName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getDegreeName <em>Degree Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree Name</em>' attribute.
	 * @see #getDegreeName()
	 * @generated
	 */
	void setDegreeName(String value);

	/**
	 * Returns the value of the '<em><b>Field Of Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Of Study</em>' attribute.
	 * @see #setFieldOfStudy(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDegreeRequirement_FieldOfStudy()
	 * @model
	 * @generated
	 */
	String getFieldOfStudy();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getFieldOfStudy <em>Field Of Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of Study</em>' attribute.
	 * @see #getFieldOfStudy()
	 * @generated
	 */
	void setFieldOfStudy(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link a3_Erasmo_Stanco_Group.DegreeLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.DegreeLevel
	 * @see #setLevel(DegreeLevel)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getDegreeRequirement_Level()
	 * @model
	 * @generated
	 */
	DegreeLevel getLevel();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.DegreeLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(DegreeLevel value);

} // DegreeRequirement
