/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erasmus Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getName <em>Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getTotalCredits <em>Total Credits</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getUniversities <em>Universities</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getScholarships <em>Scholarships</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAssociatePartners <em>Associate Partners</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure <em>Admission Structure</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidTotalCredits'"
 * @generated
 */
public interface ErasmusProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see #setTotalCredits(int)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_TotalCredits()
	 * @model required="true"
	 * @generated
	 */
	int getTotalCredits();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getTotalCredits <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credits</em>' attribute.
	 * @see #getTotalCredits()
	 * @generated
	 */
	void setTotalCredits(int value);

	/**
	 * Returns the value of the '<em><b>Universities</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.University}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.University#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universities</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_Universities()
	 * @see a3_Erasmo_Stanco_Group.University#getErasmusProgram
	 * @model opposite="erasmusProgram" containment="true"
	 * @generated
	 */
	EList<University> getUniversities();

	/**
	 * Returns the value of the '<em><b>Scholarships</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.Scholarship}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scholarships</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_Scholarships()
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram
	 * @model opposite="erasmusProgram" containment="true"
	 * @generated
	 */
	EList<Scholarship> getScholarships();

	/**
	 * Returns the value of the '<em><b>Associate Partners</b></em>' containment reference list.
	 * The list contents are of type {@link a3_Erasmo_Stanco_Group.AssociatePartner}.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate Partners</em>' containment reference list.
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_AssociatePartners()
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram
	 * @model opposite="erasmusProgram" containment="true"
	 * @generated
	 */
	EList<AssociatePartner> getAssociatePartners();

	/**
	 * Returns the value of the '<em><b>Admission Structure</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admission Structure</em>' containment reference.
	 * @see #setAdmissionStructure(AdmissionStructure)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getErasmusProgram_AdmissionStructure()
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram
	 * @model opposite="erasmusProgram" containment="true"
	 * @generated
	 */
	AdmissionStructure getAdmissionStructure();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure <em>Admission Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admission Structure</em>' containment reference.
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	void setAdmissionStructure(AdmissionStructure value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.totalCredits &gt; 0'"
	 * @generated
	 */
	boolean ValidTotalCredits(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ErasmusProgram
