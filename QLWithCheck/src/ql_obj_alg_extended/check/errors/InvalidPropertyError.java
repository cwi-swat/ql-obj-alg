package ql_obj_alg_extended.check.errors;

import ql_obj_alg.check.errors.GenError;
import ql_obj_alg.check.types.Type;

public class InvalidPropertyError extends GenError {
	Type expected;
	Type found;
	String varName;
	String property;
	
	public InvalidPropertyError(Type t1, Type t2, String varName, String property){
		this.expected = t1;
		this.found = t2;
		this.varName = varName;
		this.property = property;
	}
	
	@Override
	public int hashCode(){
		return toString().hashCode();
	}
		
	public String toString(){
		return "Invalid property : " + property + " on " + varName + ", expected type " + expected.toString() + " got " + found.toString() + ".";
	}
	
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		if(obj instanceof InvalidPropertyError){
			InvalidPropertyError error = (InvalidPropertyError) obj;
			
			if(this.expected == error.expected || (this.expected != null && this.expected.equals(error.expected))){
				if(this.found == error.found || (this.found != null && this.found.equals(error.found))){
					if(this.property == error.property || (this.property != null && this.property.equals(error.property)))
						if(this.varName == error.varName || (this.varName != null && this.varName.equals(error.varName)))
							return true;
				}
			}
			
			return false;	
		}
		return false;
	}
}
