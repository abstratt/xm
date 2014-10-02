/**
 */
package xmbehavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmbehavior.ApplyAction;
import xmbehavior.LiteralClosure;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.ApplyActionImpl#getApplier <em>Applier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyActionImpl extends FinalCollectionConsumingActionImpl implements ApplyAction {
	/**
	 * The cached value of the '{@link #getApplier() <em>Applier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplier()
	 * @generated
	 * @ordered
	 */
	protected LiteralClosure applier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.APPLY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralClosure getApplier() {
		return applier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplier(LiteralClosure newApplier, NotificationChain msgs) {
		LiteralClosure oldApplier = applier;
		applier = newApplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.APPLY_ACTION__APPLIER, oldApplier, newApplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplier(LiteralClosure newApplier) {
		if (newApplier != applier) {
			NotificationChain msgs = null;
			if (applier != null)
				msgs = ((InternalEObject)applier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.APPLY_ACTION__APPLIER, null, msgs);
			if (newApplier != null)
				msgs = ((InternalEObject)newApplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.APPLY_ACTION__APPLIER, null, msgs);
			msgs = basicSetApplier(newApplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.APPLY_ACTION__APPLIER, newApplier, newApplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.APPLY_ACTION__APPLIER:
				return basicSetApplier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmbehaviorPackage.APPLY_ACTION__APPLIER:
				return getApplier();
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
			case XmbehaviorPackage.APPLY_ACTION__APPLIER:
				setApplier((LiteralClosure)newValue);
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
			case XmbehaviorPackage.APPLY_ACTION__APPLIER:
				setApplier((LiteralClosure)null);
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
			case XmbehaviorPackage.APPLY_ACTION__APPLIER:
				return applier != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplyActionImpl
