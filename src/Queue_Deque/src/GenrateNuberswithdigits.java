import java.util.LinkedList;
import java.util.Queue;

public class GenrateNuberswithdigits {
    static void printnumber(int n){
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for(int count =0; count<n ; count++){
            String curr = q.poll();
            System.out.print(curr+" ");
            q.add(curr+"5");
            q.add(curr+"6");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printnumber(n);
    }
}
