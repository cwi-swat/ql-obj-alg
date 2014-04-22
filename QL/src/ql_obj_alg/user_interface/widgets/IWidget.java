package ql_obj_alg.user_interface.widgets;

import java.awt.event.ActionListener;

import ql_obj_alg.operation.eval.values.Value;
import ql_obj_alg.types.TBoolean;
import ql_obj_alg.types.TInteger;
import ql_obj_alg.types.TString;
import ql_obj_alg.types.Type;
import ql_obj_alg.user_interface.FormFrame;

public interface IWidget {
	void setValue(Value v);

	Value getValue();

	String getId();

	void addComputedQuestionToFrame(FormFrame frame);

	void addAnswerableQuestionToFrame(FormFrame frame);

	void setVisible(boolean visible);

	void addActionListener(ActionListener al);

	static IWidget create(String id, String label, Type type) {
		assert type != null : "Null type for widget creation.";
		if (type.equals(new TInteger())) {
			return new IntegerWidget(id, label);
		} 
		if (type.equals(new TString())) {
			return new StringWidget(id, label);
		}
		if (type.equals(new TBoolean())) {
			return new BooleanWidget(id, label);
		}
		throw new AssertionError("Unsupported type: " + type);
	}
}