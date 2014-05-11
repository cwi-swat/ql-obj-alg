package ql_obj_alg_extended.cycles;

import ql_obj_alg.cycles.Dependencies;
import ql_obj_alg.cycles.ExprDependencies;
import ql_obj_alg.cycles.IExpDependency;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprDependenciesWithModulo  implements IExpAlgWithModulo<IExpDependency>{

	@Override
	public IExpDependency mod(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			@Override
			public Dependencies dependency(Dependencies currentDependencies) {
				return ExprDependencies.unionDependencies(lhs,rhs,currentDependencies);
			}
		};
	}

}
