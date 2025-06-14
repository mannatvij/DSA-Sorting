class Nodeee {
    int data;
    Nodeee next;

    Nodeee(int d) {
        data = d;
        next = null;
    }
}
    class MyQueue{
        Nodeee front;
        Nodeee rear;
        int size;
        public MyQueue(){
            front = null;
            rear = null;
            size = 0;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        void enqueue(int d){
            Nodeee temp = new Nodeee(d);
            if(isEmpty()){ //when list empty
                front = rear= temp;
            }
            rear.next = temp;
            rear = temp;
            size++;
        }
        void dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            front = front.next;
            if(front == null){
                rear = null;
            }
            size--;
        }
        int getFront(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return front.data;
        }
        int getRear(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return rear.data;
        }
    }


public class QueueUsingLinkedList {
    public static void main(String[] args)
    {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.getFront());
        System.out.println("Queue Rear : " + q.getRear());
    }
}


