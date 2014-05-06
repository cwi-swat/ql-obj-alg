package ql_obj_alg_extended.format;

import ql_obj_alg.format.ExprFormat;
import ql_obj_alg.format.IFormatWithPrecedence;
import ql_obj_alg.format.IPrecedence;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprFormatWithModulo extends ExprFormat<ExprPrecedenceWithModulo> implements IExpAlgWithModulo<IFormatWithPrecedence> {

	public ExprFormatWithModulo(ExprPrecedenceWithModulo prec) {
		super(prec);	
	}

	@Override
	public IFormatWithPrecedence mod(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myprec = getPrecedence().mod(lhs, rhs);
		return new FP(binary(lhs,rhs,"%",myprec),myprec);
	}

}
