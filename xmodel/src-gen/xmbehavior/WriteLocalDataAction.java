/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Local Data Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.WriteLocalDataAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getWriteLocalDataAction()
 * @model
 * @generated
 */
public interface WriteLocalDataAction extends LocalDataAction, StatementAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueAction)
	 * @see xmbehavior.XmbehaviorPackage#getWriteLocalDataAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueAction getValue();

	/**
	 * Sets the value of the '{@link xmbehavior.WriteLocalDataAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueAction value);

} // WriteLocalDataAction
