package ql_obj_alg_extended.cycles;

import ql_obj_alg.cycles.Dependencies;
import ql_obj_alg.cycles.IExpDependency;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;

public class ExprDependenciesWithCheck implements IExpAlgWithCheck<IExpDependency>{

	@Override
	public IExpDependency property(String property) {
		return new IExpDependency(){

			@Override
			public Dependencies dependency(Dependencies currentDependencies) {
				return new Dependencies();
			}
			
		};
	}

}
