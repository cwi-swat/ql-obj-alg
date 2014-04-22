package ql_obj_alg.types;

public class TypeFactory {

	public static Type createType(String type){
		if(type == null)
			return new TError();
		else if(type.equals("integer")){
			return new TInteger();
		}
		else if(type.equals("boolean")){
			return new TBoolean();
		}
		else if(type.equals("string")){
			return new TString();
		}
		else{
			assert(false) : "Unknown type :"+type+".";
			return null;
		}
	}
}
