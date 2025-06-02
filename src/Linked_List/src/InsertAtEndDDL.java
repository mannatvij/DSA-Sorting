public class InsertAtEndDDL {
    static ListNode insertAtEnd(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        if (head == null) {
            return temp;
        }
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = null;
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        printList(head);
    }

}
