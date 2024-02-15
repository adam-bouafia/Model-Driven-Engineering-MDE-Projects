/**
 */
package a3_Erasmo_Stanco_Group.util;

import a3_Erasmo_Stanco_Group.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage
 * @generated
 */
public class A3_Erasmo_Stanco_GroupValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final A3_Erasmo_Stanco_GroupValidator INSTANCE = new A3_Erasmo_Stanco_GroupValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "a3_Erasmo_Stanco_Group";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Total Credits' of 'Erasmus Program'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ERASMUS_PROGRAM__VALID_TOTAL_CREDITS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Allowance' of 'Scholarship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHOLARSHIP__VALID_ALLOWANCE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Tuition Fee' of 'Scholarship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHOLARSHIP__VALID_TUITION_FEE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Travel Grant' of 'Scholarship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCHOLARSHIP__VALID_TRAVEL_GRANT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Credits' of 'University'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNIVERSITY__VALID_CREDITS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Course Credits' of 'Course'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSE__VALID_COURSE_CREDITS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Total Admitted' of 'Results'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS__VALID_TOTAL_ADMITTED = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Scholarships Awarded' of 'Results'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS__VALID_SCHOLARSHIPS_AWARDED = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Year' of 'Results'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS__VALID_YEAR = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3_Erasmo_Stanco_GroupValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return A3_Erasmo_Stanco_GroupPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM:
				return validateErasmusProgram((ErasmusProgram)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP:
				return validateScholarship((Scholarship)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER:
				return validateAssociatePartner((AssociatePartner)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE:
				return validateAdmissionStructure((AdmissionStructure)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.RESULTS:
				return validateResults((Results)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.DOCUMENT_REQUIREMENT:
				return validateDocumentRequirement((DocumentRequirement)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT:
				return validateDegreeRequirement((DegreeRequirement)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT:
				return validateLanguageRequirement((LanguageRequirement)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS:
				return validateApplicationProcess((ApplicationProcess)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP_TYPE:
				return validateScholarshipType((ScholarshipType)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_LEVEL:
				return validateLanguageLevel((LanguageLevel)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.PARTNER_TYPE:
				return validatePartnerType((PartnerType)value, diagnostics, context);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_LEVEL:
				return validateDegreeLevel((DegreeLevel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErasmusProgram(ErasmusProgram erasmusProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(erasmusProgram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(erasmusProgram, diagnostics, context);
		if (result || diagnostics != null) result &= validateErasmusProgram_ValidTotalCredits(erasmusProgram, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidTotalCredits constraint of '<em>Erasmus Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErasmusProgram_ValidTotalCredits(ErasmusProgram erasmusProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return erasmusProgram.ValidTotalCredits(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScholarship(Scholarship scholarship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scholarship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validateScholarship_ValidTravelGrant(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validateScholarship_ValidAllowance(scholarship, diagnostics, context);
		if (result || diagnostics != null) result &= validateScholarship_ValidTuitionFee(scholarship, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidTravelGrant constraint of '<em>Scholarship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScholarship_ValidTravelGrant(Scholarship scholarship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scholarship.ValidTravelGrant(diagnostics, context);
	}

	/**
	 * Validates the ValidAllowance constraint of '<em>Scholarship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScholarship_ValidAllowance(Scholarship scholarship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scholarship.ValidAllowance(diagnostics, context);
	}

	/**
	 * Validates the ValidTuitionFee constraint of '<em>Scholarship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScholarship_ValidTuitionFee(Scholarship scholarship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scholarship.ValidTuitionFee(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(university, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(university, diagnostics, context);
		if (result || diagnostics != null) result &= validateUniversity_ValidCredits(university, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidCredits constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity_ValidCredits(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return university.ValidCredits(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_ValidCourseCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidCourseCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_ValidCourseCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course.ValidCourseCredits(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatePartner(AssociatePartner associatePartner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associatePartner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionStructure(AdmissionStructure admissionStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admissionStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResults(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(results, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(results, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(results, diagnostics, context);
		if (result || diagnostics != null) result &= validateResults_ValidYear(results, diagnostics, context);
		if (result || diagnostics != null) result &= validateResults_ValidTotalAdmitted(results, diagnostics, context);
		if (result || diagnostics != null) result &= validateResults_ValidScholarshipsAwarded(results, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidYear constraint of '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResults_ValidYear(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return results.ValidYear(diagnostics, context);
	}

	/**
	 * Validates the ValidTotalAdmitted constraint of '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResults_ValidTotalAdmitted(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return results.ValidTotalAdmitted(diagnostics, context);
	}

	/**
	 * Validates the ValidScholarshipsAwarded constraint of '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResults_ValidScholarshipsAwarded(Results results, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return results.ValidScholarshipsAwarded(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRequirement(DocumentRequirement documentRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeRequirement(DegreeRequirement degreeRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degreeRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageRequirement(LanguageRequirement languageRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationProcess(ApplicationProcess applicationProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScholarshipType(ScholarshipType scholarshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageLevel(LanguageLevel languageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerType(PartnerType partnerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeLevel(DegreeLevel degreeLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //A3_Erasmo_Stanco_GroupValidator
