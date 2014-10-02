/**
 */
package xmbehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.ApplyAction#getApplier <em>Applier</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getApplyAction()
 * @model
 * @generated
 */
public interface ApplyAction extends FinalCollectionConsumingAction, StatementAction {
	/**
	 * Returns the value of the '<em><b>Applier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applier</em>' containment reference.
	 * @see #setApplier(LiteralClosure)
	 * @see xmbehavior.XmbehaviorPackage#getApplyAction_Applier()
	 * @model containment="true"
	 * @generated
	 */
	LiteralClosure getApplier();

	/**
	 * Sets the value of the '{@link xmbehavior.ApplyAction#getApplier <em>Applier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applier</em>' containment reference.
	 * @see #getApplier()
	 * @generated
	 */
	void setApplier(LiteralClosure value);

} // ApplyAction
