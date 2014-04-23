package composition;

public class EvalMul extends Eval implements ExpMulAlg<IEval> {

	@Override
	public IEval mul(IEval l, IEval r) {
		return new IEval() {
			
			@Override
			public int eval() {
				return l.eval() * r.eval();
			}
		};
	}

}
