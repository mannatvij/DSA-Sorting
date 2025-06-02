public class DeleteAtEndDDL {
    public static void main(String args[])
    {
        ListNode head=new ListNode(10);
        ListNode temp1=new ListNode(20);
        ListNode temp2=new ListNode(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=delLast(head);
        printlist(head);

    }

    static ListNode delLast(ListNode head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        ListNode curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;

    }

    public static void printlist(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

