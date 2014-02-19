package ql_obj_alg.operation.builder;

import ql_obj_alg.objectAlgebra.IStmtAlg;

public class StmtBuilder extends ExprBuilder implements IStmtAlg<IBuildE,IBuildS> {

	@Override
	public IBuildS iff(final IBuildE cond, final IBuildS b) {
		if(b != null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return alg.iff(cond.build(alg), b.build(alg));
				}
			};
		}
		return null;
	}

	@Override
	public IBuildS iffelse(final IBuildE cond, final IBuildS b1, final IBuildS b2) {
		if(b1 != null & b2!= null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return alg.iffelse(cond.build(alg), b1.build(alg), b2.build(alg));
				}
			};
		}else if(b1 != null && b2 == null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return alg.iff(cond.build(alg), b1.build(alg));
				}
			};			
		}else if(b2 != null && b1 == null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return alg.iff(alg.not(cond.build(alg)), b2.build(alg));
				}
			};				
		}
		return null;
	}

	@Override
	public IBuildS comp(final IBuildS s1, final IBuildS s2) {
		if(s1 != null && s2 != null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return alg.comp(s1.build(alg), s2.build(alg));
				}
			};
		}else if(s1 != null && s2 == null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return s1.build(alg);
				}
			};			
		}else if(s2 != null && s1 == null){
			return new IBuildS(){
				public <E,S> S build(IStmtAlg<E,S> alg) {
					return s2.build(alg);
				}
			};			
		}
		return null;
	}

	@Override
	public IBuildS question(final String id, final String label, final String type) {
		return new IBuildS(){
			public <E,S> S build(IStmtAlg<E,S> alg) {
				return alg.question(id, label, type);
			}
		};
	}

	@Override
	public IBuildS question(final String id,final  String label,final String type,final IBuildE e) {
		return new IBuildS(){
			public <E,S> S build(IStmtAlg<E,S> alg) {
				return alg.question(id, label, type, e.build(alg));
			}
		};
	}
}
