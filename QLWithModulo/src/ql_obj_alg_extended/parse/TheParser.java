package ql_obj_alg_extended.parse;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import noa.Builder;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ql_obj_alg_extended.syntax.IAllAlgWithModulo;

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
		QLWithModuloLexer lexer = new QLWithModuloLexer(new ANTLRInputStream(input));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    QLWithModuloParser qlParser = new QLWithModuloParser(tokens);
	    IAllAlgWithModulo builderBuilder = Builder.builderBuilder(IAllAlgWithModulo.class);
	    qlParser.setBuilder(builderBuilder);
		return (Builder) qlParser.f()._f;
	}
	
	@SuppressWarnings({"unchecked" })
	public static <E, S, F> F parse(InputStream input, IAllAlgWithModulo<E, S, F> alg) throws IOException {
		QLWithModuloLexer lexer = new QLWithModuloLexer(new ANTLRInputStream(input));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    QLWithModuloParser qlParser = new QLWithModuloParser(tokens);
	    qlParser.setBuilder(alg);
		return (F) qlParser.f()._f;
	}
	
	public static <E, S, F> F parse(String s, IAllAlgWithModulo<E, S, F> alg) {
		try {
			return parse(new ByteArrayInputStream(s.getBytes("UTF-8")), alg);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}