/**
 */
package xmstate;

import org.eclipse.emf.common.util.EList;

import xmbase.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmstate.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link xmstate.State#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmstate.XmstatePackage#getState()
 * @model
 * @generated
 */
public interface State extends Namespace {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link xmstate.Transition}.
	 * It is bidirectional and its opposite is '{@link xmstate.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see xmstate.XmstatePackage#getState_Outgoing()
	 * @see xmstate.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link xmstate.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see xmstate.XmstatePackage#getState_Incoming()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncoming();

} // State
