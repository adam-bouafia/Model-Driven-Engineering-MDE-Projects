/**
 */
package a3_Erasmo_Stanco_Group.util;

import a3_Erasmo_Stanco_Group.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage
 * @generated
 */
public class A3_Erasmo_Stanco_GroupAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static A3_Erasmo_Stanco_GroupPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A3_Erasmo_Stanco_GroupAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = A3_Erasmo_Stanco_GroupPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A3_Erasmo_Stanco_GroupSwitch<Adapter> modelSwitch =
		new A3_Erasmo_Stanco_GroupSwitch<Adapter>() {
			@Override
			public Adapter caseErasmusProgram(ErasmusProgram object) {
				return createErasmusProgramAdapter();
			}
			@Override
			public Adapter caseScholarship(Scholarship object) {
				return createScholarshipAdapter();
			}
			@Override
			public Adapter caseUniversity(University object) {
				return createUniversityAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseAssociatePartner(AssociatePartner object) {
				return createAssociatePartnerAdapter();
			}
			@Override
			public Adapter caseAdmissionStructure(AdmissionStructure object) {
				return createAdmissionStructureAdapter();
			}
			@Override
			public Adapter caseResults(Results object) {
				return createResultsAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseDocumentRequirement(DocumentRequirement object) {
				return createDocumentRequirementAdapter();
			}
			@Override
			public Adapter caseDegreeRequirement(DegreeRequirement object) {
				return createDegreeRequirementAdapter();
			}
			@Override
			public Adapter caseLanguageRequirement(LanguageRequirement object) {
				return createLanguageRequirementAdapter();
			}
			@Override
			public Adapter caseApplicationProcess(ApplicationProcess object) {
				return createApplicationProcessAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.ErasmusProgram <em>Erasmus Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.ErasmusProgram
	 * @generated
	 */
	public Adapter createErasmusProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Scholarship <em>Scholarship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Scholarship
	 * @generated
	 */
	public Adapter createScholarshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.AssociatePartner <em>Associate Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.AssociatePartner
	 * @generated
	 */
	public Adapter createAssociatePartnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.AdmissionStructure <em>Admission Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.AdmissionStructure
	 * @generated
	 */
	public Adapter createAdmissionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Results
	 * @generated
	 */
	public Adapter createResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.DocumentRequirement <em>Document Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.DocumentRequirement
	 * @generated
	 */
	public Adapter createDocumentRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.DegreeRequirement <em>Degree Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.DegreeRequirement
	 * @generated
	 */
	public Adapter createDegreeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.LanguageRequirement <em>Language Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.LanguageRequirement
	 * @generated
	 */
	public Adapter createLanguageRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.ApplicationProcess <em>Application Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess
	 * @generated
	 */
	public Adapter createApplicationProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link a3_Erasmo_Stanco_Group.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see a3_Erasmo_Stanco_Group.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //A3_Erasmo_Stanco_GroupAdapterFactory
