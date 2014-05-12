package ql_obj_alg.flatten;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import noa.Builder;
import noa.Union;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.check.types.Type;
import ql_obj_alg.format.ExprFormat;
import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.FormFormat;
import ql_obj_alg.format.IFormatWithPrecedence;
import ql_obj_alg.format.StmtFormat;
import ql_obj_alg.parse.TheParser;
import ql_obj_alg.syntax.IAllAlg;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.util.GenerateBinarySearchForm;

public class Flatten<E, S, F, EA extends IExpAlg<E>, SA extends IStmtAlg<E, S>, FA extends IFormAlg<E, S, F>> 
	implements IStmtAlg<E, IFlatten<E, S>>, IFormAlg<E, IFlatten<E, S>, F> {

	private EA exp;
	private SA stmt;
	private FA form;

	public static void main(String[] args) {
		GenerateBinarySearchForm gen = new GenerateBinarySearchForm(1, 10, 9);
		IExpAlg<IFormatWithPrecedence> expFormat = new ExprFormat<>(new ExprPrecedence());
		StmtFormat stmtFormat = new StmtFormat();
		FormFormat formFormat = new FormFormat();
		Flatten<IFormatWithPrecedence, IFormat, IFormat, 
				IExpAlg<IFormatWithPrecedence>, 
				IStmtAlg<IFormatWithPrecedence, IFormat>, 
				IFormAlg<IFormatWithPrecedence, IFormat, IFormat>> flatten = new Flatten<
				IFormatWithPrecedence, IFormat, IFormat,
				IExpAlg<IFormatWithPrecedence>, IStmtAlg<IFormatWithPrecedence, IFormat>, IFormAlg<IFormatWithPrecedence, IFormat, IFormat>
				>(expFormat, stmtFormat, formFormat);
		for (String src: gen) {
			Builder build = TheParser.parse(src);
			IFormat f = build.build(Union.union(IAllAlg.class, flatten, expFormat));
			StringWriter writer = new StringWriter();
			f.format(0, false, writer);
			System.out.println(writer.toString());
			break;
		}
	}
	
	public Flatten(EA exp, SA stmt, FA form) {
		this.exp = exp;
		this.stmt = stmt;
		this.form = form;
	}
	
	@Override
	public F form(String id, List<IFlatten<E, S>> statements) {
		List<S> ss = new ArrayList<S>();
		for (IFlatten<E, S> s: statements) {
			s.flatten(exp.bool(true), ss);
		}
		return form.form(id, ss);
	}

	@Override
	public IFlatten<E, S> iff(E cond, List<IFlatten<E, S>> statements) {
		return new IFlatten<E, S>() {
			@Override
			public void flatten(E guard, List<S> output) {
				for (IFlatten<E, S> s: statements) {
					s.flatten(exp.and(guard, cond), output);
				}
			}
		};
	}

	@Override
	public IFlatten<E, S> iffelse(E cond, List<IFlatten<E, S>> statementsIf,
			List<IFlatten<E, S>> statementsElse) {
		return new IFlatten<E, S>() {
			@Override
			public void flatten(E guard, List<S> output) {
				for (IFlatten<E, S> s: statementsIf) {
					s.flatten(exp.and(guard, cond), output);
				}
				for (IFlatten<E, S> s: statementsElse) {
					s.flatten(exp.and(guard, exp.not(cond)), output);
				}
			}
		};
	}

	@Override
	public IFlatten<E, S> question(String id, String label, Type type) {
		return new IFlatten<E, S>() {

			@Override
			public void flatten(E guard, List<S> output) {
				output.add(stmt.iff(guard, Collections.singletonList(stmt.question(id, label, type))));
			}
			
		};
	}

	@Override
	public IFlatten<E, S> question(String id, String label, Type type, E exp) {
		return new IFlatten<E, S>() {

			@Override
			public void flatten(E guard, List<S> output) {
				output.add(stmt.iff(guard, Collections.singletonList(stmt.question(id, label, type, exp))));
			}
			
		};
	}

}
