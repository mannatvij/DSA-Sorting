import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class TraversalLastToFirst {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        Iterator it = deque.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
