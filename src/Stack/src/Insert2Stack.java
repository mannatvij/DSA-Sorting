class MyStackk{
    int cap;
    int top1, top2;
    int arr[];
    MyStackk(int c){
        cap = c;
        top1 = -1;
        top2 = c;
        arr = new int[c];
    }
    boolean push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
            return true;
        }
        return false;
    }
    boolean push2(int x) {
        if(top1 < top2 -1){
            top2--;
            arr[top2] = x;
            return true;
        }
        return false;
    }
    Integer pop1(){
        if(top1 >=0){
            int temp = arr[top1];
            top1--;
            return temp;
        }
        return null;
    }
    Integer pop2(){
        if(top2 < cap){
            int temp = arr[top2];
            top2++;
            return temp;
        }
        return null;
    }
    int size1(){
        return top1+1;
    }
    int size2(){
        return cap - top2;
    }
}

public class Insert2Stack {
    public static void main(String[] args) {
        MyStackk ts = new MyStackk(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());
        System.out.println(ts.size1());

    }
}
