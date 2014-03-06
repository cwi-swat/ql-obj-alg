package ql_obj_alg.operation.user_interface.widgets;

import ql_obj_alg.operation.evaluator.value.Value;
import ql_obj_alg.operation.user_interface.modules.FormFrame;

public interface IWidget {
	Value getValue();
	void addComputedQuestionToFrame(FormFrame frame);
	void setVisible(boolean visible);
	String getId();
	void addAnswerableQuestionToFrame(FormFrame frame);
	boolean isUndefined();
}