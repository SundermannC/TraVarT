package at.jku.cps.travart.core.formats.afm.parser;


// Generated from src/main/java/at/jku/cps/travart/afm/decision/parser/AFM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AFMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AFMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AFMParser#feature_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_model(AFMParser.Feature_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#relationships_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationships_block(AFMParser.Relationships_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#relationship_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationship_spec(AFMParser.Relationship_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#init_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_spec(AFMParser.Init_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#cardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinality(AFMParser.CardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#cardinal_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinal_spec(AFMParser.Cardinal_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#obligatory_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObligatory_spec(AFMParser.Obligatory_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#optional_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_spec(AFMParser.Optional_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#non_cardinal_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_cardinal_spec(AFMParser.Non_cardinal_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attributes_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes_block(AFMParser.Attributes_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attribute_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_spec(AFMParser.Attribute_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(AFMParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attribute_domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_domain(AFMParser.Attribute_domainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#discrete_domain_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_domain_spec(AFMParser.Discrete_domain_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#range_domain_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_domain_spec(AFMParser.Range_domain_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#domain_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_range(AFMParser.Domain_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attribute_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_default_value(AFMParser.Attribute_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#attribute_null_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_null_value(AFMParser.Attribute_null_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#value_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_spec(AFMParser.Value_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#constraints_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_block(AFMParser.Constraints_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#constraint_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_spec(AFMParser.Constraint_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#brackets_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets_spec(AFMParser.Brackets_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#simple_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_spec(AFMParser.Simple_specContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExp(AFMParser.ArithmeticExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(AFMParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(AFMParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExp(AFMParser.RelationalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(AFMParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AFMParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExp(AFMParser.LogicalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link AFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(AFMParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(AFMParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operator(AFMParser.Arithmetic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(AFMParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AFMParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AFMParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AFMParser.VariableContext ctx);
}