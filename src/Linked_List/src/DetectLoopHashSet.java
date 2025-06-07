import java.util.HashSet;

public class DetectLoopHashSet {
    public static Node detectLoop(Node head){
        HashSet<Node> set = new HashSet<Node>();
        for(Node curr = head; curr != null; curr = curr.next){
            if(set.contains(curr)){
                return curr;
            }
            else
                set.add(curr);
        }
        return null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;
        head = detectLoop(head);
        System.out.println(head != null ? "Loop starts at node with value: " + head.data : "No loop found.");

    }
}
