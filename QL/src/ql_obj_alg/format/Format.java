package ql_obj_alg.format;

import java.util.List;

import ql_obj_alg.box.IFormat;
import ql_obj_alg.check.types.Type;
import ql_obj_alg.syntax.IAllAlg;

public class Format  extends ExprFormat<ExprPrecedence> implements IAllAlg<IFormatWithPrecedence, IFormat, IFormat> {

	private FormFormat formatForm;
	private StmtFormat formatStmt;

	public Format(FormFormat formatForm, StmtFormat formatStmt, ExprPrecedence myPrec) {
		super(myPrec);
		this.formatForm = formatForm;
		this.formatStmt = formatStmt;
	}

	@Override
	public IFormat iff(IFormatWithPrecedence cond, List<IFormat> statements) {
		return formatStmt.iff(cond, statements);
	}

	@Override
	public IFormat iffelse(IFormatWithPrecedence cond,
			List<IFormat> statementsIf, List<IFormat> statementsElse) {
		return formatStmt.iffelse(cond, statementsIf, statementsElse);
	}

	@Override
	public IFormat question(String id, String label, Type type) {
		return formatStmt.question(id, label, type);
	}

	@Override
	public IFormat question(String id, String label, Type type,
			IFormatWithPrecedence exp) {
		return formatStmt.question(id, label, type, exp);
	}

	@Override
	public IFormat form(String id, List<IFormat> statements) {
		return formatForm.form(id, statements);
	}

}
