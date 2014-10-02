/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Collection Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.LiteralCollectionAction#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getLiteralCollectionAction()
 * @model
 * @generated
 */
public interface LiteralCollectionAction extends LiteralAction, CollectionProducingAction {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.ValueAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getLiteralCollectionAction_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueAction> getValues();

} // LiteralCollectionAction
