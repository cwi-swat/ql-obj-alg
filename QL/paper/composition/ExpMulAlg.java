package composition;

public interface ExpMulAlg<E> extends ExpAlg<E> {
	E mul(E l, E r);
}
