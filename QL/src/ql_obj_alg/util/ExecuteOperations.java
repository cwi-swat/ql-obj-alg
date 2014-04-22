package ql_obj_alg.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;

import noa.Builder;
import noa.NoOp;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.object_algebra_interfaces.IExpAlg;
import ql_obj_alg.object_algebra_interfaces.IFormAlg;
import ql_obj_alg.object_algebra_interfaces.IStmtAlg;
import ql_obj_alg.operation.createUI.FormUI;
import ql_obj_alg.operation.createUI.ICreate;
import ql_obj_alg.operation.createUI.ICreateF;
import ql_obj_alg.operation.createUI.StmtUI;
import ql_obj_alg.operation.cyclic_dependencies.ExprDependencies;
import ql_obj_alg.operation.cyclic_dependencies.FormDependencies;
import ql_obj_alg.operation.cyclic_dependencies.IDependencyGraph;
import ql_obj_alg.operation.cyclic_dependencies.IDetectCycle;
import ql_obj_alg.operation.cyclic_dependencies.IExpDependency;
import ql_obj_alg.operation.cyclic_dependencies.StmtDependencies;
import ql_obj_alg.operation.evaluator.ExprEvaluator;
import ql_obj_alg.operation.evaluator.IDepsAndEvalE;
import ql_obj_alg.operation.evaluator.ValueEnvironment;
import ql_obj_alg.operation.printer.ExprFormat;
import ql_obj_alg.operation.printer.ExprPrecedence;
import ql_obj_alg.operation.printer.FormFormat;
import ql_obj_alg.operation.printer.StmtFormat;
import ql_obj_alg.operation.typechecker.ExprTypeChecker;
import ql_obj_alg.operation.typechecker.FormTypeChecker;
import ql_obj_alg.operation.typechecker.IExpType;
import ql_obj_alg.operation.typechecker.ITypeCheck;
import ql_obj_alg.operation.typechecker.StmtTypeChecker;
import ql_obj_alg.operation.typechecker.question_type_collection.FormCollectQuestionTypes;
import ql_obj_alg.operation.typechecker.question_type_collection.ICollect;
import ql_obj_alg.operation.typechecker.question_type_collection.StmtCollectQuestionTypes;
import ql_obj_alg.parsers.TheParser;
import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.types.TypeEnvironment;

public class ExecuteOperations {
	
    public static void main(String[] args) throws Exception {
    	ExecuteOperations ql = new ExecuteOperations();
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
		assert typeCheckerForm(errorReport) : "There are type errors in the form";
		IExpAlg<IDepsAndEvalE> expAlg = new ExprEvaluator();
		IStmtAlg<IDepsAndEvalE,ICreate> stmtAlg = new StmtUI<IExpAlg<IDepsAndEvalE>>(expAlg);
		IFormAlg<IDepsAndEvalE,ICreate,ICreateF> formAlg = new FormUI<IExpAlg<IDepsAndEvalE>>(expAlg);

		ValueEnvironment valEnv = new ValueEnvironment();
		createUI(valEnv, expAlg, stmtAlg, formAlg);
	}

	protected void createUI(ValueEnvironment valEnv,
			Object ...algebras) {
		builder.<ICreateF>build(algebras).create(valEnv);
	}
	
}
