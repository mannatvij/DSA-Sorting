public class InsertAtEndCLL {
    static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;
            head.next=temp; // these teo lines make temp at second place.
            int t= temp.data;
            temp.data=head.data;
            head.data=t; // swapping data of temp and head, not it is at first place.
        }
        return temp;
    }
    static void printList(Node head) {
        Node curr = head;
       do{
           System.out.print(curr.data+" ");
           curr = curr.next;
       }while(curr!=head);
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        head = insertAtEnd(head, 5);
        printList(head);
    }
}
