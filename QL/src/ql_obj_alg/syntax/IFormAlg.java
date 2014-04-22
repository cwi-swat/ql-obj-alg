package ql_obj_alg.syntax;

import java.util.List;

import noa.annos.Syntax;

public interface IFormAlg<E, S, F> {
	
	@Syntax("'form' ID '{' _* '}'")
	F form(String id, List<S> statements);
}
