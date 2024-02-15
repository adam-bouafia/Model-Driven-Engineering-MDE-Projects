/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scholarship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Scholarship#getType <em>Type</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Scholarship#getTuitionFee <em>Tuition Fee</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Scholarship#getTravelGrant <em>Travel Grant</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Scholarship#getAllowance <em>Allowance</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram <em>Erasmus Program</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidTravelGrant'"
 * @generated
 */
public interface Scholarship extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link a3_Erasmo_Stanco_Group.ScholarshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.ScholarshipType
	 * @see #setType(ScholarshipType)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship_Type()
	 * @model
	 * @generated
	 */
	ScholarshipType getType();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Scholarship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see a3_Erasmo_Stanco_Group.ScholarshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(ScholarshipType value);

	/**
	 * Returns the value of the '<em><b>Tuition Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuition Fee</em>' attribute.
	 * @see #setTuitionFee(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship_TuitionFee()
	 * @model required="true"
	 * @generated
	 */
	int getTuitionFee();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Scholarship#getTuitionFee <em>Tuition Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuition Fee</em>' attribute.
	 * @see #getTuitionFee()
	 * @generated
	 */
	void setTuitionFee(int value);

	/**
	 * Returns the value of the '<em><b>Travel Grant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Grant</em>' attribute.
	 * @see #setTravelGrant(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship_TravelGrant()
	 * @model required="true"
	 * @generated
	 */
	int getTravelGrant();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Scholarship#getTravelGrant <em>Travel Grant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Grant</em>' attribute.
	 * @see #getTravelGrant()
	 * @generated
	 */
	void setTravelGrant(int value);

	/**
	 * Returns the value of the '<em><b>Allowance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowance</em>' attribute.
	 * @see #setAllowance(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship_Allowance()
	 * @model required="true"
	 * @generated
	 */
	int getAllowance();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Scholarship#getAllowance <em>Allowance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowance</em>' attribute.
	 * @see #getAllowance()
	 * @generated
	 */
	void setAllowance(int value);

	/**
	 * Returns the value of the '<em><b>Erasmus Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getScholarships <em>Scholarships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erasmus Program</em>' container reference.
	 * @see #setErasmusProgram(ErasmusProgram)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getScholarship_ErasmusProgram()
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getScholarships
	 * @model opposite="scholarships" required="true" transient="false"
	 * @generated
	 */
	ErasmusProgram getErasmusProgram();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram <em>Erasmus Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erasmus Program</em>' container reference.
	 * @see #getErasmusProgram()
	 * @generated
	 */
	void setErasmusProgram(ErasmusProgram value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.allowance &gt;= 0'"
	 * @generated
	 */
	boolean ValidAllowance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.tuitionFee &gt;= 0'"
	 * @generated
	 */
	boolean ValidTuitionFee(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.travelGrant &gt;= 0'"
	 * @generated
	 */
	boolean ValidTravelGrant(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Scholarship
