public class MergeTwoSortedArrays {
    void merge(int a[], int b[], int m, int n){
        int i = 0, j = 0;
       while(i<m && j<n) {
           if (a[i] < b[j]) {
               System.out.print(a[i++] + " ");
           } else {
               System.out.print(b[j++] + " ");
           }
       }
           for (; i < m; i++) {
               System.out.print(a[i++] + " ");
           }
           for (; j < n; j++) {
               System.out.print(b[j++] + " ");
           }
    }
    public static void main(String args[]){
        int a[]= {10,20,30,40};
        int b[]= {4,12,40,80};
        int m=4;
        int n=4;
        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        obj.merge(a, b, m, n);
    }
}
