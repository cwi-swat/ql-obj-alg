package ql_obj_alg.types;

public abstract class Type {
	public boolean isComparable(Type t){
		return false;
	}
	
	public boolean isOrd(){
		return false;
	}
	
	public boolean isNumber(){
		return false;
	}
	
	public boolean isAlphanumeric(){
		return false;
	}
	
	public boolean isBoolean(){
		return false;
	}
	
	public Type merge(Type t){
		return new TError();
	}
	
	public Type merge(TBoolean t){
		return new TError();
	}
	
	public Type merge(TInteger t){
		return new TError();
	}
	
	public Type merge(TString t){
		return new TError();
	}
	
	public Type merge(TError t){
		return new TError();
	}
	
}
