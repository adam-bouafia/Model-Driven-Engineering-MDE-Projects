/**
 */
package a3_Erasmo_Stanco_Group;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface A3_Erasmo_Stanco_GroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "a3_Erasmo_Stanco_Group";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/a3_Erasmo_Stanco_Group";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "a3_Erasmo_Stanco_Group";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A3_Erasmo_Stanco_GroupPackage eINSTANCE = a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl <em>Erasmus Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getErasmusProgram()
	 * @generated
	 */
	int ERASMUS_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__TOTAL_CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Universities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__UNIVERSITIES = 2;

	/**
	 * The feature id for the '<em><b>Scholarships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__SCHOLARSHIPS = 3;

	/**
	 * The feature id for the '<em><b>Associate Partners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__ASSOCIATE_PARTNERS = 4;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM__ADMISSION_STRUCTURE = 5;

	/**
	 * The number of structural features of the '<em>Erasmus Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Valid Total Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM___VALID_TOTAL_CREDITS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Erasmus Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASMUS_PROGRAM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl <em>Scholarship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.ScholarshipImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getScholarship()
	 * @generated
	 */
	int SCHOLARSHIP = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tuition Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP__TUITION_FEE = 1;

	/**
	 * The feature id for the '<em><b>Travel Grant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP__TRAVEL_GRANT = 2;

	/**
	 * The feature id for the '<em><b>Allowance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP__ALLOWANCE = 3;

	/**
	 * The feature id for the '<em><b>Erasmus Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP__ERASMUS_PROGRAM = 4;

	/**
	 * The number of structural features of the '<em>Scholarship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Valid Allowance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP___VALID_ALLOWANCE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Tuition Fee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP___VALID_TUITION_FEE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Valid Travel Grant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP___VALID_TRAVEL_GRANT__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Scholarship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOLARSHIP_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.UniversityImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CREDITS = 0;

	/**
	 * The feature id for the '<em><b>University Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__UNIVERSITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Erasmus Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ERASMUS_PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSES = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__LOCATION = 4;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Valid Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY___VALID_CREDITS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.CourseImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__FACULTY = 2;

	/**
	 * The feature id for the '<em><b>Course Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CREDITS = 3;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__UNIVERSITY = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Valid Course Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___VALID_COURSE_CREDITS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.LocationImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY_NAME = 0;

	/**
	 * The feature id for the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UNIVERSITY = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl <em>Associate Partner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getAssociatePartner()
	 * @generated
	 */
	int ASSOCIATE_PARTNER = 5;

	/**
	 * The feature id for the '<em><b>Partner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_PARTNER__PARTNER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_PARTNER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Erasmus Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_PARTNER__ERASMUS_PROGRAM = 2;

	/**
	 * The number of structural features of the '<em>Associate Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_PARTNER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Associate Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATE_PARTNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl <em>Admission Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getAdmissionStructure()
	 * @generated
	 */
	int ADMISSION_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Erasmus Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE__ERASMUS_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Application Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE__APPLICATION_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Requierements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE__REQUIEREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE__RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Admission Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Admission Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMISSION_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.ResultsImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 7;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Total Admitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__TOTAL_ADMITTED = 1;

	/**
	 * The feature id for the '<em><b>Scholarships Awarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__SCHOLARSHIPS_AWARDED = 2;

	/**
	 * The feature id for the '<em><b>Admitted Students</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ADMITTED_STUDENTS = 3;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__ADMISSION_STRUCTURE = 4;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Valid Total Admitted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS___VALID_TOTAL_ADMITTED__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Valid Scholarships Awarded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS___VALID_SCHOLARSHIPS_AWARDED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Valid Year</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS___VALID_YEAR__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.RequirementImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ADMISSION_STRUCTURE = 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.DocumentRequirementImpl <em>Document Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.DocumentRequirementImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDocumentRequirement()
	 * @generated
	 */
	int DOCUMENT_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_REQUIREMENT__ADMISSION_STRUCTURE = REQUIREMENT__ADMISSION_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Document Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_REQUIREMENT__DOCUMENT_NAME = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_REQUIREMENT__DESCRIPTION = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Document Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl <em>Degree Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDegreeRequirement()
	 * @generated
	 */
	int DEGREE_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT__ADMISSION_STRUCTURE = REQUIREMENT__ADMISSION_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Degree Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT__DEGREE_NAME = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field Of Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT__FIELD_OF_STUDY = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT__LEVEL = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Degree Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Degree Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREE_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl <em>Language Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLanguageRequirement()
	 * @generated
	 */
	int LANGUAGE_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REQUIREMENT__ADMISSION_STRUCTURE = REQUIREMENT__ADMISSION_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REQUIREMENT__LANGUAGE_NAME = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REQUIREMENT__LEVEL = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Language Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl <em>Application Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getApplicationProcess()
	 * @generated
	 */
	int APPLICATION_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Admission Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROCESS__ADMISSION_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROCESS__STEPS = 1;

	/**
	 * The number of structural features of the '<em>Application Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.impl.StepImpl
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 13;

	/**
	 * The feature id for the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Step Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Application Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__APPLICATION_PROCESS = 4;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.ScholarshipType <em>Scholarship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.ScholarshipType
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getScholarshipType()
	 * @generated
	 */
	int SCHOLARSHIP_TYPE = 14;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.LanguageLevel <em>Language Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.LanguageLevel
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLanguageLevel()
	 * @generated
	 */
	int LANGUAGE_LEVEL = 15;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.PartnerType <em>Partner Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.PartnerType
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getPartnerType()
	 * @generated
	 */
	int PARTNER_TYPE = 16;

	/**
	 * The meta object id for the '{@link a3_Erasmo_Stanco_Group.DegreeLevel <em>Degree Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a3_Erasmo_Stanco_Group.DegreeLevel
	 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDegreeLevel()
	 * @generated
	 */
	int DEGREE_LEVEL = 17;


	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.ErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erasmus Program</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram
	 * @generated
	 */
	EClass getErasmusProgram();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getName()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EAttribute getErasmusProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getTotalCredits <em>Total Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credits</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getTotalCredits()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EAttribute getErasmusProgram_TotalCredits();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getUniversities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universities</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getUniversities()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EReference getErasmusProgram_Universities();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getScholarships <em>Scholarships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scholarships</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getScholarships()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EReference getErasmusProgram_Scholarships();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAssociatePartners <em>Associate Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associate Partners</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getAssociatePartners()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EReference getErasmusProgram_AssociatePartners();

	/**
	 * Returns the meta object for the containment reference '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admission Structure</em>'.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#getAdmissionStructure()
	 * @see #getErasmusProgram()
	 * @generated
	 */
	EReference getErasmusProgram_AdmissionStructure();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.ErasmusProgram#ValidTotalCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Total Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Total Credits</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram#ValidTotalCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getErasmusProgram__ValidTotalCredits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Scholarship <em>Scholarship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scholarship</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship
	 * @generated
	 */
	EClass getScholarship();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Scholarship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getType()
	 * @see #getScholarship()
	 * @generated
	 */
	EAttribute getScholarship_Type();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Scholarship#getTuitionFee <em>Tuition Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuition Fee</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getTuitionFee()
	 * @see #getScholarship()
	 * @generated
	 */
	EAttribute getScholarship_TuitionFee();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Scholarship#getTravelGrant <em>Travel Grant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Grant</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getTravelGrant()
	 * @see #getScholarship()
	 * @generated
	 */
	EAttribute getScholarship_TravelGrant();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Scholarship#getAllowance <em>Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowance</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getAllowance()
	 * @see #getScholarship()
	 * @generated
	 */
	EAttribute getScholarship_Allowance();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Erasmus Program</em>'.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#getErasmusProgram()
	 * @see #getScholarship()
	 * @generated
	 */
	EReference getScholarship_ErasmusProgram();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Scholarship#ValidAllowance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Allowance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Allowance</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#ValidAllowance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScholarship__ValidAllowance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Scholarship#ValidTuitionFee(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Tuition Fee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Tuition Fee</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#ValidTuitionFee(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScholarship__ValidTuitionFee__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Scholarship#ValidTravelGrant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Travel Grant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Travel Grant</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Scholarship#ValidTravelGrant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getScholarship__ValidTravelGrant__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see a3_Erasmo_Stanco_Group.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.University#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see a3_Erasmo_Stanco_Group.University#getCredits()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Credits();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.University#getUniversityName <em>University Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>University Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.University#getUniversityName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_UniversityName();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.University#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Erasmus Program</em>'.
	 * @see a3_Erasmo_Stanco_Group.University#getErasmusProgram()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_ErasmusProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.University#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see a3_Erasmo_Stanco_Group.University#getCourses()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Courses();

	/**
	 * Returns the meta object for the containment reference '{@link a3_Erasmo_Stanco_Group.University#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see a3_Erasmo_Stanco_Group.University#getLocation()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Location();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.University#ValidCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Credits</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.University#ValidCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUniversity__ValidCredits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Course#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faculty</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course#getFaculty()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Faculty();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Course#getCourseCredits <em>Course Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Credits</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course#getCourseCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCredits();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Course#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see a3_Erasmo_Stanco_Group.Course#getUniversity()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_University();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Course#ValidCourseCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Course Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Course Credits</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Course#ValidCourseCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__ValidCourseCredits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see a3_Erasmo_Stanco_Group.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Location#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.Location#getCountryName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CountryName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Location#getCityName <em>City Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.Location#getCityName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CityName();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Location#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see a3_Erasmo_Stanco_Group.Location#getUniversity()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_University();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.AssociatePartner <em>Associate Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associate Partner</em>'.
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner
	 * @generated
	 */
	EClass getAssociatePartner();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getPartnerName <em>Partner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner#getPartnerName()
	 * @see #getAssociatePartner()
	 * @generated
	 */
	EAttribute getAssociatePartner_PartnerName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner#getType()
	 * @see #getAssociatePartner()
	 * @generated
	 */
	EAttribute getAssociatePartner_Type();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Erasmus Program</em>'.
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner#getErasmusProgram()
	 * @see #getAssociatePartner()
	 * @generated
	 */
	EReference getAssociatePartner_ErasmusProgram();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.AdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admission Structure</em>'.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure
	 * @generated
	 */
	EClass getAdmissionStructure();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Erasmus Program</em>'.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getErasmusProgram()
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	EReference getAdmissionStructure_ErasmusProgram();

	/**
	 * Returns the meta object for the containment reference '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Process</em>'.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getApplicationProcess()
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	EReference getAdmissionStructure_ApplicationProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getRequierements <em>Requierements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requierements</em>'.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getRequierements()
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	EReference getAdmissionStructure_Requierements();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.AdmissionStructure#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure#getResults()
	 * @see #getAdmissionStructure()
	 * @generated
	 */
	EReference getAdmissionStructure_Results();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Results#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results#getYear()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_Year();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Results#getTotalAdmitted <em>Total Admitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Admitted</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results#getTotalAdmitted()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_TotalAdmitted();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Results#getScholarshipsAwarded <em>Scholarships Awarded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scholarships Awarded</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results#getScholarshipsAwarded()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_ScholarshipsAwarded();

	/**
	 * Returns the meta object for the attribute list '{@link a3_Erasmo_Stanco_Group.Results#getAdmittedStudents <em>Admitted Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Admitted Students</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results#getAdmittedStudents()
	 * @see #getResults()
	 * @generated
	 */
	EAttribute getResults_AdmittedStudents();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Results#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Admission Structure</em>'.
	 * @see a3_Erasmo_Stanco_Group.Results#getAdmissionStructure()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_AdmissionStructure();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Results#ValidTotalAdmitted(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Total Admitted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Total Admitted</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Results#ValidTotalAdmitted(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResults__ValidTotalAdmitted__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Results#ValidScholarshipsAwarded(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Scholarships Awarded</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Scholarships Awarded</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Results#ValidScholarshipsAwarded(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResults__ValidScholarshipsAwarded__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link a3_Erasmo_Stanco_Group.Results#ValidYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Year</em>' operation.
	 * @see a3_Erasmo_Stanco_Group.Results#ValidYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResults__ValidYear__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see a3_Erasmo_Stanco_Group.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Admission Structure</em>'.
	 * @see a3_Erasmo_Stanco_Group.Requirement#getAdmissionStructure()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_AdmissionStructure();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.DocumentRequirement <em>Document Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Requirement</em>'.
	 * @see a3_Erasmo_Stanco_Group.DocumentRequirement
	 * @generated
	 */
	EClass getDocumentRequirement();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDocumentName <em>Document Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.DocumentRequirement#getDocumentName()
	 * @see #getDocumentRequirement()
	 * @generated
	 */
	EAttribute getDocumentRequirement_DocumentName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.DocumentRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see a3_Erasmo_Stanco_Group.DocumentRequirement#getDescription()
	 * @see #getDocumentRequirement()
	 * @generated
	 */
	EAttribute getDocumentRequirement_Description();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.DegreeRequirement <em>Degree Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Degree Requirement</em>'.
	 * @see a3_Erasmo_Stanco_Group.DegreeRequirement
	 * @generated
	 */
	EClass getDegreeRequirement();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getDegreeName <em>Degree Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.DegreeRequirement#getDegreeName()
	 * @see #getDegreeRequirement()
	 * @generated
	 */
	EAttribute getDegreeRequirement_DegreeName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getFieldOfStudy <em>Field Of Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Of Study</em>'.
	 * @see a3_Erasmo_Stanco_Group.DegreeRequirement#getFieldOfStudy()
	 * @see #getDegreeRequirement()
	 * @generated
	 */
	EAttribute getDegreeRequirement_FieldOfStudy();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.DegreeRequirement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see a3_Erasmo_Stanco_Group.DegreeRequirement#getLevel()
	 * @see #getDegreeRequirement()
	 * @generated
	 */
	EAttribute getDegreeRequirement_Level();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.LanguageRequirement <em>Language Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Requirement</em>'.
	 * @see a3_Erasmo_Stanco_Group.LanguageRequirement
	 * @generated
	 */
	EClass getLanguageRequirement();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLanguageName <em>Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.LanguageRequirement#getLanguageName()
	 * @see #getLanguageRequirement()
	 * @generated
	 */
	EAttribute getLanguageRequirement_LanguageName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.LanguageRequirement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see a3_Erasmo_Stanco_Group.LanguageRequirement#getLevel()
	 * @see #getLanguageRequirement()
	 * @generated
	 */
	EAttribute getLanguageRequirement_Level();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.ApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Process</em>'.
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess
	 * @generated
	 */
	EClass getApplicationProcess();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Admission Structure</em>'.
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess#getAdmissionStructure()
	 * @see #getApplicationProcess()
	 * @generated
	 */
	EReference getApplicationProcess_AdmissionStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess#getSteps()
	 * @see #getApplicationProcess()
	 * @generated
	 */
	EReference getApplicationProcess_Steps();

	/**
	 * Returns the meta object for class '{@link a3_Erasmo_Stanco_Group.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Step#getStepName <em>Step Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Name</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step#getStepName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepName();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Step#getStepDescription <em>Step Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Description</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step#getStepDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepDescription();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Step#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step#getStartDate()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link a3_Erasmo_Stanco_Group.Step#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step#getEndDate()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_EndDate();

	/**
	 * Returns the meta object for the container reference '{@link a3_Erasmo_Stanco_Group.Step#getApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application Process</em>'.
	 * @see a3_Erasmo_Stanco_Group.Step#getApplicationProcess()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ApplicationProcess();

	/**
	 * Returns the meta object for enum '{@link a3_Erasmo_Stanco_Group.ScholarshipType <em>Scholarship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scholarship Type</em>'.
	 * @see a3_Erasmo_Stanco_Group.ScholarshipType
	 * @generated
	 */
	EEnum getScholarshipType();

	/**
	 * Returns the meta object for enum '{@link a3_Erasmo_Stanco_Group.LanguageLevel <em>Language Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Level</em>'.
	 * @see a3_Erasmo_Stanco_Group.LanguageLevel
	 * @generated
	 */
	EEnum getLanguageLevel();

	/**
	 * Returns the meta object for enum '{@link a3_Erasmo_Stanco_Group.PartnerType <em>Partner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partner Type</em>'.
	 * @see a3_Erasmo_Stanco_Group.PartnerType
	 * @generated
	 */
	EEnum getPartnerType();

	/**
	 * Returns the meta object for enum '{@link a3_Erasmo_Stanco_Group.DegreeLevel <em>Degree Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Degree Level</em>'.
	 * @see a3_Erasmo_Stanco_Group.DegreeLevel
	 * @generated
	 */
	EEnum getDegreeLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A3_Erasmo_Stanco_GroupFactory getA3_Erasmo_Stanco_GroupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl <em>Erasmus Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.ErasmusProgramImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getErasmusProgram()
		 * @generated
		 */
		EClass ERASMUS_PROGRAM = eINSTANCE.getErasmusProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERASMUS_PROGRAM__NAME = eINSTANCE.getErasmusProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Total Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERASMUS_PROGRAM__TOTAL_CREDITS = eINSTANCE.getErasmusProgram_TotalCredits();

		/**
		 * The meta object literal for the '<em><b>Universities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASMUS_PROGRAM__UNIVERSITIES = eINSTANCE.getErasmusProgram_Universities();

		/**
		 * The meta object literal for the '<em><b>Scholarships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASMUS_PROGRAM__SCHOLARSHIPS = eINSTANCE.getErasmusProgram_Scholarships();

		/**
		 * The meta object literal for the '<em><b>Associate Partners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASMUS_PROGRAM__ASSOCIATE_PARTNERS = eINSTANCE.getErasmusProgram_AssociatePartners();

		/**
		 * The meta object literal for the '<em><b>Admission Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASMUS_PROGRAM__ADMISSION_STRUCTURE = eINSTANCE.getErasmusProgram_AdmissionStructure();

		/**
		 * The meta object literal for the '<em><b>Valid Total Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ERASMUS_PROGRAM___VALID_TOTAL_CREDITS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getErasmusProgram__ValidTotalCredits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.ScholarshipImpl <em>Scholarship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.ScholarshipImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getScholarship()
		 * @generated
		 */
		EClass SCHOLARSHIP = eINSTANCE.getScholarship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOLARSHIP__TYPE = eINSTANCE.getScholarship_Type();

		/**
		 * The meta object literal for the '<em><b>Tuition Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOLARSHIP__TUITION_FEE = eINSTANCE.getScholarship_TuitionFee();

		/**
		 * The meta object literal for the '<em><b>Travel Grant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOLARSHIP__TRAVEL_GRANT = eINSTANCE.getScholarship_TravelGrant();

		/**
		 * The meta object literal for the '<em><b>Allowance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOLARSHIP__ALLOWANCE = eINSTANCE.getScholarship_Allowance();

		/**
		 * The meta object literal for the '<em><b>Erasmus Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOLARSHIP__ERASMUS_PROGRAM = eINSTANCE.getScholarship_ErasmusProgram();

		/**
		 * The meta object literal for the '<em><b>Valid Allowance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHOLARSHIP___VALID_ALLOWANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScholarship__ValidAllowance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Tuition Fee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHOLARSHIP___VALID_TUITION_FEE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScholarship__ValidTuitionFee__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Travel Grant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHOLARSHIP___VALID_TRAVEL_GRANT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getScholarship__ValidTravelGrant__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.UniversityImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__CREDITS = eINSTANCE.getUniversity_Credits();

		/**
		 * The meta object literal for the '<em><b>University Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__UNIVERSITY_NAME = eINSTANCE.getUniversity_UniversityName();

		/**
		 * The meta object literal for the '<em><b>Erasmus Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__ERASMUS_PROGRAM = eINSTANCE.getUniversity_ErasmusProgram();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSES = eINSTANCE.getUniversity_Courses();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__LOCATION = eINSTANCE.getUniversity_Location();

		/**
		 * The meta object literal for the '<em><b>Valid Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSITY___VALID_CREDITS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUniversity__ValidCredits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.CourseImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__FACULTY = eINSTANCE.getCourse_Faculty();

		/**
		 * The meta object literal for the '<em><b>Course Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CREDITS = eINSTANCE.getCourse_CourseCredits();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__UNIVERSITY = eINSTANCE.getCourse_University();

		/**
		 * The meta object literal for the '<em><b>Valid Course Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___VALID_COURSE_CREDITS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCourse__ValidCourseCredits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.LocationImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Country Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY_NAME = eINSTANCE.getLocation_CountryName();

		/**
		 * The meta object literal for the '<em><b>City Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY_NAME = eINSTANCE.getLocation_CityName();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__UNIVERSITY = eINSTANCE.getLocation_University();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl <em>Associate Partner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getAssociatePartner()
		 * @generated
		 */
		EClass ASSOCIATE_PARTNER = eINSTANCE.getAssociatePartner();

		/**
		 * The meta object literal for the '<em><b>Partner Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATE_PARTNER__PARTNER_NAME = eINSTANCE.getAssociatePartner_PartnerName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATE_PARTNER__TYPE = eINSTANCE.getAssociatePartner_Type();

		/**
		 * The meta object literal for the '<em><b>Erasmus Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATE_PARTNER__ERASMUS_PROGRAM = eINSTANCE.getAssociatePartner_ErasmusProgram();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl <em>Admission Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.AdmissionStructureImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getAdmissionStructure()
		 * @generated
		 */
		EClass ADMISSION_STRUCTURE = eINSTANCE.getAdmissionStructure();

		/**
		 * The meta object literal for the '<em><b>Erasmus Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMISSION_STRUCTURE__ERASMUS_PROGRAM = eINSTANCE.getAdmissionStructure_ErasmusProgram();

		/**
		 * The meta object literal for the '<em><b>Application Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMISSION_STRUCTURE__APPLICATION_PROCESS = eINSTANCE.getAdmissionStructure_ApplicationProcess();

		/**
		 * The meta object literal for the '<em><b>Requierements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMISSION_STRUCTURE__REQUIEREMENTS = eINSTANCE.getAdmissionStructure_Requierements();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMISSION_STRUCTURE__RESULTS = eINSTANCE.getAdmissionStructure_Results();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.ResultsImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__YEAR = eINSTANCE.getResults_Year();

		/**
		 * The meta object literal for the '<em><b>Total Admitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__TOTAL_ADMITTED = eINSTANCE.getResults_TotalAdmitted();

		/**
		 * The meta object literal for the '<em><b>Scholarships Awarded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__SCHOLARSHIPS_AWARDED = eINSTANCE.getResults_ScholarshipsAwarded();

		/**
		 * The meta object literal for the '<em><b>Admitted Students</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULTS__ADMITTED_STUDENTS = eINSTANCE.getResults_AdmittedStudents();

		/**
		 * The meta object literal for the '<em><b>Admission Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__ADMISSION_STRUCTURE = eINSTANCE.getResults_AdmissionStructure();

		/**
		 * The meta object literal for the '<em><b>Valid Total Admitted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULTS___VALID_TOTAL_ADMITTED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResults__ValidTotalAdmitted__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Scholarships Awarded</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULTS___VALID_SCHOLARSHIPS_AWARDED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResults__ValidScholarshipsAwarded__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Year</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESULTS___VALID_YEAR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResults__ValidYear__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.RequirementImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Admission Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ADMISSION_STRUCTURE = eINSTANCE.getRequirement_AdmissionStructure();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.DocumentRequirementImpl <em>Document Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.DocumentRequirementImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDocumentRequirement()
		 * @generated
		 */
		EClass DOCUMENT_REQUIREMENT = eINSTANCE.getDocumentRequirement();

		/**
		 * The meta object literal for the '<em><b>Document Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_REQUIREMENT__DOCUMENT_NAME = eINSTANCE.getDocumentRequirement_DocumentName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_REQUIREMENT__DESCRIPTION = eINSTANCE.getDocumentRequirement_Description();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl <em>Degree Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.DegreeRequirementImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDegreeRequirement()
		 * @generated
		 */
		EClass DEGREE_REQUIREMENT = eINSTANCE.getDegreeRequirement();

		/**
		 * The meta object literal for the '<em><b>Degree Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_REQUIREMENT__DEGREE_NAME = eINSTANCE.getDegreeRequirement_DegreeName();

		/**
		 * The meta object literal for the '<em><b>Field Of Study</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_REQUIREMENT__FIELD_OF_STUDY = eINSTANCE.getDegreeRequirement_FieldOfStudy();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREE_REQUIREMENT__LEVEL = eINSTANCE.getDegreeRequirement_Level();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl <em>Language Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.LanguageRequirementImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLanguageRequirement()
		 * @generated
		 */
		EClass LANGUAGE_REQUIREMENT = eINSTANCE.getLanguageRequirement();

		/**
		 * The meta object literal for the '<em><b>Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_REQUIREMENT__LANGUAGE_NAME = eINSTANCE.getLanguageRequirement_LanguageName();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_REQUIREMENT__LEVEL = eINSTANCE.getLanguageRequirement_Level();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl <em>Application Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.ApplicationProcessImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getApplicationProcess()
		 * @generated
		 */
		EClass APPLICATION_PROCESS = eINSTANCE.getApplicationProcess();

		/**
		 * The meta object literal for the '<em><b>Admission Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROCESS__ADMISSION_STRUCTURE = eINSTANCE.getApplicationProcess_AdmissionStructure();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_PROCESS__STEPS = eINSTANCE.getApplicationProcess_Steps();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.impl.StepImpl
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Step Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_NAME = eINSTANCE.getStep_StepName();

		/**
		 * The meta object literal for the '<em><b>Step Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_DESCRIPTION = eINSTANCE.getStep_StepDescription();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__START_DATE = eINSTANCE.getStep_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__END_DATE = eINSTANCE.getStep_EndDate();

		/**
		 * The meta object literal for the '<em><b>Application Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__APPLICATION_PROCESS = eINSTANCE.getStep_ApplicationProcess();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.ScholarshipType <em>Scholarship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.ScholarshipType
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getScholarshipType()
		 * @generated
		 */
		EEnum SCHOLARSHIP_TYPE = eINSTANCE.getScholarshipType();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.LanguageLevel <em>Language Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.LanguageLevel
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getLanguageLevel()
		 * @generated
		 */
		EEnum LANGUAGE_LEVEL = eINSTANCE.getLanguageLevel();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.PartnerType <em>Partner Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.PartnerType
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getPartnerType()
		 * @generated
		 */
		EEnum PARTNER_TYPE = eINSTANCE.getPartnerType();

		/**
		 * The meta object literal for the '{@link a3_Erasmo_Stanco_Group.DegreeLevel <em>Degree Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a3_Erasmo_Stanco_Group.DegreeLevel
		 * @see a3_Erasmo_Stanco_Group.impl.A3_Erasmo_Stanco_GroupPackageImpl#getDegreeLevel()
		 * @generated
		 */
		EEnum DEGREE_LEVEL = eINSTANCE.getDegreeLevel();

	}

} //A3_Erasmo_Stanco_GroupPackage
