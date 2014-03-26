package ql_obj_alg.operation.cyclic_dependencies.modules.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ql_obj_alg.operation.cyclic_dependencies.modules.Dependencies;
import ql_obj_alg.operation.cyclic_dependencies.modules.VariableDependency;

public class DependencyGraph {
	Map<String,VariableDependency> variables = new HashMap<String,VariableDependency>();


	public void setDefinitionIndependent(String var) {
		getNode(var).removeDefinitionDepedencies();
	}

	public void addDefinitionDependecies(String var, Dependencies dependencies) {
		VariableDependency vd = getNode(var);
		if(dependencies.isEmpty())
			vd.removeDefinitionDepedencies();
		else
			vd.addDefinitionDependencies(dependencies);
		variables.put(var, vd);
	}

	public void addValueDependecies(String var, Dependencies currentDependencies) {
		VariableDependency vd = getNode(var);
		vd.addValueDependencies(currentDependencies);
		variables.put(var, vd);
	}
	
	private VariableDependency getNode(String var){
		VariableDependency vd = variables.get(var);
		if(vd == null){
			vd = new VariableDependency();
		}
		return vd;
	}
	
	public Set<String> getNodes(){
		return variables.keySet();
	}
	
	public Map<String,Dependencies> getDependencies(){
		Map<String,Dependencies> dependent = new HashMap<String,Dependencies>();
		Iterator<String> it = variables.keySet().iterator();
		while(it.hasNext()){
			String var = it.next();
			VariableDependency vd = variables.get(var);
			if(vd.isDependent())
				dependent.put(var,vd.getDependencies());
		}
		return dependent;
	}


	public void print() {
		for (String key : variables.keySet()) {
		    System.out.println(key+" : "+variables.get(key).getDependencies());
		}		
	}

	public Dependencies getNodeDependencies(String var) {
		return getNode(var).getDependencies();
	}
	
	public Set<String> getNodeDependenciesToSet(String var) {
		return getNode(var).getDependenciesToSet();
	}
}