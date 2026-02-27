public class SinglyLinkedList<T> extends AbstractList<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    @Override
    public void addLast(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (head == null) return null;

        if (head.next == null) {
            T value = head.data;
            head = null;
            size--;
            return value;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        T value = temp.next.data;
        temp.next = null;
        size--;
        return value;
    }

    @Override
    public T getLast() {
        if (head == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }
}