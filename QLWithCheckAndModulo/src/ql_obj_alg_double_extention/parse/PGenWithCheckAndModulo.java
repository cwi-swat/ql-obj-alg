package ql_obj_alg_double_extention.parse;

import ql_obj_alg_double_extention.syntax.IAllAlgWithCheckAndModulo;
import ql_obj_alg_extended.syntax.TokensWithProperty;

public class PGenWithCheckAndModulo {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(TokensWithProperty.class, IAllAlgWithCheckAndModulo.class);
		pgen.generate("QLWithCheckAndModulo", "ql_obj_alg_double_extention.parse", "src/ql_obj_alg_double_extention/parse/", true);
	}
}
