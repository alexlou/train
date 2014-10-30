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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedListNode that = (LinkedListNode) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (next != null ? !next.equals(that.next) : that.next != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = next != null ? next.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
