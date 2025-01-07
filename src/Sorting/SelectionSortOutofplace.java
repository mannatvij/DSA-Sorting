public class SelectionSortOutofplace {
    public void Selection(int arr[]){
        int n= arr.length;
        int [] temp = new int[n];
        for(int i=0; i<n;i++){ //temp array
            int min=0;
            for(int j=1;j<n;j++) { // original array, we find the minimum and replace it with temp, and put its value to large integer, to tell it is used.
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;

        }
        for(int i=0;i<n;i++){ // copy all element s of temp to array.
            arr[i]= temp[i];
        }
    }
    public static void main(String[] args) {
        SelectionSortOutofplace ss= new SelectionSortOutofplace();
        int arr[]= {5,15,2,5,19,16,7};
        int n= arr.length;
        ss.Selection(arr);
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    }
