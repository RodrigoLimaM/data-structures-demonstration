package util;

public class Stack <T extends Comparable<T>> {

    private Node start;
    private Node end;

    public Stack() {

    }

    public Stack(T...elements) {
        for(T element : elements){
            this.push(element);
        }
    }

    public void push(T data) {
        if (isEmpty()) {
            Node node = new Node(data);
            start = node;
            end = node;
        } else {
            Node aux = getLastNode();
            aux.setNext(new Node(data, null, aux));
            end = aux.getNext();
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new NullPointerException("Empty List");
        } else if (isSingleElement()){
            start = null;
            end = null;
        } else {
            Node aux = getPenultimateNode();
            aux.setNext(null);
            end = aux;
        }
    }

    public boolean isEmpty() {
        return start == null;
    }

    public boolean isSingleElement() {
        return start.getNext() == null;
    }

    public void sort() {
        if (size() > 1) {
            for (int i = 0; i < size(); i++ ) {
                Node aux1 = start;
                Node aux2 = start.getNext();
                for (int j = 0; j < size() - 1; j++) {
                    if (aux1.compareTo(aux2) > 0) {
                        T aux = (T) aux1.getData();
                        aux1.setData(aux2.getData());
                        aux2.setData(aux);
                    }
                    aux1 = aux2;
                    aux2 = aux2.getNext();
                }
            }
        }
    }

    public int size() {
        if(isEmpty())
            return 0;

        return elementCounter(start, 1);
    }

    private int elementCounter(Node node, int cont){
        if (node.getNext() == null) {
            return cont;
        } else {
            return elementCounter(node.getNext(), cont + 1);
        }
    }

    public T getData(int pos) {
        if (isEmpty())
            throw new NullPointerException("Empty List");

        Node aux = scrollThroughTheList(start, 0, pos);
        return (T) aux.getData();
    }

    private Node getNode(int pos) {
        if (isEmpty())
            throw new NullPointerException("Empty List");

        Node aux = scrollThroughTheList(start, 0, pos);
        return aux;
    }

    private Node getLastNode(){
        return end;
    }

    private Node getPenultimateNode(){
        return end.getPrevious();
    }

    public T getFirstData(){
        if (isEmpty())
            throw new NullPointerException("Empty List");

        return (T) start.getData();
    }

    public T getLastData() {
        if (isEmpty())
            throw new NullPointerException("Empty List");

        Node aux = getLastNode();

        return (T) aux.getData();
    }

    public boolean binarySearch(T criteria) {
        return elementExistenceFinder(0, 0, size() -1, criteria);
    }

    private boolean elementExistenceFinder(int start, int mid, int end, T criteria){
        if(start > end) {
            return false;
        } else {
            mid = (start + end) / 2;
            if (indexOf(criteria) == mid)
                return true;
            if (indexOf(criteria) < mid) {
                return elementExistenceFinder(start, mid, mid -1, criteria);
            } else {
                return elementExistenceFinder(mid + 1, mid, end, criteria);
            }
        }
    }

    public int indexOf(T criteria) {
        return elementIndexFinder(start, 0, criteria);
    }

    private int elementIndexFinder(Node node, int cont, T criteria){
        if (cont == size()) {
            return -1;
        } else {
            if(node.getData().equals(criteria)) {
                return cont;
            }
            return elementIndexFinder(node.getNext(), cont + 1, criteria);
        }
    }

    private Node scrollThroughTheList(Node node, int cont, int pos){
        if (cont == pos){
            return node;
        } else {
            return scrollThroughTheList(node.getNext(), cont + 1, pos);
        }
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        Node aux = start;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (aux.getNext() != null) {
            sb.append(aux.getData() +", ");
            aux = aux.getNext();
        }
        sb.append(aux.getData() +"] ");

        return sb.toString();
    }

}
