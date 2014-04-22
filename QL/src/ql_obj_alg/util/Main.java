package ql_obj_alg.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

import noa.Builder;
import noa.NoOp;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.operation.check.ErrorReporting;
import ql_obj_alg.operation.check.ExprTypeChecker;
import ql_obj_alg.operation.check.FormCollectQuestionTypes;
import ql_obj_alg.operation.check.FormTypeChecker;
import ql_obj_alg.operation.check.ICollect;
import ql_obj_alg.operation.check.IExpType;
import ql_obj_alg.operation.check.ITypeCheck;
import ql_obj_alg.operation.check.StmtCollectQuestionTypes;
import ql_obj_alg.operation.check.StmtTypeChecker;
import ql_obj_alg.operation.cycles.ExprDependencies;
import ql_obj_alg.operation.cycles.FormDependencies;
import ql_obj_alg.operation.cycles.IDependencyGraph;
import ql_obj_alg.operation.cycles.IDetectCycle;
import ql_obj_alg.operation.cycles.IExpDependency;
import ql_obj_alg.operation.cycles.StmtDependencies;
import ql_obj_alg.operation.eval.ExprEvaluator;
import ql_obj_alg.operation.eval.IDepsAndEvalE;
import ql_obj_alg.operation.eval.ValueEnvironment;
import ql_obj_alg.operation.format.ExprFormat;
import ql_obj_alg.operation.format.ExprPrecedence;
import ql_obj_alg.operation.format.FormFormat;
import ql_obj_alg.operation.format.StmtFormat;
import ql_obj_alg.operation.render.FormUI;
import ql_obj_alg.operation.render.IRender;
import ql_obj_alg.operation.render.IRenderForm;
import ql_obj_alg.operation.render.StmtUI;
import ql_obj_alg.parse.TheParser;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.types.TypeEnvironment;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	Main ql = new Main();
    	ql.load(args[0]);
    	ql.execute();
    }

	private Builder builder;
    
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
			builder = TheParser.parse(new FileInputStream(inputFile));
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
		StringWriter w = new StringWriter();
		printForm(w, fFormat, sFormat, eFormat);
	}

	protected void printForm(StringWriter w, Object ...algebras) {
		IFormat printingForm = builder.build(algebras);
		printingForm.format(0, false, w);
        System.out.println(w);
	}
	
	private boolean typeCheckerForm(ErrorReporting report) {
		TypeEnvironment typeEnv = new TypeEnvironment();
		IFormAlg<Object,ICollect,ICollect> collectForm = new FormCollectQuestionTypes();
		IStmtAlg<Object,ICollect> collectStmt = new StmtCollectQuestionTypes();
		collectQuestions(report, typeEnv, collectForm, collectStmt, NoOp.noOp(IExpAlg.class));
		checkTypes(report, typeEnv);
		checkCyclicDependencies(report);
		return report.numberOfErrors() == 0;
	}

	private void checkCyclicDependencies(ErrorReporting report) {
		IFormAlg<IExpDependency,IDependencyGraph,IDetectCycle> formDependencies = new FormDependencies();
		IStmtAlg<IExpDependency,IDependencyGraph> stmtDependencies = new StmtDependencies();
		IExpAlg<IExpDependency> expDependencies = new ExprDependencies();
		checkCyclicDependencies(report, formDependencies, stmtDependencies, expDependencies);
	}

	protected void checkCyclicDependencies(ErrorReporting report, Object ...algebras) {
		IDetectCycle cyclesDetection = builder.build(algebras);
		cyclesDetection.detect(report);
	}

	private void checkTypes(ErrorReporting report,
			TypeEnvironment typeEnv) {
		IFormAlg<IExpType,ITypeCheck,ITypeCheck> typeCheckForm = new FormTypeChecker();
		IStmtAlg<IExpType,ITypeCheck> typeCheckStmt = new StmtTypeChecker();
		IExpAlg<IExpType> typeCheckExpr = new ExprTypeChecker();
		checkTypes(report, typeEnv, typeCheckForm, typeCheckStmt, typeCheckExpr);
	}

	protected void checkTypes(ErrorReporting report,
			TypeEnvironment typeEnv, Object ...algebras) {
		ITypeCheck checkTypes = builder.build(algebras);
		checkTypes.check(typeEnv, report);
	}

	protected void collectQuestions(ErrorReporting report,
			TypeEnvironment typeEnv, Object ... algebras) {
		ICollect collectTypes = builder.build(algebras);
		collectTypes.collect(typeEnv,report);
	}
	
	private void runUI(ErrorReporting errorReport){
		IExpAlg<IDepsAndEvalE> expAlg = new ExprEvaluator();
		IStmtAlg<IDepsAndEvalE,IRender> stmtAlg = new StmtUI<IExpAlg<IDepsAndEvalE>>(expAlg);
		IFormAlg<IDepsAndEvalE,IRender,IRenderForm> formAlg = new FormUI<IExpAlg<IDepsAndEvalE>>(expAlg);

		ValueEnvironment valEnv = new ValueEnvironment();
		createUI(valEnv, expAlg, stmtAlg, formAlg);
	}

	protected void createUI(ValueEnvironment valEnv,
			Object ...algebras) {
		builder.<IRenderForm>build(algebras).render(valEnv);
	}
	
}
