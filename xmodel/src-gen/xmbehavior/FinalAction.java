/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.FinalAction#getResultValue <em>Result Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getFinalAction()
 * @model
 * @generated
 */
public interface FinalAction extends StatementAction {
	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' containment reference.
	 * @see #setResultValue(ValueAction)
	 * @see xmbehavior.XmbehaviorPackage#getFinalAction_ResultValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueAction getResultValue();

	/**
	 * Sets the value of the '{@link xmbehavior.FinalAction#getResultValue <em>Result Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' containment reference.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(ValueAction value);

} // FinalAction
