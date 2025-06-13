import java.util.Stack;
public class AreaMaxRect2stack {
    public static int largestRectangleArea(int[] heights) {
        int res =0;
        int prevsmaller[] = new int[heights.length];
        int nextsmaller[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for(int i =0; i< heights.length; i++){
            while(s.isEmpty()== false && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            int prevsmallervalue= s.isEmpty()? -1 : s.peek();
            prevsmaller[i] = prevsmallervalue;
            s.push(i);
        }
        s.clear();
        s.push(heights.length-1);
        for(int i = heights.length-1; i>=0; i--){
            while(s.isEmpty()== false && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            int nextsmallervalue = s.isEmpty()? heights.length : s.peek();
            nextsmaller[i] = nextsmallervalue;
            s.push(i);
        }
        for(int i=0; i< heights.length; i++){
            int curr = heights[i];
            curr += (i - prevsmaller[i] -1)*heights[i];
            curr += (nextsmaller[i] -i-1)*heights[i];
            res = Math.max(res, curr);
        }
        return res;
    }
    public static void main (String[] args) {

        int[] arr=new int[]{6,2,5,4,1,5,6};

        System.out.print("Maximum Area: "+largestRectangleArea(arr));

    }


}
