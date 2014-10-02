/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

import xmbase.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.OperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link xmbehavior.OperationAction#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getOperationAction()
 * @model abstract="true"
 * @generated
 */
public interface OperationAction extends ObjectAction {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see xmbehavior.XmbehaviorPackage#getOperationAction_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link xmbehavior.OperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.ValueAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getOperationAction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueAction> getArguments();

} // OperationAction
