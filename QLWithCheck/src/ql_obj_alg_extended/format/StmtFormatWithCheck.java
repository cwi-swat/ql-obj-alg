package ql_obj_alg_extended.format;

import ql_obj_alg.box.BoxAlg;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.check.types.Type;
import ql_obj_alg.format.IFormatWithPrecedence;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class StmtFormatWithCheck implements IStmtAlgWithCheck<IFormatWithPrecedence,IFormat> {

	private BoxAlg<IFormat> box;

	@Override
	public IFormat checked_question(final String id, final String label, final Type type,
			final IFormatWithPrecedence exp) {
		return box.H(1,box.L(id),box.L(label),box.L(type.toString()), box.L("="), box.H(0, box.L("("), exp, box.L(")")));
	}

}
