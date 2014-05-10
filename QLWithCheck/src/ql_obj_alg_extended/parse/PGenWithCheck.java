package ql_obj_alg_extended.parse;

import java.io.File;

import ql_obj_alg.syntax.Tokens;
import ql_obj_alg_extended.syntax.IAllAlgWithCheck;
import ql_obj_alg_extended.syntax.TokensWithProperty;

public class PGenWithCheck {
	public static void main(String[] args) {
		noa.PGen pgen = new noa.PGen(IAllAlgWithCheck.class, Tokens.class, TokensWithProperty.class);
		pgen.generate("QLWithCheck", "ql_obj_alg_extended.parse", "src"+File.pathSeparator+"ql_obj_alg_extended"+File.pathSeparator+"parse"+File.pathSeparator, true);
	}
}
