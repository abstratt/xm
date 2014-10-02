/**
 */
package xmbehavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmbehavior.LiteralClosure;
import xmbehavior.MapAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.MapActionImpl#getMapper <em>Mapper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapActionImpl extends CollectionTransformingActionImpl implements MapAction {
	/**
	 * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapper()
	 * @generated
	 * @ordered
	 */
	protected LiteralClosure mapper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.MAP_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralClosure getMapper() {
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapper(LiteralClosure newMapper, NotificationChain msgs) {
		LiteralClosure oldMapper = mapper;
		mapper = newMapper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.MAP_ACTION__MAPPER, oldMapper, newMapper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapper(LiteralClosure newMapper) {
		if (newMapper != mapper) {
			NotificationChain msgs = null;
			if (mapper != null)
				msgs = ((InternalEObject)mapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.MAP_ACTION__MAPPER, null, msgs);
			if (newMapper != null)
				msgs = ((InternalEObject)newMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.MAP_ACTION__MAPPER, null, msgs);
			msgs = basicSetMapper(newMapper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.MAP_ACTION__MAPPER, newMapper, newMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.MAP_ACTION__MAPPER:
				return basicSetMapper(null, msgs);
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
			case XmbehaviorPackage.MAP_ACTION__MAPPER:
				return getMapper();
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
			case XmbehaviorPackage.MAP_ACTION__MAPPER:
				setMapper((LiteralClosure)newValue);
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
			case XmbehaviorPackage.MAP_ACTION__MAPPER:
				setMapper((LiteralClosure)null);
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
			case XmbehaviorPackage.MAP_ACTION__MAPPER:
				return mapper != null;
		}
		return super.eIsSet(featureID);
	}

} //MapActionImpl
