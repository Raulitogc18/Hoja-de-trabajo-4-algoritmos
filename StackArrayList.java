import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) return null;
        size--;
        return list.remove(size);
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return list.get(size - 1);
    }
}