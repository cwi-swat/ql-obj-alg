package composition;

public class Eval implements ExpAlg<IEval> {

	@Override
	public IEval add(IEval l, IEval r) {
		return new IEval() {
			
			@Override
			public int eval() {
				return l.eval() + r.eval();
			}
		};
	}

	@Override
	public IEval lit(int x) {
		return new IEval() {
			
			@Override
			public int eval() {
				return x;
			}
		};
	}
	
}
