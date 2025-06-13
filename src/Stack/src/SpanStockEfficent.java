import java.util.Stack;
import java.io.*;
import java.util.*;
public class SpanStockEfficent {
    static void SpanStock(int arr[], int n){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main (String[] args) {

        int[] arr=new int[]{18,12,13,14,11,16};

        SpanStock(arr,arr.length);

    }

}
