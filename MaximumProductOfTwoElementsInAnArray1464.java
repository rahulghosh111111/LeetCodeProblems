public class MaximumProductOfTwoElementsInAnArray1464 {
    public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            smax = max;
            max = nums[i];
        }else if(nums[i]>smax){
            smax = nums[i];
        }
    }
    return (max-1)*(smax-1);
    }

    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray1464 p = new MaximumProductOfTwoElementsInAnArray1464();
        int[] nums = {3,4,5,2};
        System.out.println(p.maxProduct(nums));
    }
}