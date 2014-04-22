package ql_obj_alg.object_algebra_interfaces;

import java.util.List;

import noa.annos.Level;
import noa.annos.Syntax;
import ql_obj_alg.types.Type;

public interface IStmtAlg<E, S>  {
	@Syntax("'if' '(' _ ')' '{' _* '}'") @Level(80)
	S iff(E cond, List<S> statements);
	
	@Syntax("'if' '(' _ ')' '{' _* '}' 'else' '{' _* '}'") @Level(70)
	S iffelse(E cond, List<S> statementsIf, List<S> statementsElse);

	@Syntax("ID ':' STRING TYPE") @Level(30)
	S question(String id, String label, Type type);
	
	@Syntax("ID ':' STRING TYPE '=' '(' _ ')'") @Level(20)
	S question(String id, String label, Type type, E exp);
}
