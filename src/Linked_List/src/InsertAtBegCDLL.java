public class InsertAtBegCDLL {
    public static void main(String args[]) {
        ListNode head = new ListNode(10);
        ListNode temp1 = new ListNode(20);
        ListNode temp2 = new ListNode(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;
        temp2.prev = temp1;
        temp1.prev = head;
        head.prev = temp2;
        head = insertAtHead(head, 5);
        printlist(head);

    }

    public static void printlist(ListNode head) {
        if (head == null) return;
        ListNode r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static ListNode insertAtHead(ListNode head, int x) {
        ListNode temp = new ListNode(x);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp; // if we return head here, it will be insert at end in this question itself.

    }
}
