package ql_obj_alg.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ql_obj_alg.test.eval.ExprEvalTests;
import ql_obj_alg.test.operations.CyclicDependenciesTest;
import ql_obj_alg.test.operations.DeclarationCollectionTest;
import ql_obj_alg.test.operations.TypeCheckerTest;

@RunWith(Suite.class)
@SuiteClasses({CyclicDependenciesTest.class,DeclarationCollectionTest.class,TypeCheckerTest.class,ExprEvalTests.class})
public class AllTests {
	

}
