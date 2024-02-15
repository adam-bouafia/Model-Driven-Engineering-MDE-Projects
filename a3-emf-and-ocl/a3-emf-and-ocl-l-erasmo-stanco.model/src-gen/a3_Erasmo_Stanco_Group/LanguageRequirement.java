/**
 */
package a3_Erasmo_Stanco_Group;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLanguageName <em>Language Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLanguageRequirement()
 * @model
 * @generated
 */
public interface LanguageRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Name</em>' attribute.
	 * @see #setLanguageName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLanguageRequirement_LanguageName()
	 * @model
	 * @generated
	 */
	String getLanguageName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLanguageName <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Name</em>' attribute.
	 * @see #getLanguageName()
	 * @generated
	 */
	void setLanguageName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link a3_Erasmo_Stanco_Group.LanguageLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.LanguageLevel
	 * @see #setLevel(LanguageLevel)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLanguageRequirement_Level()
	 * @model
	 * @generated
	 */
	LanguageLevel getLevel();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.LanguageLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LanguageLevel value);

} // LanguageRequirement
