public class StackList<T> extends AbstractStack<T> {

    private IList<T> list;

    public StackList(IList<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.addLast(item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) return null;
        size--;
        return list.removeLast();
    }

    @Override
    public T peek() {
        return list.getLast();
    }
}