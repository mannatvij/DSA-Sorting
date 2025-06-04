public class SortedInsertInLL {
    static Node SortedInsert(Node head, int data) {
        Node temp = new Node(data);
        if (head == null || data < head.data) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < data){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    static void PrrintList(Node head){
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
        head = SortedInsert(head, 5);
        PrrintList(head);
    }
}
