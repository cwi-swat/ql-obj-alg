package ql_obj_alg.user_interface.widgets;

import java.awt.event.ActionListener;

import ql_obj_alg.operation.eval.values.Value;
import ql_obj_alg.user_interface.FormFrame;

public interface IWidget {
	abstract public void setValue(Value v);
	abstract public Value getValue();
	abstract public String getId();
	
	abstract public void addComputedQuestionToFrame(FormFrame frame);
	abstract public void addAnswerableQuestionToFrame(FormFrame frame);
	
	abstract public void setVisible(boolean visible);
	
	abstract public void addActionListener(ActionListener al);

}
