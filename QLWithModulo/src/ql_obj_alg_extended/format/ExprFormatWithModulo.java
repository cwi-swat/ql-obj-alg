package ql_obj_alg_extended.format;

import ql_obj_alg.box.BoxAlg;
import ql_obj_alg.box.FormatBox;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.format.ExprFormat;
import ql_obj_alg.format.IFormatWithPrecedence;
import ql_obj_alg.format.IPrecedence;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprFormatWithModulo  implements IExpAlgWithModulo<IFormatWithPrecedence> {

	private ExprPrecedenceWithModulo prec;
	private BoxAlg<IFormat> box;

	public ExprFormatWithModulo(ExprPrecedenceWithModulo prec) {
		this.prec = prec;	
		this.box = new FormatBox();
	}

	@Override
	public IFormatWithPrecedence mod(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myprec = prec.mod(lhs, rhs);
		return new ExprFormat.FP(ExprFormat.binary(box, lhs,rhs,"%",myprec),myprec);
	}

}
