package ql_obj_alg.operation.render;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import ql_obj_alg.operation.eval.IDepsAndEvalE;
import ql_obj_alg.operation.eval.ValueEnvironment;
import ql_obj_alg.operation.eval.value.VUndefined;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.types.Type;
import ql_obj_alg.user_interface.FormFrame;
import ql_obj_alg.user_interface.widgets.FieldFactory;
import ql_obj_alg.user_interface.widgets.IWidget;

public class StmtUI<V extends IExpAlg<IDepsAndEvalE>> implements IStmtAlg<IDepsAndEvalE,IRender>{

	private V expAlg;

	public StmtUI(V expAlg){
		this.expAlg = expAlg;
	}
	
	@Override
	public IRender iff(final IDepsAndEvalE cond, final List<IRender> statements) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame,final ValueEnvironment valEnv,
					IDepsAndEvalE condition) {
				for(IRender stmt : statements){
					stmt.render(frame,valEnv,expAlg.and(condition,cond));
				}
			}
		};
	}

	@Override
	public IRender iffelse(final IDepsAndEvalE cond,final List<IRender> statementsIf, final List<IRender> statementsElse) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, 
					IDepsAndEvalE condition) {
				for(IRender stmt : statementsIf){
					stmt.render(frame,valEnv,expAlg.and(cond,condition));
				}

				for(IRender stmt : statementsElse){
					stmt.render(frame,valEnv,expAlg.and(expAlg.not(cond),condition));
				}

			}
		};
	}

	@Override
	public IRender question(final String id, final String label, final Type type) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, 
					 final IDepsAndEvalE condition) {
				valEnv.setQuestionValue(id, new VUndefined());
				final IWidget widget = FieldFactory.createField(id,label,type);
				widget.setVisible(condition.eval(valEnv).getBoolean());
				widget.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						valEnv.setQuestionValue(id, widget.getValue());
						valEnv.notifyObservers(id);
						frame.pack();
					}
				});
				widget.addAnswerableQuestionToFrame(frame);				
				valEnv.createVisibilityObservers(id, frame, widget,condition);
			}
		};
	}

	@Override
	public IRender question(final String id, final String label, final Type type, final IDepsAndEvalE exp) {
		return new IRender(){

			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, 
					final IDepsAndEvalE condition) {
				valEnv.setQuestionValue(id, new VUndefined());				
				final IWidget widget = FieldFactory.createField(id,label,type);
				widget.setVisible(condition.eval(valEnv).getBoolean());
				widget.setValue(exp.eval(valEnv));
				widget.addComputedQuestionToFrame(frame);
				valEnv.createValueObservers(id, exp, frame, widget);
				valEnv.createVisibilityObservers(id, frame, widget,condition);			

			}
		};
	}

}
