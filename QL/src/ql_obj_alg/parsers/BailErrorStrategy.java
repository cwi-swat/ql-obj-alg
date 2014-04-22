package ql_obj_alg.parsers;

import org.antlr.v4.runtime.*;

public class BailErrorStrategy extends DefaultErrorStrategy {
	 
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw e;
    }
    
    @Override
    public void sync(Parser recognizer) { }
}
