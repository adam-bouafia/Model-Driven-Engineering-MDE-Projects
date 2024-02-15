/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A3_Erasmo_Stanco_GroupFactoryImpl extends EFactoryImpl implements A3_Erasmo_Stanco_GroupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static A3_Erasmo_Stanco_GroupFactory init() {
		try {
			A3_Erasmo_Stanco_GroupFactory theA3_Erasmo_Stanco_GroupFactory = (A3_Erasmo_Stanco_GroupFactory)EPackage.Registry.INSTANCE.getEFactory(A3_Erasmo_Stanco_GroupPackage.eNS_URI);
			if (theA3_Erasmo_Stanco_GroupFactory != null) {
				return theA3_Erasmo_Stanco_GroupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new A3_Erasmo_Stanco_GroupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3_Erasmo_Stanco_GroupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM: return createErasmusProgram();
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP: return createScholarship();
			case A3_Erasmo_Stanco_GroupPackage.UNIVERSITY: return createUniversity();
			case A3_Erasmo_Stanco_GroupPackage.COURSE: return createCourse();
			case A3_Erasmo_Stanco_GroupPackage.LOCATION: return createLocation();
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER: return createAssociatePartner();
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE: return createAdmissionStructure();
			case A3_Erasmo_Stanco_GroupPackage.RESULTS: return createResults();
			case A3_Erasmo_Stanco_GroupPackage.REQUIREMENT: return createRequirement();
			case A3_Erasmo_Stanco_GroupPackage.DOCUMENT_REQUIREMENT: return createDocumentRequirement();
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_REQUIREMENT: return createDegreeRequirement();
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_REQUIREMENT: return createLanguageRequirement();
			case A3_Erasmo_Stanco_GroupPackage.APPLICATION_PROCESS: return createApplicationProcess();
			case A3_Erasmo_Stanco_GroupPackage.STEP: return createStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP_TYPE:
				return createScholarshipTypeFromString(eDataType, initialValue);
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_LEVEL:
				return createLanguageLevelFromString(eDataType, initialValue);
			case A3_Erasmo_Stanco_GroupPackage.PARTNER_TYPE:
				return createPartnerTypeFromString(eDataType, initialValue);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_LEVEL:
				return createDegreeLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case A3_Erasmo_Stanco_GroupPackage.SCHOLARSHIP_TYPE:
				return convertScholarshipTypeToString(eDataType, instanceValue);
			case A3_Erasmo_Stanco_GroupPackage.LANGUAGE_LEVEL:
				return convertLanguageLevelToString(eDataType, instanceValue);
			case A3_Erasmo_Stanco_GroupPackage.PARTNER_TYPE:
				return convertPartnerTypeToString(eDataType, instanceValue);
			case A3_Erasmo_Stanco_GroupPackage.DEGREE_LEVEL:
				return convertDegreeLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErasmusProgram createErasmusProgram() {
		ErasmusProgramImpl erasmusProgram = new ErasmusProgramImpl();
		return erasmusProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scholarship createScholarship() {
		ScholarshipImpl scholarship = new ScholarshipImpl();
		return scholarship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociatePartner createAssociatePartner() {
		AssociatePartnerImpl associatePartner = new AssociatePartnerImpl();
		return associatePartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionStructure createAdmissionStructure() {
		AdmissionStructureImpl admissionStructure = new AdmissionStructureImpl();
		return admissionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRequirement createDocumentRequirement() {
		DocumentRequirementImpl documentRequirement = new DocumentRequirementImpl();
		return documentRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeRequirement createDegreeRequirement() {
		DegreeRequirementImpl degreeRequirement = new DegreeRequirementImpl();
		return degreeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageRequirement createLanguageRequirement() {
		LanguageRequirementImpl languageRequirement = new LanguageRequirementImpl();
		return languageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationProcess createApplicationProcess() {
		ApplicationProcessImpl applicationProcess = new ApplicationProcessImpl();
		return applicationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScholarshipType createScholarshipTypeFromString(EDataType eDataType, String initialValue) {
		ScholarshipType result = ScholarshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScholarshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageLevel createLanguageLevelFromString(EDataType eDataType, String initialValue) {
		LanguageLevel result = LanguageLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerType createPartnerTypeFromString(EDataType eDataType, String initialValue) {
		PartnerType result = PartnerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartnerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeLevel createDegreeLevelFromString(EDataType eDataType, String initialValue) {
		DegreeLevel result = DegreeLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public A3_Erasmo_Stanco_GroupPackage getA3_Erasmo_Stanco_GroupPackage() {
		return (A3_Erasmo_Stanco_GroupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static A3_Erasmo_Stanco_GroupPackage getPackage() {
		return A3_Erasmo_Stanco_GroupPackage.eINSTANCE;
	}

} //A3_Erasmo_Stanco_GroupFactoryImpl
