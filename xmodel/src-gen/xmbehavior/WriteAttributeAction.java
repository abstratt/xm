/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Attribute Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.WriteAttributeAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getWriteAttributeAction()
 * @model
 * @generated
 */
public interface WriteAttributeAction extends AttributeAction, ObjectStatementAction {
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
	 * @see xmbehavior.XmbehaviorPackage#getWriteAttributeAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueAction getValue();

	/**
	 * Sets the value of the '{@link xmbehavior.WriteAttributeAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueAction value);

} // WriteAttributeAction
