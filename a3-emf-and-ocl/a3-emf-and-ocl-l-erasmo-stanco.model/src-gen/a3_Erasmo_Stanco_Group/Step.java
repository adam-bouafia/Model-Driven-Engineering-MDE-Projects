/**
 */
package a3_Erasmo_Stanco_Group;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.Step#getStepName <em>Step Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Step#getStepDescription <em>Step Description</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Step#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Step#getEndDate <em>End Date</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.Step#getApplicationProcess <em>Application Process</em>}</li>
 * </ul>
 *
 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Name</em>' attribute.
	 * @see #setStepName(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep_StepName()
	 * @model
	 * @generated
	 */
	String getStepName();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Step#getStepName <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Name</em>' attribute.
	 * @see #getStepName()
	 * @generated
	 */
	void setStepName(String value);

	/**
	 * Returns the value of the '<em><b>Step Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Description</em>' attribute.
	 * @see #setStepDescription(String)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep_StepDescription()
	 * @model
	 * @generated
	 */
	String getStepDescription();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Step#getStepDescription <em>Step Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Description</em>' attribute.
	 * @see #getStepDescription()
	 * @generated
	 */
	void setStepDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Step#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Step#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Application Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link a3_Erasmo_Stanco_Group.ApplicationProcess#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Process</em>' container reference.
	 * @see #setApplicationProcess(ApplicationProcess)
	 * @see a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage#getStep_ApplicationProcess()
	 * @see a3_Erasmo_Stanco_Group.ApplicationProcess#getSteps
	 * @model opposite="steps" required="true" transient="false"
	 * @generated
	 */
	ApplicationProcess getApplicationProcess();

	/**
	 * Sets the value of the '{@link a3_Erasmo_Stanco_Group.Step#getApplicationProcess <em>Application Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Process</em>' container reference.
	 * @see #getApplicationProcess()
	 * @generated
	 */
	void setApplicationProcess(ApplicationProcess value);

} // Step
