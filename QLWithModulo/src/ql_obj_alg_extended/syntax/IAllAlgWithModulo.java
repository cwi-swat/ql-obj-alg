package ql_obj_alg_extended.syntax;

import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;

public interface IAllAlgWithModulo<E,S,F> extends IExpAlgWithModulo<E>, IExpAlg<E>, IStmtAlg<E,S>,IFormAlg<E,S,F> {

}
