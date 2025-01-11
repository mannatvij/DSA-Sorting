import java.util.Arrays;

public class SortArraybyParityLC {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        int result[]= new int[n];
        int odd=0;
        int even=0;
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                even++;
                result[k++]= nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]%2!=0){
                odd++;
                result[k++]= nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SortArraybyParityLC obj = new SortArraybyParityLC();
        int nums[]={1,3,45,12,0};
        System.out.println(Arrays.toString(obj.sortArrayByParity(nums)));
    }
}
