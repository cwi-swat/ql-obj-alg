package ql_obj_alg.check;

import java.util.List;

import ql_obj_alg.syntax.IFormAlg;

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
