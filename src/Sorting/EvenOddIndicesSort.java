import java.util.Arrays;

public class EvenOddIndicesSort {

        public int[] sortEvenOdd(int[] nums) {
            int n= nums.length;
            int oddSize= n/2;
            int evenSize= (n+1)/2;
            // initialze array.
            int Odd[]= new int[oddSize];
            int Even[]= new int[evenSize];

            // divide the array in odd and even.
            int O=0;
            int E=0;
            for(int i=0; i<n; i++){
                if(i%2==0){
                    Even[E++]= nums[i];

                }
                else{
                    Odd[O++]= nums[i];
                }

            }
            Arrays.sort(Odd);
            Arrays.sort(Even);
            // reverse odd one.
            for(int i=0; i< oddSize/2; i++){
                int temp= Odd[i];
                Odd[i]= Odd[oddSize-i-1];
                Odd[oddSize-i-1]= temp;
            }

            // merge it back
            O=0;
            E=0;
            for(int i=0; i<n; i++){
                if(i%2==0){
                    nums[i]= Even[E++];
                }
                else
                    nums[i]= Odd[O++];
            }
            return nums;
        }
public static void main(String[] args) {
            EvenOddIndicesSort e = new EvenOddIndicesSort();
            System.out.println(Arrays.toString(e.sortEvenOdd(new int[]{1,2,3,4,5})));
}
    }

