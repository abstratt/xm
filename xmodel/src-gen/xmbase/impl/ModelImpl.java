/**
 */
package xmbase.impl;

import java.lang.Iterable;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import xmbase.Model;
import xmbase.NamedElement;
import xmbase.TopLevel;
import xmbase.XmbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbase.impl.ModelImpl#getTopLevelElements <em>Top Level Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends NamespaceImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbasePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopLevel> getTopLevelElements() {
		EList<NamedElement> _children = this.getChildren();
		final Function1<NamedElement, Boolean> _function = new Function1<NamedElement, Boolean>() {
			public Boolean apply(final NamedElement it) {
				return Boolean.valueOf((it instanceof TopLevel));
			}
		};
		Iterable<NamedElement> _filter = IterableExtensions.<NamedElement>filter(_children, _function);
		List<NamedElement> _list = IterableExtensions.<NamedElement>toList(_filter);
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
			case XmbasePackage.MODEL__TOP_LEVEL_ELEMENTS:
				return ((InternalEList<?>)getTopLevelElements()).basicRemove(otherEnd, msgs);
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
			case XmbasePackage.MODEL__TOP_LEVEL_ELEMENTS:
				return getTopLevelElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmbasePackage.MODEL__TOP_LEVEL_ELEMENTS:
				return !getTopLevelElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
