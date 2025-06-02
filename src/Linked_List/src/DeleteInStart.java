public class DeleteInStart {
    static Node DeleteInStart(Node head) {
        if(head == null)
            return null;
        else
            return head.next; // use logic head.next = head;
    }
    static void Printlist(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = DeleteInStart(head);
        Printlist(head);
    }

}
