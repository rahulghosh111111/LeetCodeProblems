public class MaximumAscendingSubarraySum1800 {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                sum = 0;
            }
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumAscendingSubarraySum1800 m = new MaximumAscendingSubarraySum1800();
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(m.maxAscendingSum(nums));
    }
}
