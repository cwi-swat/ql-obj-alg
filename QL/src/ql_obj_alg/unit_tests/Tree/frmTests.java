package ql_obj_alg.unit_tests.Tree;

import static org.junit.Assert.assertTrue;

import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;

import ql_obj_alg.parsers.parser.ANTLRParserWrapper;
import ql_obj_alg.parsers.parser.Parser;
import ql_obj_alg.parsers.parser.proxy.Builder;
import ql_obj_alg.unit_tests.Tree.test_algebra.ITest;
import ql_obj_alg.unit_tests.Tree.test_algebra.Tester;

public class frmTests{

	@Test(expected=RecognitionException.class)
	public void testEmptyForm() {
		ITest formAlg = getTestAlgebraObject("form testform { }");
		assertTrue(formAlg.isForm().isTrue());
	}
	
	private static ITest getTestAlgebraObject(String expr){
		ANTLRParserWrapper parserWrapper = new ANTLRParserWrapper();
		parserWrapper.setParseErrors(false);
		Parser parser = new Parser(parserWrapper);
		Builder formBuilder = parser.getForm(expr);
		Tester tester = new Tester();
		return (ITest) formBuilder.build(tester);		
	}
	

}