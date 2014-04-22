package ql_obj_alg.operation.createUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import ql_obj_alg.operation.evaluator.IDepsAndEvalE;
import ql_obj_alg.operation.evaluator.ValueEnvironment;
import ql_obj_alg.operation.evaluator.value.VUndefined;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IStmtAlg;
import ql_obj_alg.types.Type;
import ql_obj_alg.user_interface.modules.FormFrame;
import ql_obj_alg.user_interface.widgets.FieldFactory;
import ql_obj_alg.user_interface.widgets.IWidget;

public class StmtUI<V extends IExpAlg<IDepsAndEvalE>> implements IStmtAlg<IDepsAndEvalE,ICreate>{

	private V expAlg;

	public StmtUI(V expAlg){
		this.expAlg = expAlg;
	}
	
	@Override
	public ICreate iff(final IDepsAndEvalE cond, final List<ICreate> statements) {
		return new ICreate(){
			@Override
			public void create(final FormFrame frame,final ValueEnvironment valEnv,
					IDepsAndEvalE condition) {
				for(ICreate stmt : statements){
					stmt.create(frame,valEnv,expAlg.and(condition,cond));
				}
			}
		};
	}

	@Override
	public ICreate iffelse(final IDepsAndEvalE cond,final List<ICreate> statementsIf, final List<ICreate> statementsElse) {
		return new ICreate(){
			@Override
			public void create(final FormFrame frame, final ValueEnvironment valEnv, 
					IDepsAndEvalE condition) {
				for(ICreate stmt : statementsIf){
					stmt.create(frame,valEnv,expAlg.and(cond,condition));
				}

				for(ICreate stmt : statementsElse){
					stmt.create(frame,valEnv,expAlg.and(expAlg.not(cond),condition));
				}

			}
		};
	}

	@Override
	public ICreate question(final String id, final String label, final Type type) {
		return new ICreate(){
			@Override
			public void create(final FormFrame frame, final ValueEnvironment valEnv, 
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
	public ICreate question(final String id, final String label, final Type type, final IDepsAndEvalE exp) {
		return new ICreate(){

			@Override
			public void create(final FormFrame frame, final ValueEnvironment valEnv, 
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
