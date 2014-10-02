/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.ReduceAction#getReducer <em>Reducer</em>}</li>
 *   <li>{@link xmbehavior.ReduceAction#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getReduceAction()
 * @model
 * @generated
 */
public interface ReduceAction extends FinalCollectionConsumingAction, SimpleValueAction {
	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reducer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reducer</em>' containment reference.
	 * @see #setReducer(LiteralClosure)
	 * @see xmbehavior.XmbehaviorPackage#getReduceAction_Reducer()
	 * @model containment="true"
	 * @generated
	 */
	LiteralClosure getReducer();

	/**
	 * Sets the value of the '{@link xmbehavior.ReduceAction#getReducer <em>Reducer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' containment reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(LiteralClosure value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(ValueAction)
	 * @see xmbehavior.XmbehaviorPackage#getReduceAction_Initial()
	 * @model containment="true"
	 * @generated
	 */
	ValueAction getInitial();

	/**
	 * Sets the value of the '{@link xmbehavior.ReduceAction#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(ValueAction value);

} // ReduceAction
