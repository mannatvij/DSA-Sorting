public class Merge {
    void Merge(int arr[], int low, int mid, int high){
        int n1= mid-low+1;
        int n2= high-mid;
        int left[]= new int[n1];
        int right[] =new int[n2];


        for(int i=0; i<n1;i++){
            left[i] = arr[low+i];
        }
        for(int j=0; j<n2;j++){
            right[j]= arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k= low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }
    public static void main(String args[]){
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
        Merge ob = new Merge();
        ob.Merge(a,0,3,8);
        for(int x: a)
            System.out.print(x+" ");
}
}
