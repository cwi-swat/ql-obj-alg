package composition;

import java.util.Map;

public class Exec<V extends ExpAlg<IEval>> implements StmtAlg<IEval, IExec>, ExpAlg<IEval> {
	
	protected V exp;
	
	public Exec(V exp) {
		this.exp = exp;
	}
	
	@Override
	public IExec assign(String x, IEval e) {
		return new IExec() {
			
			@Override
			public void exec(Map<String, Integer> store) {
				store.put(x, e.eval());
			}
		};
	}

	@Override
	public IEval add(IEval l, IEval r) {
		return exp.add(l, r);
	}

	@Override
	public IEval lit(int x) {
		return exp.lit(x);
	}
}
