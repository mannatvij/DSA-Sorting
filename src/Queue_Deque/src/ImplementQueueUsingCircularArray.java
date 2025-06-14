class Queue{// this is circular array implementation.
    int front, cap, size;
    int[] arr;
    Queue(int c){
        front = 0;
        cap = c;
        size = 0;
        arr = new int[cap];
    }
    int getFront(){
        if(size == 0) return -1;
        else return arr[front];
    }
    int getRear(){
        if(size == 0) return -1;
        else return (front+ size-1)%cap;
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == cap;
    }
    void enqueue(int x){
        if(size == cap){
            System.out.println("Queue is full");
        }
        else{
         int rear =  getRear();
            rear = (rear+1)%cap;
            arr[rear] = x;
            size++;
        }
    }
    void dequeue(){
        if(size == 0) return;
        int front = getFront();
            front = (front + 1)%cap;
            size--;

    }

}

public class ImplementQueueUsingCircularArray{
    public static void main(String[] args)
    {
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();

        System.out.println("Front item is "
                + queue.getFront());
        System.out.println("Rear item is "
                + queue.getRear());
    }
}

