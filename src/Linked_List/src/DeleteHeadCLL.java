public class DeleteHeadCLL {
    static Node DeleteHead(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;
        head.data = head.next.data; // copy head data to next.
        head.next = head.next.next; // delete second node.
        return head;
    }
    static void PrintList(Node head) {
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }while(curr != head);

    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        head = DeleteHead(head);
        PrintList(head);
    }
//  static Node delHead(Node head){ naive method.
//        if(head==null)return null;
//        if(head.next==head)
//            return null;
//        Node curr=head;
//        while(curr.next!=head)
//            curr=curr.next;
//        curr.next=head.next;
//        return (curr.next);
//    }
}
