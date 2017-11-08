/**
 * Created by Josh on 08/11/2017.
 */
public class Node {
    private Node next;
    private Person data;

    public Node(Person data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public Person getData() {
        return data;
    }

}
