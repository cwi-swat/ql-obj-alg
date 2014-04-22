package ql_obj_alg.parser;

import ql_obj_alg.syntax.IAllAlg;
import ql_obj_alg.syntax.Tokens;

public class PGen {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(Tokens.class, IAllAlg.class);
		pgen.generate("QL", "ql_obj_alg.parser", "src/ql_obj_alg/parsers/", true);
	}
}
