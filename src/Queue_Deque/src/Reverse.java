import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Reverse {

    void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        // Push all elements of queue to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        // Pop from stack and add back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();

        // Using LinkedList as Queue implementation
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: " + q);

        // Reversing the queue
        r.reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}
