package ql_obj_alg_extended.parse;

import ql_obj_alg.syntax.Tokens;
import ql_obj_alg_extended.syntax.IAllAlgWithModulo;

public class PGenWithModulo {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(Tokens.class, IAllAlgWithModulo.class);
		pgen.generate("QLWithModulo", "ql_obj_alg_extended.parse", "src/ql_obj_alg/parse/", true);
	}
}
