package ql_obj_alg_extended.syntax;

import noa.annos.Token;

public interface TokensWithProperty {

	@Token("'length'|'value'")
	public static String property(String x) {
		return x;
	}
}
