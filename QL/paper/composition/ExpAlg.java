package composition;

public interface ExpAlg<E> {
	E add(E l, E r);
	E lit(int x);
}
