public class InversionNaive {
    public int Inversion(int a[]) {
        // inversion i<i+1 and arr[i] > arr[i+1]
        int n = a.length;
        int res=0;
        for(int i=0; i<n; i++){ //first loop on index 1
            for(int j=i+1; j<n; j++){ // second loop on next element keep comaring and increase if less than before.
                if(a[i]>a[j]){
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        InversionNaive i = new InversionNaive();
        int a[]= {2,4,1,3,5};
        System.out.println(i.Inversion(a));
    }
}
