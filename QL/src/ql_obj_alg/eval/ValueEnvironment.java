package ql_obj_alg.eval;

import java.util.HashMap;
import java.util.Map;

import ql_obj_alg.eval.values.Value;
import ql_obj_alg.render.widgets.ObservableWidget;

public class ValueEnvironment {

	private Map<String,Value> questions;
	private Map<String, ObservableWidget> registry;
	
	public ValueEnvironment(){
		questions = new HashMap<String,Value>();
		registry = new HashMap<String,ObservableWidget>();
	}
	
	public Value getQuestionValue(String id){
		return questions.get(id);
	}

	public void setQuestionValue(String id, Value v){
		questions.put(id,v);
	}	
	
	
}

