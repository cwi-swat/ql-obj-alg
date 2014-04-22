package ql_obj_alg.parsers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ql_obj_alg.box.IFormat;
import ql_obj_alg.object_algebra_interfaces.IAllAlg;
import ql_obj_alg.operation.printer.ExprFormat;
import ql_obj_alg.operation.printer.ExprPrecedence;
import ql_obj_alg.operation.printer.FormFormat;
import ql_obj_alg.operation.printer.StmtFormat;
import ql_obj_alg.operation.typechecker.ExprTypeChecker;
import ql_obj_alg.operation.typechecker.FormTypeChecker;
import ql_obj_alg.operation.typechecker.ITypeCheck;
import ql_obj_alg.operation.typechecker.StmtTypeChecker;
import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.types.TypeEnvironment;
import noa.Builder;

public class TheParser {
	
	public static Builder parse(String s) {
		try {
			return parse(new ByteArrayInputStream(s.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static Builder parse(InputStream input) throws IOException {
		QLLexer lexer = new QLLexer(new ANTLRInputStream(input));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    QLParser qlParser = new QLParser(tokens);
	    IAllAlg builderBuilder = Builder.builderBuilder(IAllAlg.class);
	    qlParser.setBuilder(builderBuilder);
	    qlParser.setErrorHandler(new BailErrorStrategy());
	    qlParser.removeErrorListeners();
		return (Builder) qlParser.f()._f;
	}
 	
	
	public static void main(String[] args) throws IOException {
		Builder b = parse("form x { x: \"bla\" integer = (3) }");
		IFormat formatter = b.build(new FormFormat(), new StmtFormat(), new ExprFormat<>(new ExprPrecedence()));
		ITypeCheck checker = b.build(new FormTypeChecker(), new StmtTypeChecker(), new ExprTypeChecker());
		ErrorReporting errs = new ErrorReporting();
		checker.check(new TypeEnvironment(), errs);
		errs.printErrors();
		StringWriter w = new StringWriter();
		formatter.format(0, true, w);
		System.out.println(w.toString());
	}

}
