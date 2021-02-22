/**
 * List Interface of necessary methods
 * @author Rumbi Chinhamhora
 * @version 1.0
 */
public interface List<T> {
    void addLast( T item) throws ListFullException;
    void add(int index, T item) throws ListFullException;
    T peekFirst() throws ListEmptyException;
    T removeFirst() throws ListEmptyException;
    T remove(int index) throws ListEmptyException;
    int size();
    boolean isEmpty();
}
