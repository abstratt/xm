/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.CollectionExpressionAction#getSource <em>Source</em>}</li>
 *   <li>{@link xmbehavior.CollectionExpressionAction#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link xmbehavior.CollectionExpressionAction#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getCollectionExpressionAction()
 * @model
 * @generated
 */
public interface CollectionExpressionAction extends ValueAction {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OriginalCollectionProducingAction)
	 * @see xmbehavior.XmbehaviorPackage#getCollectionExpressionAction_Source()
	 * @model containment="true"
	 * @generated
	 */
	OriginalCollectionProducingAction getSource();

	/**
	 * Sets the value of the '{@link xmbehavior.CollectionExpressionAction#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OriginalCollectionProducingAction value);

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.CollectionTransformingAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformers</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getCollectionExpressionAction_Transformers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectionTransformingAction> getTransformers();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(FinalCollectionConsumingAction)
	 * @see xmbehavior.XmbehaviorPackage#getCollectionExpressionAction_Destination()
	 * @model containment="true"
	 * @generated
	 */
	FinalCollectionConsumingAction getDestination();

	/**
	 * Sets the value of the '{@link xmbehavior.CollectionExpressionAction#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(FinalCollectionConsumingAction value);

} // CollectionExpressionAction
