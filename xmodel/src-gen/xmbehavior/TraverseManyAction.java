/**
 */
package xmbehavior;

import xmbase.AssociationRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traverse Many Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.TraverseManyAction#getTarget <em>Target</em>}</li>
 *   <li>{@link xmbehavior.TraverseManyAction#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getTraverseManyAction()
 * @model
 * @generated
 */
public interface TraverseManyAction extends OriginalCollectionProducingAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ValueAction)
	 * @see xmbehavior.XmbehaviorPackage#getTraverseManyAction_Target()
	 * @model containment="true"
	 * @generated
	 */
	ValueAction getTarget();

	/**
	 * Sets the value of the '{@link xmbehavior.TraverseManyAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ValueAction value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(AssociationRole)
	 * @see xmbehavior.XmbehaviorPackage#getTraverseManyAction_End()
	 * @model
	 * @generated
	 */
	AssociationRole getEnd();

	/**
	 * Sets the value of the '{@link xmbehavior.TraverseManyAction#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(AssociationRole value);

} // TraverseManyAction
