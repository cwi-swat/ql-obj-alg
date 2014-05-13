package ql_obj_alg_double_extention.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import noa.Builder;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ql_obj_alg_double_extention.syntax.IAllAlgWithCheckAndModulo;

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
			QLWithCheckAndModuloLexer lexer = new QLWithCheckAndModuloLexer(new ANTLRInputStream(input));
		    CommonTokenStream tokens = new CommonTokenStream(lexer);
		    QLWithCheckAndModuloParser qlParser = new QLWithCheckAndModuloParser(tokens);
		    IAllAlgWithCheckAndModulo builderBuilder = Builder.builderBuilder(IAllAlgWithCheckAndModulo.class);
		    qlParser.setBuilder(builderBuilder);
			return (Builder) qlParser.form()._form;
		}
		
		@SuppressWarnings({"unchecked" })
		public static <E, S, F> F parse(InputStream input, IAllAlgWithCheckAndModulo<E, S, F> alg) throws IOException {
			QLWithCheckAndModuloLexer lexer = new QLWithCheckAndModuloLexer(new ANTLRInputStream(input));
		    CommonTokenStream tokens = new CommonTokenStream(lexer);
		    QLWithCheckAndModuloParser qlParser = new QLWithCheckAndModuloParser(tokens);
		    qlParser.setBuilder(alg);
			return (F) qlParser.form()._form;
		}
		
		public static <E, S, F> F parse(String s, IAllAlgWithCheckAndModulo<E, S, F> alg) {
			try {
				return parse(new ByteArrayInputStream(s.getBytes("UTF-8")), alg);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}


}
