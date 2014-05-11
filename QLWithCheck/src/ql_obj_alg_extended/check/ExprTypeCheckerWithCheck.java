package ql_obj_alg_extended.check;

import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.IExpType;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.check.types.TError;
import ql_obj_alg.check.types.TInteger;
import ql_obj_alg.check.types.TString;
import ql_obj_alg.check.types.Type;
import ql_obj_alg_extended.check.errors.InvalidPropertyError;
import ql_obj_alg_extended.syntax.IExpAlgWithCheck;

public class ExprTypeCheckerWithCheck implements IExpAlgWithCheck<IExpType> {

	@Override
	public IExpType property(final String property) {
		return new IExpType(){
			@Override
			public Type type(TypeEnvironment typeEnv, ErrorReporting reporting) {
				String varName = ((TypeEnvironmentWithCurrentQuestion)typeEnv).getCurrentQuestion();
				if(property.equals("length")) {
					Type type = typeEnv.getType(varName);
					if (!type.isAlphanumeric()) {
						reporting.addError(new InvalidPropertyError(new TString(),type,varName,property));
						return new TError();
					}
					return new TInteger();
				} else if (property.equals("value")){
					return typeEnv.getType(varName);
				}
				assert (false) : "Unknown property";
				return null;
			}
			
		};
	}
}
