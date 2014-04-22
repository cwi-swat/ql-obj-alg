package ql_obj_alg.operation.cycles;

import ql_obj_alg.syntax.IExpAlg;

public class ExprDependencies implements IExpAlg<IExpDependency>{

	@Override
	public IExpDependency lit(int x) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return new Dependencies();
			}
		};
	}

	@Override
	public IExpDependency bool(boolean b) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return new Dependencies();
			}
		};
	}

	@Override
	public IExpDependency string(String s) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return new Dependencies();
			}
		};
	}

	@Override
	public IExpDependency var(final String s) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				Dependencies newDependencies = new Dependencies();
				newDependencies.add(s);
				return newDependencies;
			}
		};
	}

	@Override
	public IExpDependency mul(final IExpDependency lhs,final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency div(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency add(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency sub(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency eq(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency neq(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency lt(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency leq(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency gt(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency geq(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}


	@Override
	public IExpDependency not(final IExpDependency exp) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				Dependencies newDependencies = new Dependencies();
				newDependencies.addAll(exp.dependency(dependencyGraph));
				return newDependencies;
			}
		};
	}

	@Override
	public IExpDependency and(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}

	@Override
	public IExpDependency or(final IExpDependency lhs, final IExpDependency rhs) {
		return new IExpDependency(){
			public Dependencies dependency(FillDependencyGraph dependencyGraph){
				return unionDependencies(lhs, rhs, dependencyGraph);
			}
		};
	}
	
	protected Dependencies unionDependencies(final IExpDependency lhs,
			final IExpDependency rhs, FillDependencyGraph dependencyGraph) {
		Dependencies newDependencies = new Dependencies();
		newDependencies.addAll(lhs.dependency(dependencyGraph));
		newDependencies.addAll(rhs.dependency(dependencyGraph));
		return newDependencies;
	}

	@Override
	public IExpDependency bracket(IExpDependency e) {
		return new IExpDependency() {

			@Override
			public Dependencies dependency(FillDependencyGraph dependencyGraph) {
				Dependencies newDependencies = new Dependencies();
				newDependencies.addAll(e.dependency(dependencyGraph));
				return newDependencies;
			}
			
		};
	}
}
