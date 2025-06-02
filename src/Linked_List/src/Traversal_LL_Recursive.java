
public class Traversal_LL_Recursive {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printElementsRecursive(head);
    }
    public static void printElementsRecursive(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printElementsRecursive(head.next);
    }
}
