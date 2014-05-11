package ql_obj_alg_extended.syntax;

import ql_obj_alg.syntax.Tokens;
import noa.annos.Token;

public abstract class TokensWithProperty extends Tokens {

	@Token("'length'|'value'")
	public static String property(String x) {
		return x;
	}
}
