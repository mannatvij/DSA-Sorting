public class Traversal_LL {
    public static void main(String[] args) {
        Node head= new Node(10); //make objects and enter
         head.next = new Node(20);
         head.next.next = new Node(30);
        printlist(head);
    }
    public static void printlist(Node head) {
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
