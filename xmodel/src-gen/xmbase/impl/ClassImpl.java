/**
 */
package xmbase.impl;

import java.lang.Iterable;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import xmbase.Attribute;
import xmbase.ClassFeature;
import xmbase.Operation;
import xmbase.XmbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbase.impl.ClassImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link xmbase.impl.ClassImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link xmbase.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements xmbase.Class {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbasePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<ClassFeature>(ClassFeature.class, this, XmbasePackage.CLASS__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		EList<ClassFeature> _features = this.getFeatures();
		final Function1<ClassFeature, Boolean> _function = new Function1<ClassFeature, Boolean>() {
			public Boolean apply(final ClassFeature it) {
				return Boolean.valueOf((it instanceof Operation));
			}
		};
		Iterable<ClassFeature> _filter = IterableExtensions.<ClassFeature>filter(_features, _function);
		List<ClassFeature> _list = IterableExtensions.<ClassFeature>toList(_filter);
		return new UnmodifiableEList(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		EList<ClassFeature> _features = this.getFeatures();
		final Function1<ClassFeature, Boolean> _function = new Function1<ClassFeature, Boolean>() {
			public Boolean apply(final ClassFeature it) {
				return Boolean.valueOf((it instanceof Attribute));
			}
		};
		Iterable<ClassFeature> _filter = IterableExtensions.<ClassFeature>filter(_features, _function);
		List<ClassFeature> _list = IterableExtensions.<ClassFeature>toList(_filter);
		return new UnmodifiableEList(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbasePackage.CLASS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmbasePackage.CLASS__FEATURES:
				return getFeatures();
			case XmbasePackage.CLASS__OPERATIONS:
				return getOperations();
			case XmbasePackage.CLASS__ATTRIBUTES:
				return getAttributes();
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
			case XmbasePackage.CLASS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ClassFeature>)newValue);
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
			case XmbasePackage.CLASS__FEATURES:
				getFeatures().clear();
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
			case XmbasePackage.CLASS__FEATURES:
				return features != null && !features.isEmpty();
			case XmbasePackage.CLASS__OPERATIONS:
				return !getOperations().isEmpty();
			case XmbasePackage.CLASS__ATTRIBUTES:
				return !getAttributes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
