package ql_obj_alg.operation.eval;

import java.util.List;

import ql_obj_alg.operation.eval.values.Value;

public interface IDepsAndEvalE {
	Value eval(ValueEnvironment valEnv);
	List<String> deps();
}
