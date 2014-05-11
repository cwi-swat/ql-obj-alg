package ql_obj_alg_extended.eval;

import ql_obj_alg.eval.ValueEnvironment;

public class ValueEnvironmentWithCurrentQuestion extends ValueEnvironment {

	private String currentQuestion;

	public void setCurrentQuestion(String id) {
		this.currentQuestion = id;
	}
	
	public String getCurrentQuestion() {
		return currentQuestion;
	}

}
