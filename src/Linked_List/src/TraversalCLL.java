public class TraversalCLL {
    static void printList(Node head){
        if(head == null) return;
        Node curr = head;
        do {
            System.out.println(curr.data + " ");

            curr = curr.next;
        }
        while(curr != head);
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        printList(head);
    }
}
//  public static void printlist(Node head){
//        if(head==null)return;
//        System.out.print(head.data+" ");
//        for(Node r=head.next;r!=head;r=r.next)
//            System.out.print(r.data+" ");
//    Method 2.