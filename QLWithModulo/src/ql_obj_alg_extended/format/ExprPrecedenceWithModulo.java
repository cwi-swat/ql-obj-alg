package ql_obj_alg_extended.format;

import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.IPrecedence;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprPrecedenceWithModulo extends ExprPrecedence implements IExpAlgWithModulo<IPrecedence> {

	@Override
	public IPrecedence mod(IPrecedence lhs, IPrecedence rhs) {
		return getPrecedence(5);
	}

}
