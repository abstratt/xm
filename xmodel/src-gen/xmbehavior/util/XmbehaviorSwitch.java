/**
 */
package xmbehavior.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xmbase.Behavior;
import xmbase.LocalData;
import xmbase.NamedElement;
import xmbase.Parameter;
import xmbase.ParameteredElement;
import xmbase.TypedElement;

import xmbehavior.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xmbehavior.XmbehaviorPackage
 * @generated
 */
public class XmbehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmbehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmbehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = XmbehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmbehaviorPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseStatementAction(block);
				if (result == null) result = caseAction(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_CLOSURE: {
				LiteralClosure literalClosure = (LiteralClosure)theEObject;
				T result = caseLiteralClosure(literalClosure);
				if (result == null) result = caseActivity(literalClosure);
				if (result == null) result = caseParameteredElement(literalClosure);
				if (result == null) result = caseLiteralAction(literalClosure);
				if (result == null) result = caseBehavior(literalClosure);
				if (result == null) result = caseSimpleValueAction(literalClosure);
				if (result == null) result = caseValueAction(literalClosure);
				if (result == null) result = caseAction(literalClosure);
				if (result == null) result = caseNamedElement(literalClosure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.CLOSURE_PARAMETER: {
				ClosureParameter closureParameter = (ClosureParameter)theEObject;
				T result = caseClosureParameter(closureParameter);
				if (result == null) result = caseParameter(closureParameter);
				if (result == null) result = caseLocalData(closureParameter);
				if (result == null) result = caseTypedElement(closureParameter);
				if (result == null) result = caseNamedElement(closureParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.VALUE_ACTION: {
				ValueAction valueAction = (ValueAction)theEObject;
				T result = caseValueAction(valueAction);
				if (result == null) result = caseAction(valueAction);
				if (result == null) result = caseNamedElement(valueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.EXPRESSION_ACTION: {
				ExpressionAction expressionAction = (ExpressionAction)theEObject;
				T result = caseExpressionAction(expressionAction);
				if (result == null) result = caseValueAction(expressionAction);
				if (result == null) result = caseAction(expressionAction);
				if (result == null) result = caseNamedElement(expressionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.SIMPLE_VALUE_ACTION: {
				SimpleValueAction simpleValueAction = (SimpleValueAction)theEObject;
				T result = caseSimpleValueAction(simpleValueAction);
				if (result == null) result = caseValueAction(simpleValueAction);
				if (result == null) result = caseAction(simpleValueAction);
				if (result == null) result = caseNamedElement(simpleValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.STATEMENT_ACTION: {
				StatementAction statementAction = (StatementAction)theEObject;
				T result = caseStatementAction(statementAction);
				if (result == null) result = caseAction(statementAction);
				if (result == null) result = caseNamedElement(statementAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.OBJECT_STATEMENT_ACTION: {
				ObjectStatementAction objectStatementAction = (ObjectStatementAction)theEObject;
				T result = caseObjectStatementAction(objectStatementAction);
				if (result == null) result = caseStatementAction(objectStatementAction);
				if (result == null) result = caseObjectAction(objectStatementAction);
				if (result == null) result = caseAction(objectStatementAction);
				if (result == null) result = caseNamedElement(objectStatementAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_ACTION: {
				LiteralAction literalAction = (LiteralAction)theEObject;
				T result = caseLiteralAction(literalAction);
				if (result == null) result = caseSimpleValueAction(literalAction);
				if (result == null) result = caseValueAction(literalAction);
				if (result == null) result = caseAction(literalAction);
				if (result == null) result = caseNamedElement(literalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_DOUBLE_ACTION: {
				LiteralDoubleAction literalDoubleAction = (LiteralDoubleAction)theEObject;
				T result = caseLiteralDoubleAction(literalDoubleAction);
				if (result == null) result = caseLiteralAction(literalDoubleAction);
				if (result == null) result = caseSimpleValueAction(literalDoubleAction);
				if (result == null) result = caseValueAction(literalDoubleAction);
				if (result == null) result = caseAction(literalDoubleAction);
				if (result == null) result = caseNamedElement(literalDoubleAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_INT_ACTION: {
				LiteralIntAction literalIntAction = (LiteralIntAction)theEObject;
				T result = caseLiteralIntAction(literalIntAction);
				if (result == null) result = caseLiteralAction(literalIntAction);
				if (result == null) result = caseSimpleValueAction(literalIntAction);
				if (result == null) result = caseValueAction(literalIntAction);
				if (result == null) result = caseAction(literalIntAction);
				if (result == null) result = caseNamedElement(literalIntAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_STRING_ACTION: {
				LiteralStringAction literalStringAction = (LiteralStringAction)theEObject;
				T result = caseLiteralStringAction(literalStringAction);
				if (result == null) result = caseLiteralAction(literalStringAction);
				if (result == null) result = caseSimpleValueAction(literalStringAction);
				if (result == null) result = caseValueAction(literalStringAction);
				if (result == null) result = caseAction(literalStringAction);
				if (result == null) result = caseNamedElement(literalStringAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_MAP_ACTION: {
				LiteralMapAction literalMapAction = (LiteralMapAction)theEObject;
				T result = caseLiteralMapAction(literalMapAction);
				if (result == null) result = caseLiteralAction(literalMapAction);
				if (result == null) result = caseSimpleValueAction(literalMapAction);
				if (result == null) result = caseValueAction(literalMapAction);
				if (result == null) result = caseAction(literalMapAction);
				if (result == null) result = caseNamedElement(literalMapAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_COLLECTION_ACTION: {
				LiteralCollectionAction literalCollectionAction = (LiteralCollectionAction)theEObject;
				T result = caseLiteralCollectionAction(literalCollectionAction);
				if (result == null) result = caseLiteralAction(literalCollectionAction);
				if (result == null) result = caseCollectionProducingAction(literalCollectionAction);
				if (result == null) result = caseSimpleValueAction(literalCollectionAction);
				if (result == null) result = caseValueAction(literalCollectionAction);
				if (result == null) result = caseAction(literalCollectionAction);
				if (result == null) result = caseNamedElement(literalCollectionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_MAP_ENTRY: {
				LiteralMapEntry literalMapEntry = (LiteralMapEntry)theEObject;
				T result = caseLiteralMapEntry(literalMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LITERAL_BOOLEAN_ACTION: {
				LiteralBooleanAction literalBooleanAction = (LiteralBooleanAction)theEObject;
				T result = caseLiteralBooleanAction(literalBooleanAction);
				if (result == null) result = caseLiteralAction(literalBooleanAction);
				if (result == null) result = caseSimpleValueAction(literalBooleanAction);
				if (result == null) result = caseValueAction(literalBooleanAction);
				if (result == null) result = caseAction(literalBooleanAction);
				if (result == null) result = caseNamedElement(literalBooleanAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.READ_SELF_ACTION: {
				ReadSelfAction readSelfAction = (ReadSelfAction)theEObject;
				T result = caseReadSelfAction(readSelfAction);
				if (result == null) result = caseSimpleValueAction(readSelfAction);
				if (result == null) result = caseValueAction(readSelfAction);
				if (result == null) result = caseAction(readSelfAction);
				if (result == null) result = caseNamedElement(readSelfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.OBJECT_ACTION: {
				ObjectAction objectAction = (ObjectAction)theEObject;
				T result = caseObjectAction(objectAction);
				if (result == null) result = caseAction(objectAction);
				if (result == null) result = caseNamedElement(objectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.NON_OBJECT_ACTION: {
				NonObjectAction nonObjectAction = (NonObjectAction)theEObject;
				T result = caseNonObjectAction(nonObjectAction);
				if (result == null) result = caseAction(nonObjectAction);
				if (result == null) result = caseNamedElement(nonObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.ATTRIBUTE_ACTION: {
				AttributeAction attributeAction = (AttributeAction)theEObject;
				T result = caseAttributeAction(attributeAction);
				if (result == null) result = caseObjectAction(attributeAction);
				if (result == null) result = caseAction(attributeAction);
				if (result == null) result = caseNamedElement(attributeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.READ_ATTRIBUTE_ACTION: {
				ReadAttributeAction readAttributeAction = (ReadAttributeAction)theEObject;
				T result = caseReadAttributeAction(readAttributeAction);
				if (result == null) result = caseAttributeAction(readAttributeAction);
				if (result == null) result = caseExpressionAction(readAttributeAction);
				if (result == null) result = caseObjectAction(readAttributeAction);
				if (result == null) result = caseValueAction(readAttributeAction);
				if (result == null) result = caseAction(readAttributeAction);
				if (result == null) result = caseNamedElement(readAttributeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.WRITE_ATTRIBUTE_ACTION: {
				WriteAttributeAction writeAttributeAction = (WriteAttributeAction)theEObject;
				T result = caseWriteAttributeAction(writeAttributeAction);
				if (result == null) result = caseAttributeAction(writeAttributeAction);
				if (result == null) result = caseObjectStatementAction(writeAttributeAction);
				if (result == null) result = caseObjectAction(writeAttributeAction);
				if (result == null) result = caseStatementAction(writeAttributeAction);
				if (result == null) result = caseAction(writeAttributeAction);
				if (result == null) result = caseNamedElement(writeAttributeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseLocalData(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.LOCAL_DATA_ACTION: {
				LocalDataAction localDataAction = (LocalDataAction)theEObject;
				T result = caseLocalDataAction(localDataAction);
				if (result == null) result = caseObjectAction(localDataAction);
				if (result == null) result = caseAction(localDataAction);
				if (result == null) result = caseNamedElement(localDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.READ_LOCAL_DATA_ACTION: {
				ReadLocalDataAction readLocalDataAction = (ReadLocalDataAction)theEObject;
				T result = caseReadLocalDataAction(readLocalDataAction);
				if (result == null) result = caseLocalDataAction(readLocalDataAction);
				if (result == null) result = caseSimpleValueAction(readLocalDataAction);
				if (result == null) result = caseObjectAction(readLocalDataAction);
				if (result == null) result = caseValueAction(readLocalDataAction);
				if (result == null) result = caseAction(readLocalDataAction);
				if (result == null) result = caseNamedElement(readLocalDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.WRITE_LOCAL_DATA_ACTION: {
				WriteLocalDataAction writeLocalDataAction = (WriteLocalDataAction)theEObject;
				T result = caseWriteLocalDataAction(writeLocalDataAction);
				if (result == null) result = caseLocalDataAction(writeLocalDataAction);
				if (result == null) result = caseStatementAction(writeLocalDataAction);
				if (result == null) result = caseObjectAction(writeLocalDataAction);
				if (result == null) result = caseAction(writeLocalDataAction);
				if (result == null) result = caseNamedElement(writeLocalDataAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.CREATE_OBJECT_ACTION: {
				CreateObjectAction createObjectAction = (CreateObjectAction)theEObject;
				T result = caseCreateObjectAction(createObjectAction);
				if (result == null) result = caseSimpleValueAction(createObjectAction);
				if (result == null) result = caseValueAction(createObjectAction);
				if (result == null) result = caseAction(createObjectAction);
				if (result == null) result = caseNamedElement(createObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.OPERATION_ACTION: {
				OperationAction operationAction = (OperationAction)theEObject;
				T result = caseOperationAction(operationAction);
				if (result == null) result = caseObjectAction(operationAction);
				if (result == null) result = caseAction(operationAction);
				if (result == null) result = caseNamedElement(operationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.CALL_ACTION_ACTION: {
				CallActionAction callActionAction = (CallActionAction)theEObject;
				T result = caseCallActionAction(callActionAction);
				if (result == null) result = caseOperationAction(callActionAction);
				if (result == null) result = caseObjectStatementAction(callActionAction);
				if (result == null) result = caseObjectAction(callActionAction);
				if (result == null) result = caseStatementAction(callActionAction);
				if (result == null) result = caseAction(callActionAction);
				if (result == null) result = caseNamedElement(callActionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.CALL_QUERY_ACTION: {
				CallQueryAction callQueryAction = (CallQueryAction)theEObject;
				T result = caseCallQueryAction(callQueryAction);
				if (result == null) result = caseOperationAction(callQueryAction);
				if (result == null) result = caseExpressionAction(callQueryAction);
				if (result == null) result = caseObjectAction(callQueryAction);
				if (result == null) result = caseValueAction(callQueryAction);
				if (result == null) result = caseAction(callQueryAction);
				if (result == null) result = caseNamedElement(callQueryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.FINAL_ACTION: {
				FinalAction finalAction = (FinalAction)theEObject;
				T result = caseFinalAction(finalAction);
				if (result == null) result = caseStatementAction(finalAction);
				if (result == null) result = caseAction(finalAction);
				if (result == null) result = caseNamedElement(finalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.COLLECTION_PRODUCING_ACTION: {
				CollectionProducingAction collectionProducingAction = (CollectionProducingAction)theEObject;
				T result = caseCollectionProducingAction(collectionProducingAction);
				if (result == null) result = caseAction(collectionProducingAction);
				if (result == null) result = caseNamedElement(collectionProducingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.ORIGINAL_COLLECTION_PRODUCING_ACTION: {
				OriginalCollectionProducingAction originalCollectionProducingAction = (OriginalCollectionProducingAction)theEObject;
				T result = caseOriginalCollectionProducingAction(originalCollectionProducingAction);
				if (result == null) result = caseCollectionProducingAction(originalCollectionProducingAction);
				if (result == null) result = caseAction(originalCollectionProducingAction);
				if (result == null) result = caseNamedElement(originalCollectionProducingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.COLLECTION_CONSUMING_ACTION: {
				CollectionConsumingAction collectionConsumingAction = (CollectionConsumingAction)theEObject;
				T result = caseCollectionConsumingAction(collectionConsumingAction);
				if (result == null) result = caseAction(collectionConsumingAction);
				if (result == null) result = caseNamedElement(collectionConsumingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.COLLECTION_TRANSFORMING_ACTION: {
				CollectionTransformingAction collectionTransformingAction = (CollectionTransformingAction)theEObject;
				T result = caseCollectionTransformingAction(collectionTransformingAction);
				if (result == null) result = caseCollectionConsumingAction(collectionTransformingAction);
				if (result == null) result = caseCollectionProducingAction(collectionTransformingAction);
				if (result == null) result = caseAction(collectionTransformingAction);
				if (result == null) result = caseNamedElement(collectionTransformingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.FINAL_COLLECTION_CONSUMING_ACTION: {
				FinalCollectionConsumingAction finalCollectionConsumingAction = (FinalCollectionConsumingAction)theEObject;
				T result = caseFinalCollectionConsumingAction(finalCollectionConsumingAction);
				if (result == null) result = caseCollectionConsumingAction(finalCollectionConsumingAction);
				if (result == null) result = caseAction(finalCollectionConsumingAction);
				if (result == null) result = caseNamedElement(finalCollectionConsumingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.TRAVERSE_MANY_ACTION: {
				TraverseManyAction traverseManyAction = (TraverseManyAction)theEObject;
				T result = caseTraverseManyAction(traverseManyAction);
				if (result == null) result = caseOriginalCollectionProducingAction(traverseManyAction);
				if (result == null) result = caseCollectionProducingAction(traverseManyAction);
				if (result == null) result = caseAction(traverseManyAction);
				if (result == null) result = caseNamedElement(traverseManyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.EXTENT_ACTION: {
				ExtentAction extentAction = (ExtentAction)theEObject;
				T result = caseExtentAction(extentAction);
				if (result == null) result = caseOriginalCollectionProducingAction(extentAction);
				if (result == null) result = caseCollectionProducingAction(extentAction);
				if (result == null) result = caseAction(extentAction);
				if (result == null) result = caseNamedElement(extentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.FILTER_ACTION: {
				FilterAction filterAction = (FilterAction)theEObject;
				T result = caseFilterAction(filterAction);
				if (result == null) result = caseCollectionTransformingAction(filterAction);
				if (result == null) result = caseCollectionConsumingAction(filterAction);
				if (result == null) result = caseCollectionProducingAction(filterAction);
				if (result == null) result = caseAction(filterAction);
				if (result == null) result = caseNamedElement(filterAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.MAP_ACTION: {
				MapAction mapAction = (MapAction)theEObject;
				T result = caseMapAction(mapAction);
				if (result == null) result = caseCollectionTransformingAction(mapAction);
				if (result == null) result = caseCollectionConsumingAction(mapAction);
				if (result == null) result = caseCollectionProducingAction(mapAction);
				if (result == null) result = caseAction(mapAction);
				if (result == null) result = caseNamedElement(mapAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.REDUCE_ACTION: {
				ReduceAction reduceAction = (ReduceAction)theEObject;
				T result = caseReduceAction(reduceAction);
				if (result == null) result = caseFinalCollectionConsumingAction(reduceAction);
				if (result == null) result = caseSimpleValueAction(reduceAction);
				if (result == null) result = caseCollectionConsumingAction(reduceAction);
				if (result == null) result = caseValueAction(reduceAction);
				if (result == null) result = caseAction(reduceAction);
				if (result == null) result = caseNamedElement(reduceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.APPLY_ACTION: {
				ApplyAction applyAction = (ApplyAction)theEObject;
				T result = caseApplyAction(applyAction);
				if (result == null) result = caseFinalCollectionConsumingAction(applyAction);
				if (result == null) result = caseStatementAction(applyAction);
				if (result == null) result = caseCollectionConsumingAction(applyAction);
				if (result == null) result = caseAction(applyAction);
				if (result == null) result = caseNamedElement(applyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.COLLECTION_EXPRESSION_ACTION: {
				CollectionExpressionAction collectionExpressionAction = (CollectionExpressionAction)theEObject;
				T result = caseCollectionExpressionAction(collectionExpressionAction);
				if (result == null) result = caseValueAction(collectionExpressionAction);
				if (result == null) result = caseAction(collectionExpressionAction);
				if (result == null) result = caseNamedElement(collectionExpressionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmbehaviorPackage.COLLECTION_STATEMENT: {
				CollectionStatement collectionStatement = (CollectionStatement)theEObject;
				T result = caseCollectionStatement(collectionStatement);
				if (result == null) result = caseStatementAction(collectionStatement);
				if (result == null) result = caseAction(collectionStatement);
				if (result == null) result = caseNamedElement(collectionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Closure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Closure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralClosure(LiteralClosure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closure Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closure Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosureParameter(ClosureParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueAction(ValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionAction(ExpressionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleValueAction(SimpleValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementAction(StatementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Statement Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Statement Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectStatementAction(ObjectStatementAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralAction(LiteralAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Double Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Double Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralDoubleAction(LiteralDoubleAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Int Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Int Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralIntAction(LiteralIntAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralStringAction(LiteralStringAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Map Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Map Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralMapAction(LiteralMapAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Collection Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Collection Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCollectionAction(LiteralCollectionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralMapEntry(LiteralMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBooleanAction(LiteralBooleanAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectAction(ObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonObjectAction(NonObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAction(AttributeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Attribute Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Attribute Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadAttributeAction(ReadAttributeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Attribute Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Attribute Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteAttributeAction(WriteAttributeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Data Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalDataAction(LocalDataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Local Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Local Data Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLocalDataAction(ReadLocalDataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Local Data Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Local Data Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLocalDataAction(WriteLocalDataAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAction(OperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallActionAction(CallActionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Query Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Query Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallQueryAction(CallQueryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalAction(FinalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Producing Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Producing Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionProducingAction(CollectionProducingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Original Collection Producing Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Original Collection Producing Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOriginalCollectionProducingAction(OriginalCollectionProducingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Consuming Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Consuming Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionConsumingAction(CollectionConsumingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Transforming Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Transforming Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTransformingAction(CollectionTransformingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Collection Consuming Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Collection Consuming Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalCollectionConsumingAction(FinalCollectionConsumingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traverse Many Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traverse Many Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraverseManyAction(TraverseManyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtentAction(ExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterAction(FilterAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapAction(MapAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceAction(ReduceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyAction(ApplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpressionAction(CollectionExpressionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionStatement(CollectionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametered Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametered Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameteredElement(ParameteredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalData(LocalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmbehaviorSwitch
