/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.Block#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends StatementAction {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getBlock_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Block
