/**
 */
package a3_Erasmo_Stanco_Group.impl;

import a3_Erasmo_Stanco_Group.A3_Erasmo_Stanco_GroupPackage;
import a3_Erasmo_Stanco_Group.AssociatePartner;
import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.PartnerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Associate Partner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl#getPartnerName <em>Partner Name</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl#getType <em>Type</em>}</li>
 *   <li>{@link a3_Erasmo_Stanco_Group.impl.AssociatePartnerImpl#getErasmusProgram <em>Erasmus Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociatePartnerImpl extends MinimalEObjectImpl.Container implements AssociatePartner {
	/**
	 * The default value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartnerName() <em>Partner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerName()
	 * @generated
	 * @ordered
	 */
	protected String partnerName = PARTNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PartnerType TYPE_EDEFAULT = PartnerType.INDUSTRIAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PartnerType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociatePartnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A3_Erasmo_Stanco_GroupPackage.Literals.ASSOCIATE_PARTNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerName(String newPartnerName) {
		String oldPartnerName = partnerName;
		partnerName = newPartnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__PARTNER_NAME, oldPartnerName, partnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartnerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PartnerType newType) {
		PartnerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErasmusProgram getErasmusProgram() {
		if (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM) return null;
		return (ErasmusProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErasmusProgram(ErasmusProgram newErasmusProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newErasmusProgram, A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasmusProgram(ErasmusProgram newErasmusProgram) {
		if (newErasmusProgram != eInternalContainer() || (eContainerFeatureID() != A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM && newErasmusProgram != null)) {
			if (EcoreUtil.isAncestor(this, newErasmusProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newErasmusProgram != null)
				msgs = ((InternalEObject)newErasmusProgram).eInverseAdd(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS, ErasmusProgram.class, msgs);
			msgs = basicSetErasmusProgram(newErasmusProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM, newErasmusProgram, newErasmusProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetErasmusProgram((ErasmusProgram)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				return basicSetErasmusProgram(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				return eInternalContainer().eInverseRemove(this, A3_Erasmo_Stanco_GroupPackage.ERASMUS_PROGRAM__ASSOCIATE_PARTNERS, ErasmusProgram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__PARTNER_NAME:
				return getPartnerName();
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__TYPE:
				return getType();
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				return getErasmusProgram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__PARTNER_NAME:
				setPartnerName((String)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__TYPE:
				setType((PartnerType)newValue);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__PARTNER_NAME:
				setPartnerName(PARTNER_NAME_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				setErasmusProgram((ErasmusProgram)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__PARTNER_NAME:
				return PARTNER_NAME_EDEFAULT == null ? partnerName != null : !PARTNER_NAME_EDEFAULT.equals(partnerName);
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__TYPE:
				return type != TYPE_EDEFAULT;
			case A3_Erasmo_Stanco_GroupPackage.ASSOCIATE_PARTNER__ERASMUS_PROGRAM:
				return getErasmusProgram() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (partnerName: ");
		result.append(partnerName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AssociatePartnerImpl
