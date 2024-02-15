/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Location#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Location#getCityName <em>City Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Location#getUniversity <em>University</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Name</em>' attribute.
	 * @see #setCountryName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLocation_CountryName()
	 * @model
	 * @generated
	 */
	String getCountryName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Location#getCountryName <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Name</em>' attribute.
	 * @see #getCountryName()
	 * @generated
	 */
	void setCountryName(String value);

	/**
	 * Returns the value of the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Name</em>' attribute.
	 * @see #setCityName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLocation_CityName()
	 * @model required="true"
	 * @generated
	 */
	String getCityName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Location#getCityName <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' attribute.
	 * @see #getCityName()
	 * @generated
	 */
	void setCityName(String value);

	/**
	 * Returns the value of the '<em><b>University</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.University#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' container reference.
	 * @see #setUniversity(University)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getLocation_University()
	 * @see a3_Erasmo_Stanco_Group.University#getLocation
	 * @model opposite="location" transient="false"
	 * @generated
	 */
	University getUniversity();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Location#getUniversity <em>University</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' container reference.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(University value);

} // Location
