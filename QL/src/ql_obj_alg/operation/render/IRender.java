package ql_obj_alg.operation.render;

import ql_obj_alg.operation.eval.IDepsAndEvalE;
import ql_obj_alg.operation.eval.ValueEnvironment;
import ql_obj_alg.user_interface.modules.FormFrame;

public interface IRender {
	void render(FormFrame frame, ValueEnvironment valEnv, IDepsAndEvalE condition);
}
