public class InsertionSort {
    void InsertSort(int arr[]){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while( j>=0 && arr[j]> key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= key;
        }

    }
    public static void main(String args[]) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {10, 5, 20, 40, 7};
        ob.InsertSort(arr);
        System.out.println("Sorted Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
