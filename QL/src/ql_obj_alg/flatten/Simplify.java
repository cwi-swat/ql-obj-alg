package ql_obj_alg.flatten;

import ql_obj_alg.syntax.IExpAlg;


interface Unit {
	default boolean isUnitOfAdd() { return false; }
	default boolean isUnitOfMul() { return false; }
	default boolean isUnitOfAnd() { return false; }
	default boolean isUnitOfOr() { return false; }
}

public class Simplify<E> implements IExpAlg<Unit> {

	@Override
	public Unit bracket(Unit e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit lit(int x) {
		return new Unit() {
			@Override
			public boolean isUnitOfAdd() {
				return x == 0;
			}
			@Override
			public boolean isUnitOfMul() {
				return x == 1;
			}
		};
	}

	@Override
	public Unit bool(boolean b) {
		return new Unit() {
			@Override
			public boolean isUnitOfOr() {
				return b == false;
			}
			@Override
			public boolean isUnitOfAnd() {
				return b == true;
			}
		};
	}

	@Override
	public Unit string(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit var(String varName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit not(Unit exp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit mul(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit div(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit add(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit sub(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit eq(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit neq(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit lt(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit leq(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit gt(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit geq(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit and(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Unit or(Unit lhs, Unit rhs) {
		// TODO Auto-generated method stub
		return null;
	}

}
