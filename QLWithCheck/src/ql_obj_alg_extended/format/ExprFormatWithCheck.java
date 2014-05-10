package ql_obj_alg_extended.format;

import ql_obj_alg.format.ExprFormat;
import ql_obj_alg.format.IFormatWithPrecedence;
import ql_obj_alg.format.IPrecedence;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;

public class ExprFormatWithCheck extends ExprFormat<ExprPrecedenceWithCheck> implements IExpAlgWithCheck<IFormatWithPrecedence> {

	public ExprFormatWithCheck(ExprPrecedenceWithCheck myPrec) {
		super(myPrec);
		
	}

	@Override
	public IFormatWithPrecedence property(String varName, String property) {
		IPrecedence myprec = getPrecedence().property(varName, property);
		return new FP(getBox().L(property),myprec);		
	}

}
