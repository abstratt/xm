/**
 */
package xmbehavior;

import xmbase.LocalData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Data Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.LocalDataAction#getLocalData <em>Local Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getLocalDataAction()
 * @model abstract="true"
 * @generated
 */
public interface LocalDataAction extends ObjectAction {
	/**
	 * Returns the value of the '<em><b>Local Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Data</em>' reference.
	 * @see #setLocalData(LocalData)
	 * @see xmbehavior.XmbehaviorPackage#getLocalDataAction_LocalData()
	 * @model
	 * @generated
	 */
	LocalData getLocalData();

	/**
	 * Sets the value of the '{@link xmbehavior.LocalDataAction#getLocalData <em>Local Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Data</em>' reference.
	 * @see #getLocalData()
	 * @generated
	 */
	void setLocalData(LocalData value);

} // LocalDataAction
