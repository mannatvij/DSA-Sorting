public class SpanStock {
    static void stockspan(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int span =1;
            for(int j=i-1;j>=0 && arr[j]<= arr[i] ;j--) {
                span++;
            }
                System.out.println(span);

        }

    }
    public static void main(String args[]){
        int[] arr=new int[]{18,12,13,14,11,16};

        stockspan(arr);
    }


}
