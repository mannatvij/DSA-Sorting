class Mystack {
    int cap;
    int top;
    int arr[];

    Mystack(int c) {
        cap = c;
        top = -1;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }

        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

}
public class StackCreateArray {
public static void main(String[] args) {
    Mystack s = new Mystack(5);
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println(s.pop());
    System.out.println(s.peek());
    System.out.println(s.pop());
    s.push(4);
    System.out.println(s.size());
    System.out.println(s.isEmpty());
}
}
