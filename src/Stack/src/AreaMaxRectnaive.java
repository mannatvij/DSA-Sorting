public class AreaMaxRectnaive {
    public static int getMaxArea(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>=arr[i])curr+=arr[i];
                else break;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i])curr+=arr[i];
                else break;
            }
            res=Math.max(res,curr);
        }
        return res;

    }
    public static void main (String[] args) {

        int[] arr=new int[]{6,2,5,4,1,5,6};

        System.out.print("Maximum Area: "+getMaxArea(arr,arr.length));

    }

}
