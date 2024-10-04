public class HouseRobber198 {
    public int rob(int[] nums) {
        // If there are no houses, return 0
        if (nums.length == 0) {
            return 0;
        }
        
        // If there is only one house, return the amount in that house
        if (nums.length == 1) {
            return nums[0];
        }

        // Create the dp array
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Fill dp array using the recurrence relation
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        
        // The last element of dp contains the answer
        return dp[nums.length - 1];
    }
    public static void main(String[] args) {
        HouseRobber198 obj = new HouseRobber198();
        int[] nums = {2, 3, 2};
        int result = obj.rob(nums);
        System.out.println(result);
    }
}



// this code is also working but it's time complexity is O(n^2)
// class Solution {
// public int rob(int[] nums) {

//     int[] dp = new int[nums.length];
//     dp[0] = nums[0];
//     dp[1] = Math.max(nums[0], nums[1]);
//     for (int i = 2; i < nums.length; i++) {
//         dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
//     }
//     return dp[nums.length - 1];
// }
// public static void main(String[] args) {
//     HouseRobber198 obj = new HouseRobber198();
//     int[] nums = {2, 3, 2};
//     int result = obj.rob(nums);
//     System.out.println(result);
// }
// }