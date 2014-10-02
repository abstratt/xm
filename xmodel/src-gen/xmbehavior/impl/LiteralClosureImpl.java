/**
 */
package xmbehavior.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import xmbase.Behavior;
import xmbase.NamedElement;
import xmbase.Namespace;
import xmbase.Parameter;
import xmbase.ParameteredElement;
import xmbase.XmbasePackage;

import xmbehavior.Action;
import xmbehavior.LiteralAction;
import xmbehavior.LiteralClosure;
import xmbehavior.SimpleValueAction;
import xmbehavior.ValueAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Closure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.LiteralClosureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xmbehavior.impl.LiteralClosureImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link xmbehavior.impl.LiteralClosureImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralClosureImpl extends ActivityImpl implements LiteralClosure {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralClosureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.LITERAL_CLOSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS, XmbasePackage.PARAMETER__PARAMETERED);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getParent() {
		if (eContainerFeatureID() != XmbehaviorPackage.LITERAL_CLOSURE__PARENT) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetParent() {
		if (eContainerFeatureID() != XmbehaviorPackage.LITERAL_CLOSURE__PARENT) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Namespace newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XmbehaviorPackage.LITERAL_CLOSURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Namespace newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XmbehaviorPackage.LITERAL_CLOSURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XmbasePackage.NAMESPACE__CHILDREN, Namespace.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.LITERAL_CLOSURE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.LITERAL_CLOSURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior parameteredBehavior() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Namespace)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				return eInternalContainer().eInverseRemove(this, XmbasePackage.NAMESPACE__CHILDREN, Namespace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				return getParameters();
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case XmbehaviorPackage.LITERAL_CLOSURE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				setParent((Namespace)newValue);
				return;
			case XmbehaviorPackage.LITERAL_CLOSURE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				getParameters().clear();
				return;
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				setParent((Namespace)null);
				return;
			case XmbehaviorPackage.LITERAL_CLOSURE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XmbehaviorPackage.LITERAL_CLOSURE__PARENT:
				return basicGetParent() != null;
			case XmbehaviorPackage.LITERAL_CLOSURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameteredElement.class) {
			switch (derivedFeatureID) {
				case XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS: return XmbasePackage.PARAMETERED_ELEMENT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case XmbehaviorPackage.LITERAL_CLOSURE__PARENT: return XmbasePackage.NAMED_ELEMENT__PARENT;
				case XmbehaviorPackage.LITERAL_CLOSURE__NAME: return XmbasePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ValueAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleValueAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LiteralAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameteredElement.class) {
			switch (baseFeatureID) {
				case XmbasePackage.PARAMETERED_ELEMENT__PARAMETERS: return XmbehaviorPackage.LITERAL_CLOSURE__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case XmbasePackage.NAMED_ELEMENT__PARENT: return XmbehaviorPackage.LITERAL_CLOSURE__PARENT;
				case XmbasePackage.NAMED_ELEMENT__NAME: return XmbehaviorPackage.LITERAL_CLOSURE__NAME;
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ValueAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleValueAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LiteralAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameteredElement.class) {
			switch (baseOperationID) {
				case XmbasePackage.PARAMETERED_ELEMENT___PARAMETERED_BEHAVIOR: return XmbehaviorPackage.LITERAL_CLOSURE___PARAMETERED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Action.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ValueAction.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == SimpleValueAction.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == LiteralAction.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XmbehaviorPackage.LITERAL_CLOSURE___PARAMETERED_BEHAVIOR:
				return parameteredBehavior();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LiteralClosureImpl
