package ql_obj_alg.operation.cycles.modules;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Dependencies {
	private Set<String> nodes;
	
	public Dependencies(){
		this.nodes = new HashSet<String>();
	}

	public void setIndependent() {
		nodes = null;
	}
	
	public boolean isIndependent(){
		return nodes == null;
	}
	
	public boolean isEmpty(){
		return nodes.isEmpty();
	}
	
	public void add(String node){
		if(!isIndependent())
			nodes.add(node);
	}
	
	
	public void addAll(Collection<String> dependencies){
		if(!isIndependent())
			this.nodes.addAll(dependencies);
	}
	
	public void addAll(Dependencies dependencies){
		if(!isIndependent())
			nodes.addAll(dependencies.toSet());
	}
	
	public Set<String> toSet(){
		if(!isIndependent())
			return nodes;
		return new HashSet<String>();
	}
}
