package ql_obj_alg.desugar;

import java.util.List;

import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.syntax.IUnlessAlg;

public class DesugarUnless<E, S, EA extends IExpAlg<E>, SA extends IStmtAlg<E, S>> implements IUnlessAlg<E, S> {
	
	private EA exp;
	private SA stmt;

	public DesugarUnless(EA exp, SA stmt) {
		this.exp = exp;
		this.stmt = stmt;
	}

	@Override
	public S unless(E cond, List<S> body) {
		return stmt.iff(exp.not(cond), body);
	}

}
