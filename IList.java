public interface IList<T> {
    void addLast(T value);
    T removeLast();
    T getLast();
    boolean isEmpty();
    int size();
}