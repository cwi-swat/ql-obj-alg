package ql_obj_alg.render;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import ql_obj_alg.check.types.Type;
import ql_obj_alg.eval.IDepsAndEvalE;
import ql_obj_alg.eval.ValueEnvironment;
import ql_obj_alg.eval.values.VUndefined;
import ql_obj_alg.render.widgets.Widget;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IStmtAlg;

public class StmtUI<V extends IExpAlg<IDepsAndEvalE>> implements IStmtAlg<IDepsAndEvalE,IRender>{

	private V expAlg;

	public StmtUI(V expAlg){
		this.expAlg = expAlg;
	}
	
	@Override
	public IRender iff(final IDepsAndEvalE cond, final List<IRender> statements) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame,final ValueEnvironment valEnv, final Registry registry,
					IDepsAndEvalE condition) {
				for(IRender stmt : statements){
					stmt.render(frame,valEnv,registry, expAlg.and(condition,cond));
				}
			}
		};
	}

	@Override
	public IRender iffelse(final IDepsAndEvalE cond,final List<IRender> statementsIf, final List<IRender> statementsElse) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, final Registry registry,
					IDepsAndEvalE condition) {
				for(IRender stmt : statementsIf){
					stmt.render(frame,valEnv,registry, expAlg.and(cond,condition));
				}

				for(IRender stmt : statementsElse){
					stmt.render(frame,valEnv,registry, expAlg.and(expAlg.not(cond),condition));
				}

			}
		};
	}

	@Override
	public IRender question(final String id, final String label, final Type type) {
		return new IRender(){
			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, final Registry registry,  
					 final IDepsAndEvalE condition) {
				valEnv.setQuestionValue(id, new VUndefined());
				final Widget widget = Widget.create(id,label,type);
				widget.setVisible(condition.eval(valEnv).getBoolean());
				widget.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						valEnv.setQuestionValue(id, widget.getValue());
						registry.notifyObservers(id);
						frame.pack();
					}
				});
				widget.addAnswerableQuestionToFrame(frame);				
				registry.createVisibilityObservers(id, frame, valEnv, widget, condition);
			}
		};
	}

	@Override
	public IRender question(final String id, final String label, final Type type, final IDepsAndEvalE exp) {
		return new IRender(){

			@Override
			public void render(final FormFrame frame, final ValueEnvironment valEnv, final Registry registry, 
					final IDepsAndEvalE condition) {
				valEnv.setQuestionValue(id, new VUndefined());				
				final Widget widget = Widget.create(id,label,type);
				widget.setVisible(condition.eval(valEnv).getBoolean());
				widget.setValue(exp.eval(valEnv));
				widget.addComputedQuestionToFrame(frame);
				registry.createValueObservers(id, exp, frame, valEnv, widget);
				registry.createVisibilityObservers(id, frame, valEnv, widget, condition);			

			}
		};
	}

}
