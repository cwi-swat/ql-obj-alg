package ql_obj_alg_diamond_extension.syntax;

import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg_extended.syntax.IAllAlgWithCheck;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public interface IAllAlgWithCheckAndModulo<E,S,F> extends IExpAlg<E>,
	 IExpAlgWithModulo<E>, IExpAlgWithCheck<E>, IStmtAlg<E, S>,
		IAllAlgWithCheck<E, S, F>, IFormAlg<E, S, F> {

}
