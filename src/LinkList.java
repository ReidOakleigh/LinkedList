/**
 * Array implementation of LinkedList
 * @author Rumbi Chinhamhora
 * @version 1.0
 */
public class LinkList<T> implements List<T> {
    private int size = -1;
    private int maxSize;
    private final T[] array;

    public LinkList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
	public LinkList(int maxSize) {
        this.maxSize = maxSize;
        array = ( T[] ) new Object[maxSize];
    }

    @Override
    public void addLast( T item ) throws ListFullException {
        if (size + 1 == maxSize) {
            throw new ListFullException();
        }
        size++;
        array[size] = item;
    }

    @Override
    public void add( int index, T item ) throws ListFullException {
        if (size + 1 == maxSize) {
            throw new ListFullException();
        }
        size++;
        for ( int i = size; i > index; i-- ) {
            array[i] = array[i - 1];
        }
        array[index] = item;
    }

    @Override
    public T peekFirst() throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException();
        return array[0];
    }

    @Override
    public T removeFirst() throws ListEmptyException {
        return remove(0);
    }

    @Override
    public T remove( int index ) throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException();
        T item = array[index];
        if (size > 0) {
            for ( int i = index; i < size; i++ ) {
                array[i] = array[i + 1];
            }
        }
        array[size] = null;
        size--;
        return item;
    }

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public boolean isEmpty() { return size == -1; }

    @Override
    public String toString() {
        if (size < 0) return "";
        StringBuilder sb = new StringBuilder();
        for ( T item : array ) {
            if (item != null)
                sb.append(item).append("\n");
        }
        return sb.toString();
    }
}
