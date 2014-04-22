package ql_obj_alg.operation.eval;

import java.util.Observable;
import java.util.Observer;

import ql_obj_alg.operation.eval.values.Value;
import ql_obj_alg.user_interface.FormFrame;
import ql_obj_alg.user_interface.widgets.IWidget;

public class ValueObserver implements Observer {
	
	final String id;
	final IDepsAndEvalE e;
	final FormFrame frame;
	final IWidget widget;
	final ValueEnvironment valEnv;
	
	public ValueObserver(String id, IDepsAndEvalE e, FormFrame frame, IWidget widget, ValueEnvironment valEnv){
		this.id = id;
		this.e = e;
		this.frame = frame;
		this.widget = widget;
		this.valEnv = valEnv;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		Value val = e.eval(valEnv);
		valEnv.setQuestionValue(id, val);
		widget.setValue(val);
		valEnv.notifyObservers(id);
		frame.pack();
	}

}
