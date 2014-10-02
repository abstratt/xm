/**
 */
package xmbehavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xmbehavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmbehaviorFactoryImpl extends EFactoryImpl implements XmbehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmbehaviorFactory init() {
		try {
			XmbehaviorFactory theXmbehaviorFactory = (XmbehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(XmbehaviorPackage.eNS_URI);
			if (theXmbehaviorFactory != null) {
				return theXmbehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmbehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmbehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmbehaviorPackage.ACTIVITY: return createActivity();
			case XmbehaviorPackage.BLOCK: return createBlock();
			case XmbehaviorPackage.LITERAL_CLOSURE: return createLiteralClosure();
			case XmbehaviorPackage.CLOSURE_PARAMETER: return createClosureParameter();
			case XmbehaviorPackage.LITERAL_DOUBLE_ACTION: return createLiteralDoubleAction();
			case XmbehaviorPackage.LITERAL_INT_ACTION: return createLiteralIntAction();
			case XmbehaviorPackage.LITERAL_STRING_ACTION: return createLiteralStringAction();
			case XmbehaviorPackage.LITERAL_MAP_ACTION: return createLiteralMapAction();
			case XmbehaviorPackage.LITERAL_COLLECTION_ACTION: return createLiteralCollectionAction();
			case XmbehaviorPackage.LITERAL_MAP_ENTRY: return createLiteralMapEntry();
			case XmbehaviorPackage.LITERAL_BOOLEAN_ACTION: return createLiteralBooleanAction();
			case XmbehaviorPackage.READ_SELF_ACTION: return createReadSelfAction();
			case XmbehaviorPackage.READ_ATTRIBUTE_ACTION: return createReadAttributeAction();
			case XmbehaviorPackage.WRITE_ATTRIBUTE_ACTION: return createWriteAttributeAction();
			case XmbehaviorPackage.VARIABLE: return createVariable();
			case XmbehaviorPackage.READ_LOCAL_DATA_ACTION: return createReadLocalDataAction();
			case XmbehaviorPackage.WRITE_LOCAL_DATA_ACTION: return createWriteLocalDataAction();
			case XmbehaviorPackage.CREATE_OBJECT_ACTION: return createCreateObjectAction();
			case XmbehaviorPackage.CALL_ACTION_ACTION: return createCallActionAction();
			case XmbehaviorPackage.CALL_QUERY_ACTION: return createCallQueryAction();
			case XmbehaviorPackage.FINAL_ACTION: return createFinalAction();
			case XmbehaviorPackage.TRAVERSE_MANY_ACTION: return createTraverseManyAction();
			case XmbehaviorPackage.EXTENT_ACTION: return createExtentAction();
			case XmbehaviorPackage.FILTER_ACTION: return createFilterAction();
			case XmbehaviorPackage.MAP_ACTION: return createMapAction();
			case XmbehaviorPackage.REDUCE_ACTION: return createReduceAction();
			case XmbehaviorPackage.APPLY_ACTION: return createApplyAction();
			case XmbehaviorPackage.COLLECTION_EXPRESSION_ACTION: return createCollectionExpressionAction();
			case XmbehaviorPackage.COLLECTION_STATEMENT: return createCollectionStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralClosure createLiteralClosure() {
		LiteralClosureImpl literalClosure = new LiteralClosureImpl();
		return literalClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureParameter createClosureParameter() {
		ClosureParameterImpl closureParameter = new ClosureParameterImpl();
		return closureParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralDoubleAction createLiteralDoubleAction() {
		LiteralDoubleActionImpl literalDoubleAction = new LiteralDoubleActionImpl();
		return literalDoubleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntAction createLiteralIntAction() {
		LiteralIntActionImpl literalIntAction = new LiteralIntActionImpl();
		return literalIntAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralStringAction createLiteralStringAction() {
		LiteralStringActionImpl literalStringAction = new LiteralStringActionImpl();
		return literalStringAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralMapAction createLiteralMapAction() {
		LiteralMapActionImpl literalMapAction = new LiteralMapActionImpl();
		return literalMapAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralCollectionAction createLiteralCollectionAction() {
		LiteralCollectionActionImpl literalCollectionAction = new LiteralCollectionActionImpl();
		return literalCollectionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralMapEntry createLiteralMapEntry() {
		LiteralMapEntryImpl literalMapEntry = new LiteralMapEntryImpl();
		return literalMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanAction createLiteralBooleanAction() {
		LiteralBooleanActionImpl literalBooleanAction = new LiteralBooleanActionImpl();
		return literalBooleanAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfAction createReadSelfAction() {
		ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
		return readSelfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadAttributeAction createReadAttributeAction() {
		ReadAttributeActionImpl readAttributeAction = new ReadAttributeActionImpl();
		return readAttributeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteAttributeAction createWriteAttributeAction() {
		WriteAttributeActionImpl writeAttributeAction = new WriteAttributeActionImpl();
		return writeAttributeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLocalDataAction createReadLocalDataAction() {
		ReadLocalDataActionImpl readLocalDataAction = new ReadLocalDataActionImpl();
		return readLocalDataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLocalDataAction createWriteLocalDataAction() {
		WriteLocalDataActionImpl writeLocalDataAction = new WriteLocalDataActionImpl();
		return writeLocalDataAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectAction createCreateObjectAction() {
		CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
		return createObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActionAction createCallActionAction() {
		CallActionActionImpl callActionAction = new CallActionActionImpl();
		return callActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQueryAction createCallQueryAction() {
		CallQueryActionImpl callQueryAction = new CallQueryActionImpl();
		return callQueryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalAction createFinalAction() {
		FinalActionImpl finalAction = new FinalActionImpl();
		return finalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraverseManyAction createTraverseManyAction() {
		TraverseManyActionImpl traverseManyAction = new TraverseManyActionImpl();
		return traverseManyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentAction createExtentAction() {
		ExtentActionImpl extentAction = new ExtentActionImpl();
		return extentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAction createFilterAction() {
		FilterActionImpl filterAction = new FilterActionImpl();
		return filterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapAction createMapAction() {
		MapActionImpl mapAction = new MapActionImpl();
		return mapAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceAction createReduceAction() {
		ReduceActionImpl reduceAction = new ReduceActionImpl();
		return reduceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyAction createApplyAction() {
		ApplyActionImpl applyAction = new ApplyActionImpl();
		return applyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExpressionAction createCollectionExpressionAction() {
		CollectionExpressionActionImpl collectionExpressionAction = new CollectionExpressionActionImpl();
		return collectionExpressionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionStatement createCollectionStatement() {
		CollectionStatementImpl collectionStatement = new CollectionStatementImpl();
		return collectionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmbehaviorPackage getXmbehaviorPackage() {
		return (XmbehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmbehaviorPackage getPackage() {
		return XmbehaviorPackage.eINSTANCE;
	}

} //XmbehaviorFactoryImpl
