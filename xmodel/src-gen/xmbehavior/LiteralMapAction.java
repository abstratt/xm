/**
 */
package xmbehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Map Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmbehavior.LiteralMapAction#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmbehavior.XmbehaviorPackage#getLiteralMapAction()
 * @model
 * @generated
 */
public interface LiteralMapAction extends LiteralAction {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link xmbehavior.LiteralMapEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see xmbehavior.XmbehaviorPackage#getLiteralMapAction_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralMapEntry> getEntries();

} // LiteralMapAction
