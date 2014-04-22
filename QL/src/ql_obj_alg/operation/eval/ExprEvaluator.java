package ql_obj_alg.operation.eval;

import java.util.ArrayList;
import java.util.List;

import ql_obj_alg.operation.eval.value.VBoolean;
import ql_obj_alg.operation.eval.value.VInteger;
import ql_obj_alg.operation.eval.value.VString;
import ql_obj_alg.operation.eval.value.Value;
import ql_obj_alg.syntax.IExpAlg;

public class ExprEvaluator implements IExpAlg<IDepsAndEvalE>{

	@Override
	public IDepsAndEvalE lit(final int x) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				return new VInteger(x);
			}

			@Override
			public List<String> deps() {
				return new ArrayList<String>();
			}	
		};
	}

	@Override
	public IDepsAndEvalE bool(final boolean b) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				return new VBoolean(b);
			}

			@Override
			public List<String> deps() {
				return new ArrayList<String>();
			}	
		};
	}

	@Override
	public IDepsAndEvalE string(final String s) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				return new VString(s);
			}

			@Override
			public List<String> deps() {
				return new ArrayList<String>();
			}	
		};
	}

	@Override
	public IDepsAndEvalE var(final String varName) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				return valEnv.getQuestionValue(varName);
			}

			@Override
			public List<String> deps() {
				List<String> list = new ArrayList<String>();
				list.add(varName);
				return list;
			}	
		};
	}

	@Override
	public IDepsAndEvalE mul(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.mul(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}	
		};
	}

	@Override
	public IDepsAndEvalE div(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.div(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE add(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.add(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE sub(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.min(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE eq(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.eq(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE neq(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.neq(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE lt(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.lt(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE leq(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.leq(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE gt(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.gt(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE geq(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.geq(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE not(final IDepsAndEvalE exp) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v = exp.eval(valEnv);
				return v.not();
			}

			@Override
			public List<String> deps() {
				return exp.deps();
			}
		};
	}

	@Override
	public IDepsAndEvalE and(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.and(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	@Override
	public IDepsAndEvalE or(final IDepsAndEvalE lhs, final IDepsAndEvalE rhs) {
		return new IDepsAndEvalE(){
			@Override
			public Value eval(ValueEnvironment valEnv) {
				Value v1 = lhs.eval(valEnv);
				Value v2 = rhs.eval(valEnv);
				return v1.or(v2);
			}

			@Override
			public List<String> deps() {
				return unionLists(lhs.deps(),rhs.deps());
			}
		};
	}

	protected List<String> unionLists(List<String> list1, List<String> list2){
		list1.addAll(list2);
		return list1;		
	}

	@Override
	public IDepsAndEvalE bracket(IDepsAndEvalE e) {
		return new IDepsAndEvalE() {
			
			@Override
			public Value eval(ValueEnvironment valEnv) {
				return e.eval(valEnv);
			}
			
			@Override
			public List<String> deps() {
				return e.deps();
			}
		};
	}
}
