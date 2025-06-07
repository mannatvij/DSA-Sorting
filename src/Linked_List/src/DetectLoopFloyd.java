public class DetectLoopFloyd {
    static boolean DetectLoopFloyd(Node head) {
        if (head == null || head.next == null)
            return false;

    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            return true;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next.next;
        System.out.println(DetectLoopFloyd(head));

    }
}
