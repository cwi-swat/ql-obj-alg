package ql_obj_alg.operation.check;

import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.types.TypeEnvironment;

public interface ITypeCheck {
	void check(TypeEnvironment typeEnv,ErrorReporting report);
}
