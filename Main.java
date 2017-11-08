/**
 * Created by Josh on 08/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(new Person("josh","22V",33));
        queue.enqueue(new Person("john","22V",33));
        System.out.println(queue.peek().getData().getName());
        System.out.println(queue.dequeue().getData().getName());
        System.out.println(queue.peek().getData().getName());
        System.out.println(queue.dequeue().getData().getName());
    }
}
