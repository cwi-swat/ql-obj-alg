package ql_obj_alg.operation.check;

import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.types.Type;
import ql_obj_alg.types.TypeEnvironment;

public interface IExpType {
	Type type(TypeEnvironment typeEnv, ErrorReporting report);
}
