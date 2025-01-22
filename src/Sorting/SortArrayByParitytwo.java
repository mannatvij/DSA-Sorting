import java.util.Arrays;

public class SortArrayByParitytwo {
    public int[] Parity(int []nums){
    int n= nums.length;
    int e=0;
    int o=1;
    int arr[]= new int[n];
    for(int i=0; i<n;i++){
        if(nums[i]%2==0){
            arr[e]=nums[i];
            e=e+2;
        }
        else {
            arr[o] = nums[i];
            o=o+2;
        }
    }
    return arr;
    }
    public static void main(String[] args) {
        SortArrayByParitytwo sa = new SortArrayByParitytwo();
        int arr[]= {4,2,5,7};
        int[] sortedArr = sa.Parity(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
