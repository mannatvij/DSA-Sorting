import java.util.Stack;
    class MyStackkk {

        Stack<Integer> ms;
        Stack<Integer> as;

        MyStackkk(){
            ms=new Stack<>();
            as=new Stack<>();
        }

        void push(int x) {

            if(ms.isEmpty() ) {
                ms.add(x);as.add(x);return;
            }

            ms.add(x);

            if(as.peek()>=ms.peek())
                as.add(x);
        }

        void pop() {

            if(as.peek()==ms.peek())
                as.pop();
            ms.pop();

        }

        int top() {
            return ms.peek();
        }

        int getMin() {
            return as.peek();
        }
    }

public class MinElementinStack {

        public static void main(String[] args) {
            MyStackkk s = new MyStackkk();
            s.push(4);
            s.push(5);
            s.push(8);
            s.push(1);
            s.pop();

            System.out.print(s.getMin());

        }
    }

