package composition;

public interface StmtIfAlg<E, S> extends StmtAlg<E, S> {
	S ifThen(E cond, S body);
}
