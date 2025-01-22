public class LomoutoPartition {
    int LPartition(int arr[], int l, int h){
        int i=l-1;
        int pivot=arr[h];
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=pivot;
        arr[h]=temp;
        return i+1;

    }
    public static void main(String args[]){
        LomoutoPartition lp=new LomoutoPartition();
        int arr[]={2,4,7,1,3,6};
        System.out.println(lp.LPartition(arr,0,arr.length-1));
    }

}
