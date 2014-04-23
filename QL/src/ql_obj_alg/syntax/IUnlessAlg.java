package ql_obj_alg.syntax;

import java.util.List;

public interface IUnlessAlg<E, S> {
	S unless(E cond, List<S> body);
}
