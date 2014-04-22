package ql_obj_alg.operation.check;


import ql_obj_alg.operation.check.errors.ConflictingTypeError;
import ql_obj_alg.operation.check.errors.UndefinedQuestionError;
import ql_obj_alg.operation.check.errors.UnexpectedTypeError;
import ql_obj_alg.operation.check.errors.UnexpectedTypeInBinaryOpError;
import ql_obj_alg.report_system.error_reporting.ErrorReporting;
import ql_obj_alg.syntax.IExpAlg;
import ql_obj_alg.types.TBoolean;
import ql_obj_alg.types.TError;
import ql_obj_alg.types.TInteger;
import ql_obj_alg.types.TNumber;
import ql_obj_alg.types.TString;
import ql_obj_alg.types.Type;
import ql_obj_alg.types.TypeEnvironment;

public class ExprTypeChecker implements IExpAlg<IExpType>{

	@Override
	public IExpType lit(int x) {
		return new IExpType(){
			@Override
			public Type type(TypeEnvironment typeEnv, ErrorReporting report) {
				return new TInteger();
			}
		};
	}

	@Override
	public IExpType bool(boolean b) {
		return new IExpType(){
			@Override
			public Type type(TypeEnvironment typeEnv, ErrorReporting report) {
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType string(String s) {
		return new IExpType(){
			@Override
			public Type type(TypeEnvironment typeEnv, ErrorReporting report) {
				return new TString();
			}
		};
	}

	@Override
	public IExpType var(final String varName) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type t = typeEnv.getType(varName);
				if(t != null)
					return t;
				report.addError(new UndefinedQuestionError(varName));
				return new TError();
			}
		};
	}

	@Override
	public IExpType mul(final IExpType lhs,final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report);
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isNumber() || !typeRhs.isNumber()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TNumber(), typeLhs, typeRhs, "/"));
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType div(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isNumber() || !typeRhs.isNumber()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TNumber(), typeLhs, typeRhs, "/"));
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType add(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isNumber() || !typeRhs.isNumber()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TNumber(), typeLhs, typeRhs, "+"));
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType sub(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isNumber() || !typeRhs.isNumber()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TNumber(), typeLhs, typeRhs, "-"));				
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType eq(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.equals(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, "=="));
					return new TError();
				}
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType neq(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.equals(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, "!="));	
					return new TError();
				}
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType lt(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isComparable(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, "<"));
					return new TError();
				}
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType leq(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isComparable(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, "<="));	
					return new TError();
				}
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType gt(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isComparable(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, ">"));
					return new TError();
				}
				return new TBoolean();
			}
		};
	}

	@Override
	public IExpType geq(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(typeLhs.isComparable(typeRhs)){
					report.addError(new ConflictingTypeError(typeLhs, typeRhs, ">="));
					return new TError();
				}
				return new TBoolean();
			}
		};
	}


	@Override
	public IExpType not(final IExpType a) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type t = a.type(typeEnv, report); 
				if(!t.isBoolean()){
					report.addError(new UnexpectedTypeError(new TBoolean(), t, "!"));
					return new TError();
				}
				return t;
			}
		};
	}

	@Override
	public IExpType and(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isBoolean() || !typeRhs.isBoolean()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TBoolean(), typeLhs, typeRhs, "&&"));
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType or(final IExpType lhs, final IExpType rhs) {
		return new IExpType(){
			public Type type(TypeEnvironment typeEnv, ErrorReporting report){
				Type typeLhs = lhs.type(typeEnv, report); 
				Type typeRhs = rhs.type(typeEnv, report);
				if(!typeLhs.isBoolean() || !typeRhs.isBoolean()){
					report.addError(new UnexpectedTypeInBinaryOpError(new TBoolean(), typeLhs, typeRhs, "||"));
					return new TError();
				}
				return typeLhs.merge(typeRhs);
			}
		};
	}

	@Override
	public IExpType bracket(IExpType e) {
		return new IExpType() {
			
			@Override
			public Type type(TypeEnvironment typeEnv, ErrorReporting report) {
				return e.type(typeEnv, report);
			}
		};
	}
}
