package ql_obj_alg.operation.eval;

import java.util.Observable;
import java.util.Observer;

import ql_obj_alg.operation.eval.values.VUndefined;
import ql_obj_alg.user_interface.FormFrame;
import ql_obj_alg.user_interface.widgets.IWidget;

public class VisibilityObserver implements Observer {

	final String id;
	final FormFrame frame;
	final IWidget widget;
	final ValueEnvironment valEnv;
	final IDepsAndEvalE condition;
	
	public VisibilityObserver(String id, FormFrame frame, IWidget widget, ValueEnvironment valEnv, IDepsAndEvalE condition){
		this.id = id;
		this.frame = frame;
		this.widget = widget;
		this.valEnv = valEnv;
		this.condition = condition;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		boolean visible = condition.eval(valEnv).getBoolean();
		if(!visible){
			valEnv.setQuestionValue(id, new VUndefined());
			widget.setValue(new VUndefined());
		}
		widget.setVisible(visible);
		valEnv.notifyObservers(id);
		frame.pack();
	}
}
