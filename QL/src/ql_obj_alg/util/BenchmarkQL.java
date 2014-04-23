package ql_obj_alg.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import noa.Builder;
import ql_obj_alg.format.ExprPrecedence;
import ql_obj_alg.format.FormFormat;
import ql_obj_alg.format.Format;
import ql_obj_alg.format.StmtFormat;
import ql_obj_alg.parse.TheParser;
import ql_obj_alg.syntax.IAllAlg;

public class BenchmarkQL  {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void benchmark(int min, int max, int step, String label, IAllAlg alg, IAllAlg realAlg) throws FileNotFoundException {
		GenerateBinarySearchForm gen = new GenerateBinarySearchForm(min, max, step);
		// Warm-up
		for (String src: gen) {
			TheParser.parse(src, alg);
		}
		
		gen = new GenerateBinarySearchForm(min, max, step);
				
		PrintStream output = new PrintStream(new File("resources/benchmark/parse-" + min + "-" + max + "-" + step + "-" + label + ".csv"));
		output.println("size, seconds");
		for (String src: gen) {
			long nBefore = System.nanoTime();
			Object x = TheParser.parse(src, alg);
			if (realAlg != null) {
				((Builder)x).build(realAlg);
			}
			long nAfter = System.nanoTime();
			double time = (1.0 * (nAfter - nBefore)) / 1000000000.0;
			output.println(src.length() + ", " +  String.format("%f", time));
		}
		output.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Format f = new Format(new FormFormat(), new StmtFormat(), new ExprPrecedence());
		benchmark(0, 10000, 10, "direct", f, null);
		benchmark(0, 10000, 10, "builder", Builder.builderBuilder(IAllAlg.class), f);
	}
}
