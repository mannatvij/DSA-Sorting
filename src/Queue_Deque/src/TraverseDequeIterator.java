import java.util.*;
public class TraverseDequeIterator {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        Iterator it = d.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
