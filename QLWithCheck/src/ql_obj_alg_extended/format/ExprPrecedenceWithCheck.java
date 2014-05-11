package ql_obj_alg_extended.format;

import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.IPrecedence;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;

public class ExprPrecedenceWithCheck extends ExprPrecedence implements IExpAlgWithCheck<IPrecedence>{

	@Override
	public IPrecedence property(String property) {
			return getPrecedence(1);
	}
}
