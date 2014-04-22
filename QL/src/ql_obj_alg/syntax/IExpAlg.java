package ql_obj_alg.syntax;

import noa.annos.Level;
import noa.annos.Syntax;

public interface IExpAlg<E>{

	@Syntax("'(' _ ')'")
	E bracket(E e);
	
	@Syntax("INTEGER")
	E lit(int x);
	
	@Syntax("BOOL")
	E bool(boolean b);
	
	@Syntax("STRING")
	E string(String s);
	
	@Syntax("ID")
	E var(String varName);
	
	@Syntax("'!' _") @Level(200)
	E not(E exp);
	
	@Syntax("_ '*' _") @Level(100)
	E mul(E lhs, E rhs);
	
	@Syntax("_ '/' _") @Level(100)
	E div(E lhs, E rhs);
	
	@Syntax("_ '+' _") @Level(90)
	E add(E lhs, E rhs);
	
	@Syntax("_ '-' _") @Level(90)
	E sub(E lhs, E rhs);
	
	@Syntax("_ '==' _") @Level(80)
	E eq(E lhs, E rhs);
	
	@Syntax("_ '!=' _") @Level(80)
	E neq(E lhs, E rhs);
	
	@Syntax("_ '<' _") @Level(80)
	E lt(E lhs, E rhs);
	
	@Syntax("_ '<=' _") @Level(80)
	E leq(E lhs, E rhs);
	
	@Syntax("_ '>' _") @Level(80)
	E gt(E lhs, E rhs);
	
	@Syntax("_ '>=' _") @Level(80)
	E geq(E lhs, E rhs);
	
	@Syntax("_ '&&' _") @Level(70)
	E and(E lhs, E rhs);
	
	@Syntax("_ '||' _") @Level(60)
	E or(E lhs, E rhs);
}
