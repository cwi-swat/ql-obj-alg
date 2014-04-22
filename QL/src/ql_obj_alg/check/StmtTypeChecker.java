package ql_obj_alg.check;


import java.util.List;

import ql_obj_alg.check.errors.ConflictingTypeInAssignmentError;
import ql_obj_alg.check.errors.UnexpectedTypeError;
import ql_obj_alg.check.types.TBoolean;
import ql_obj_alg.check.types.Type;
import ql_obj_alg.syntax.IStmtAlg;

public class StmtTypeChecker implements
		IStmtAlg<IExpType, ITypeCheck> {

	@Override
	public ITypeCheck iff(final IExpType cond, final List<ITypeCheck> statements) {
		return new ITypeCheck(){
			public void check(TypeEnvironment typeEnv, ErrorReporting report){
				Type type = cond.type(typeEnv,report); 
				if(!type.isBoolean()){
					report.addError(new UnexpectedTypeError(new TBoolean(), type, "if-then"));
				}
				for(ITypeCheck stmt : statements)
					stmt.check(typeEnv,report);
			}
		};
	}

	@Override
	public ITypeCheck iffelse(final IExpType cond, final List<ITypeCheck> statementsIf,
			final List<ITypeCheck> statementsElse) {
		return new ITypeCheck(){
			public void check(TypeEnvironment typeEnv, ErrorReporting report){
				Type type = cond.type(typeEnv,report); 
				if(!type.isBoolean()){
					report.addError(new UnexpectedTypeError(new TBoolean(), type, "if-then-else"));
				}
				for(ITypeCheck stmt : statementsIf)
					stmt.check(typeEnv,report);
				for(ITypeCheck stmt : statementsElse)
					stmt.check(typeEnv,report);
			}
		};
	}

	@Override
	public ITypeCheck question(final String id, final String label, final Type type) {
		return new ITypeCheck(){
			public void check(TypeEnvironment typeEnv, ErrorReporting report){
				Type type = typeEnv.getType(id);
				if(type == null) 
					assert(false) : "Missing question with id "+id+" from memory.";
			}
		};
	}

	@Override
	public ITypeCheck question(final String id, final String label, final Type type,
			final IExpType exp) {
		return new ITypeCheck(){
			public void check(TypeEnvironment typeEnv, ErrorReporting report){

				ITypeCheck ordQuestion = question(id,label,type);
				ordQuestion.check(typeEnv,report);

				Type exprType = exp.type(typeEnv,report); 
				if(!exprType.equals(type)){
					report.addError(new ConflictingTypeInAssignmentError(type, exprType,id));
				}

			}
		};
	}

}
