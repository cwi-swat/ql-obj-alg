package ql_obj_alg.operation.createUI;

import java.util.List;

import ql_obj_alg.operation.evaluator.IDepsAndEvalE;
import ql_obj_alg.operation.evaluator.ValueEnvironment;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.user_interface.modules.FormFrame;

public class FormUI<V extends IExpAlg<IDepsAndEvalE>> implements IFormAlg<IDepsAndEvalE,ICreate,ICreateF>{

	private V expAlg;
	public FormUI(V expAlg){
		this.expAlg = expAlg;
	}
	
	@Override
	public ICreateF form(final String id, final List<ICreate> s) {
		return new ICreateF(){
			@Override
			public void create(final ValueEnvironment valEnv) {
				final FormFrame frame = new FormFrame(id);
				for(ICreate stmt : s){
					stmt.create(frame,valEnv, expAlg.bool(true));
				}
				frame.render();
			}
		};
	}

}

