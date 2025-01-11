import java.util.Arrays;

public class Concatenatearrays {
    public void Concatenatearrays(int[] arr1, int[] arr2) {
        int m= arr1.length;
        int n= arr2.length;
        int arr3[]= new int[m+n];
        for(int i=0; i<m; i++){
            arr3[i]= arr1[i];
        }
        for(int i=0; i<n; i++){
            arr3[m+i]= arr2[i];
        }
        Arrays.sort(arr3);
        for(int i=0; i<m+n; i++){
            if(i==0 || arr3[i]!=arr3[i-1]){
                System.out.print(arr3[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Concatenatearrays obj = new Concatenatearrays();
        int arr1[]= {10,20,20,40};
        int arr2[]= {5,10,10,20,40};
        obj.Concatenatearrays(arr1, arr2);

    }
}
