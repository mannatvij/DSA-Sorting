class ListNode{
    int data;
    ListNode prev;
    ListNode next;
    ListNode(int d){
        data = d;
        prev= null;
        next= null;
    }
        }

public class DoublyLinedListTraversal {
    public static void printlist(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(3);
        head.next = temp1;
        temp1.next = temp2;
        temp1.prev = head;
        temp2.prev = head;

        printlist(head);

    }

}
