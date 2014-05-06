package ql_obj_alg_extended.parse;

import java.io.File;

import ql_obj_alg.syntax.Tokens;
import ql_obj_alg_extended.syntax.IAllAlgWithModulo;

public class PGenWithModulo {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(Tokens.class, IAllAlgWithModulo.class);
		pgen.generate("QLWithModulo", "ql_obj_alg_extended.parse", "src"+File.pathSeparator+"ql_obj_alg_extended"+File.pathSeparator+"parse"+File.pathSeparator, true);
	}
}
