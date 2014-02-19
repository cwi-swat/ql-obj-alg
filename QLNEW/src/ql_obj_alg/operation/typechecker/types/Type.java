package ql_obj_alg.operation.typechecker.types;

public abstract class Type {
	
	public abstract boolean isComparable(Type t);
	
	public abstract boolean isOrd();
	
	public abstract boolean isNumber();
	
	public abstract boolean isAlphanumeric();
	
	public abstract boolean isBoolean();
	
	public abstract boolean isDate();
	
	public abstract boolean isUndefined();
	
	public abstract Type merge(Type t);
	
	public abstract String toString();
}
