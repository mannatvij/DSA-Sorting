public class DeleteAtEnd {
    static Node DeleteAtEnd(Node head) {
        if(head == null)
            return null;
        if( head.next == null){
            return null;
        }
        Node curr = head;
        while(curr.next.next!= null){ // stop at second last one.
            curr = curr.next;

        }
        curr.next = null;
        return head;
    }
    static void printList(Node head) {
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
        head = DeleteAtEnd(head);
        printList(head);
    }
}