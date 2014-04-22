package ql_obj_alg.operation.check;

import ql_obj_alg.operation.check.types.Type;

public interface IExpType {
	Type type(TypeEnvironment typeEnv, ErrorReporting report);
}
