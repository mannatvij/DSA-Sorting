public class DLLInsertAtbeg {
    public static ListNode insertAtbeg(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        temp.next = head;
        if(head != null) {
            head.prev = temp;

        }
        return temp;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.prev = head;
        head.next.next.prev = head.next;
       head= insertAtbeg(head,4);
        printList(head);
    }
}
