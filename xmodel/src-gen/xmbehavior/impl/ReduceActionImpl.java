/**
 */
package xmbehavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmbehavior.LiteralClosure;
import xmbehavior.ReduceAction;
import xmbehavior.ValueAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.ReduceActionImpl#getReducer <em>Reducer</em>}</li>
 *   <li>{@link xmbehavior.impl.ReduceActionImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReduceActionImpl extends FinalCollectionConsumingActionImpl implements ReduceAction {
	/**
	 * The cached value of the '{@link #getReducer() <em>Reducer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducer()
	 * @generated
	 * @ordered
	 */
	protected LiteralClosure reducer;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected ValueAction initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.REDUCE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralClosure getReducer() {
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReducer(LiteralClosure newReducer, NotificationChain msgs) {
		LiteralClosure oldReducer = reducer;
		reducer = newReducer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.REDUCE_ACTION__REDUCER, oldReducer, newReducer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReducer(LiteralClosure newReducer) {
		if (newReducer != reducer) {
			NotificationChain msgs = null;
			if (reducer != null)
				msgs = ((InternalEObject)reducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.REDUCE_ACTION__REDUCER, null, msgs);
			if (newReducer != null)
				msgs = ((InternalEObject)newReducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.REDUCE_ACTION__REDUCER, null, msgs);
			msgs = basicSetReducer(newReducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.REDUCE_ACTION__REDUCER, newReducer, newReducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAction getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(ValueAction newInitial, NotificationChain msgs) {
		ValueAction oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.REDUCE_ACTION__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(ValueAction newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.REDUCE_ACTION__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.REDUCE_ACTION__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.REDUCE_ACTION__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.REDUCE_ACTION__REDUCER:
				return basicSetReducer(null, msgs);
			case XmbehaviorPackage.REDUCE_ACTION__INITIAL:
				return basicSetInitial(null, msgs);
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
			case XmbehaviorPackage.REDUCE_ACTION__REDUCER:
				return getReducer();
			case XmbehaviorPackage.REDUCE_ACTION__INITIAL:
				return getInitial();
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
			case XmbehaviorPackage.REDUCE_ACTION__REDUCER:
				setReducer((LiteralClosure)newValue);
				return;
			case XmbehaviorPackage.REDUCE_ACTION__INITIAL:
				setInitial((ValueAction)newValue);
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
			case XmbehaviorPackage.REDUCE_ACTION__REDUCER:
				setReducer((LiteralClosure)null);
				return;
			case XmbehaviorPackage.REDUCE_ACTION__INITIAL:
				setInitial((ValueAction)null);
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
			case XmbehaviorPackage.REDUCE_ACTION__REDUCER:
				return reducer != null;
			case XmbehaviorPackage.REDUCE_ACTION__INITIAL:
				return initial != null;
		}
		return super.eIsSet(featureID);
	}

} //ReduceActionImpl
