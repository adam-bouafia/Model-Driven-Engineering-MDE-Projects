/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupFactory;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AdmissionStructure;
import a3_Erasmo_Stanco_Group.ApplicationProcess;
import a3_Erasmo_Stanco_Group.AssociatePartner;
import a3_Erasmo_Stanco_Group.Course;
import a3_Erasmo_Stanco_Group.DegreeLevel;
import a3_Erasmo_Stanco_Group.DegreeRequirement;
import a3_Erasmo_Stanco_Group.DocumentRequirement;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.LanguageLevel;
import a3_Erasmo_Stanco_Group.LanguageRequirement;
import a3_Erasmo_Stanco_Group.Location;
import a3_Erasmo_Stanco_Group.PartnerType;
import a3_Erasmo_Stanco_Group.Requirement;
import a3_Erasmo_Stanco_Group.Results;
import a3_Erasmo_Stanco_Group.Scholarship;
import a3_Erasmo_Stanco_Group.ScholarshipType;
import a3_Erasmo_Stanco_Group.Step;
import a3_Erasmo_Stanco_Group.University;

import a3_Erasmo_Stanco_Group.util.A3_Erasmo_Stanco_GroupValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A3_Erasmo_Stanco_GroupPackageImpl extends EPackageImpl implements A3_Erasmo_Stanco_GroupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erasmusProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scholarshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associatePartnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scholarshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partnerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum degreeLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private A3_Erasmo_Stanco_GroupPackageImpl() {
		super(eNS_URI, A3_Erasmo_Stanco_GroupFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link A3_Erasmo_Stanco_GroupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static A3_Erasmo_Stanco_GroupPackage init() {
		if (isInited) return (A3_Erasmo_Stanco_GroupPackage)EPackage.Registry.INSTANCE.getEPackage(A3_Erasmo_Stanco_GroupPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredA3_Erasmo_Stanco_GroupPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		A3_Erasmo_Stanco_GroupPackageImpl theA3_Erasmo_Stanco_GroupPackage = registeredA3_Erasmo_Stanco_GroupPackage instanceof A3_Erasmo_Stanco_GroupPackageImpl ? (A3_Erasmo_Stanco_GroupPackageImpl)registeredA3_Erasmo_Stanco_GroupPackage : new A3_Erasmo_Stanco_GroupPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theA3_Erasmo_Stanco_GroupPackage.createPackageContents();

		// Initialize created meta-data
		theA3_Erasmo_Stanco_GroupPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theA3_Erasmo_Stanco_GroupPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return A3_Erasmo_Stanco_GroupValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theA3_Erasmo_Stanco_GroupPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(A3_Erasmo_Stanco_GroupPackage.eNS_URI, theA3_Erasmo_Stanco_GroupPackage);
		return theA3_Erasmo_Stanco_GroupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErasmusProgram() {
		return erasmusProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErasmusProgram_Name() {
		return (EAttribute)erasmusProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErasmusProgram_TotalCredits() {
		return (EAttribute)erasmusProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErasmusProgram_Universities() {
		return (EReference)erasmusProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErasmusProgram_Scholarships() {
		return (EReference)erasmusProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErasmusProgram_AssociatePartners() {
		return (EReference)erasmusProgramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getErasmusProgram_AdmissionStructure() {
		return (EReference)erasmusProgramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getErasmusProgram__ValidTotalCredits__DiagnosticChain_Map() {
		return erasmusProgramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScholarship() {
		return scholarshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScholarship_Type() {
		return (EAttribute)scholarshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScholarship_TuitionFee() {
		return (EAttribute)scholarshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScholarship_TravelGrant() {
		return (EAttribute)scholarshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScholarship_Allowance() {
		return (EAttribute)scholarshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScholarship_ErasmusProgram() {
		return (EReference)scholarshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScholarship__ValidAllowance__DiagnosticChain_Map() {
		return scholarshipEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScholarship__ValidTuitionFee__DiagnosticChain_Map() {
		return scholarshipEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScholarship__ValidTravelGrant__DiagnosticChain_Map() {
		return scholarshipEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_Credits() {
		return (EAttribute)universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversity_UniversityName() {
		return (EAttribute)universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_ErasmusProgram() {
		return (EReference)universityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Courses() {
		return (EReference)universityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Location() {
		return (EReference)universityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUniversity__ValidCredits__DiagnosticChain_Map() {
		return universityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseCode() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseName() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Faculty() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseCredits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_University() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourse__ValidCourseCredits__DiagnosticChain_Map() {
		return courseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_CountryName() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_CityName() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_University() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociatePartner() {
		return associatePartnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatePartner_PartnerName() {
		return (EAttribute)associatePartnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociatePartner_Type() {
		return (EAttribute)associatePartnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociatePartner_ErasmusProgram() {
		return (EReference)associatePartnerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmissionStructure() {
		return admissionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmissionStructure_ErasmusProgram() {
		return (EReference)admissionStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmissionStructure_ApplicationProcess() {
		return (EReference)admissionStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmissionStructure_Requierements() {
		return (EReference)admissionStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmissionStructure_Results() {
		return (EReference)admissionStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResults() {
		return resultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResults_Year() {
		return (EAttribute)resultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResults_TotalAdmitted() {
		return (EAttribute)resultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResults_ScholarshipsAwarded() {
		return (EAttribute)resultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResults_AdmittedStudents() {
		return (EAttribute)resultsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResults_AdmissionStructure() {
		return (EReference)resultsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResults__ValidTotalAdmitted__DiagnosticChain_Map() {
		return resultsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResults__ValidScholarshipsAwarded__DiagnosticChain_Map() {
		return resultsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResults__ValidYear__DiagnosticChain_Map() {
		return resultsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_AdmissionStructure() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRequirement() {
		return documentRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRequirement_DocumentName() {
		return (EAttribute)documentRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRequirement_Description() {
		return (EAttribute)documentRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeRequirement() {
		return degreeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeRequirement_DegreeName() {
		return (EAttribute)degreeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeRequirement_FieldOfStudy() {
		return (EAttribute)degreeRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeRequirement_Level() {
		return (EAttribute)degreeRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageRequirement() {
		return languageRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageRequirement_LanguageName() {
		return (EAttribute)languageRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageRequirement_Level() {
		return (EAttribute)languageRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationProcess() {
		return applicationProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationProcess_AdmissionStructure() {
		return (EReference)applicationProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationProcess_Steps() {
		return (EReference)applicationProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_StepName() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_StepDescription() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_StartDate() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_EndDate() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_ApplicationProcess() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScholarshipType() {
		return scholarshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageLevel() {
		return languageLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPartnerType() {
		return partnerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDegreeLevel() {
		return degreeLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A3_Erasmo_Stanco_GroupFactory getA3_Erasmo_Stanco_GroupFactory() {
		return (A3_Erasmo_Stanco_GroupFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		erasmusProgramEClass = createEClass(ERASMUS_PROGRAM);
		createEAttribute(erasmusProgramEClass, ERASMUS_PROGRAM__NAME);
		createEAttribute(erasmusProgramEClass, ERASMUS_PROGRAM__TOTAL_CREDITS);
		createEReference(erasmusProgramEClass, ERASMUS_PROGRAM__UNIVERSITIES);
		createEReference(erasmusProgramEClass, ERASMUS_PROGRAM__SCHOLARSHIPS);
		createEReference(erasmusProgramEClass, ERASMUS_PROGRAM__ASSOCIATE_PARTNERS);
		createEReference(erasmusProgramEClass, ERASMUS_PROGRAM__ADMISSION_STRUCTURE);
		createEOperation(erasmusProgramEClass, ERASMUS_PROGRAM___VALID_TOTAL_CREDITS__DIAGNOSTICCHAIN_MAP);

		scholarshipEClass = createEClass(SCHOLARSHIP);
		createEAttribute(scholarshipEClass, SCHOLARSHIP__TYPE);
		createEAttribute(scholarshipEClass, SCHOLARSHIP__TUITION_FEE);
		createEAttribute(scholarshipEClass, SCHOLARSHIP__TRAVEL_GRANT);
		createEAttribute(scholarshipEClass, SCHOLARSHIP__ALLOWANCE);
		createEReference(scholarshipEClass, SCHOLARSHIP__ERASMUS_PROGRAM);
		createEOperation(scholarshipEClass, SCHOLARSHIP___VALID_ALLOWANCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(scholarshipEClass, SCHOLARSHIP___VALID_TUITION_FEE__DIAGNOSTICCHAIN_MAP);
		createEOperation(scholarshipEClass, SCHOLARSHIP___VALID_TRAVEL_GRANT__DIAGNOSTICCHAIN_MAP);

		universityEClass = createEClass(UNIVERSITY);
		createEAttribute(universityEClass, UNIVERSITY__CREDITS);
		createEAttribute(universityEClass, UNIVERSITY__UNIVERSITY_NAME);
		createEReference(universityEClass, UNIVERSITY__ERASMUS_PROGRAM);
		createEReference(universityEClass, UNIVERSITY__COURSES);
		createEReference(universityEClass, UNIVERSITY__LOCATION);
		createEOperation(universityEClass, UNIVERSITY___VALID_CREDITS__DIAGNOSTICCHAIN_MAP);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__COURSE_CODE);
		createEAttribute(courseEClass, COURSE__COURSE_NAME);
		createEAttribute(courseEClass, COURSE__FACULTY);
		createEAttribute(courseEClass, COURSE__COURSE_CREDITS);
		createEReference(courseEClass, COURSE__UNIVERSITY);
		createEOperation(courseEClass, COURSE___VALID_COURSE_CREDITS__DIAGNOSTICCHAIN_MAP);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__COUNTRY_NAME);
		createEAttribute(locationEClass, LOCATION__CITY_NAME);
		createEReference(locationEClass, LOCATION__UNIVERSITY);

		associatePartnerEClass = createEClass(ASSOCIATE_PARTNER);
		createEAttribute(associatePartnerEClass, ASSOCIATE_PARTNER__PARTNER_NAME);
		createEAttribute(associatePartnerEClass, ASSOCIATE_PARTNER__TYPE);
		createEReference(associatePartnerEClass, ASSOCIATE_PARTNER__ERASMUS_PROGRAM);

		admissionStructureEClass = createEClass(ADMISSION_STRUCTURE);
		createEReference(admissionStructureEClass, ADMISSION_STRUCTURE__ERASMUS_PROGRAM);
		createEReference(admissionStructureEClass, ADMISSION_STRUCTURE__APPLICATION_PROCESS);
		createEReference(admissionStructureEClass, ADMISSION_STRUCTURE__REQUIEREMENTS);
		createEReference(admissionStructureEClass, ADMISSION_STRUCTURE__RESULTS);

		resultsEClass = createEClass(RESULTS);
		createEAttribute(resultsEClass, RESULTS__YEAR);
		createEAttribute(resultsEClass, RESULTS__TOTAL_ADMITTED);
		createEAttribute(resultsEClass, RESULTS__SCHOLARSHIPS_AWARDED);
		createEAttribute(resultsEClass, RESULTS__ADMITTED_STUDENTS);
		createEReference(resultsEClass, RESULTS__ADMISSION_STRUCTURE);
		createEOperation(resultsEClass, RESULTS___VALID_TOTAL_ADMITTED__DIAGNOSTICCHAIN_MAP);
		createEOperation(resultsEClass, RESULTS___VALID_SCHOLARSHIPS_AWARDED__DIAGNOSTICCHAIN_MAP);
		createEOperation(resultsEClass, RESULTS___VALID_YEAR__DIAGNOSTICCHAIN_MAP);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__ADMISSION_STRUCTURE);

		documentRequirementEClass = createEClass(DOCUMENT_REQUIREMENT);
		createEAttribute(documentRequirementEClass, DOCUMENT_REQUIREMENT__DOCUMENT_NAME);
		createEAttribute(documentRequirementEClass, DOCUMENT_REQUIREMENT__DESCRIPTION);

		degreeRequirementEClass = createEClass(DEGREE_REQUIREMENT);
		createEAttribute(degreeRequirementEClass, DEGREE_REQUIREMENT__DEGREE_NAME);
		createEAttribute(degreeRequirementEClass, DEGREE_REQUIREMENT__FIELD_OF_STUDY);
		createEAttribute(degreeRequirementEClass, DEGREE_REQUIREMENT__LEVEL);

		languageRequirementEClass = createEClass(LANGUAGE_REQUIREMENT);
		createEAttribute(languageRequirementEClass, LANGUAGE_REQUIREMENT__LANGUAGE_NAME);
		createEAttribute(languageRequirementEClass, LANGUAGE_REQUIREMENT__LEVEL);

		applicationProcessEClass = createEClass(APPLICATION_PROCESS);
		createEReference(applicationProcessEClass, APPLICATION_PROCESS__ADMISSION_STRUCTURE);
		createEReference(applicationProcessEClass, APPLICATION_PROCESS__STEPS);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__STEP_NAME);
		createEAttribute(stepEClass, STEP__STEP_DESCRIPTION);
		createEAttribute(stepEClass, STEP__START_DATE);
		createEAttribute(stepEClass, STEP__END_DATE);
		createEReference(stepEClass, STEP__APPLICATION_PROCESS);

		// Create enums
		scholarshipTypeEEnum = createEEnum(SCHOLARSHIP_TYPE);
		languageLevelEEnum = createEEnum(LANGUAGE_LEVEL);
		partnerTypeEEnum = createEEnum(PARTNER_TYPE);
		degreeLevelEEnum = createEEnum(DEGREE_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentRequirementEClass.getESuperTypes().add(this.getRequirement());
		degreeRequirementEClass.getESuperTypes().add(this.getRequirement());
		languageRequirementEClass.getESuperTypes().add(this.getRequirement());

		// Initialize classes, features, and operations; add parameters
		initEClass(erasmusProgramEClass, ErasmusProgram.class, "ErasmusProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErasmusProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErasmusProgram_TotalCredits(), ecorePackage.getEInt(), "totalCredits", null, 1, 1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErasmusProgram_Universities(), this.getUniversity(), this.getUniversity_ErasmusProgram(), "universities", null, 0, -1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErasmusProgram_Scholarships(), this.getScholarship(), this.getScholarship_ErasmusProgram(), "scholarships", null, 0, -1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErasmusProgram_AssociatePartners(), this.getAssociatePartner(), this.getAssociatePartner_ErasmusProgram(), "associatePartners", null, 0, -1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErasmusProgram_AdmissionStructure(), this.getAdmissionStructure(), this.getAdmissionStructure_ErasmusProgram(), "admissionStructure", null, 0, 1, ErasmusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getErasmusProgram__ValidTotalCredits__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidTotalCredits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scholarshipEClass, Scholarship.class, "Scholarship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScholarship_Type(), this.getScholarshipType(), "type", null, 0, 1, Scholarship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScholarship_TuitionFee(), ecorePackage.getEInt(), "tuitionFee", null, 1, 1, Scholarship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScholarship_TravelGrant(), ecorePackage.getEInt(), "travelGrant", null, 1, 1, Scholarship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScholarship_Allowance(), ecorePackage.getEInt(), "allowance", null, 1, 1, Scholarship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScholarship_ErasmusProgram(), this.getErasmusProgram(), this.getErasmusProgram_Scholarships(), "erasmusProgram", null, 1, 1, Scholarship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getScholarship__ValidAllowance__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidAllowance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScholarship__ValidTuitionFee__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidTuitionFee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getScholarship__ValidTravelGrant__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidTravelGrant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversity_Credits(), ecorePackage.getEInt(), "credits", null, 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversity_UniversityName(), ecorePackage.getEString(), "universityName", null, 0, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_ErasmusProgram(), this.getErasmusProgram(), this.getErasmusProgram_Universities(), "erasmusProgram", null, 0, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Courses(), this.getCourse(), this.getCourse_University(), "courses", null, 1, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Location(), this.getLocation(), this.getLocation_University(), "location", null, 1, 1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUniversity__ValidCredits__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidCredits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_CourseCode(), ecorePackage.getEString(), "courseCode", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseName(), ecorePackage.getEString(), "courseName", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Faculty(), ecorePackage.getEString(), "faculty", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CourseCredits(), ecorePackage.getEInt(), "courseCredits", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_University(), this.getUniversity(), this.getUniversity_Courses(), "university", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourse__ValidCourseCredits__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidCourseCredits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_CountryName(), ecorePackage.getEString(), "countryName", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_CityName(), ecorePackage.getEString(), "cityName", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_University(), this.getUniversity(), this.getUniversity_Location(), "university", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associatePartnerEClass, AssociatePartner.class, "AssociatePartner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociatePartner_PartnerName(), ecorePackage.getEString(), "partnerName", null, 0, 1, AssociatePartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociatePartner_Type(), this.getPartnerType(), "type", null, 0, 1, AssociatePartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociatePartner_ErasmusProgram(), this.getErasmusProgram(), this.getErasmusProgram_AssociatePartners(), "erasmusProgram", null, 0, 1, AssociatePartner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(admissionStructureEClass, AdmissionStructure.class, "AdmissionStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdmissionStructure_ErasmusProgram(), this.getErasmusProgram(), this.getErasmusProgram_AdmissionStructure(), "erasmusProgram", null, 1, 1, AdmissionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmissionStructure_ApplicationProcess(), this.getApplicationProcess(), this.getApplicationProcess_AdmissionStructure(), "applicationProcess", null, 1, 1, AdmissionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmissionStructure_Requierements(), this.getRequirement(), this.getRequirement_AdmissionStructure(), "requierements", null, 1, -1, AdmissionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmissionStructure_Results(), this.getResults(), this.getResults_AdmissionStructure(), "results", null, 0, -1, AdmissionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsEClass, Results.class, "Results", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResults_Year(), ecorePackage.getEInt(), "year", null, 1, 1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResults_TotalAdmitted(), ecorePackage.getEInt(), "totalAdmitted", null, 1, 1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResults_ScholarshipsAwarded(), ecorePackage.getEInt(), "scholarshipsAwarded", null, 1, 1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResults_AdmittedStudents(), ecorePackage.getEString(), "admittedStudents", null, 0, -1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResults_AdmissionStructure(), this.getAdmissionStructure(), this.getAdmissionStructure_Results(), "admissionStructure", null, 1, 1, Results.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResults__ValidTotalAdmitted__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidTotalAdmitted", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResults__ValidScholarshipsAwarded__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidScholarshipsAwarded", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResults__ValidYear__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidYear", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_AdmissionStructure(), this.getAdmissionStructure(), this.getAdmissionStructure_Requierements(), "admissionStructure", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRequirementEClass, DocumentRequirement.class, "DocumentRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRequirement_DocumentName(), ecorePackage.getEString(), "documentName", null, 0, 1, DocumentRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DocumentRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeRequirementEClass, DegreeRequirement.class, "DegreeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegreeRequirement_DegreeName(), ecorePackage.getEString(), "degreeName", null, 0, 1, DegreeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeRequirement_FieldOfStudy(), ecorePackage.getEString(), "fieldOfStudy", null, 0, 1, DegreeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeRequirement_Level(), this.getDegreeLevel(), "level", null, 0, 1, DegreeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageRequirementEClass, LanguageRequirement.class, "LanguageRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageRequirement_LanguageName(), ecorePackage.getEString(), "languageName", null, 0, 1, LanguageRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageRequirement_Level(), this.getLanguageLevel(), "level", null, 0, 1, LanguageRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationProcessEClass, ApplicationProcess.class, "ApplicationProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationProcess_AdmissionStructure(), this.getAdmissionStructure(), this.getAdmissionStructure_ApplicationProcess(), "admissionStructure", null, 1, 1, ApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationProcess_Steps(), this.getStep(), this.getStep_ApplicationProcess(), "steps", null, 1, -1, ApplicationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_StepName(), ecorePackage.getEString(), "stepName", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepDescription(), ecorePackage.getEString(), "stepDescription", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_ApplicationProcess(), this.getApplicationProcess(), this.getApplicationProcess_Steps(), "applicationProcess", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scholarshipTypeEEnum, ScholarshipType.class, "ScholarshipType");
		addEEnumLiteral(scholarshipTypeEEnum, ScholarshipType.PROGRAM_COUNTRY);
		addEEnumLiteral(scholarshipTypeEEnum, ScholarshipType.PARTNER_COUNTRY);

		initEEnum(languageLevelEEnum, LanguageLevel.class, "LanguageLevel");
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.A1);
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.A2);
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.B1);
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.B2);
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.C1);
		addEEnumLiteral(languageLevelEEnum, LanguageLevel.C2);

		initEEnum(partnerTypeEEnum, PartnerType.class, "PartnerType");
		addEEnumLiteral(partnerTypeEEnum, PartnerType.INDUSTRIAL);
		addEEnumLiteral(partnerTypeEEnum, PartnerType.ACADEMIC);

		initEEnum(degreeLevelEEnum, DegreeLevel.class, "DegreeLevel");
		addEEnumLiteral(degreeLevelEEnum, DegreeLevel.BACHELOR);
		addEEnumLiteral(degreeLevelEEnum, DegreeLevel.MASTER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (erasmusProgramEClass,
		   source,
		   new String[] {
			   "constraints", "ValidTotalCredits"
		   });
		addAnnotation
		  (scholarshipEClass,
		   source,
		   new String[] {
			   "constraints", "ValidTravelGrant"
		   });
		addAnnotation
		  (universityEClass,
		   source,
		   new String[] {
			   "constraints", "ValidCredits"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "constraints", "ValidCourseCredits"
		   });
		addAnnotation
		  (resultsEClass,
		   source,
		   new String[] {
			   "constraints", "ValidYear"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getErasmusProgram__ValidTotalCredits__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.totalCredits > 0"
		   });
		addAnnotation
		  (getScholarship__ValidAllowance__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.allowance >= 0"
		   });
		addAnnotation
		  (getScholarship__ValidTuitionFee__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.tuitionFee >= 0"
		   });
		addAnnotation
		  (getScholarship__ValidTravelGrant__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.travelGrant >= 0"
		   });
		addAnnotation
		  (getUniversity__ValidCredits__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.credits <= 60"
		   });
		addAnnotation
		  (getCourse__ValidCourseCredits__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.courseCredits > 0"
		   });
		addAnnotation
		  (getResults__ValidTotalAdmitted__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.totalAdmitted >= 0"
		   });
		addAnnotation
		  (getResults__ValidScholarshipsAwarded__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.scholarshipsAwarded >= 0"
		   });
		addAnnotation
		  (getResults__ValidYear__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.year > 0"
		   });
	}

} //A3_Erasmo_Stanco_GroupPackageImpl
