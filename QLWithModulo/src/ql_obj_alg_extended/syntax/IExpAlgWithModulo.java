package ql_obj_alg_extended.syntax;

import noa.annos.Level;
import noa.annos.Syntax;
import ql_obj_alg.syntax.IExpAlg;


public interface IExpAlgWithModulo<E> extends IExpAlg<E> {
	@Syntax("_ '%' _") @Level(100)
	E mod(E lhs, E rhs); 
}
