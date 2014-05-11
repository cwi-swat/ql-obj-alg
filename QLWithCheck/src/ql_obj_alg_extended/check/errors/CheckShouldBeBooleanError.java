package ql_obj_alg_extended.check.errors;

import ql_obj_alg.check.errors.GenError;
import ql_obj_alg.check.types.Type;

public class CheckShouldBeBooleanError extends GenError {

	private String id;
	private Type actualType;

	public CheckShouldBeBooleanError(String id, Type exprType) {
		this.id = id;
		this.actualType = exprType;
	}

	@Override
	public String toString() {
		return "Type of check expression should be boolean, not " + actualType + " (" + id + ")";
	}
}
