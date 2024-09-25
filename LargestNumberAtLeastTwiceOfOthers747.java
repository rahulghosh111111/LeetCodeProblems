public class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                maxIdx = i;
    
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
             
        }
        if (smax * 2 <= max) {
            return maxIdx;
        } else {
            return -1;
    
        }
    }

    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers747 p = new LargestNumberAtLeastTwiceOfOthers747();
        int[] nums = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(p.dominantIndex(nums));
        System.out.println(p.dominantIndex(nums2));
    }
}    