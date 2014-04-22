package ql_obj_alg.operation.cycles;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CycleDetection implements Iterable<Cycle>{
	private DependencyGraph dependencyG;
	private Path path;
	private List<Cycle> cycles;
	
	public CycleDetection(DependencyGraph dependencyG){
		this.dependencyG = dependencyG;
		this.path = new Path();
		this.cycles = new LinkedList<Cycle>();
	}
	
	public void detectCycles(){
		for(String node : dependencyG){
			if(!path.alreadyVisited(node)){
				visit(node);
			}
		}
	}
	
	private void visit(String node) {
		if(path.contains(node)){
			saveCycle(node);
			return;
		}
		
		if(path.alreadyVisited(node))
			return;
		
		path.add(node);
		for(String edge : dependencyG.getNodeDependencies(node)){
				visit(edge);
		}
		path.remove(node);
	}

	private void saveCycle(String node) {
		cycles.add(path.getCycle(node));
	}
	
	public void printCycles(){
		for(Cycle cycle : cycles){
			System.out.println(cycle.toString());
		}
	}

	@Override
	public Iterator<Cycle> iterator() {
		return cycles.iterator();
	}
}
