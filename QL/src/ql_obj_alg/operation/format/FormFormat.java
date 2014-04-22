package ql_obj_alg.operation.format;

import java.util.List;

import ql_obj_alg.box.BoxAlg;
import ql_obj_alg.box.FormatBox;
import ql_obj_alg.box.IFormat;
import ql_obj_alg.syntax.IFormAlg;

public class FormFormat implements IFormAlg<IFormatWithPrecedence,IFormat,IFormat>{

	private BoxAlg<IFormat> box;
	
	public FormFormat() {
		this.box = new FormatBox();
	}

	protected BoxAlg<IFormat> getBox(){
		return box;
	}
	
	@Override
	public IFormat form(final String id, final List<IFormat> statements) {
		return box.V(box.H(1,box.L("form"),box.L(id), box.L("{")),box.I(2,statements),box.L("}"));
	}
}
