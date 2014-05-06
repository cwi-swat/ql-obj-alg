package ql_obj_alg_extended.eval;

import java.util.List;

import ql_obj_alg.eval.ExprEvaluator;
import ql_obj_alg.eval.IDepsAndEvalE;
import ql_obj_alg.eval.ValueEnvironment;
import ql_obj_alg.eval.values.VInteger;
import ql_obj_alg.eval.values.VUndefined;
import ql_obj_alg.eval.values.Value;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprEvaluatorWithModulo extends ExprEvaluator implements IExpAlgWithModulo<IDepsAndEvalE> {

	@Override
	public IDepsAndEvalE mod(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}

			@Override
			public Value eval(ValueEnvironment arg0) {
				Value v1 = lhs.eval(arg0);
				Value v2 = rhs.eval(arg0);
				if(!v1.isUndefined() && !v2.isUndefined()){
					return new VInteger(v1.getInteger() % v2.getInteger());
				}
				return new VUndefined();
			}
			
		};
	}

}
