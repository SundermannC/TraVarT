package at.jku.cps.travart.core.formats.afm.parser;

// Generated from src/main/java/at/jku/cps/travart/core/formats/afm/parser/AFM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AFMParser}.
 */
public interface AFMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AFMParser#feature_model}.
	 * @param ctx the parse tree
	 */
	void enterFeature_model(AFMParser.Feature_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#feature_model}.
	 * @param ctx the parse tree
	 */
	void exitFeature_model(AFMParser.Feature_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#relationships_block}.
	 * @param ctx the parse tree
	 */
	void enterRelationships_block(AFMParser.Relationships_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#relationships_block}.
	 * @param ctx the parse tree
	 */
	void exitRelationships_block(AFMParser.Relationships_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#relationship_spec}.
	 * @param ctx the parse tree
	 */
	void enterRelationship_spec(AFMParser.Relationship_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#relationship_spec}.
	 * @param ctx the parse tree
	 */
	void exitRelationship_spec(AFMParser.Relationship_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#init_spec}.
	 * @param ctx the parse tree
	 */
	void enterInit_spec(AFMParser.Init_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#init_spec}.
	 * @param ctx the parse tree
	 */
	void exitInit_spec(AFMParser.Init_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void enterCardinality(AFMParser.CardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void exitCardinality(AFMParser.CardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#cardinal_spec}.
	 * @param ctx the parse tree
	 */
	void enterCardinal_spec(AFMParser.Cardinal_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#cardinal_spec}.
	 * @param ctx the parse tree
	 */
	void exitCardinal_spec(AFMParser.Cardinal_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#obligatory_spec}.
	 * @param ctx the parse tree
	 */
	void enterObligatory_spec(AFMParser.Obligatory_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#obligatory_spec}.
	 * @param ctx the parse tree
	 */
	void exitObligatory_spec(AFMParser.Obligatory_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#optional_spec}.
	 * @param ctx the parse tree
	 */
	void enterOptional_spec(AFMParser.Optional_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#optional_spec}.
	 * @param ctx the parse tree
	 */
	void exitOptional_spec(AFMParser.Optional_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#non_cardinal_spec}.
	 * @param ctx the parse tree
	 */
	void enterNon_cardinal_spec(AFMParser.Non_cardinal_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#non_cardinal_spec}.
	 * @param ctx the parse tree
	 */
	void exitNon_cardinal_spec(AFMParser.Non_cardinal_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attributes_block}.
	 * @param ctx the parse tree
	 */
	void enterAttributes_block(AFMParser.Attributes_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attributes_block}.
	 * @param ctx the parse tree
	 */
	void exitAttributes_block(AFMParser.Attributes_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attribute_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_spec(AFMParser.Attribute_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attribute_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_spec(AFMParser.Attribute_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(AFMParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(AFMParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attribute_domain}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_domain(AFMParser.Attribute_domainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attribute_domain}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_domain(AFMParser.Attribute_domainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#discrete_domain_spec}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_domain_spec(AFMParser.Discrete_domain_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#discrete_domain_spec}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_domain_spec(AFMParser.Discrete_domain_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#range_domain_spec}.
	 * @param ctx the parse tree
	 */
	void enterRange_domain_spec(AFMParser.Range_domain_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#range_domain_spec}.
	 * @param ctx the parse tree
	 */
	void exitRange_domain_spec(AFMParser.Range_domain_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#domain_range}.
	 * @param ctx the parse tree
	 */
	void enterDomain_range(AFMParser.Domain_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#domain_range}.
	 * @param ctx the parse tree
	 */
	void exitDomain_range(AFMParser.Domain_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attribute_default_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_default_value(AFMParser.Attribute_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attribute_default_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_default_value(AFMParser.Attribute_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#attribute_null_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_null_value(AFMParser.Attribute_null_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#attribute_null_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_null_value(AFMParser.Attribute_null_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#value_spec}.
	 * @param ctx the parse tree
	 */
	void enterValue_spec(AFMParser.Value_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#value_spec}.
	 * @param ctx the parse tree
	 */
	void exitValue_spec(AFMParser.Value_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#constraints_block}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_block(AFMParser.Constraints_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#constraints_block}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_block(AFMParser.Constraints_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#constraint_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_spec(AFMParser.Constraint_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#constraint_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_spec(AFMParser.Constraint_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#brackets_spec}.
	 * @param ctx the parse tree
	 */
	void enterBrackets_spec(AFMParser.Brackets_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#brackets_spec}.
	 * @param ctx the parse tree
	 */
	void exitBrackets_spec(AFMParser.Brackets_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#simple_spec}.
	 * @param ctx the parse tree
	 */
	void enterSimple_spec(AFMParser.Simple_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#simple_spec}.
	 * @param ctx the parse tree
	 */
	void exitSimple_spec(AFMParser.Simple_specContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExp(AFMParser.ArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExp(AFMParser.ArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(AFMParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(AFMParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(AFMParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(AFMParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterERROR(AFMParser.ERRORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitERROR(AFMParser.ERRORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(AFMParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(AFMParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(AFMParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(AFMParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AFMParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AFMParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExp(AFMParser.LogicalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExp(AFMParser.LogicalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(AFMParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(AFMParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void enterError_expression(AFMParser.Error_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#error_expression}.
	 * @param ctx the parse tree
	 */
	void exitError_expression(AFMParser.Error_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(AFMParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(AFMParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(AFMParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(AFMParser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(AFMParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(AFMParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AFMParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AFMParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AFMParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AFMParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AFMParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AFMParser.VariableContext ctx);
}