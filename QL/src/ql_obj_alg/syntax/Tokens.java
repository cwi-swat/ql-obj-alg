package ql_obj_alg.syntax;

import noa.annos.Skip;
import noa.annos.Token;
import ql_obj_alg.check.types.Type;

public abstract class Tokens {
	
	@Token("'\"' (('\\\\' [btnr\"\\\\]) | .)*? '\"'")
	public static String string(String x) {
		// todo: unescaping
		return x;
		//return x.substring(1, x.length() - 1);
	}
	
	@Token("[0-9]+")
	public static int integer(String x) {
		return Integer.parseInt(x);
	}
	
	@Token("'true'|'false'")
	public static boolean bool(String x) {
		return Boolean.parseBoolean(x);
	}
	
	@Token("[a-zA-Z][_a-zA-Z0-9]*")
	public static String id(String x) {
		return x;
	}
	
	@Token("'boolean'|'string'|'integer'") 
	public static Type type(String x) {
		return Type.create(x);
	}
	
	@Token("[ \\t\\r\\n]+") @Skip
	abstract void ws();
	
	@Token("'//' .*? '\\n'") @Skip
	abstract void comment();

}
