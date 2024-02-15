/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage
 * @generated
 */
public interface A3_Erasmo_Stanco_GroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A3_Erasmo_Stanco_GroupFactory eINSTANCE = a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Erasmus Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erasmus Program</em>'.
	 * @generated
	 */
	ErasmusProgram createErasmusProgram();

	/**
	 * Returns a new object of class '<em>Scholarship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scholarship</em>'.
	 * @generated
	 */
	Scholarship createScholarship();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Associate Partner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associate Partner</em>'.
	 * @generated
	 */
	AssociatePartner createAssociatePartner();

	/**
	 * Returns a new object of class '<em>Admission Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Structure</em>'.
	 * @generated
	 */
	AdmissionStructure createAdmissionStructure();

	/**
	 * Returns a new object of class '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results</em>'.
	 * @generated
	 */
	Results createResults();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Document Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Requirement</em>'.
	 * @generated
	 */
	DocumentRequirement createDocumentRequirement();

	/**
	 * Returns a new object of class '<em>Degree Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degree Requirement</em>'.
	 * @generated
	 */
	DegreeRequirement createDegreeRequirement();

	/**
	 * Returns a new object of class '<em>Language Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Requirement</em>'.
	 * @generated
	 */
	LanguageRequirement createLanguageRequirement();

	/**
	 * Returns a new object of class '<em>Application Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Process</em>'.
	 * @generated
	 */
	ApplicationProcess createApplicationProcess();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	A3_Erasmo_Stanco_GroupPackage getA3_Erasmo_Stanco_GroupPackage();

} //A3_Erasmo_Stanco_GroupFactory
