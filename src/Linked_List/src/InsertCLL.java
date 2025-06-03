public class InsertCLL {
    static Node insert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp.next = temp;
        }
        else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            head = temp;
        }
        return head;
    }
    static void printList(Node head) {
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while(curr != head);
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        head = insert(head, 5);
        printList(head);
    }


}
