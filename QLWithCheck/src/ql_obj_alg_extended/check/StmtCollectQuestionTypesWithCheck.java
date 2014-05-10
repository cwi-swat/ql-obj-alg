package ql_obj_alg_extended.check;

import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.ICollect;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.check.errors.DuplicateQuestionError;
import ql_obj_alg.check.types.Type;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class StmtCollectQuestionTypesWithCheck implements
		IStmtAlgWithCheck<Object,ICollect> {

	@Override
	public ICollect checked_question(final String id, final String label, final Type type,
			final Object e) {
		return new ICollect(){
			public void collect(TypeEnvironment tenv,ErrorReporting report){
				if(tenv.isDefined(id)){
					report.addError(new DuplicateQuestionError(id));
				}
				else{
					tenv.define(id, type);
				}
			}
		};
	}

}
