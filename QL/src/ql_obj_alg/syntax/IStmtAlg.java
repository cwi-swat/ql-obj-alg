package ql_obj_alg.syntax;

import java.util.List;

import noa.annos.Level;
import noa.annos.Syntax;
import ql_obj_alg.check.types.Type;

public interface IStmtAlg<E, S>  {
	@Syntax("stmt = 'if' '(' exp ')' '{' stmt* '}'") @Level(80)
	S iff(E cond, List<S> statements);
	
	@Syntax("stmt = 'if' '(' exp ')' '{' stmt* '}' 'else' '{' stmt* '}'") @Level(70)
	S iffelse(E cond, List<S> statementsIf, List<S> statementsElse);

	@Syntax("stmt = ID ':' STRING TYPE") @Level(30)
	S question(String id, String label, Type type);
	
	@Syntax("stmt = ID ':' STRING TYPE '=' '(' exp ')'") @Level(20)
	S question(String id, String label, Type type, E exp);
}
