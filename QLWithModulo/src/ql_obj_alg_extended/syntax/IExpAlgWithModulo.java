package ql_obj_alg_extended.syntax;

import noa.annos.Level;
import noa.annos.Syntax;


public interface IExpAlgWithModulo<E> {
	@Syntax("exp = exp '%' exp") @Level(100)
	E mod(E lhs, E rhs); 
}
