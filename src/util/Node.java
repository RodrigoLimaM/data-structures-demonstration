package util;

public class Node <T extends Comparable<T>> {
    private T data;
    private Node next;
    private Node previous;

    public Node(T data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return data +"";
    }

    public int compareTo(Node n) {
        return data.compareTo((T) n.getData());
    }
}
