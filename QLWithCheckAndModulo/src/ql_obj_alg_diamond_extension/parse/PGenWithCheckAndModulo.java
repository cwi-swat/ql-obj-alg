package ql_obj_alg_diamond_extension.parse;

import ql_obj_alg_diamond_extension.syntax.IAllAlgWithCheckAndModulo;
import ql_obj_alg_extended.syntax.TokensWithProperty;

public class PGenWithCheckAndModulo {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(TokensWithProperty.class, IAllAlgWithCheckAndModulo.class);
		pgen.generate("QLWithCheckAndModulo", "ql_obj_alg_diamond_extension.parse", "src/ql_obj_alg_diamond_extension/parse/", true);
	}
}
