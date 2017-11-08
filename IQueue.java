/**
 * Created by Josh on 08/11/2017.
 */
public interface IQueue {

    public boolean isEmpty();
    public void enqueue(Person data);
    public Node dequeue();
    public Node peek();
    public int size();

}
