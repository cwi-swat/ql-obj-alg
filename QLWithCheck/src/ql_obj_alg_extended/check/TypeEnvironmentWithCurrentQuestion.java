package ql_obj_alg_extended.check;

import ql_obj_alg.check.TypeEnvironment;

public class TypeEnvironmentWithCurrentQuestion extends TypeEnvironment {
	private String currentQuestion;

	public void setCurrentQuestion(String id) {
		this.currentQuestion = id;
	}
	
	public String getCurrentQuestion() {
		return currentQuestion;
	}
}
