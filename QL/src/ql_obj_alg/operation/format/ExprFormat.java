package ql_obj_alg.operation.format;

import java.io.StringWriter;

import ql_obj_alg.box.BoxAlg;
import ql_obj_alg.box.FormatBox;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.syntax.IExpAlg;

public class ExprFormat<V extends IExpAlg<IPrecedence>> implements IExpAlg<IFormatWithPrecedence> {

	private BoxAlg<IFormat> box;
	private V prec;

	public ExprFormat(V myPrec) {
		this.box = new FormatBox();
		this.prec = myPrec;
	}

	protected V getPrecedence(){
		return prec;
	}
	
	protected BoxAlg<IFormat> getBox(){
		return box;
	}

	protected static class FP implements IFormatWithPrecedence {
		private IFormat f;
		private IPrecedence p;

		public FP(IFormat f, IPrecedence p) {
			this.f = f;
			this.p = p;
		}

		@Override
		public void format(int indent, boolean vert, StringWriter writer) {
			f.format(indent, vert, writer);
		}
		
		@Override
		public int prec() {
			return p.prec();
		}
	}
	protected IFormat binary(IFormatWithPrecedence l, IFormatWithPrecedence r, 
			String op, IPrecedence myPrec) {
		return box.H(1,parens(myPrec, l), box.L(op), parens(myPrec, r));
	}
	
	protected IFormat unary(IFormatWithPrecedence l, String op, IPrecedence myPrec) {
		return box.H(1,box.L(op), parens(myPrec, l));
	}


	private IFormat parens(IPrecedence parent, IFormatWithPrecedence kid) {
		if (kid.prec() > parent.prec()) {
			return box.H(box.L("("), kid, box.L(")"));
		}
		return kid;
	}

	@Override
	public IFormatWithPrecedence lit(int x) {
		return new FP(box.L(""+x),prec.lit(x));
	}


	@Override
	public IFormatWithPrecedence bool(boolean b) {
		return new FP(box.L(""+b),prec.bool(b));
	}


	@Override
	public IFormatWithPrecedence string(String s) {
		return new FP(box.L(s),prec.string(s));
	}


	@Override
	public IFormatWithPrecedence var(String varName) {
		return new FP(box.L(varName),prec.string(varName));
	}


	@Override
	public IFormatWithPrecedence mul(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.mul(lhs, rhs);
		return new FP(binary(lhs,rhs,"*",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence div(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.div(lhs, rhs);
		return new FP(binary(lhs,rhs,"/",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence add(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.add(lhs, rhs);
		return new FP(binary(lhs,rhs,"+",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence sub(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.sub(lhs, rhs);
		return new FP(binary(lhs,rhs,"-",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence eq(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.eq(lhs, rhs);
		return new FP(binary(lhs,rhs,"==",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence neq(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.neq(lhs, rhs);
		return new FP(binary(lhs,rhs,"!=",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence lt(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.lt(lhs, rhs);
		return new FP(binary(lhs,rhs,"<",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence leq(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.leq(lhs, rhs);
		return new FP(binary(lhs,rhs,"<=",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence gt(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.gt(lhs, rhs);
		return new FP(binary(lhs,rhs,">",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence geq(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.geq(lhs, rhs);
		return new FP(binary(lhs,rhs,">=",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence not(IFormatWithPrecedence exp) {
		IPrecedence myPrec = prec.not(exp);
		return new FP(unary(exp,"!",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence and(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.and(lhs, rhs);
		return new FP(binary(lhs,rhs,"&&",myPrec),myPrec);
	}


	@Override
	public IFormatWithPrecedence or(IFormatWithPrecedence lhs,
			IFormatWithPrecedence rhs) {
		IPrecedence myPrec = prec.mul(lhs, rhs);
		return new FP(binary(lhs,rhs,"||",myPrec),myPrec);
	}

	@Override
	public IFormatWithPrecedence bracket(IFormatWithPrecedence e) {
		IPrecedence myPrec = prec.bracket(e);
		return new FP(box.H(box.L("("), e, box.L(")")), myPrec);
	};

}