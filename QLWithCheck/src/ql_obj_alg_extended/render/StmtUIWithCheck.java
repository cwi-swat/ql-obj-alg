package ql_obj_alg_extended.render;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ql_obj_alg.check.types.Type;
import ql_obj_alg.eval.IDepsAndEvalE;
import ql_obj_alg.eval.ValueEnvironment;
import ql_obj_alg.eval.values.VUndefined;
import ql_obj_alg.render.FormFrame;
import ql_obj_alg.render.IRender;
import ql_obj_alg.render.Registry;
import ql_obj_alg.render.widgets.Widget;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;
import ql_obj_alg_extended.syntax.IStmtAlgWithCheck;

public class StmtUIWithCheck implements IStmtAlgWithCheck<IDepsAndEvalE, IRender> {

	IExpAlgWithCheck<IDepsAndEvalE> expAlg;
	public StmtUIWithCheck(IExpAlgWithCheck<IDepsAndEvalE> expAlg) {
		this.expAlg = expAlg;

	}

	@Override
	public IRender checked_question(final String id, final String label,
			final Type type, final IDepsAndEvalE e) {
		return new IRender() {

			@Override
			public void render(FormFrame frame, ValueEnvironment valEnv,
					Registry registry, IDepsAndEvalE condition) {
				{

					final Widget widget = Widget.create(id, label, type);
					widget.setVisible(condition.eval(valEnv).getBoolean());

					valEnv.setQuestionValue(id, new VUndefined());
					widget.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							valEnv.setQuestionValue(id, widget.getValue());
							if (!e.eval(valEnv).getBoolean()) {
								valEnv.setQuestionValue(id, new VUndefined());
								widget.setValue(new VUndefined());
							}
							registry.notifyObservers(id);
							frame.pack();
						}
					});

					registry.createVisibilityObservers(id, frame, valEnv,
							widget, condition);
					widget.addAnswerableQuestionToFrame(frame);
				}
			}

		};
	}

}
