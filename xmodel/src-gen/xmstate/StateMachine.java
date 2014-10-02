/**
 */
package xmstate;

import org.eclipse.emf.common.util.EList;

import xmbase.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmstate.StateMachine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmstate.XmstatePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Namespace {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link xmstate.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see xmstate.XmstatePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // StateMachine
