package ql_obj_alg.operation.cycles;

import java.util.List;

import ql_obj_alg.operation.cycles.graph_operations.FillDependencyGraph;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.types.Type;

public class StmtDependencies implements
		IStmtAlg<IExpDependency, IDependencyGraph> {
	
	@Override
	public IDependencyGraph iff(final IExpDependency cond, final List<IDependencyGraph> statements) {
		return new IDependencyGraph(){
			public void dependencies(FillDependencyGraph dependencyGraph){
				dependencyGraph.newDefinitionDependencyLevel();
				dependencyGraph.addNodesToDependOn(cond.dependency(dependencyGraph));
				
				for(IDependencyGraph stmt : statements)
					stmt.dependencies(dependencyGraph);
				
				dependencyGraph.revert();
			}
		};
	}

	@Override
	public IDependencyGraph iffelse(final IExpDependency cond, final List<IDependencyGraph> statementsIf,
			final List<IDependencyGraph> statementsElse) {
		return new IDependencyGraph(){
			public void dependencies(FillDependencyGraph dependencyGraph){
				dependencyGraph.newDefinitionDependencyLevel();
				dependencyGraph.addNodesToDependOn(cond.dependency(dependencyGraph));
				
				for(IDependencyGraph stmt : statementsIf)
					stmt.dependencies(dependencyGraph);
				
				for(IDependencyGraph stmt : statementsElse)
					stmt.dependencies(dependencyGraph);
				
				dependencyGraph.revert();
			}
		};
	}

	@Override
	public IDependencyGraph question(final String id, final String label, Type type) {
		return new IDependencyGraph(){
			public void dependencies(FillDependencyGraph dependencyGraph){
				dependencyGraph.addDefinitionDependentNode(id);
			}
		};
	}

	@Override
	public IDependencyGraph question(final String id, final String label, final Type type,
			final IExpDependency exp) {
		return new IDependencyGraph(){
			public void dependencies(FillDependencyGraph dependencyGraph){
				dependencyGraph.addDefinitionDependentNode(id);
				dependencyGraph.addValueDependentNode(id, exp.dependency(dependencyGraph));
			}
		};
	}
}
