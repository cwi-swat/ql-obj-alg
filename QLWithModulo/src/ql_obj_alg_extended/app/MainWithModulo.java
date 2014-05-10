package ql_obj_alg_extended.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

import noa.NoOp;
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
import ql_obj_alg.eval.ValueEnvironment;
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
import ql_obj_alg_extended.check.ExprTypeCheckerWithModulo;
import ql_obj_alg_extended.cycles.ExprDependenciesWithModulo;
import ql_obj_alg_extended.eval.ExprEvaluatorWithModulo;
import ql_obj_alg_extended.format.ExprFormatWithModulo;
import ql_obj_alg_extended.format.ExprPrecedenceWithModulo;
import ql_obj_alg_extended.parse.TheParser;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class MainWithModulo extends Main{
	
    public static void main(String[] args) throws Exception {
    	MainWithModulo ql = new MainWithModulo();
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
	

   
	private void printForm() {
		FormFormat fFormat = new FormFormat();
		StmtFormat sFormat = new StmtFormat();
		ExprPrecedence prec = new ExprPrecedence();
		ExprFormat<ExprPrecedence> eFormat = new ExprFormat<ExprPrecedence>(prec);
		ExprPrecedenceWithModulo precMod = new ExprPrecedenceWithModulo();
		ExprFormatWithModulo eFormatMod = new ExprFormatWithModulo(precMod);
		StringWriter w = new StringWriter();
		printForm(w, fFormat, sFormat, eFormat,eFormatMod);
	}

	private boolean typeCheckerForm(ErrorReporting report) {
		TypeEnvironment typeEnv = new TypeEnvironment();
		IFormAlg<Object,ICollect,ICollect> collectForm = new FormCollectQuestionTypes();
		IStmtAlg<Object,ICollect> collectStmt = new StmtCollectQuestionTypes();
		collectQuestions(report, typeEnv, collectForm, collectStmt, NoOp.noOp(IExpAlg.class), NoOp.noOp(IExpAlgWithModulo.class));
		checkTypes(report, typeEnv);
		checkCyclicDependencies(report);
		return report.numberOfErrors() == 0;
	}

	private void checkCyclicDependencies(ErrorReporting report) {
		IFormAlg<IExpDependency,IDependencyGraph,IDetectCycle> formDependencies = new FormDependencies();
		IStmtAlg<IExpDependency,IDependencyGraph> stmtDependencies = new StmtDependencies();
		IExpAlg<IExpDependency> expDependencies = new ExprDependencies();
		IExpAlgWithModulo<IExpDependency> expModDependencies = new ExprDependenciesWithModulo();
		checkCyclicDependencies(report, formDependencies, stmtDependencies, expDependencies, expModDependencies);
	}

	private void checkTypes(ErrorReporting report,
			TypeEnvironment typeEnv) {
		IFormAlg<IExpType,ITypeCheck,ITypeCheck> typeCheckForm = new FormTypeChecker();
		IStmtAlg<IExpType,ITypeCheck> typeCheckStmt = new StmtTypeChecker();
		IExpAlg<IExpType> typeCheckExpr = new ExprTypeChecker();
		IExpAlgWithModulo<IExpType> typeCheckModExpr = new ExprTypeCheckerWithModulo();
		checkTypes(report, typeEnv, typeCheckForm, typeCheckStmt, typeCheckExpr, typeCheckModExpr);
	}
	
	private void runUI(ErrorReporting errorReport){
		IExpAlg<IDepsAndEvalE> expAlg = new ExprEvaluator();		
		IExpAlgWithModulo<IDepsAndEvalE> modAlg = new ExprEvaluatorWithModulo();
		IStmtAlg<IDepsAndEvalE,IRender> stmtAlg = new StmtUI<IExpAlg<IDepsAndEvalE>>(expAlg);
		IFormAlg<IDepsAndEvalE,IRender,IRenderForm> formAlg = new FormUI<IExpAlg<IDepsAndEvalE>>(expAlg);

		ValueEnvironment valEnv = new ValueEnvironment();
		Registry registry = new Registry();
		createUI(valEnv, registry, expAlg, modAlg, stmtAlg, formAlg);
	}
	
}