/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.ecore
 * using:
 *   /a3-emf-and-ocl-l-erasmo-stanco.model/model/a3_Erasmo_Stanco_Group.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package a3_Erasmo_Stanco_Group;

// import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
// import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * A3_Erasmo_Stanco_GroupTables provides the dispatch tables for the a3_Erasmo_Stanco_Group for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class A3_Erasmo_Stanco_GroupTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(A3_Erasmo_Stanco_GroupPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group = IdManager.getNsURIPackageId("http://www.example.org/a3_Erasmo_Stanco_Group", null, A3_Erasmo_Stanco_GroupPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AdmissionStructure = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("AdmissionStructure", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ApplicationProcess = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("ApplicationProcess", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AssociatePartner = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("AssociatePartner", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Course = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Course", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ErasmusProgram = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("ErasmusProgram", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Requirement = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Requirement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Results = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Results", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Scholarship = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Scholarship", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Step = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("Step", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_University = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getClassId("University", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DegreeLevel = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getEnumerationId("DegreeLevel");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LanguageLevel = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getEnumerationId("LanguageLevel");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PartnerType = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getEnumerationId("PartnerType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ScholarshipType = A3_Erasmo_Stanco_GroupTables.PACKid_http_c_s_s_www_example_org_s_a3_Erasmo_Stanco_Group.getEnumerationId("ScholarshipType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_60 = ValueUtil.integerValueOf("60");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AssociatePartner = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_AssociatePartner, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_Course, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Requirement = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_Requirement, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Results = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_Results, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Scholarship = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_Scholarship, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Step = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_Step, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_University = TypeId.ORDERED_SET.getSpecializedId(A3_Erasmo_Stanco_GroupTables.CLSSid_University, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			A3_Erasmo_Stanco_GroupTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AdmissionStructure = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE, PACKAGE, 0);
		public static final EcoreExecutorType _ApplicationProcess = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.APPLICATION_PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _AssociatePartner = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.ASSOCIATE_PARTNER, PACKAGE, 0);
		public static final EcoreExecutorType _Course = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DegreeLevel = new EcoreExecutorEnumeration(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _DegreeRequirement = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_REQUIREMENT, PACKAGE, 0);
		public static final EcoreExecutorType _DocumentRequirement = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.DOCUMENT_REQUIREMENT, PACKAGE, 0);
		public static final EcoreExecutorType _ErasmusProgram = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LanguageLevel = new EcoreExecutorEnumeration(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL, PACKAGE, 0);
		public static final EcoreExecutorType _LanguageRequirement = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_REQUIREMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PartnerType = new EcoreExecutorEnumeration(A3_Erasmo_Stanco_GroupPackage.Literals.PARTNER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Requirement = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.REQUIREMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Results = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS, PACKAGE, 0);
		public static final EcoreExecutorType _Scholarship = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ScholarshipType = new EcoreExecutorEnumeration(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.STEP, PACKAGE, 0);
		public static final EcoreExecutorType _University = new EcoreExecutorType(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AdmissionStructure,
			_ApplicationProcess,
			_AssociatePartner,
			_Course,
			_DegreeLevel,
			_DegreeRequirement,
			_DocumentRequirement,
			_ErasmusProgram,
			_LanguageLevel,
			_LanguageRequirement,
			_Location,
			_PartnerType,
			_Requirement,
			_Results,
			_Scholarship,
			_ScholarshipType,
			_Step,
			_University
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AdmissionStructure__AdmissionStructure = new ExecutorFragment(Types._AdmissionStructure, A3_Erasmo_Stanco_GroupTables.Types._AdmissionStructure);
		private static final ExecutorFragment _AdmissionStructure__OclAny = new ExecutorFragment(Types._AdmissionStructure, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AdmissionStructure__OclElement = new ExecutorFragment(Types._AdmissionStructure, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ApplicationProcess__ApplicationProcess = new ExecutorFragment(Types._ApplicationProcess, A3_Erasmo_Stanco_GroupTables.Types._ApplicationProcess);
		private static final ExecutorFragment _ApplicationProcess__OclAny = new ExecutorFragment(Types._ApplicationProcess, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ApplicationProcess__OclElement = new ExecutorFragment(Types._ApplicationProcess, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AssociatePartner__AssociatePartner = new ExecutorFragment(Types._AssociatePartner, A3_Erasmo_Stanco_GroupTables.Types._AssociatePartner);
		private static final ExecutorFragment _AssociatePartner__OclAny = new ExecutorFragment(Types._AssociatePartner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AssociatePartner__OclElement = new ExecutorFragment(Types._AssociatePartner, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Course__Course = new ExecutorFragment(Types._Course, A3_Erasmo_Stanco_GroupTables.Types._Course);
		private static final ExecutorFragment _Course__OclAny = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Course__OclElement = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DegreeLevel__DegreeLevel = new ExecutorFragment(Types._DegreeLevel, A3_Erasmo_Stanco_GroupTables.Types._DegreeLevel);
		private static final ExecutorFragment _DegreeLevel__OclAny = new ExecutorFragment(Types._DegreeLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DegreeLevel__OclElement = new ExecutorFragment(Types._DegreeLevel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DegreeLevel__OclEnumeration = new ExecutorFragment(Types._DegreeLevel, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DegreeLevel__OclType = new ExecutorFragment(Types._DegreeLevel, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DegreeRequirement__DegreeRequirement = new ExecutorFragment(Types._DegreeRequirement, A3_Erasmo_Stanco_GroupTables.Types._DegreeRequirement);
		private static final ExecutorFragment _DegreeRequirement__OclAny = new ExecutorFragment(Types._DegreeRequirement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DegreeRequirement__OclElement = new ExecutorFragment(Types._DegreeRequirement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DegreeRequirement__Requirement = new ExecutorFragment(Types._DegreeRequirement, A3_Erasmo_Stanco_GroupTables.Types._Requirement);

		private static final ExecutorFragment _DocumentRequirement__DocumentRequirement = new ExecutorFragment(Types._DocumentRequirement, A3_Erasmo_Stanco_GroupTables.Types._DocumentRequirement);
		private static final ExecutorFragment _DocumentRequirement__OclAny = new ExecutorFragment(Types._DocumentRequirement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentRequirement__OclElement = new ExecutorFragment(Types._DocumentRequirement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DocumentRequirement__Requirement = new ExecutorFragment(Types._DocumentRequirement, A3_Erasmo_Stanco_GroupTables.Types._Requirement);

		private static final ExecutorFragment _ErasmusProgram__ErasmusProgram = new ExecutorFragment(Types._ErasmusProgram, A3_Erasmo_Stanco_GroupTables.Types._ErasmusProgram);
		private static final ExecutorFragment _ErasmusProgram__OclAny = new ExecutorFragment(Types._ErasmusProgram, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ErasmusProgram__OclElement = new ExecutorFragment(Types._ErasmusProgram, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LanguageLevel__LanguageLevel = new ExecutorFragment(Types._LanguageLevel, A3_Erasmo_Stanco_GroupTables.Types._LanguageLevel);
		private static final ExecutorFragment _LanguageLevel__OclAny = new ExecutorFragment(Types._LanguageLevel, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LanguageLevel__OclElement = new ExecutorFragment(Types._LanguageLevel, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LanguageLevel__OclEnumeration = new ExecutorFragment(Types._LanguageLevel, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LanguageLevel__OclType = new ExecutorFragment(Types._LanguageLevel, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _LanguageRequirement__LanguageRequirement = new ExecutorFragment(Types._LanguageRequirement, A3_Erasmo_Stanco_GroupTables.Types._LanguageRequirement);
		private static final ExecutorFragment _LanguageRequirement__OclAny = new ExecutorFragment(Types._LanguageRequirement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LanguageRequirement__OclElement = new ExecutorFragment(Types._LanguageRequirement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LanguageRequirement__Requirement = new ExecutorFragment(Types._LanguageRequirement, A3_Erasmo_Stanco_GroupTables.Types._Requirement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, A3_Erasmo_Stanco_GroupTables.Types._Location);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _PartnerType__OclAny = new ExecutorFragment(Types._PartnerType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PartnerType__OclElement = new ExecutorFragment(Types._PartnerType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PartnerType__OclEnumeration = new ExecutorFragment(Types._PartnerType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PartnerType__OclType = new ExecutorFragment(Types._PartnerType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PartnerType__PartnerType = new ExecutorFragment(Types._PartnerType, A3_Erasmo_Stanco_GroupTables.Types._PartnerType);

		private static final ExecutorFragment _Requirement__OclAny = new ExecutorFragment(Types._Requirement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Requirement__OclElement = new ExecutorFragment(Types._Requirement, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Requirement__Requirement = new ExecutorFragment(Types._Requirement, A3_Erasmo_Stanco_GroupTables.Types._Requirement);

		private static final ExecutorFragment _Results__OclAny = new ExecutorFragment(Types._Results, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Results__OclElement = new ExecutorFragment(Types._Results, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Results__Results = new ExecutorFragment(Types._Results, A3_Erasmo_Stanco_GroupTables.Types._Results);

		private static final ExecutorFragment _Scholarship__OclAny = new ExecutorFragment(Types._Scholarship, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Scholarship__OclElement = new ExecutorFragment(Types._Scholarship, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Scholarship__Scholarship = new ExecutorFragment(Types._Scholarship, A3_Erasmo_Stanco_GroupTables.Types._Scholarship);

		private static final ExecutorFragment _ScholarshipType__OclAny = new ExecutorFragment(Types._ScholarshipType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ScholarshipType__OclElement = new ExecutorFragment(Types._ScholarshipType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ScholarshipType__OclEnumeration = new ExecutorFragment(Types._ScholarshipType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ScholarshipType__OclType = new ExecutorFragment(Types._ScholarshipType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ScholarshipType__ScholarshipType = new ExecutorFragment(Types._ScholarshipType, A3_Erasmo_Stanco_GroupTables.Types._ScholarshipType);

		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, A3_Erasmo_Stanco_GroupTables.Types._Step);

		private static final ExecutorFragment _University__OclAny = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _University__OclElement = new ExecutorFragment(Types._University, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _University__University = new ExecutorFragment(Types._University, A3_Erasmo_Stanco_GroupTables.Types._University);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AdmissionStructure__applicationProcess = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__APPLICATION_PROCESS, Types._AdmissionStructure, 0);
		public static final ExecutorProperty _AdmissionStructure__erasmusProgram = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__ERASMUS_PROGRAM, Types._AdmissionStructure, 1);
		public static final ExecutorProperty _AdmissionStructure__requierements = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS, Types._AdmissionStructure, 2);
		public static final ExecutorProperty _AdmissionStructure__results = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__RESULTS, Types._AdmissionStructure, 3);

		public static final ExecutorProperty _ApplicationProcess__admissionStructure = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.APPLICATION_PROCESS__ADMISSION_STRUCTURE, Types._ApplicationProcess, 0);
		public static final ExecutorProperty _ApplicationProcess__steps = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.APPLICATION_PROCESS__STEPS, Types._ApplicationProcess, 1);

		public static final ExecutorProperty _AssociatePartner__erasmusProgram = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ASSOCIATE_PARTNER__ERASMUS_PROGRAM, Types._AssociatePartner, 0);
		public static final ExecutorProperty _AssociatePartner__partnerName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ASSOCIATE_PARTNER__PARTNER_NAME, Types._AssociatePartner, 1);
		public static final ExecutorProperty _AssociatePartner__type = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ASSOCIATE_PARTNER__TYPE, Types._AssociatePartner, 2);

		public static final ExecutorProperty _Course__courseCode = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE__COURSE_CODE, Types._Course, 0);
		public static final ExecutorProperty _Course__courseCredits = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE__COURSE_CREDITS, Types._Course, 1);
		public static final ExecutorProperty _Course__courseName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE__COURSE_NAME, Types._Course, 2);
		public static final ExecutorProperty _Course__faculty = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE__FACULTY, Types._Course, 3);
		public static final ExecutorProperty _Course__university = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.COURSE__UNIVERSITY, Types._Course, 4);

		public static final ExecutorProperty _DegreeRequirement__degreeName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_REQUIREMENT__DEGREE_NAME, Types._DegreeRequirement, 0);
		public static final ExecutorProperty _DegreeRequirement__fieldOfStudy = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_REQUIREMENT__FIELD_OF_STUDY, Types._DegreeRequirement, 1);
		public static final ExecutorProperty _DegreeRequirement__level = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_REQUIREMENT__LEVEL, Types._DegreeRequirement, 2);

		public static final ExecutorProperty _DocumentRequirement__description = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.DOCUMENT_REQUIREMENT__DESCRIPTION, Types._DocumentRequirement, 0);
		public static final ExecutorProperty _DocumentRequirement__documentName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.DOCUMENT_REQUIREMENT__DOCUMENT_NAME, Types._DocumentRequirement, 1);

		public static final ExecutorProperty _ErasmusProgram__admissionStructure = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__ADMISSION_STRUCTURE, Types._ErasmusProgram, 0);
		public static final ExecutorProperty _ErasmusProgram__associatePartners = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS, Types._ErasmusProgram, 1);
		public static final ExecutorProperty _ErasmusProgram__name = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__NAME, Types._ErasmusProgram, 2);
		public static final ExecutorProperty _ErasmusProgram__scholarships = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__SCHOLARSHIPS, Types._ErasmusProgram, 3);
		public static final ExecutorProperty _ErasmusProgram__totalCredits = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__TOTAL_CREDITS, Types._ErasmusProgram, 4);
		public static final ExecutorProperty _ErasmusProgram__universities = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.ERASMUS_PROGRAM__UNIVERSITIES, Types._ErasmusProgram, 5);

		public static final ExecutorProperty _LanguageRequirement__languageName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_REQUIREMENT__LANGUAGE_NAME, Types._LanguageRequirement, 0);
		public static final ExecutorProperty _LanguageRequirement__level = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_REQUIREMENT__LEVEL, Types._LanguageRequirement, 1);

		public static final ExecutorProperty _Location__cityName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.LOCATION__CITY_NAME, Types._Location, 0);
		public static final ExecutorProperty _Location__countryName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.LOCATION__COUNTRY_NAME, Types._Location, 1);
		public static final ExecutorProperty _Location__university = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.LOCATION__UNIVERSITY, Types._Location, 2);

		public static final ExecutorProperty _Requirement__admissionStructure = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.REQUIREMENT__ADMISSION_STRUCTURE, Types._Requirement, 0);

		public static final ExecutorProperty _Results__admissionStructure = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS__ADMISSION_STRUCTURE, Types._Results, 0);
		public static final ExecutorProperty _Results__admittedStudents = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS__ADMITTED_STUDENTS, Types._Results, 1);
		public static final ExecutorProperty _Results__scholarshipsAwarded = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS__SCHOLARSHIPS_AWARDED, Types._Results, 2);
		public static final ExecutorProperty _Results__totalAdmitted = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS__TOTAL_ADMITTED, Types._Results, 3);
		public static final ExecutorProperty _Results__year = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.RESULTS__YEAR, Types._Results, 4);

		public static final ExecutorProperty _Scholarship__allowance = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP__ALLOWANCE, Types._Scholarship, 0);
		public static final ExecutorProperty _Scholarship__erasmusProgram = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP__ERASMUS_PROGRAM, Types._Scholarship, 1);
		public static final ExecutorProperty _Scholarship__travelGrant = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP__TRAVEL_GRANT, Types._Scholarship, 2);
		public static final ExecutorProperty _Scholarship__tuitionFee = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP__TUITION_FEE, Types._Scholarship, 3);
		public static final ExecutorProperty _Scholarship__type = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP__TYPE, Types._Scholarship, 4);

		public static final ExecutorProperty _Step__applicationProcess = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.STEP__APPLICATION_PROCESS, Types._Step, 0);
		public static final ExecutorProperty _Step__endDate = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.STEP__END_DATE, Types._Step, 1);
		public static final ExecutorProperty _Step__startDate = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.STEP__START_DATE, Types._Step, 2);
		public static final ExecutorProperty _Step__stepDescription = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.STEP__STEP_DESCRIPTION, Types._Step, 3);
		public static final ExecutorProperty _Step__stepName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.STEP__STEP_NAME, Types._Step, 4);

		public static final ExecutorProperty _University__courses = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY__COURSES, Types._University, 0);
		public static final ExecutorProperty _University__credits = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY__CREDITS, Types._University, 1);
		public static final ExecutorProperty _University__erasmusProgram = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY__ERASMUS_PROGRAM, Types._University, 2);
		public static final ExecutorProperty _University__location = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY__LOCATION, Types._University, 3);
		public static final ExecutorProperty _University__universityName = new EcoreExecutorProperty(A3_Erasmo_Stanco_GroupPackage.Literals.UNIVERSITY__UNIVERSITY_NAME, Types._University, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AdmissionStructure =
			{
				Fragments._AdmissionStructure__OclAny /* 0 */,
				Fragments._AdmissionStructure__OclElement /* 1 */,
				Fragments._AdmissionStructure__AdmissionStructure /* 2 */
			};
		private static final int /*@NonNull*/ [] __AdmissionStructure = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ApplicationProcess =
			{
				Fragments._ApplicationProcess__OclAny /* 0 */,
				Fragments._ApplicationProcess__OclElement /* 1 */,
				Fragments._ApplicationProcess__ApplicationProcess /* 2 */
			};
		private static final int /*@NonNull*/ [] __ApplicationProcess = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AssociatePartner =
			{
				Fragments._AssociatePartner__OclAny /* 0 */,
				Fragments._AssociatePartner__OclElement /* 1 */,
				Fragments._AssociatePartner__AssociatePartner /* 2 */
			};
		private static final int /*@NonNull*/ [] __AssociatePartner = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Course =
			{
				Fragments._Course__OclAny /* 0 */,
				Fragments._Course__OclElement /* 1 */,
				Fragments._Course__Course /* 2 */
			};
		private static final int /*@NonNull*/ [] __Course = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DegreeLevel =
			{
				Fragments._DegreeLevel__OclAny /* 0 */,
				Fragments._DegreeLevel__OclElement /* 1 */,
				Fragments._DegreeLevel__OclType /* 2 */,
				Fragments._DegreeLevel__OclEnumeration /* 3 */,
				Fragments._DegreeLevel__DegreeLevel /* 4 */
			};
		private static final int /*@NonNull*/ [] __DegreeLevel = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DegreeRequirement =
			{
				Fragments._DegreeRequirement__OclAny /* 0 */,
				Fragments._DegreeRequirement__OclElement /* 1 */,
				Fragments._DegreeRequirement__Requirement /* 2 */,
				Fragments._DegreeRequirement__DegreeRequirement /* 3 */
			};
		private static final int /*@NonNull*/ [] __DegreeRequirement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentRequirement =
			{
				Fragments._DocumentRequirement__OclAny /* 0 */,
				Fragments._DocumentRequirement__OclElement /* 1 */,
				Fragments._DocumentRequirement__Requirement /* 2 */,
				Fragments._DocumentRequirement__DocumentRequirement /* 3 */
			};
		private static final int /*@NonNull*/ [] __DocumentRequirement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ErasmusProgram =
			{
				Fragments._ErasmusProgram__OclAny /* 0 */,
				Fragments._ErasmusProgram__OclElement /* 1 */,
				Fragments._ErasmusProgram__ErasmusProgram /* 2 */
			};
		private static final int /*@NonNull*/ [] __ErasmusProgram = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LanguageLevel =
			{
				Fragments._LanguageLevel__OclAny /* 0 */,
				Fragments._LanguageLevel__OclElement /* 1 */,
				Fragments._LanguageLevel__OclType /* 2 */,
				Fragments._LanguageLevel__OclEnumeration /* 3 */,
				Fragments._LanguageLevel__LanguageLevel /* 4 */
			};
		private static final int /*@NonNull*/ [] __LanguageLevel = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LanguageRequirement =
			{
				Fragments._LanguageRequirement__OclAny /* 0 */,
				Fragments._LanguageRequirement__OclElement /* 1 */,
				Fragments._LanguageRequirement__Requirement /* 2 */,
				Fragments._LanguageRequirement__LanguageRequirement /* 3 */
			};
		private static final int /*@NonNull*/ [] __LanguageRequirement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__Location /* 2 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PartnerType =
			{
				Fragments._PartnerType__OclAny /* 0 */,
				Fragments._PartnerType__OclElement /* 1 */,
				Fragments._PartnerType__OclType /* 2 */,
				Fragments._PartnerType__OclEnumeration /* 3 */,
				Fragments._PartnerType__PartnerType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PartnerType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Requirement =
			{
				Fragments._Requirement__OclAny /* 0 */,
				Fragments._Requirement__OclElement /* 1 */,
				Fragments._Requirement__Requirement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Requirement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Results =
			{
				Fragments._Results__OclAny /* 0 */,
				Fragments._Results__OclElement /* 1 */,
				Fragments._Results__Results /* 2 */
			};
		private static final int /*@NonNull*/ [] __Results = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Scholarship =
			{
				Fragments._Scholarship__OclAny /* 0 */,
				Fragments._Scholarship__OclElement /* 1 */,
				Fragments._Scholarship__Scholarship /* 2 */
			};
		private static final int /*@NonNull*/ [] __Scholarship = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ScholarshipType =
			{
				Fragments._ScholarshipType__OclAny /* 0 */,
				Fragments._ScholarshipType__OclElement /* 1 */,
				Fragments._ScholarshipType__OclType /* 2 */,
				Fragments._ScholarshipType__OclEnumeration /* 3 */,
				Fragments._ScholarshipType__ScholarshipType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ScholarshipType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Step /* 2 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _University =
			{
				Fragments._University__OclAny /* 0 */,
				Fragments._University__OclElement /* 1 */,
				Fragments._University__University /* 2 */
			};
		private static final int /*@NonNull*/ [] __University = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AdmissionStructure.initFragments(_AdmissionStructure, __AdmissionStructure);
			Types._ApplicationProcess.initFragments(_ApplicationProcess, __ApplicationProcess);
			Types._AssociatePartner.initFragments(_AssociatePartner, __AssociatePartner);
			Types._Course.initFragments(_Course, __Course);
			Types._DegreeLevel.initFragments(_DegreeLevel, __DegreeLevel);
			Types._DegreeRequirement.initFragments(_DegreeRequirement, __DegreeRequirement);
			Types._DocumentRequirement.initFragments(_DocumentRequirement, __DocumentRequirement);
			Types._ErasmusProgram.initFragments(_ErasmusProgram, __ErasmusProgram);
			Types._LanguageLevel.initFragments(_LanguageLevel, __LanguageLevel);
			Types._LanguageRequirement.initFragments(_LanguageRequirement, __LanguageRequirement);
			Types._Location.initFragments(_Location, __Location);
			Types._PartnerType.initFragments(_PartnerType, __PartnerType);
			Types._Requirement.initFragments(_Requirement, __Requirement);
			Types._Results.initFragments(_Results, __Results);
			Types._Scholarship.initFragments(_Scholarship, __Scholarship);
			Types._ScholarshipType.initFragments(_ScholarshipType, __ScholarshipType);
			Types._Step.initFragments(_Step, __Step);
			Types._University.initFragments(_University, __University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AdmissionStructure__AdmissionStructure = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AdmissionStructure__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AdmissionStructure__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ApplicationProcess__ApplicationProcess = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicationProcess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ApplicationProcess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AssociatePartner__AssociatePartner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AssociatePartner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AssociatePartner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Course__Course = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DegreeLevel__DegreeLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeLevel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeLevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeLevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DegreeRequirement__DegreeRequirement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeRequirement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeRequirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DegreeRequirement__Requirement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRequirement__DocumentRequirement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRequirement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRequirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentRequirement__Requirement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ErasmusProgram__ErasmusProgram = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ErasmusProgram__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ErasmusProgram__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LanguageLevel__LanguageLevel = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageLevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageLevel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageLevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageLevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LanguageRequirement__LanguageRequirement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageRequirement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageRequirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LanguageRequirement__Requirement = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PartnerType__PartnerType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PartnerType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PartnerType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PartnerType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PartnerType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Requirement__Requirement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Requirement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Requirement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Results__Results = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Results__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Results__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Scholarship__Scholarship = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Scholarship__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Scholarship__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ScholarshipType__ScholarshipType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ScholarshipType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScholarshipType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScholarshipType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ScholarshipType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _University__University = {};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _University__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AdmissionStructure__AdmissionStructure.initOperations(_AdmissionStructure__AdmissionStructure);
			Fragments._AdmissionStructure__OclAny.initOperations(_AdmissionStructure__OclAny);
			Fragments._AdmissionStructure__OclElement.initOperations(_AdmissionStructure__OclElement);

			Fragments._ApplicationProcess__ApplicationProcess.initOperations(_ApplicationProcess__ApplicationProcess);
			Fragments._ApplicationProcess__OclAny.initOperations(_ApplicationProcess__OclAny);
			Fragments._ApplicationProcess__OclElement.initOperations(_ApplicationProcess__OclElement);

			Fragments._AssociatePartner__AssociatePartner.initOperations(_AssociatePartner__AssociatePartner);
			Fragments._AssociatePartner__OclAny.initOperations(_AssociatePartner__OclAny);
			Fragments._AssociatePartner__OclElement.initOperations(_AssociatePartner__OclElement);

			Fragments._Course__Course.initOperations(_Course__Course);
			Fragments._Course__OclAny.initOperations(_Course__OclAny);
			Fragments._Course__OclElement.initOperations(_Course__OclElement);

			Fragments._DegreeLevel__DegreeLevel.initOperations(_DegreeLevel__DegreeLevel);
			Fragments._DegreeLevel__OclAny.initOperations(_DegreeLevel__OclAny);
			Fragments._DegreeLevel__OclElement.initOperations(_DegreeLevel__OclElement);
			Fragments._DegreeLevel__OclEnumeration.initOperations(_DegreeLevel__OclEnumeration);
			Fragments._DegreeLevel__OclType.initOperations(_DegreeLevel__OclType);

			Fragments._DegreeRequirement__DegreeRequirement.initOperations(_DegreeRequirement__DegreeRequirement);
			Fragments._DegreeRequirement__OclAny.initOperations(_DegreeRequirement__OclAny);
			Fragments._DegreeRequirement__OclElement.initOperations(_DegreeRequirement__OclElement);
			Fragments._DegreeRequirement__Requirement.initOperations(_DegreeRequirement__Requirement);

			Fragments._DocumentRequirement__DocumentRequirement.initOperations(_DocumentRequirement__DocumentRequirement);
			Fragments._DocumentRequirement__OclAny.initOperations(_DocumentRequirement__OclAny);
			Fragments._DocumentRequirement__OclElement.initOperations(_DocumentRequirement__OclElement);
			Fragments._DocumentRequirement__Requirement.initOperations(_DocumentRequirement__Requirement);

			Fragments._ErasmusProgram__ErasmusProgram.initOperations(_ErasmusProgram__ErasmusProgram);
			Fragments._ErasmusProgram__OclAny.initOperations(_ErasmusProgram__OclAny);
			Fragments._ErasmusProgram__OclElement.initOperations(_ErasmusProgram__OclElement);

			Fragments._LanguageLevel__LanguageLevel.initOperations(_LanguageLevel__LanguageLevel);
			Fragments._LanguageLevel__OclAny.initOperations(_LanguageLevel__OclAny);
			Fragments._LanguageLevel__OclElement.initOperations(_LanguageLevel__OclElement);
			Fragments._LanguageLevel__OclEnumeration.initOperations(_LanguageLevel__OclEnumeration);
			Fragments._LanguageLevel__OclType.initOperations(_LanguageLevel__OclType);

			Fragments._LanguageRequirement__LanguageRequirement.initOperations(_LanguageRequirement__LanguageRequirement);
			Fragments._LanguageRequirement__OclAny.initOperations(_LanguageRequirement__OclAny);
			Fragments._LanguageRequirement__OclElement.initOperations(_LanguageRequirement__OclElement);
			Fragments._LanguageRequirement__Requirement.initOperations(_LanguageRequirement__Requirement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._PartnerType__OclAny.initOperations(_PartnerType__OclAny);
			Fragments._PartnerType__OclElement.initOperations(_PartnerType__OclElement);
			Fragments._PartnerType__OclEnumeration.initOperations(_PartnerType__OclEnumeration);
			Fragments._PartnerType__OclType.initOperations(_PartnerType__OclType);
			Fragments._PartnerType__PartnerType.initOperations(_PartnerType__PartnerType);

			Fragments._Requirement__OclAny.initOperations(_Requirement__OclAny);
			Fragments._Requirement__OclElement.initOperations(_Requirement__OclElement);
			Fragments._Requirement__Requirement.initOperations(_Requirement__Requirement);

			Fragments._Results__OclAny.initOperations(_Results__OclAny);
			Fragments._Results__OclElement.initOperations(_Results__OclElement);
			Fragments._Results__Results.initOperations(_Results__Results);

			Fragments._Scholarship__OclAny.initOperations(_Scholarship__OclAny);
			Fragments._Scholarship__OclElement.initOperations(_Scholarship__OclElement);
			Fragments._Scholarship__Scholarship.initOperations(_Scholarship__Scholarship);

			Fragments._ScholarshipType__OclAny.initOperations(_ScholarshipType__OclAny);
			Fragments._ScholarshipType__OclElement.initOperations(_ScholarshipType__OclElement);
			Fragments._ScholarshipType__OclEnumeration.initOperations(_ScholarshipType__OclEnumeration);
			Fragments._ScholarshipType__OclType.initOperations(_ScholarshipType__OclType);
			Fragments._ScholarshipType__ScholarshipType.initOperations(_ScholarshipType__ScholarshipType);

			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._University__OclAny.initOperations(_University__OclAny);
			Fragments._University__OclElement.initOperations(_University__OclElement);
			Fragments._University__University.initOperations(_University__University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AdmissionStructure = {
			A3_Erasmo_Stanco_GroupTables.Properties._AdmissionStructure__applicationProcess,
			A3_Erasmo_Stanco_GroupTables.Properties._AdmissionStructure__erasmusProgram,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._AdmissionStructure__requierements,
			A3_Erasmo_Stanco_GroupTables.Properties._AdmissionStructure__results
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ApplicationProcess = {
			A3_Erasmo_Stanco_GroupTables.Properties._ApplicationProcess__admissionStructure,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._ApplicationProcess__steps
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AssociatePartner = {
			A3_Erasmo_Stanco_GroupTables.Properties._AssociatePartner__erasmusProgram,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._AssociatePartner__partnerName,
			A3_Erasmo_Stanco_GroupTables.Properties._AssociatePartner__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Course = {
			A3_Erasmo_Stanco_GroupTables.Properties._Course__courseCode,
			A3_Erasmo_Stanco_GroupTables.Properties._Course__courseCredits,
			A3_Erasmo_Stanco_GroupTables.Properties._Course__courseName,
			A3_Erasmo_Stanco_GroupTables.Properties._Course__faculty,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._Course__university
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DegreeLevel = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DegreeRequirement = {
			A3_Erasmo_Stanco_GroupTables.Properties._Requirement__admissionStructure,
			A3_Erasmo_Stanco_GroupTables.Properties._DegreeRequirement__degreeName,
			A3_Erasmo_Stanco_GroupTables.Properties._DegreeRequirement__fieldOfStudy,
			A3_Erasmo_Stanco_GroupTables.Properties._DegreeRequirement__level,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentRequirement = {
			A3_Erasmo_Stanco_GroupTables.Properties._Requirement__admissionStructure,
			A3_Erasmo_Stanco_GroupTables.Properties._DocumentRequirement__description,
			A3_Erasmo_Stanco_GroupTables.Properties._DocumentRequirement__documentName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ErasmusProgram = {
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__admissionStructure,
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__associatePartners,
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__scholarships,
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__totalCredits,
			A3_Erasmo_Stanco_GroupTables.Properties._ErasmusProgram__universities
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LanguageLevel = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LanguageRequirement = {
			A3_Erasmo_Stanco_GroupTables.Properties._Requirement__admissionStructure,
			A3_Erasmo_Stanco_GroupTables.Properties._LanguageRequirement__languageName,
			A3_Erasmo_Stanco_GroupTables.Properties._LanguageRequirement__level,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			A3_Erasmo_Stanco_GroupTables.Properties._Location__cityName,
			A3_Erasmo_Stanco_GroupTables.Properties._Location__countryName,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._Location__university
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PartnerType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Requirement = {
			A3_Erasmo_Stanco_GroupTables.Properties._Requirement__admissionStructure,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Results = {
			A3_Erasmo_Stanco_GroupTables.Properties._Results__admissionStructure,
			A3_Erasmo_Stanco_GroupTables.Properties._Results__admittedStudents,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._Results__scholarshipsAwarded,
			A3_Erasmo_Stanco_GroupTables.Properties._Results__totalAdmitted,
			A3_Erasmo_Stanco_GroupTables.Properties._Results__year
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Scholarship = {
			A3_Erasmo_Stanco_GroupTables.Properties._Scholarship__allowance,
			A3_Erasmo_Stanco_GroupTables.Properties._Scholarship__erasmusProgram,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._Scholarship__travelGrant,
			A3_Erasmo_Stanco_GroupTables.Properties._Scholarship__tuitionFee,
			A3_Erasmo_Stanco_GroupTables.Properties._Scholarship__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ScholarshipType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			A3_Erasmo_Stanco_GroupTables.Properties._Step__applicationProcess,
			A3_Erasmo_Stanco_GroupTables.Properties._Step__endDate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._Step__startDate,
			A3_Erasmo_Stanco_GroupTables.Properties._Step__stepDescription,
			A3_Erasmo_Stanco_GroupTables.Properties._Step__stepName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _University = {
			A3_Erasmo_Stanco_GroupTables.Properties._University__courses,
			A3_Erasmo_Stanco_GroupTables.Properties._University__credits,
			A3_Erasmo_Stanco_GroupTables.Properties._University__erasmusProgram,
			A3_Erasmo_Stanco_GroupTables.Properties._University__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			A3_Erasmo_Stanco_GroupTables.Properties._University__universityName
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AdmissionStructure__AdmissionStructure.initProperties(_AdmissionStructure);
			Fragments._ApplicationProcess__ApplicationProcess.initProperties(_ApplicationProcess);
			Fragments._AssociatePartner__AssociatePartner.initProperties(_AssociatePartner);
			Fragments._Course__Course.initProperties(_Course);
			Fragments._DegreeLevel__DegreeLevel.initProperties(_DegreeLevel);
			Fragments._DegreeRequirement__DegreeRequirement.initProperties(_DegreeRequirement);
			Fragments._DocumentRequirement__DocumentRequirement.initProperties(_DocumentRequirement);
			Fragments._ErasmusProgram__ErasmusProgram.initProperties(_ErasmusProgram);
			Fragments._LanguageLevel__LanguageLevel.initProperties(_LanguageLevel);
			Fragments._LanguageRequirement__LanguageRequirement.initProperties(_LanguageRequirement);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._PartnerType__PartnerType.initProperties(_PartnerType);
			Fragments._Requirement__Requirement.initProperties(_Requirement);
			Fragments._Results__Results.initProperties(_Results);
			Fragments._Scholarship__Scholarship.initProperties(_Scholarship);
			Fragments._ScholarshipType__ScholarshipType.initProperties(_ScholarshipType);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._University__University.initProperties(_University);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DegreeLevel__Bachelor = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_LEVEL.getEEnumLiteral("Bachelor"), Types._DegreeLevel, 0);
		public static final EcoreExecutorEnumerationLiteral _DegreeLevel__Master = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.DEGREE_LEVEL.getEEnumLiteral("Master"), Types._DegreeLevel, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DegreeLevel = {
			_DegreeLevel__Bachelor,
			_DegreeLevel__Master
		};

		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__A1 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("A1"), Types._LanguageLevel, 0);
		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__A2 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("A2"), Types._LanguageLevel, 1);
		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__B1 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("B1"), Types._LanguageLevel, 2);
		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__B2 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("B2"), Types._LanguageLevel, 3);
		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__C1 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("C1"), Types._LanguageLevel, 4);
		public static final EcoreExecutorEnumerationLiteral _LanguageLevel__C2 = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.LANGUAGE_LEVEL.getEEnumLiteral("C2"), Types._LanguageLevel, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LanguageLevel = {
			_LanguageLevel__A1,
			_LanguageLevel__A2,
			_LanguageLevel__B1,
			_LanguageLevel__B2,
			_LanguageLevel__C1,
			_LanguageLevel__C2
		};

		public static final EcoreExecutorEnumerationLiteral _PartnerType__Industrial = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.PARTNER_TYPE.getEEnumLiteral("Industrial"), Types._PartnerType, 0);
		public static final EcoreExecutorEnumerationLiteral _PartnerType__Academic = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.PARTNER_TYPE.getEEnumLiteral("Academic"), Types._PartnerType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PartnerType = {
			_PartnerType__Industrial,
			_PartnerType__Academic
		};

		public static final EcoreExecutorEnumerationLiteral _ScholarshipType__Program_Country = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP_TYPE.getEEnumLiteral("Program_Country"), Types._ScholarshipType, 0);
		public static final EcoreExecutorEnumerationLiteral _ScholarshipType__Partner_Country = new EcoreExecutorEnumerationLiteral(A3_Erasmo_Stanco_GroupPackage.Literals.SCHOLARSHIP_TYPE.getEEnumLiteral("Partner_Country"), Types._ScholarshipType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ScholarshipType = {
			_ScholarshipType__Program_Country,
			_ScholarshipType__Partner_Country
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DegreeLevel.initLiterals(_DegreeLevel);
			Types._LanguageLevel.initLiterals(_LanguageLevel);
			Types._PartnerType.initLiterals(_PartnerType);
			Types._ScholarshipType.initLiterals(_ScholarshipType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of A3_Erasmo_Stanco_GroupTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new A3_Erasmo_Stanco_GroupTables();
	}

	private A3_Erasmo_Stanco_GroupTables() {
		super(A3_Erasmo_Stanco_GroupPackage.eNS_URI);
	}
}
