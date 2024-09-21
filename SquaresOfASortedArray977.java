import java.util.Arrays;
public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SquaresOfASortedArray977 p = new SquaresOfASortedArray977();
        int[] nums = {-4,-1,0,3,10};
        System.out.println(p.sortedSquares(nums));
    }
}