package lou.alex.train.datastruct;

/**
 * Created by alex on 30/10/14.
 */
public class LinkedListNode<E> {
    private LinkedListNode<E> next;
    private E data;

    public LinkedListNode(LinkedListNode<E> next, E data) {
        this.next = next;
        this.data = data;
    }

    public LinkedListNode(E data) {
        this.data = data;
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public E getData() {
        return data;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }
}
