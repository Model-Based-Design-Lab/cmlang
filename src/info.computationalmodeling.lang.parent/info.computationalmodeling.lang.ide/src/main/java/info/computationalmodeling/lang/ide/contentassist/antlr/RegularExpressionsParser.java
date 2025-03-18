/*
 * generated by Xtext 2.29.0
 */
package info.computationalmodeling.lang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import info.computationalmodeling.lang.ide.contentassist.antlr.internal.InternalRegularExpressionsParser;
import info.computationalmodeling.lang.services.RegularExpressionsGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RegularExpressionsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RegularExpressionsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RegularExpressionsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRegularExpression2Access().getAlternatives_1(), "rule__RegularExpression2__Alternatives_1");
			builder.put(grammarAccess.getRegularExpression3Access().getAlternatives(), "rule__RegularExpression3__Alternatives");
			builder.put(grammarAccess.getLetterAccess().getAlternatives(), "rule__Letter__Alternatives");
			builder.put(grammarAccess.getRegExModelAccess().getGroup(), "rule__RegExModel__Group__0");
			builder.put(grammarAccess.getRegExModelAccess().getGroup_5(), "rule__RegExModel__Group_5__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
			builder.put(grammarAccess.getRegularExpressionAccess().getGroup(), "rule__RegularExpression__Group__0");
			builder.put(grammarAccess.getRegularExpressionAccess().getGroup_1(), "rule__RegularExpression__Group_1__0");
			builder.put(grammarAccess.getRegularExpressionAccess().getGroup_1_2(), "rule__RegularExpression__Group_1_2__0");
			builder.put(grammarAccess.getRegularExpression1Access().getGroup(), "rule__RegularExpression1__Group__0");
			builder.put(grammarAccess.getRegularExpression1Access().getGroup_1(), "rule__RegularExpression1__Group_1__0");
			builder.put(grammarAccess.getRegularExpression1Access().getGroup_1_2(), "rule__RegularExpression1__Group_1_2__0");
			builder.put(grammarAccess.getRegularExpression2Access().getGroup(), "rule__RegularExpression2__Group__0");
			builder.put(grammarAccess.getRegularExpression3Access().getGroup_0(), "rule__RegularExpression3__Group_0__0");
			builder.put(grammarAccess.getRegularExpression3Access().getGroup_1(), "rule__RegularExpression3__Group_1__0");
			builder.put(grammarAccess.getRegularExpression3Access().getGroup_2(), "rule__RegularExpression3__Group_2__0");
			builder.put(grammarAccess.getRegularExpression3Access().getGroup_3(), "rule__RegularExpression3__Group_3__0");
			builder.put(grammarAccess.getRegularExpression3Access().getGroup_4(), "rule__RegularExpression3__Group_4__0");
			builder.put(grammarAccess.getReferenceExpressionAccess().getGroup(), "rule__ReferenceExpression__Group__0");
			builder.put(grammarAccess.getRegExModelAccess().getNameAssignment_2(), "rule__RegExModel__NameAssignment_2");
			builder.put(grammarAccess.getRegExModelAccess().getExpressionAssignment_4(), "rule__RegExModel__ExpressionAssignment_4");
			builder.put(grammarAccess.getRegExModelAccess().getDefinitionsAssignment_5_1(), "rule__RegExModel__DefinitionsAssignment_5_1");
			builder.put(grammarAccess.getDefinitionAccess().getSymbolAssignment_0(), "rule__Definition__SymbolAssignment_0");
			builder.put(grammarAccess.getDefinitionAccess().getExpressionAssignment_2(), "rule__Definition__ExpressionAssignment_2");
			builder.put(grammarAccess.getRegularExpressionAccess().getExpressionAssignment_0(), "rule__RegularExpression__ExpressionAssignment_0");
			builder.put(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_1(), "rule__RegularExpression__AlternativesAssignment_1_1");
			builder.put(grammarAccess.getRegularExpressionAccess().getAlternativesAssignment_1_2_1(), "rule__RegularExpression__AlternativesAssignment_1_2_1");
			builder.put(grammarAccess.getRegularExpression1Access().getExpressionAssignment_0(), "rule__RegularExpression1__ExpressionAssignment_0");
			builder.put(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_1(), "rule__RegularExpression1__ConcatenationsAssignment_1_1");
			builder.put(grammarAccess.getRegularExpression1Access().getConcatenationsAssignment_1_2_1(), "rule__RegularExpression1__ConcatenationsAssignment_1_2_1");
			builder.put(grammarAccess.getRegularExpression2Access().getSubexpressionAssignment_0(), "rule__RegularExpression2__SubexpressionAssignment_0");
			builder.put(grammarAccess.getRegularExpression2Access().getKleeneAssignment_1_0(), "rule__RegularExpression2__KleeneAssignment_1_0");
			builder.put(grammarAccess.getRegularExpression2Access().getOmegaAssignment_1_1(), "rule__RegularExpression2__OmegaAssignment_1_1");
			builder.put(grammarAccess.getRegularExpression3Access().getEmptyLangExpressionAssignment_0_1(), "rule__RegularExpression3__EmptyLangExpressionAssignment_0_1");
			builder.put(grammarAccess.getRegularExpression3Access().getEmptyWordExpressionAssignment_1_1(), "rule__RegularExpression3__EmptyWordExpressionAssignment_1_1");
			builder.put(grammarAccess.getRegularExpression3Access().getLetterExpressionAssignment_2_1(), "rule__RegularExpression3__LetterExpressionAssignment_2_1");
			builder.put(grammarAccess.getRegularExpression3Access().getReferenceExpressionAssignment_3_1(), "rule__RegularExpression3__ReferenceExpressionAssignment_3_1");
			builder.put(grammarAccess.getRegularExpression3Access().getExpressionAssignment_4_1(), "rule__RegularExpression3__ExpressionAssignment_4_1");
			builder.put(grammarAccess.getReferenceExpressionAccess().getReferenceAssignment_1(), "rule__ReferenceExpression__ReferenceAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RegularExpressionsGrammarAccess grammarAccess;

	@Override
	protected InternalRegularExpressionsParser createParser() {
		InternalRegularExpressionsParser result = new InternalRegularExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RegularExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RegularExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
