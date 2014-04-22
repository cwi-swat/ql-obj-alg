package ql_obj_alg.operation.render;

import java.util.List;

import ql_obj_alg.operation.eval.IDepsAndEvalE;
import ql_obj_alg.operation.eval.ValueEnvironment;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.syntax.IFormAlg;
import ql_obj_alg.user_interface.modules.FormFrame;

public class FormUI<V extends IExpAlg<IDepsAndEvalE>> implements IFormAlg<IDepsAndEvalE,IRender,IRenderForm>{

	private V expAlg;
	public FormUI(V expAlg){
		this.expAlg = expAlg;
	}
	
	@Override
	public IRenderForm form(final String id, final List<IRender> s) {
		return new IRenderForm(){
			@Override
			public void render(final ValueEnvironment valEnv) {
				final FormFrame frame = new FormFrame(id);
				for(IRender stmt : s){
					stmt.render(frame,valEnv, expAlg.bool(true));
				}
				frame.render();
			}
		};
	}

}

