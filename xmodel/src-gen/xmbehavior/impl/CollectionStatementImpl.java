/**
 */
package xmbehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmbehavior.CollectionStatement;
import xmbehavior.CollectionTransformingAction;
import xmbehavior.FinalCollectionConsumingAction;
import xmbehavior.OriginalCollectionProducingAction;
import xmbehavior.XmbehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmbehavior.impl.CollectionStatementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link xmbehavior.impl.CollectionStatementImpl#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link xmbehavior.impl.CollectionStatementImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionStatementImpl extends StatementActionImpl implements CollectionStatement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OriginalCollectionProducingAction source;

	/**
	 * The cached value of the '{@link #getTransformers() <em>Transformers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformers()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionTransformingAction> transformers;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected FinalCollectionConsumingAction destination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmbehaviorPackage.Literals.COLLECTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalCollectionProducingAction getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OriginalCollectionProducingAction newSource, NotificationChain msgs) {
		OriginalCollectionProducingAction oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OriginalCollectionProducingAction newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionTransformingAction> getTransformers() {
		if (transformers == null) {
			transformers = new EObjectContainmentEList<CollectionTransformingAction>(CollectionTransformingAction.class, this, XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS);
		}
		return transformers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalCollectionConsumingAction getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(FinalCollectionConsumingAction newDestination, NotificationChain msgs) {
		FinalCollectionConsumingAction oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(FinalCollectionConsumingAction newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE:
				return basicSetSource(null, msgs);
			case XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS:
				return ((InternalEList<?>)getTransformers()).basicRemove(otherEnd, msgs);
			case XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION:
				return basicSetDestination(null, msgs);
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
			case XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE:
				return getSource();
			case XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS:
				return getTransformers();
			case XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION:
				return getDestination();
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
			case XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE:
				setSource((OriginalCollectionProducingAction)newValue);
				return;
			case XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS:
				getTransformers().clear();
				getTransformers().addAll((Collection<? extends CollectionTransformingAction>)newValue);
				return;
			case XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION:
				setDestination((FinalCollectionConsumingAction)newValue);
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
			case XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE:
				setSource((OriginalCollectionProducingAction)null);
				return;
			case XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS:
				getTransformers().clear();
				return;
			case XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION:
				setDestination((FinalCollectionConsumingAction)null);
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
			case XmbehaviorPackage.COLLECTION_STATEMENT__SOURCE:
				return source != null;
			case XmbehaviorPackage.COLLECTION_STATEMENT__TRANSFORMERS:
				return transformers != null && !transformers.isEmpty();
			case XmbehaviorPackage.COLLECTION_STATEMENT__DESTINATION:
				return destination != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionStatementImpl
