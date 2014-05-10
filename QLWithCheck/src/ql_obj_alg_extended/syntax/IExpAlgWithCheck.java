package ql_obj_alg_extended.syntax;

import noa.annos.Syntax;

public interface IExpAlgWithCheck<E> {
	
	@Syntax("exp = PROPERTY")	
	E property(String varName, String property);
}
