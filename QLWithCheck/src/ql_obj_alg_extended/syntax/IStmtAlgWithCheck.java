package ql_obj_alg_extended.syntax;

import noa.annos.Syntax;
import ql_obj_alg.check.types.Type;

public interface IStmtAlgWithCheck<E,S> {
	
	@Syntax("stmt = ID ':' STRING TYPE '$' '(' exp ')'")
	S checked_question(String id, String label, Type type, E e);

}
