class Node {
    int data;
    Node next;
    public Node(int d) {
        data = d;
        next = null;
    }
}
class Stack {
     Node head;
     int size;
     public Stack() {
         head = null;
         size = 0;
     }
     int size() {
         return size;
     }
     boolean isEmpty() {
         return size == 0;
     }
     void push(int d) {
         Node temp = new Node(d);
         temp.next = head;
         head = temp;
     }
     int pop(){
         if(head == null){
             return Integer.MIN_VALUE;
         }
         int res = head.data;
         head = head.next;
         return res;
     }
     int peek(){
         if(head == null){
             return Integer.MIN_VALUE;
         }
         return head.data;
     }

}
public class StackCreateLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
