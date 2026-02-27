public class DoublyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    @Override
    public void addLast(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (tail == null) return null;

        T value = tail.data;
        tail = tail.prev;

        if (tail != null)
            tail.next = null;
        else
            head = null;

        size--;
        return value;
    }

    @Override
    public T getLast() {
        if (tail == null) return null;
        return tail.data;
    }
}