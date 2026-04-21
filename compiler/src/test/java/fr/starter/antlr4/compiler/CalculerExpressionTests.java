package fr.starter.antlr4.compiler;

import fr.starter.antlr4.parser.SampleGrammarLexer;
import fr.starter.antlr4.parser.SampleGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculerExpressionTests {

    @ParameterizedTest
    @CsvFileSource(resources = "data/calcul_test_data.csv")
    void testCalculArithmetique(String expr, String expectedResult){
        SampleGrammarLexer lexer = new SampleGrammarLexer(CharStreams.fromString(expr));
        SampleGrammarParser parser = new SampleGrammarParser(new CommonTokenStream(lexer));
        CalculerExpression visitor = new CalculerExpression();
        assertEquals(visitor.visitProgramm(parser.programm()), Integer.valueOf(expectedResult));
    }
}
