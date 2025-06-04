public class ReverseLLRecursive {
    static Node reverseLLRecursive(Node head) {
        if (head == null || head.next==null) return head;
        Node rest_head= reverseLLRecursive(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = reverseLLRecursive(head);
        printlist(head);

    }
    }
