/**
 */
package xmbehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmbase.LocalData;

import xmbehavior.LocalDataAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Data Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.LocalDataActionImpl#getLocalData <em>Local Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocalDataActionImpl extends ObjectActionImpl implements LocalDataAction {
	/**
	 * The cached value of the '{@link #getLocalData() <em>Local Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalData()
	 * @generated
	 * @ordered
	 */
	protected LocalData localData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDataActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.LOCAL_DATA_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalData getLocalData() {
		if (localData != null && localData.eIsProxy()) {
			InternalEObject oldLocalData = (InternalEObject)localData;
			localData = (LocalData)eResolveProxy(oldLocalData);
			if (localData != oldLocalData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA, oldLocalData, localData));
			}
		}
		return localData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalData basicGetLocalData() {
		return localData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalData(LocalData newLocalData) {
		LocalData oldLocalData = localData;
		localData = newLocalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA, oldLocalData, localData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA:
				if (resolve) return getLocalData();
				return basicGetLocalData();
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
			case XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA:
				setLocalData((LocalData)newValue);
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
			case XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA:
				setLocalData((LocalData)null);
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
			case XmbehaviorPackage.LOCAL_DATA_ACTION__LOCAL_DATA:
				return localData != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalDataActionImpl
