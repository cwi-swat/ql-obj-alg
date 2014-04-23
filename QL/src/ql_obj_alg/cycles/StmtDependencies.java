package ql_obj_alg.cycles;

import java.util.List;

import ql_obj_alg.check.types.Type;
import ql_obj_alg.syntax.IStmtAlg;

public class StmtDependencies implements
		IStmtAlg<IExpDependency, IDependencyGraph> {

	@Override
	public IDependencyGraph iff(final IExpDependency cond,
			final List<IDependencyGraph> statements) {
		return new IDependencyGraph() {

			@Override
			public void fill(DependencyGraph dependencyGraph,
					Dependencies currentDependencies) {
				Dependencies newDependencies = cond
						.dependency(currentDependencies);

				for (IDependencyGraph stmt : statements) {
					stmt.fill(dependencyGraph, newDependencies);
				}
			}
		};
	}

	@Override
	public IDependencyGraph iffelse(final IExpDependency cond,
			final List<IDependencyGraph> statementsIf,
			final List<IDependencyGraph> statementsElse) {
		return new IDependencyGraph() {

			@Override
			public void fill(DependencyGraph dependencyGraph,
					Dependencies currentDependencies) {

				Dependencies newDependencies = cond
						.dependency(currentDependencies);

				for (IDependencyGraph stmt : statementsIf) {
					stmt.fill(dependencyGraph, newDependencies);
				}

				for (IDependencyGraph stmt : statementsElse) {
					stmt.fill(dependencyGraph, newDependencies);
				}
			}
		};
	}

	@Override
	public IDependencyGraph question(final String id, final String label,
			Type type) {
		return new IDependencyGraph() {

			@Override
			public void fill(DependencyGraph dependencyGraph,
					Dependencies currentDependencies) {
				dependencyGraph.addDefinitionDependecies(id, currentDependencies);
			}
		};
	}

	@Override
	public IDependencyGraph question(final String id, final String label,
			final Type type, final IExpDependency exp) {
		return new IDependencyGraph() {

			@Override
			public void fill(DependencyGraph dependencyGraph,
					Dependencies currentDependencies) {
				dependencyGraph.addDefinitionDependecies(id, currentDependencies);
				dependencyGraph.addValueDependecies(id, exp.dependency(new Dependencies()));
			}
		};
	}
}
