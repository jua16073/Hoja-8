/**
 * Interfaz PriorityQueue obtenida del libro Java Structures: Data Structures for the Principled Programmer
 * @author Jose Pablo Viana - 16091
 * @author Rodrigo Juarez - 16073
 * @since 03/04/2017
 * @version 1.0
 * @param <E>
 */
public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	public int size();
	// post: returns number of elements within queue
	
	public void clear();
	// post: removes all elements from queue
}
