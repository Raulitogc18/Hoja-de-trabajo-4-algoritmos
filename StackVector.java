import java.util.Vector;

public class StackVector<T> extends AbstractStack<T> {

    private Vector<T> vector = new Vector<>();

    @Override
    public void push(T item) {
        vector.add(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) return null;
        size--;
        return vector.remove(size);
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return vector.get(size - 1);
    }
}