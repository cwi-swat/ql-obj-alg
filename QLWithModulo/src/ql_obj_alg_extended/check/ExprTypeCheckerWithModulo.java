package ql_obj_alg_extended.check;

import ql_obj_alg.check.ErrorReporting;
import ql_obj_alg.check.IExpType;
import ql_obj_alg.check.TypeEnvironment;
import ql_obj_alg.check.errors.UnexpectedTypeInBinaryOpError;
import ql_obj_alg.check.types.TNumber;
import ql_obj_alg.check.types.Type;
import ql_obj_alg_extended.syntax.IExpAlgWithModulo;

public class ExprTypeCheckerWithModulo implements IExpAlgWithModulo<IExpType> {

	@Override
	public IExpType mod(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){

			@Override
			public Type type(TypeEnvironment tenv, ErrorReporting report) {
				Type t1 = lhs.type(tenv,report);
				Type t2 = rhs.type(tenv,report);
				if(!t1.isNumber() || !t2.isNumber()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TNumber(), t1,t2,"%"));
				}
				return t1.merge(t2);
			}
			
		};
	}

}
