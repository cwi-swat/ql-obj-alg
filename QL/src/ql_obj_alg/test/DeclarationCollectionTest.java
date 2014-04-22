package ql_obj_alg.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.FormCollectQuestionTypes;
import ql_obj_alg.check.FormTypeChecker;
import ql_obj_alg.check.ICollect;
import ql_obj_alg.check.ITypeCheck;
import ql_obj_alg.check.StmtCollectQuestionTypes;
import ql_obj_alg.check.StmtTypeChecker;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.check.errors.DuplicateQuestionError;
import ql_obj_alg.check.errors.GenError;
import ql_obj_alg.check.types.TBoolean;
import ql_obj_alg.check.types.TInteger;
import ql_obj_alg.check.types.TString;
import ql_obj_alg.check.warnings.DuplicateLabelWarning;
import ql_obj_alg.check.warnings.Warning;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;

public class DeclarationCollectionTest extends TestCase{

	FormCollectQuestionTypes fcd;
	StmtCollectQuestionTypes scd;
	ErrorReporting report;
	TypeEnvironment tenv;
	GenError expectedError;
	Warning expectedWarning;
	String question = "duplicated";

	@Before
	public void setUp() throws Exception {
		fcd = new FormCollectQuestionTypes();
		scd = new StmtCollectQuestionTypes();
		tenv = new TypeEnvironment();
		report = new ErrorReporting();
		expectedError = null;
		expectedWarning = null;
	}

	@Test @Ignore
	public void testDuplicates() {
		
		ICollect forms = duplicateQuestionInForm(fcd,scd);
		
		forms.collect(tenv, report);
			
		assertEquals(1,report.numberOfErrors());
		
		expectedError = new DuplicateQuestionError(question);
	
		assertTrue(report.containsError(expectedError));		
	}
	
	private <E,S,F> F duplicateQuestionInForm(IFormAlg<E,S,F> f, IStmtAlg<E,S> s){

		List<S> questions = new ArrayList<S>();
		questions.add(s.question(question, "Prototype", new TInteger()));
		questions.add(s.question(question, "Correct duplicate", new TInteger()));
		questions.add(s.question(question, "Conflicting duplicate", new TBoolean()));

		return f.form("id", questions);
	}
	
	@Test
	public void testCollectoion() {
		
		ICollect forms = collection(fcd,scd);
		
		forms.collect(tenv, report);
			
		assertEquals(0,report.numberOfErrors());
	
		assertTrue(tenv.getType("int").isNumber());		
		
		assertTrue(tenv.getType("bool").isBoolean());		
	
		assertTrue(tenv.getType("str").isAlphanumeric());		
	}
	
	private <E,S,F> F collection(IFormAlg<E,S,F> f, IStmtAlg<E,S> s){
		
		List<S> questions = new ArrayList<S>();
		questions.add(s.question("int", "Integer", new TInteger()));
		questions.add(s.question("bool", "Boolean", new TBoolean()));
		questions.add(s.question("str", "String", new TString()));

		return f.form("id", questions);
	}
	
	@Test
	public void testDuplicateLabels() {
		ICollect collector = duplicateLabels(new FormCollectQuestionTypes(),new StmtCollectQuestionTypes());

		collector.collect(tenv,report);
		
		ITypeCheck form = duplicateLabels(new FormTypeChecker(),new StmtTypeChecker());
		form.check(tenv, report);

		assertEquals(1, report.numberOfWarnings());
				
		assertEquals(0,report.numberOfErrors());
		
		expectedWarning = new DuplicateLabelWarning("label");
		assertTrue(report.containsWarning(expectedWarning));
	}
	
	private static <E,S,F> F duplicateLabels(IFormAlg<E,S,F> f, IStmtAlg<E,S> s){

		List<S> questions = new ArrayList<S>();
		questions.add(s.question("id1", "label", new TBoolean()));
		questions.add(s.question("id2", "label", new TInteger()));
		return f.form("Form id", questions);
	}
}
