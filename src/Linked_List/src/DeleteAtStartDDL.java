public class DeleteAtStartDDL {
    static ListNode deleteAtStartDDL(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        else
            head = head.next;
           head.prev = null;
        return head;
    }
    static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.prev = head;

        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(4);
        head.next.next.next.prev = head.next.next;

        head = deleteAtStartDDL(head);
        printList(head);
    }
}
