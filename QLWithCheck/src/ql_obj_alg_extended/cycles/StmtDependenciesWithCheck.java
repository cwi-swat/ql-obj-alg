package ql_obj_alg_extended.cycles;

import ql_obj_alg.check.types.Type;
import ql_obj_alg.cycles.Dependencies;
import ql_obj_alg.cycles.DependencyGraph;
import ql_obj_alg.cycles.IDependencyGraph;
import ql_obj_alg.cycles.IExpDependency;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class StmtDependenciesWithCheck implements
		IStmtAlgWithCheck<IExpDependency, IDependencyGraph> {

	@Override
	public IDependencyGraph checked_question(final String id, String label,
			Type type, final IExpDependency check) {
		return new IDependencyGraph(){
			@Override
			public void fill(DependencyGraph dependencyGraph,
					Dependencies currentDependencies) {
				dependencyGraph.addDefinitionDependecies(id, currentDependencies);
				dependencyGraph.addValueDependecies(id, check.dependency(new Dependencies()));
			}
		};
	}
}
