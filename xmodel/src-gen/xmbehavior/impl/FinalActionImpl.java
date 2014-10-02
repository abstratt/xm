/**
 */
package xmbehavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmbehavior.FinalAction;
import xmbehavior.ValueAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.FinalActionImpl#getResultValue <em>Result Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinalActionImpl extends StatementActionImpl implements FinalAction {
	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueAction resultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.FINAL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAction getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultValue(ValueAction newResultValue, NotificationChain msgs) {
		ValueAction oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE, oldResultValue, newResultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(ValueAction newResultValue) {
		if (newResultValue != resultValue) {
			NotificationChain msgs = null;
			if (resultValue != null)
				msgs = ((InternalEObject)resultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE, null, msgs);
			if (newResultValue != null)
				msgs = ((InternalEObject)newResultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE, null, msgs);
			msgs = basicSetResultValue(newResultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE, newResultValue, newResultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE:
				return basicSetResultValue(null, msgs);
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
			case XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE:
				return getResultValue();
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
			case XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE:
				setResultValue((ValueAction)newValue);
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
			case XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE:
				setResultValue((ValueAction)null);
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
			case XmbehaviorPackage.FINAL_ACTION__RESULT_VALUE:
				return resultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalActionImpl
