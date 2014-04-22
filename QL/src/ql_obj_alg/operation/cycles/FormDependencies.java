package ql_obj_alg.operation.cycles;

import java.util.List;

import ql_obj_alg.operation.cycles.graph_operations.CycleDetection;
import ql_obj_alg.operation.cycles.graph_operations.FillDependencyGraph;
import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.report_system.errors.CyclicDependencyError;
import ql_obj_alg.syntax.IFormAlg;

public class FormDependencies implements
		IFormAlg<IExpDependency, IDependencyGraph, IDetectCycle> {

	@Override
	public IDetectCycle form(final String id, final List<IDependencyGraph> statements) {
		return new IDetectCycle(){
			public void detect(ErrorReporting report){
				
				FillDependencyGraph fillDependencyGraph = new FillDependencyGraph();
				for(IDependencyGraph stmt : statements)
					stmt.dependencies(fillDependencyGraph);
				
				CycleDetection cycleDetection = new CycleDetection(fillDependencyGraph.getGraph());
				cycleDetection.detectCycles();
				for(Cycle cycle : cycleDetection)
					report.addError(new CyclicDependencyError(cycle));
			}
		};
	}
}
