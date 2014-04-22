package ql_obj_alg.operation.cycles;

import ql_obj_alg.operation.cycles.graph_operations.FillDependencyGraph;

public interface IExpDependency {
	Dependencies dependency(FillDependencyGraph dependencyGraph);
}
