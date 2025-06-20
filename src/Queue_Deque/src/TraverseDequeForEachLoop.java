import java.util.ArrayDeque;
import java.util.Deque;

public class TraverseDequeForEachLoop {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        for(int x : deque)
            System.out.println(x);
    }
}
