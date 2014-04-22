package ql_obj_alg.operation.check.collect;

import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.types.TypeEnvironment;

public interface ICollect {
	void collect(TypeEnvironment typeEnv, ErrorReporting report);
}
