package ql_obj_alg_extended.parse;

import ql_obj_alg_extended.syntax.IAllAlgWithCheck;
import ql_obj_alg_extended.syntax.TokensWithProperty;

public class PGenWithCheck {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(TokensWithProperty.class, IAllAlgWithCheck.class);
		pgen.generate("QLWithCheck", "ql_obj_alg_extended.parse", "src/ql_obj_alg_extended/parse/", true);
	}
}
