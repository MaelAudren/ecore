/**
 */
package org.occiware.clouddesigner.OCCI;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Kind#getParent <em>Parent</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Kind#getActions <em>Actions</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.OCCI.Kind#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getKind()
 * @model
 * @generated
 */
public interface Kind extends Category {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Kind)
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getKind_Parent()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Kind!parent'"
	 * @generated
	 */
	Kind getParent();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.OCCI.Kind#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Kind value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getKind_Actions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Kind!actions'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.OCCI.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.occiware.clouddesigner.OCCI.OCCIPackage#getKind_Entities()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * Entity.allInstances()->select(kind = self)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_OCCI_c_c_Entity_0 = idResolver.getType(<%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Entity, null);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Entity, TYP_OCCI_c_c_Entity_0));\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Entity);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Entity%> _1 = (<%org.occiware.clouddesigner.OCCI.Entity%>)ITERATOR__1.next();\n    /**\n     * kind = self\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Entity::kind\\\'\");\n    }\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> kind = _1.getKind();\n    final /*@Thrown\052/ boolean eq = this.equals(kind);\n    //\n    if (eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(_1);\n    }\n}\nfinal <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Entity%>> UNBOXED_select = select.asEcoreObjects(idResolver, org.occiware.clouddesigner.OCCI.Entity.class);\nassert UNBOXED_select != null;\nreturn (<%org.eclipse.emf.common.util.EList<org.occiware.clouddesigner.OCCI.Entity>%>)UNBOXED_select;'"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv CorrectScheme: scheme = self.oclContainer().oclAsType(Extension).scheme\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\ntry {\n    final /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_OCCI_c_c_Extension_0 = idResolver.getType(<%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Extension, null);\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = this.getScheme();\n    final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.examples.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(this);\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Extension%> oclAsType = (<%org.occiware.clouddesigner.OCCI.Extension%>)<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(evaluator, oclContainer, TYP_OCCI_c_c_Extension_0);\n    if (oclAsType == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Extension::scheme\\\'\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme_0 = oclAsType.getScheme();\n    final /*@Thrown\052/ boolean eq = scheme.equals(scheme_0);\n    CAUGHT_eq = eq;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_eq = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_eq == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Kind\", \"CorrectScheme\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.KIND__CORRECT_SCHEME, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv NoCyclicInheritance: parent->closure(parent)->excludes(self)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_excludes;\ntry {\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent = this.getParent();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> oclAsSet = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, parent));\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.examples.domain.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n    final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, <%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Kind);\n    /**\n     * Implementation of the iterator body.\n     \052/\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%>()\n    {\n        /**\n         * parent\n         \052/\n        @Override\n        public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> symbol_0 = (<%org.occiware.clouddesigner.OCCI.Kind%>)_1;\n            if (symbol_0 == null) {\n                throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Kind::parent\\\'\");\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent_0 = symbol_0.getParent();\n            return parent_0;\n        }\n    };\n    final /*@NonNull\052/  <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> closure = (<%org.eclipse.ocl.examples.domain.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0);\n    final /*@Thrown\052/ boolean excludes = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionExcludesOperation%>.INSTANCE.evaluate(closure, this).booleanValue());\n    CAUGHT_excludes = excludes;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_excludes = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_excludes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Kind\", \"NoCyclicInheritance\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.KIND__NO_CYCLIC_INHERITANCE, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean NoCyclicInheritance(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AttributesNameNotAlreadyDefinedInParent: attributes.name->excludesAll(parent->closure(parent).attributes.name)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_excludesAll;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Attribute%>> attributes = this.getAttributes();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Attribute, attributes);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSequenceAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.SEQ_PRIMid_String);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_attributes.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SequenceValue%> collect;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            collect = accumulator;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Attribute%> _1 = (<%org.occiware.clouddesigner.OCCI.Attribute%>)ITERATOR__1.next();\n        /**\n         * name\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Attribute::name\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n        //\n        accumulator.add(name);\n    }\n    final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent = this.getParent();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> oclAsSet = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, parent));\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.examples.domain.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n    final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, <%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Kind);\n    /**\n     * Implementation of the iterator body.\n     \052/\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%>()\n    {\n        /**\n         * parent\n         \052/\n        @Override\n        public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1_0) {\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> symbol_0 = (<%org.occiware.clouddesigner.OCCI.Kind%>)_1_0;\n            if (symbol_0 == null) {\n                throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Kind::parent\\\'\");\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent_0 = symbol_0.getParent();\n            return parent_0;\n        }\n    };\n    final /*@NonNull\052/  <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> closure = (<%org.eclipse.ocl.examples.domain.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.BAG_CLSSid_Attribute);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_1 = closure.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect_1;\n    while (true) {\n        if (!ITERATOR__1_1.hasNext()) {\n            collect_1 = accumulator_0;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> _1_1 = (<%org.occiware.clouddesigner.OCCI.Kind%>)ITERATOR__1_1.next();\n        /**\n         * attributes\n         \052/\n        if (_1_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::attributes\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Attribute%>> attributes_0 = _1_1.getAttributes();\n        final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_attributes_0 = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Attribute, attributes_0);\n        //\n        for (Object value : BOXED_attributes_0.flatten().getElements()) {\n            accumulator_0.add(value);\n        }\n    }\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.BAG_PRIMid_String);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1_2 = collect_1.iterator();\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect_0;\n    while (true) {\n        if (!ITERATOR__1_2.hasNext()) {\n            collect_0 = accumulator_1;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Attribute%> _1_2 = (<%org.occiware.clouddesigner.OCCI.Attribute%>)ITERATOR__1_2.next();\n        /**\n         * name\n         \052/\n        if (_1_2 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Attribute::name\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> name_0 = _1_2.getName();\n        //\n        accumulator_1.add(name_0);\n    }\n    final /*@Thrown\052/ boolean excludesAll = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.collection.CollectionExcludesAllOperation%>.INSTANCE.evaluate(collect, collect_0).booleanValue());\n    CAUGHT_excludesAll = excludesAll;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_excludesAll = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_excludesAll == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Kind\", \"AttributesNameNotAlreadyDefinedInParent\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean AttributesNameNotAlreadyDefinedInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv ActionTermUnicity: actions->isUnique(term)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\n/*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_isUnique;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><<%org.occiware.clouddesigner.OCCI.Action%>> actions = this.getActions();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.OrderedSetValue%> BOXED_actions = idResolver.createOrderedSetOfAll(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Action, actions);\n    /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.occiware.clouddesigner.OCCI.OCCITables%>.ORD_CLSSid_Action);\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_actions.iterator();\n    /*@Thrown\052/ boolean isUnique;\n    while (true) {\n        if (!ITERATOR__1.hasNext()) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Action%> _1 = (<%org.occiware.clouddesigner.OCCI.Action%>)ITERATOR__1.next();\n        /**\n         * term\n         \052/\n        if (_1 == null) {\n            throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::term\\\'\");\n        }\n        final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = _1.getTerm();\n        //\n        if (accumulator.includes(term) == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n            isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n            break;\n        }\n        else {\n            accumulator.add(term);\n        }\n    }\n    CAUGHT_isUnique = isUnique;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_isUnique = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_isUnique == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Kind\", \"ActionTermUnicity\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.KIND__ACTION_TERM_UNICITY, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean ActionTermUnicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv EntityKindIsRootParent: self->closure(parent)->exists(k | k.term = \'entity\' and k.scheme = \'http://schemas.ogf.org/occi/core#\' and k.parent = null)\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = <%org.eclipse.ocl.examples.pivot.utilities.PivotUtil%>.getEvaluator(this);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n/*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_exists;\ntry {\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> oclAsSet = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.nonNullState(<%org.eclipse.ocl.examples.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, this));\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYPE_closure_0 = evaluator.getStaticTypeOf(oclAsSet);\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.LibraryIteration%> IMPL_closure_0 = (<%org.eclipse.ocl.examples.domain.library.LibraryIteration%>)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n    final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, <%org.occiware.clouddesigner.OCCI.OCCITables%>.CLSSid_Kind);\n    /**\n     * Implementation of the iterator body.\n     \052/\n    final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation%>()\n    {\n        /**\n         * parent\n         \052/\n        @Override\n        public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator, final /*@NonNull\052/ <%org.eclipse.ocl.examples.domain.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@Nullable\052/ /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n            final /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> symbol_0 = (<%org.occiware.clouddesigner.OCCI.Kind%>)_1;\n            if (symbol_0 == null) {\n                throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Kind::parent\\\'\");\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent = symbol_0.getParent();\n            return parent;\n        }\n    };\n    final /*@NonNull\052/  <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.examples.library.executor.ExecutorSingleIterationManager%>(evaluator, <%org.occiware.clouddesigner.OCCI.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> closure = (<%org.eclipse.ocl.examples.domain.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0);\n    /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE;\n    /*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_k = closure.iterator();\n    /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> exists;\n    while (true) {\n        if (!ITERATOR_k.hasNext()) {\n            if ((accumulator == null) || (accumulator == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE)) {\n                exists = (<%java.lang.Boolean%>)accumulator;\n            }\n            else {\n                throw (<%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>)accumulator;\n            }\n            break;\n        }\n        /*@Nullable\052/ /*@NonInvalid\052/ <%org.occiware.clouddesigner.OCCI.Kind%> k = (<%org.occiware.clouddesigner.OCCI.Kind%>)ITERATOR_k.next();\n        /**\n         * k.term = \'entity\' and k.scheme = \'http://schemas.ogf.org/occi/core#\' and k.parent = null\n         \052/\n        /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_and_0;\n        try {\n            /*@Nullable\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_and;\n            try {\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq;\n                try {\n                    if (k == null) {\n                        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::term\\\'\");\n                    }\n                    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> term = k.getTerm();\n                    final /*@Thrown\052/ boolean eq = term.equals(<%org.occiware.clouddesigner.OCCI.OCCITables%>.STR_entity);\n                    CAUGHT_eq = eq;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_eq = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq_0;\n                try {\n                    if (k == null) {\n                        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Category::scheme\\\'\");\n                    }\n                    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.String%> scheme = k.getScheme();\n                    final /*@Thrown\052/ boolean eq_0 = scheme.equals(<%org.occiware.clouddesigner.OCCI.OCCITables%>.STR_http_c_s_s_schemas_ogf_o);\n                    CAUGHT_eq_0 = eq_0;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_eq_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> and = <%org.eclipse.ocl.examples.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);\n                CAUGHT_and = and;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_and = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n            }\n            /*@NonNull\052/ /*@Caught\052/ <%java.lang.Object%> CAUGHT_eq_1;\n            try {\n                if (k == null) {\n                    throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source for \\\'OCCI::Kind::parent\\\'\");\n                }\n                final /*@Nullable\052/ /*@Thrown\052/ <%org.occiware.clouddesigner.OCCI.Kind%> parent_0 = k.getParent();\n                final /*@Thrown\052/ boolean eq_1 = parent_0 == null;\n                CAUGHT_eq_1 = eq_1;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_eq_1 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n            }\n            final /*@Nullable\052/ /*@Thrown\052/ <%java.lang.Boolean%> and_0 = <%org.eclipse.ocl.examples.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_and, CAUGHT_eq_1);\n            CAUGHT_and_0 = and_0;\n        }\n        catch (<%java.lang.Exception%> e) {\n            CAUGHT_and_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n        }\n        //\n        if (CAUGHT_and_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n            exists = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE;\n            break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n        }\n        else if (CAUGHT_and_0 == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n            ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n        }\n        else if (CAUGHT_and_0 == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n            if (accumulator == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.FALSE_VALUE) {\n                accumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n            }\n        }\n        else if (CAUGHT_and_0 instanceof <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n            accumulator = CAUGHT_and_0;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n        }\n        else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n            accumulator = new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.NonBooleanBody, \"exists\");\n        }\n    }\n    CAUGHT_exists = exists;\n}\ncatch (<%java.lang.Exception%> e) {\n    CAUGHT_exists = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createInvalidValue(e);\n}\nif (CAUGHT_exists == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n    return true;\n}\nif (diagnostics != null) {\n    int severity = CAUGHT_exists == null ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n    <%java.lang.String%> message = <%org.eclipse.ocl.examples.domain.utilities.DomainUtil%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"Kind\", \"EntityKindIsRootParent\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.DIAGNOSTIC_SOURCE, <%org.occiware.clouddesigner.OCCI.util.OCCIValidator%>.KIND__ENTITY_KIND_IS_ROOT_PARENT, message, new Object [] { this }));\n}\nreturn false;'"
	 * @generated
	 */
	boolean EntityKindIsRootParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Kind