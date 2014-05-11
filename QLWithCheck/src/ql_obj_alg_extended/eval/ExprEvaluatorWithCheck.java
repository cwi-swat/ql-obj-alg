package ql_obj_alg_extended.eval;

import java.util.Collections;
import java.util.List;

import ql_obj_alg.eval.ExprEvaluator;
import ql_obj_alg.eval.IDepsAndEvalE;
import ql_obj_alg.eval.ValueEnvironment;
import ql_obj_alg.eval.values.VInteger;
import ql_obj_alg.eval.values.Value;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;

public class ExprEvaluatorWithCheck extends ExprEvaluator implements IExpAlgWithCheck<IDepsAndEvalE> {

	@Override
	public IDepsAndEvalE property(final String property) {
		return new IDepsAndEvalE(){

			@Override
			public Value eval(ValueEnvironment valEnv) {
				String varName = ((ValueEnvironmentWithCurrentQuestion)valEnv).getCurrentQuestion();
				switch(property){
					case "value" : return valEnv.getQuestionValue(varName);
					case "length" : return new VInteger(valEnv.getQuestionValue(varName).getString().length());
					default:
						assert false : "invalid property name" + property;
				}
				return null;
			}

			@Override
			public List<String> deps() {
				// Not needed, fortunately
				return Collections.emptyList();
			}
			
		};
	}

}
