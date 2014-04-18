package ql_obj_alg.pgen;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ql_obj_alg.pgen.Conventions.*;

public class Rules implements Conventions {
	private Map<String, List<IAlt>> rules;
	private String name;
	private String pkg;
	private Class<?> tokens;
	private Class<?> builder;

	public Rules(String name, String pkg, Class<?> tokens, Class<?> builder) {
		this.name = name;
		this.pkg = pkg;
		this.tokens = tokens;
		this.builder = builder;
		this.rules = new HashMap<String, List<IAlt>>();
	}
	
	public void addAlt(IAlt a) {
		if (!rules.containsKey(a.getNT())) {
			rules.put(a.getNT(), new ArrayList<>());
		}
		rules.get(a.getNT()).add(a);
	}
	
	public void groupByLevel() {
		for (String nt: rules.keySet()) {
			rules.put(nt, groupByLevel(rules.get(nt)));
		}
	}

	private List<IAlt> groupByLevel(List<IAlt> alts) {
		Map<Integer, List<IAlt>> leveled = new HashMap<>();
		for (IAlt a: alts) {
			if (!leveled.containsKey(a.getLevel())) {
				leveled.put(a.getLevel(), new ArrayList<>());
			}
			leveled.get(a.getLevel()).add(a);
		}
		
		for (Integer level: leveled.keySet()) {
			if (level != MAX_PRECEDENCE && leveled.get(level).size() > 1) {
				collapseLevel(leveled, level);
			}
		}
		
		return sortAlternatives(leveled);
	}

	private void collapseLevel(Map<Integer, List<IAlt>> leveled, Integer level) {
		NormalAlt last = null;
		Map<String, String> map = new HashMap<>();
		for (IAlt ia: leveled.get(level)) {
			NormalAlt a = (NormalAlt)ia;
			assertValidInfix(last, a);
			last = a;
			map.put(a.getOperator(), a.getCons());
		}
		leveled.put(level, Arrays.asList(new InfixAlt(last.getNT(), level, map)));
	}

	private List<IAlt> sortAlternatives(Map<Integer, List<IAlt>> leveled) {
		List<IAlt> all = new ArrayList<>();
		for (Integer level: leveled.keySet()) {
			all.addAll(leveled.get(level));
		}
		IAlt[] array = all.toArray(new IAlt[]{});
		Arrays.sort(array);
		return Arrays.asList(array);
	}

	private void assertValidInfix(NormalAlt last, NormalAlt a) {
		if (!a.isInfix()) {
			throw new RuntimeException("Cannot have non-infix prods at same level of precedence");
		}
		if (last != null) {
			if (!last.getLhs().equals(a.getLhs()) || !last.getRhs().equals(a.getRhs())) {
				throw new RuntimeException("Infix prods at same level should have same lhs and rhs");
			}
		}
		if (!a.getLhs().equals(a.getNT()) || !a.getRhs().equals(a.getNT())) {
			throw new RuntimeException("Lhs/rhs must be same as result non-terminal");
		}
	}
	
	public void generate(StringBuilder sb) {
		sb.append("grammar " + name + ";\n"); 
		addHeader(sb);
		addParserMembers(sb);

		for (String nt: rules.keySet()) {
			sb.append(nt + " returns [Object " + valueName(nt) + "]:\n");
			List<IAlt> ntAlts = rules.get(nt);
			int numOfAlts = ntAlts.size();
			for (int i = 0; i < numOfAlts; i++) {
				if (i != 0) {
					sb.append("  | ");
				}
				else {
					sb.append("    ");
				}
				sb.append(ntAlts.get(i) + "\n");
			}
			sb.append("  ;\n\n");
		}
	}

	private void addParserMembers(StringBuilder sb) {
		sb.append("@parser::members{\n");
		sb.append("private " + builder.getName() + " " + BUILDER + ";\n");
		sb.append("public void setBuilder(" + builder.getName() + " " + BUILDER + ") { this." + BUILDER + " = " + BUILDER + "; }\n");
		
		addLiftMethod(sb);
		
		sb.append("}\n");
	}

	private void addLiftMethod(StringBuilder sb) {
		sb.append("private static List<Object> lift(String name, List<?> ctxs) {\n");
		sb.append("  List<Object> l = new ArrayList<Object>();\n");
		sb.append("	for (Object ctx: ctxs) {\n");
		sb.append("		try {\n");
		sb.append("			l.add(ctx.getClass().getField(name).get(ctx));\n");
		sb.append("		} catch (Throwable e) {\n");
		sb.append("			throw new RuntimeException(e);\n");
		sb.append("		}\n");
		sb.append("	}\n");
		sb.append("	return l;\n");
		sb.append("}\n");		
	}

	private void addHeader(StringBuilder sb) {
		sb.append("@header{\n");
		sb.append("package " + pkg + ";\n");
		sb.append("import static " + tokens.getName() + ".*;\n");
		sb.append("}\n");
	}
	
}