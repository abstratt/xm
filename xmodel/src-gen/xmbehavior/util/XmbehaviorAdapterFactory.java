/**
 */
package xmbehavior.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xmbase.Behavior;
import xmbase.LocalData;
import xmbase.NamedElement;
import xmbase.Parameter;
import xmbase.ParameteredElement;
import xmbase.TypedElement;

import xmbehavior.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xmbehavior.XmbehaviorPackage
 * @generated
 */
public class XmbehaviorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmbehaviorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmbehaviorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmbehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmbehaviorSwitch<Adapter> modelSwitch =
		new XmbehaviorSwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseLiteralClosure(LiteralClosure object) {
				return createLiteralClosureAdapter();
			}
			@Override
			public Adapter caseClosureParameter(ClosureParameter object) {
				return createClosureParameterAdapter();
			}
			@Override
			public Adapter caseValueAction(ValueAction object) {
				return createValueActionAdapter();
			}
			@Override
			public Adapter caseExpressionAction(ExpressionAction object) {
				return createExpressionActionAdapter();
			}
			@Override
			public Adapter caseSimpleValueAction(SimpleValueAction object) {
				return createSimpleValueActionAdapter();
			}
			@Override
			public Adapter caseStatementAction(StatementAction object) {
				return createStatementActionAdapter();
			}
			@Override
			public Adapter caseObjectStatementAction(ObjectStatementAction object) {
				return createObjectStatementActionAdapter();
			}
			@Override
			public Adapter caseLiteralAction(LiteralAction object) {
				return createLiteralActionAdapter();
			}
			@Override
			public Adapter caseLiteralDoubleAction(LiteralDoubleAction object) {
				return createLiteralDoubleActionAdapter();
			}
			@Override
			public Adapter caseLiteralIntAction(LiteralIntAction object) {
				return createLiteralIntActionAdapter();
			}
			@Override
			public Adapter caseLiteralStringAction(LiteralStringAction object) {
				return createLiteralStringActionAdapter();
			}
			@Override
			public Adapter caseLiteralMapAction(LiteralMapAction object) {
				return createLiteralMapActionAdapter();
			}
			@Override
			public Adapter caseLiteralCollectionAction(LiteralCollectionAction object) {
				return createLiteralCollectionActionAdapter();
			}
			@Override
			public Adapter caseLiteralMapEntry(LiteralMapEntry object) {
				return createLiteralMapEntryAdapter();
			}
			@Override
			public Adapter caseLiteralBooleanAction(LiteralBooleanAction object) {
				return createLiteralBooleanActionAdapter();
			}
			@Override
			public Adapter caseReadSelfAction(ReadSelfAction object) {
				return createReadSelfActionAdapter();
			}
			@Override
			public Adapter caseObjectAction(ObjectAction object) {
				return createObjectActionAdapter();
			}
			@Override
			public Adapter caseNonObjectAction(NonObjectAction object) {
				return createNonObjectActionAdapter();
			}
			@Override
			public Adapter caseAttributeAction(AttributeAction object) {
				return createAttributeActionAdapter();
			}
			@Override
			public Adapter caseReadAttributeAction(ReadAttributeAction object) {
				return createReadAttributeActionAdapter();
			}
			@Override
			public Adapter caseWriteAttributeAction(WriteAttributeAction object) {
				return createWriteAttributeActionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseLocalDataAction(LocalDataAction object) {
				return createLocalDataActionAdapter();
			}
			@Override
			public Adapter caseReadLocalDataAction(ReadLocalDataAction object) {
				return createReadLocalDataActionAdapter();
			}
			@Override
			public Adapter caseWriteLocalDataAction(WriteLocalDataAction object) {
				return createWriteLocalDataActionAdapter();
			}
			@Override
			public Adapter caseCreateObjectAction(CreateObjectAction object) {
				return createCreateObjectActionAdapter();
			}
			@Override
			public Adapter caseOperationAction(OperationAction object) {
				return createOperationActionAdapter();
			}
			@Override
			public Adapter caseCallActionAction(CallActionAction object) {
				return createCallActionActionAdapter();
			}
			@Override
			public Adapter caseCallQueryAction(CallQueryAction object) {
				return createCallQueryActionAdapter();
			}
			@Override
			public Adapter caseFinalAction(FinalAction object) {
				return createFinalActionAdapter();
			}
			@Override
			public Adapter caseCollectionProducingAction(CollectionProducingAction object) {
				return createCollectionProducingActionAdapter();
			}
			@Override
			public Adapter caseOriginalCollectionProducingAction(OriginalCollectionProducingAction object) {
				return createOriginalCollectionProducingActionAdapter();
			}
			@Override
			public Adapter caseCollectionConsumingAction(CollectionConsumingAction object) {
				return createCollectionConsumingActionAdapter();
			}
			@Override
			public Adapter caseCollectionTransformingAction(CollectionTransformingAction object) {
				return createCollectionTransformingActionAdapter();
			}
			@Override
			public Adapter caseFinalCollectionConsumingAction(FinalCollectionConsumingAction object) {
				return createFinalCollectionConsumingActionAdapter();
			}
			@Override
			public Adapter caseTraverseManyAction(TraverseManyAction object) {
				return createTraverseManyActionAdapter();
			}
			@Override
			public Adapter caseExtentAction(ExtentAction object) {
				return createExtentActionAdapter();
			}
			@Override
			public Adapter caseFilterAction(FilterAction object) {
				return createFilterActionAdapter();
			}
			@Override
			public Adapter caseMapAction(MapAction object) {
				return createMapActionAdapter();
			}
			@Override
			public Adapter caseReduceAction(ReduceAction object) {
				return createReduceActionAdapter();
			}
			@Override
			public Adapter caseApplyAction(ApplyAction object) {
				return createApplyActionAdapter();
			}
			@Override
			public Adapter caseCollectionExpressionAction(CollectionExpressionAction object) {
				return createCollectionExpressionActionAdapter();
			}
			@Override
			public Adapter caseCollectionStatement(CollectionStatement object) {
				return createCollectionStatementAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseParameteredElement(ParameteredElement object) {
				return createParameteredElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseLocalData(LocalData object) {
				return createLocalDataAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralClosure <em>Literal Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralClosure
	 * @generated
	 */
	public Adapter createLiteralClosureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ClosureParameter <em>Closure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ClosureParameter
	 * @generated
	 */
	public Adapter createClosureParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ValueAction <em>Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ValueAction
	 * @generated
	 */
	public Adapter createValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ExpressionAction <em>Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ExpressionAction
	 * @generated
	 */
	public Adapter createExpressionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.SimpleValueAction <em>Simple Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.SimpleValueAction
	 * @generated
	 */
	public Adapter createSimpleValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.StatementAction <em>Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.StatementAction
	 * @generated
	 */
	public Adapter createStatementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ObjectStatementAction <em>Object Statement Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ObjectStatementAction
	 * @generated
	 */
	public Adapter createObjectStatementActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralAction <em>Literal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralAction
	 * @generated
	 */
	public Adapter createLiteralActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralDoubleAction <em>Literal Double Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralDoubleAction
	 * @generated
	 */
	public Adapter createLiteralDoubleActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralIntAction <em>Literal Int Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralIntAction
	 * @generated
	 */
	public Adapter createLiteralIntActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralStringAction <em>Literal String Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralStringAction
	 * @generated
	 */
	public Adapter createLiteralStringActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralMapAction <em>Literal Map Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralMapAction
	 * @generated
	 */
	public Adapter createLiteralMapActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralCollectionAction <em>Literal Collection Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralCollectionAction
	 * @generated
	 */
	public Adapter createLiteralCollectionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralMapEntry <em>Literal Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralMapEntry
	 * @generated
	 */
	public Adapter createLiteralMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LiteralBooleanAction <em>Literal Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LiteralBooleanAction
	 * @generated
	 */
	public Adapter createLiteralBooleanActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ObjectAction
	 * @generated
	 */
	public Adapter createObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.NonObjectAction <em>Non Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.NonObjectAction
	 * @generated
	 */
	public Adapter createNonObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.AttributeAction <em>Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.AttributeAction
	 * @generated
	 */
	public Adapter createAttributeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ReadAttributeAction <em>Read Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ReadAttributeAction
	 * @generated
	 */
	public Adapter createReadAttributeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.WriteAttributeAction <em>Write Attribute Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.WriteAttributeAction
	 * @generated
	 */
	public Adapter createWriteAttributeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.LocalDataAction <em>Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.LocalDataAction
	 * @generated
	 */
	public Adapter createLocalDataActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ReadLocalDataAction <em>Read Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ReadLocalDataAction
	 * @generated
	 */
	public Adapter createReadLocalDataActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.WriteLocalDataAction <em>Write Local Data Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.WriteLocalDataAction
	 * @generated
	 */
	public Adapter createWriteLocalDataActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.OperationAction
	 * @generated
	 */
	public Adapter createOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CallActionAction <em>Call Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CallActionAction
	 * @generated
	 */
	public Adapter createCallActionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CallQueryAction <em>Call Query Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CallQueryAction
	 * @generated
	 */
	public Adapter createCallQueryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.FinalAction <em>Final Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.FinalAction
	 * @generated
	 */
	public Adapter createFinalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CollectionProducingAction <em>Collection Producing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CollectionProducingAction
	 * @generated
	 */
	public Adapter createCollectionProducingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.OriginalCollectionProducingAction <em>Original Collection Producing Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.OriginalCollectionProducingAction
	 * @generated
	 */
	public Adapter createOriginalCollectionProducingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CollectionConsumingAction <em>Collection Consuming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CollectionConsumingAction
	 * @generated
	 */
	public Adapter createCollectionConsumingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CollectionTransformingAction <em>Collection Transforming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CollectionTransformingAction
	 * @generated
	 */
	public Adapter createCollectionTransformingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.FinalCollectionConsumingAction <em>Final Collection Consuming Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.FinalCollectionConsumingAction
	 * @generated
	 */
	public Adapter createFinalCollectionConsumingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.TraverseManyAction <em>Traverse Many Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.TraverseManyAction
	 * @generated
	 */
	public Adapter createTraverseManyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ExtentAction <em>Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ExtentAction
	 * @generated
	 */
	public Adapter createExtentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.FilterAction <em>Filter Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.FilterAction
	 * @generated
	 */
	public Adapter createFilterActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.MapAction <em>Map Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.MapAction
	 * @generated
	 */
	public Adapter createMapActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ReduceAction
	 * @generated
	 */
	public Adapter createReduceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.ApplyAction <em>Apply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.ApplyAction
	 * @generated
	 */
	public Adapter createApplyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CollectionExpressionAction <em>Collection Expression Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CollectionExpressionAction
	 * @generated
	 */
	public Adapter createCollectionExpressionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbehavior.CollectionStatement <em>Collection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbehavior.CollectionStatement
	 * @generated
	 */
	public Adapter createCollectionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.ParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.ParameteredElement
	 * @generated
	 */
	public Adapter createParameteredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.LocalData <em>Local Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.LocalData
	 * @generated
	 */
	public Adapter createLocalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xmbase.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xmbase.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XmbehaviorAdapterFactory
