public class ReverseDDL {
    static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        if(prev!=null)
            head=prev.prev;
        return head;
    }
    static void PrintList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
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
        head = reverse(head);
        PrintList(head);
    }
}
