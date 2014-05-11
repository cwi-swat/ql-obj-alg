package ql_obj_alg_extended.check;

import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.IExpType;
import ql_obj_alg.check.ITypeCheck;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.check.types.TBoolean;
import ql_obj_alg.check.types.Type;
import ql_obj_alg_extended.check.errors.CheckShouldBeBooleanError;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class StmtTypeCheckerWithCheck implements
		IStmtAlgWithCheck<IExpType, ITypeCheck> {
	
	@Override
	public ITypeCheck checked_question(final String id, final String label, final Type type,
			final IExpType exp) {
		return new ITypeCheck(){
			public void check(TypeEnvironment typeEnv, ErrorReporting report){
				Type type = typeEnv.getType(id);
				assert type != null : "Missing question with id "+id+" from memory.";
				((TypeEnvironmentWithCurrentQuestion)typeEnv).setCurrentQuestion(id);
				Type exprType = exp.type(typeEnv, report); 
				if(!exprType.equals(new TBoolean())){
					report.addError(new CheckShouldBeBooleanError(id, exprType));
				}
			}
		};
	}

}
