
public class SelectionSortinOrder {
    public void Selection(int arr[]) {
        int n= arr.length;

    for(int i=0;i<n-1;i++) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }

       int temps = arr[min];
        arr[min] = arr[i];
        arr[i] = temps;

    }
    }
    public static void main(String[] args) {
        SelectionSortinOrder ss = new SelectionSortinOrder();
        int arr[]={11,21,3,5,7,12};
        int n= arr.length;
        ss.Selection(arr);
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
