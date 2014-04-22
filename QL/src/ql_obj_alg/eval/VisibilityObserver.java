package ql_obj_alg.eval;

import java.util.Observable;
import java.util.Observer;

import ql_obj_alg.eval.values.VUndefined;
import ql_obj_alg.render.FormFrame;
import ql_obj_alg.render.widgets.Widget;

public class VisibilityObserver implements Observer {

	final String id;
	final FormFrame frame;
	final Widget widget;
	final ValueEnvironment valEnv;
	final IDepsAndEvalE condition;
	
	public VisibilityObserver(String id, FormFrame frame, Widget widget, ValueEnvironment valEnv, IDepsAndEvalE condition){
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
