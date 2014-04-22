package ql_obj_alg.operation.check;

import java.util.List;

import ql_obj_alg.operation.check.errors.DuplicateQuestionError;
import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.report_system.warnings.DuplicateLabelWarning;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.types.Type;
import ql_obj_alg.types.TypeEnvironment;

public class StmtCollectQuestionTypes implements
		IStmtAlg<Object,ICollect> {
	
	@Override
	public ICollect iff(final Object cond, final List<ICollect> statements) {
		return new ICollect(){
			public void collect(TypeEnvironment typeEnv, ErrorReporting report){
				for(ICollect stmt : statements)
					stmt.collect(typeEnv,report);
			}
		};
	}

	@Override
	public ICollect iffelse(final Object cond, final List<ICollect> statementsIf,
			final List<ICollect> statementsElse) {
		return new ICollect(){
			public void collect(TypeEnvironment typeEnv, ErrorReporting report){
				for(ICollect stmt : statementsIf)
					stmt.collect(typeEnv, report);
				for(ICollect stmt : statementsElse)
					stmt.collect(typeEnv,report);
			}
		};
	}

	@Override
	public ICollect question(final String id, final String label, final Type type) {
		return new ICollect(){
			public void collect(TypeEnvironment typeEnv, ErrorReporting report){
				if(typeEnv.isDefined(id)){
					report.addError(new DuplicateQuestionError(id));
				}
				else{
					typeEnv.define(id, type);
				}
				if(typeEnv.containsLabel(label)){
					report.addWarning(new DuplicateLabelWarning(label));
				}
				else
					typeEnv.addLabel(label);
			}
		};
	}

	@Override
	public ICollect question(final String id, final String label, final Type type,
			final Object exp) {
		return new ICollect(){
			public void collect(TypeEnvironment typeEnv,ErrorReporting report){
				question(id,label,type).collect(typeEnv, report);
			}
		};
	}

}
