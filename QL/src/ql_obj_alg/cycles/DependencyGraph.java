package ql_obj_alg.cycles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DependencyGraph implements Iterable<String>{
	private Map<String,VariableDependency> varDependencies;
	
	public DependencyGraph(){
		this.varDependencies = new HashMap<String,VariableDependency>();
	}

	public void setDefinitionIndependent(String var) {
		getNode(var).removeDefinitionDepedencies();
	}

	public void addDefinitionDependecies(String var, Dependencies dependencies) {
		VariableDependency vd = getNode(var);
		if(dependencies.isEmpty())
			vd.removeDefinitionDepedencies();
		else
			vd.addDefinitionDependencies(dependencies);
		varDependencies.put(var, vd);
	}

	public void addValueDependecies(String var, Dependencies currentDependencies) {
		VariableDependency vd = getNode(var);
		vd.addValueDependencies(currentDependencies);
		varDependencies.put(var, vd);
	}
	
	public Set<String> getNodeDependencies(String var) {
		return getNode(var).getDependenciesToSet();
	}

	@Override
	public Iterator<String> iterator() {
		return varDependencies.keySet().iterator();
	}
	
	
	private VariableDependency getNode(String var){
		VariableDependency vd = varDependencies.get(var);
		if(vd == null){
			vd = new VariableDependency();
		}
		return vd;
	}
}
