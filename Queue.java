/**
 * Created by Josh on 08/11/2017.
 */
public class Queue implements IQueue{
    private Node first,last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void enqueue(Person data) {
        Node oldLast = last;
        last = new Node(data);
        size++;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.setNext(last);
        }
    }

    @Override
    public Node dequeue() {
        if(isEmpty()) {
            throw new QueueIsEmptyException("Cannot dequeue from an empty queue.");
        }
        Node oldFirst = first;

        setFirst(first.getNext());
        size--;
        return oldFirst;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    @Override
    public Node peek() {
        if (isEmpty()) {
            throw new QueueIsEmptyException("Cannot peek on an empty queue.");
        } else {
            return first;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
