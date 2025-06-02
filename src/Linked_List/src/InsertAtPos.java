public class InsertAtPos {
    static Node InsertAtPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if(head == null) {
            if(pos==1){
                return temp;
            }
            else
                return head;
        }
        if(pos==1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i =0; i< pos-1 && curr!=null; i++) {
            curr = curr.next;
            if (curr == null)
                return head;
        }
            temp.next = curr.next;
            curr.next = temp;
                    return head;
        }
     static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
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
        head = InsertAtPos(head,1,2);
        printlist(head);
        }
        }


