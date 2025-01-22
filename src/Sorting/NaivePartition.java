public class NaivePartition {
    void partition(int[] arr, int low, int high, int pivot) {
        int temp[]= new int[high-low+1];
        int index=0;
        //for copying elements grater than equal pivot.
        for(int i=low;i<=high;i++) {
            if (arr[i] <= arr[pivot] && i != pivot) {
                temp[index] = arr[i];
                index++;

            }
        }
            temp[index++] = arr[pivot];

        for(int i=low;i<=high;i++){
            if(arr[i]>arr[pivot]){
                temp[index]= arr[i];
                index++;
            }
        }
        for(int i=low;i<=high;i++){
            arr[i]= temp[i-low];
        }
    }
    public static void main(String[] args) {
        NaivePartition np = new NaivePartition();
        int[] arr = {1,4,10,6,3,2,7};
        np.partition(arr, 0, arr.length-1, 6);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
