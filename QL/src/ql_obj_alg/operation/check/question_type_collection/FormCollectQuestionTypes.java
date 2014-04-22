package ql_obj_alg.operation.check.question_type_collection;

import java.util.List;

import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.types.TypeEnvironment;

public class FormCollectQuestionTypes implements
		IFormAlg<Object, ICollect, ICollect> {

	@Override
	public ICollect form(final String id, final List<ICollect> statements) {
		return new ICollect(){
			public void collect(TypeEnvironment typeEnv, ErrorReporting report){
				for(ICollect stmt : statements)
				stmt.collect(typeEnv,report);
			}
		};
	}
}
