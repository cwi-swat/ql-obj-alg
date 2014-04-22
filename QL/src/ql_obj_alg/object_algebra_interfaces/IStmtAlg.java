package ql_obj_alg.object_algebra_interfaces;

import java.util.List;

import noa.annos.Syntax;
import ql_obj_alg.types.Type;

public interface IStmtAlg<E, S>  {
	@Syntax("'if' '(' _ ')' _*")
	S iff(E cond, List<S> statements);
	
	@Syntax("'if' '(' _ ')' _* 'else' _*")
	S iffelse(E cond, List<S> statementsIf, List<S> statementsElse);

	@Syntax("ID ':' STRING TYPE")
	S question(String id, String label, Type type);
	
	@Syntax("ID ':' STRING TYPE '=' '(' _ ')'")
	S question(String id, String label, Type type, E exp);
}
