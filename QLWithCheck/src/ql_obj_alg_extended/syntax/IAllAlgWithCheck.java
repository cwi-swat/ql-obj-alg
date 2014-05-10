package ql_obj_alg_extended.syntax;

import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;

public interface IAllAlgWithCheck<E,S,F> extends IExpAlgWithCheck<E>, IExpAlg<E>, IStmtAlgWithCheck<E,S>, IStmtAlg<E,S>, IFormAlg<E,S,F> {

}
