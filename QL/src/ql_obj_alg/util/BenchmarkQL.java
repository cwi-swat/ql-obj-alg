package ql_obj_alg.util;

import java.security.InvalidAlgorithmParameterException;

import noa.Builder;
import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.FormFormat;
import ql_obj_alg.format.Format;
import ql_obj_alg.format.StmtFormat;
import ql_obj_alg.parse.TheParser;
import ql_obj_alg.syntax.IAllAlg;

public class BenchmarkQL  {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void benchmark(GenerateBinarySearchForm gen, String label, IAllAlg alg) {
		long total = 0;
		int count = 0;
		for (String src: gen) {
			long nBefore = System.nanoTime();
			TheParser.parse(src, alg);
			long nAfter = System.nanoTime();
			count += 1;
			total += nAfter - nBefore;
		}
		System.out.println(label + ": " + ((1.0 * total) / (1.0 * count)) / 1000000000.0);
	}
	
	public static void main(String[] args) {
		GenerateBinarySearchForm gen = new GenerateBinarySearchForm(0, 10000, 100);
		Format f = new Format(new FormFormat(), new StmtFormat(), new ExprPrecedence());

		// Warm-up
		for (String src: gen) {
			TheParser.parse(src, f);
		}
		
		benchmark(gen, "direct", f);
		benchmark(gen, "builder", Builder.builderBuilder(IAllAlg.class));
		
	}
}
