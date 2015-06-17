/*
 * generated by Xtext
 */
package org.occiware.clouddesigner.occi.xtext.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.occiware.clouddesigner.occi.xtext.services.OCCIGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public abstract class AbstractOCCISyntacticSequencer extends AbstractSyntacticSequencer {

	protected OCCIGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeDecl_AsteriskKeyword_6_q;
	protected AbstractElementAlias match_AttributeDecl___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q;
	protected AbstractElementAlias match_ConfigurationDecl___AsKeyword_2_2_0_IDTerminalRuleCall_2_2_1__q;
	protected AbstractElementAlias match_ExtensionDecl___AsKeyword_4_2_0_IDTerminalRuleCall_4_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OCCIGrammarAccess) access;
		match_AttributeDecl_AsteriskKeyword_6_q = new TokenAlias(false, true, grammarAccess.getAttributeDeclAccess().getAsteriskKeyword_6());
		match_AttributeDecl___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeDeclAccess().getLeftCurlyBracketKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getAttributeDeclAccess().getRightCurlyBracketKeyword_8_2()));
		match_ConfigurationDecl___AsKeyword_2_2_0_IDTerminalRuleCall_2_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurationDeclAccess().getAsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getConfigurationDeclAccess().getIDTerminalRuleCall_2_2_1()));
		match_ExtensionDecl___AsKeyword_4_2_0_IDTerminalRuleCall_4_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExtensionDeclAccess().getAsKeyword_4_2_0()), new TokenAlias(false, false, grammarAccess.getExtensionDeclAccess().getIDTerminalRuleCall_4_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AttributeDecl_AsteriskKeyword_6_q.equals(syntax))
				emit_AttributeDecl_AsteriskKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AttributeDecl___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q.equals(syntax))
				emit_AttributeDecl___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurationDecl___AsKeyword_2_2_0_IDTerminalRuleCall_2_2_1__q.equals(syntax))
				emit_ConfigurationDecl___AsKeyword_2_2_0_IDTerminalRuleCall_2_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExtensionDecl___AsKeyword_4_2_0_IDTerminalRuleCall_4_2_1__q.equals(syntax))
				emit_ExtensionDecl___AsKeyword_4_2_0_IDTerminalRuleCall_4_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=[EDataType|QualifiedID] (ambiguity) '=' default=STRING
	 *     type=[EDataType|QualifiedID] (ambiguity) '{' 'description' description=STRING
	 *     type=[EDataType|QualifiedID] (ambiguity) ('{' '}')? (rule end)
	 */
	protected void emit_AttributeDecl_AsteriskKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     default=STRING (ambiguity) (rule end)
	 *     type=[EDataType|QualifiedID] '*'? (ambiguity) (rule end)
	 */
	protected void emit_AttributeDecl___LeftCurlyBracketKeyword_8_0_RightCurlyBracketKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('as' ID)?
	 *
	 * This ambiguous syntax occurs at:
	 *     use+=[Extension|STRING] (ambiguity) 'use' use+=[Extension|STRING]
	 *     use+=[Extension|STRING] (ambiguity) (rule end)
	 *     use+=[Extension|STRING] (ambiguity) resources+=ResourceDecl
	 */
	protected void emit_ConfigurationDecl___AsKeyword_2_2_0_IDTerminalRuleCall_2_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('as' ID)?
	 *
	 * This ambiguous syntax occurs at:
	 *     import+=[Extension|STRING] (ambiguity) 'import' import+=[Extension|STRING]
	 *     import+=[Extension|STRING] (ambiguity) (rule end)
	 *     import+=[Extension|STRING] (ambiguity) kinds+=KindDecl
	 *     import+=[Extension|STRING] (ambiguity) mixins+=MixinDecl
	 *     import+=[Extension|STRING] (ambiguity) types+=DataTypeDecl
	 *     import+=[Extension|STRING] (ambiguity) types+=EnumTypeDecl
	 */
	protected void emit_ExtensionDecl___AsKeyword_4_2_0_IDTerminalRuleCall_4_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
