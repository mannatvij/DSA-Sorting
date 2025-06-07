public class ReverseInGroupsOfK {
   public static Node reverses(Node head, int k) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;
        while(curr != null && count< k ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
            if(next != null){
                Node newHead = reverses(next, k);
                head.next = newHead;

            }
            return prev;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
        }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head = reverses(head, 2);
        printList(head);
    }
}
