/**
 */
package a3_Erasmo_Stanco_Group.provider;


import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupFactory;
import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AdmissionStructure;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link a3_Erasmo_Stanco_Group.AdmissionStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdmissionStructureItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionStructureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addErasmusProgramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Erasmus Program feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErasmusProgramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdmissionStructure_erasmusProgram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdmissionStructure_erasmusProgram_feature", "_UI_AdmissionStructure_type"),
				 A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__ERASMUS_PROGRAM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__APPLICATION_PROCESS);
			childrenFeatures.add(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS);
			childrenFeatures.add(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__RESULTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AdmissionStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdmissionStructure"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AdmissionStructure_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AdmissionStructure.class)) {
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__APPLICATION_PROCESS:
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__REQUIEREMENTS:
			case A3_Erasmo_Stanco_GroupPackage.ADMISSION_STRUCTURE__RESULTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__APPLICATION_PROCESS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createApplicationProcess()));

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createDocumentRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createDegreeRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__REQUIEREMENTS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createLanguageRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(A3_Erasmo_Stanco_GroupPackage.Literals.ADMISSION_STRUCTURE__RESULTS,
				 A3_Erasmo_Stanco_GroupFactory.eINSTANCE.createResults()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return A3_Erasmo_Stanco_GroupEditPlugin.INSTANCE;
	}

}
