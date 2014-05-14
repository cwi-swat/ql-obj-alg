package ql_obj_alg_diamond_extension.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

import noa.NoOp;
import noa.Union;
import ql_obj_alg.app.Main;
import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.ExprTypeChecker;
import ql_obj_alg.check.FormCollectQuestionTypes;
import ql_obj_alg.check.FormTypeChecker;
import ql_obj_alg.check.ICollect;
import ql_obj_alg.check.IExpType;
import ql_obj_alg.check.ITypeCheck;
import ql_obj_alg.check.StmtCollectQuestionTypes;
import ql_obj_alg.check.StmtTypeChecker;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.cycles.ExprDependencies;
import ql_obj_alg.cycles.FormDependencies;
import ql_obj_alg.cycles.IDependencyGraph;
import ql_obj_alg.cycles.IDetectCycle;
import ql_obj_alg.cycles.IExpDependency;
import ql_obj_alg.cycles.StmtDependencies;
import ql_obj_alg.eval.ExprEvaluator;
import ql_obj_alg.eval.IDepsAndEvalE;
import ql_obj_alg.format.ExprFormat;
import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.FormFormat;
import ql_obj_alg.format.StmtFormat;
import ql_obj_alg.render.FormUI;
import ql_obj_alg.render.IRender;
import ql_obj_alg.render.IRenderForm;
import ql_obj_alg.render.Registry;
import ql_obj_alg.render.StmtUI;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg_diamond_extension.parse.TheParser;
import ql_obj_alg_diamond_extension.syntax.IAllAlgWithCheckAndModulo;
import ql_obj_alg_extended.check.ExprTypeCheckerWithCheck;
import ql_obj_alg_extended.check.ExprTypeCheckerWithModulo;
import ql_obj_alg_extended.check.StmtCollectQuestionTypesWithCheck;
import ql_obj_alg_extended.check.StmtTypeCheckerWithCheck;
import ql_obj_alg_extended.check.TypeEnvironmentWithCurrentQuestion;
import ql_obj_alg_extended.cycles.ExprDependenciesWithCheck;
import ql_obj_alg_extended.cycles.ExprDependenciesWithModulo;
import ql_obj_alg_extended.cycles.StmtDependenciesWithCheck;
import ql_obj_alg_extended.eval.ExprEvaluatorWithCheck;
import ql_obj_alg_extended.eval.ExprEvaluatorWithModulo;
import ql_obj_alg_extended.eval.ValueEnvironmentWithCurrentQuestion;
import ql_obj_alg_extended.format.ExprFormatWithCheck;
import ql_obj_alg_extended.format.ExprFormatWithModulo;
import ql_obj_alg_extended.format.ExprPrecedenceWithCheck;
import ql_obj_alg_extended.format.ExprPrecedenceWithModulo;
import ql_obj_alg_extended.format.StmtFormatWithCheck;
import ql_obj_alg_extended.render.StmtUIWithCheck;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class MainWithCheckAndModulo extends Main {

	public static void main(String[] args) throws Exception {
		MainWithCheckAndModulo ql = new MainWithCheckAndModulo();
    	ql.load(args[0]);
    	ql.execute();
    }
   
	public void execute(){
    	ErrorReporting errorReport = new ErrorReporting();
    	if(!typeCheckerForm(errorReport)){
    		errorReport.printErrors();
    		errorReport.printWarnings();
    	}
    	else{
    		printForm();
    		runUI(errorReport);
    	}
	}
    
	protected void load(String inputFile){
		try {
			setBuilder(TheParser.parse(new FileInputStream(inputFile)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	// NB!!!
	@Override
	protected <T> T buildUsing(Object ...algebras) {
		return getBuilder().build(Union.union(IAllAlgWithCheckAndModulo.class, algebras));
	}
   
	private void printForm() {
		FormFormat fFormat = new FormFormat();
		StmtFormat sFormat = new StmtFormat();
		StmtFormatWithCheck sFormatCheck = new StmtFormatWithCheck();
		ExprPrecedence prec = new ExprPrecedence();
		ExprFormat<ExprPrecedence> eFormat = new ExprFormat<ExprPrecedence>(prec);
		ExprPrecedenceWithModulo precMod = new ExprPrecedenceWithModulo();
		ExprFormatWithModulo eFormatMod = new ExprFormatWithModulo(precMod);
		ExprPrecedenceWithCheck precCheck = new ExprPrecedenceWithCheck();
		ExprFormatWithCheck eFormatCheck = new ExprFormatWithCheck(precCheck);
		StringWriter w = new StringWriter();
		printForm(w, fFormat, sFormat, sFormatCheck, eFormat, eFormatMod, eFormatCheck);
	}

	private boolean typeCheckerForm(ErrorReporting report) {
		TypeEnvironmentWithCurrentQuestion typeEnv = new TypeEnvironmentWithCurrentQuestion();
		IFormAlg<Object,ICollect,ICollect> collectForm = new FormCollectQuestionTypes();
		IStmtAlg<Object,ICollect> collectStmt = new StmtCollectQuestionTypes();
		IStmtAlgWithCheck<Object,ICollect> collectStmtCheck = new StmtCollectQuestionTypesWithCheck();
		collectQuestions(report, typeEnv, collectForm, collectStmt, collectStmtCheck, NoOp.noOp(IExpAlg.class), NoOp.noOp(IExpAlgWithModulo.class), NoOp.noOp(IExpAlgWithCheck.class));
		checkTypes(report, typeEnv);
		checkCyclicDependencies(report);
		return report.numberOfErrors() == 0;
	}

	private void checkCyclicDependencies(ErrorReporting report) {
		IFormAlg<IExpDependency,IDependencyGraph,IDetectCycle> formDependencies = new FormDependencies();
		IStmtAlg<IExpDependency,IDependencyGraph> stmtDependencies = new StmtDependencies();
		IStmtAlgWithCheck<IExpDependency,IDependencyGraph> stmtDependenciesCheck = new StmtDependenciesWithCheck();
		IExpAlg<IExpDependency> expDependencies = new ExprDependencies();
		IExpAlgWithModulo<IExpDependency> expModDependencies = new ExprDependenciesWithModulo();
		IExpAlgWithCheck<IExpDependency> expDependenciesCheck = new ExprDependenciesWithCheck();
		checkCyclicDependencies(report, formDependencies, stmtDependencies, stmtDependenciesCheck, expDependencies, expModDependencies, expDependenciesCheck);
	}

	private void checkTypes(ErrorReporting report,
			TypeEnvironment typeEnv) {
		IFormAlg<IExpType,ITypeCheck,ITypeCheck> typeCheckForm = new FormTypeChecker();
		IStmtAlg<IExpType,ITypeCheck> typeCheckStmt = new StmtTypeChecker();
		IStmtAlgWithCheck<IExpType,ITypeCheck> typeCheckStmtCheck = new StmtTypeCheckerWithCheck();
		IExpAlg<IExpType> typeCheckExpr = new ExprTypeChecker();
		IExpAlgWithModulo<IExpType> typeCheckExprMod = new ExprTypeCheckerWithModulo();
		IExpAlgWithCheck<IExpType> typeCheckExprCheck = new ExprTypeCheckerWithCheck();
		checkTypes(report, typeEnv, typeCheckForm, typeCheckStmt, typeCheckStmtCheck, typeCheckExpr, typeCheckExprMod, typeCheckExprCheck);
	}
	
	private void runUI(ErrorReporting errorReport){
		IExpAlg<IDepsAndEvalE> expAlg = new ExprEvaluator();		
		IExpAlgWithModulo<IDepsAndEvalE> modAlg = new ExprEvaluatorWithModulo();
		IExpAlgWithCheck<IDepsAndEvalE> expAlgCheck = new ExprEvaluatorWithCheck();
		IStmtAlg<IDepsAndEvalE,IRender> renderStmt = new StmtUI<IExpAlg<IDepsAndEvalE>>(expAlg);
		IStmtAlgWithCheck<IDepsAndEvalE,IRender> renderStmtCheck = new StmtUIWithCheck();
		IFormAlg<IDepsAndEvalE,IRender,IRenderForm> renderForm = new FormUI<IExpAlg<IDepsAndEvalE>>(expAlg);

		ValueEnvironmentWithCurrentQuestion valEnv = new ValueEnvironmentWithCurrentQuestion();
		Registry registry = new Registry();
		createUI(valEnv, registry, expAlg, modAlg, expAlgCheck, renderStmt, renderStmtCheck, renderForm);
	}

}
