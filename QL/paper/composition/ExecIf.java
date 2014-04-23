package composition;

import java.util.Map;

public class ExecIf<V extends ExpMulAlg<IEval>> extends Exec<V> implements StmtIfAlg<IEval, IExec>, ExpMulAlg<IEval> {

	public ExecIf(V exp) {
		super(exp);
	}

	@Override
	public IExec ifThen(IEval cond, IExec body) {
		return new IExec() {
			
			@Override
			public void exec(Map<String, Integer> store) {
				if (cond.eval() != 0) {
					body.exec(store);
				}
			}
		};
	}

	@Override
	public IEval mul(IEval l, IEval r) {
		return exp.mul(l, r);
	}

	
}
