package ql_obj_alg.operation.check;

import ql_obj_alg.types.TypeEnvironment;

public interface ICollect {
	void collect(TypeEnvironment typeEnv, ErrorReporting report);
}
