package ql_obj_alg.cycles;

import java.util.Stack;

public class FillDependencyGraph {
	private Stack<Dependencies> currentDependencies;
	private DependencyGraph dependencyGraph;
	
	public FillDependencyGraph(){
		currentDependencies = new Stack<Dependencies>();
		dependencyGraph = new DependencyGraph();
	}
	
	public void newDefinitionDependencyLevel() {
		currentDependencies.push(new Dependencies());		
	}
	
	public void revert(){
		currentDependencies.pop();
	}
	
	public void addNodeToDependOn(String var){
		currentDependencies.peek().add(var);
	}

	public void addNodesToDependOn(Dependencies dependency) {
		currentDependencies.peek().addAll(dependency.toSet());	
	}
	
	public void addDefinitionDependentNode(String var){
		dependencyGraph.addDefinitionDependecies(var,getCurrentDependencies());
	}
	
	public void addValueDependentNode(String var, Dependencies dependencies){
		dependencyGraph.addValueDependecies(var,dependencies);
	}

	private Dependencies getCurrentDependencies() {
		Dependencies dependencies = new Dependencies();
		for(Dependencies d : currentDependencies)
			dependencies.addAll(d);
		return dependencies;
	}
	
	public DependencyGraph getGraph(){
		return dependencyGraph;
	}
}
