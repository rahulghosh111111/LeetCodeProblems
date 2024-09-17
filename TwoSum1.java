public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j= i+1;j<nums.length;j++){ 
                if(target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            } 
        }
        throw new RuntimeException("No two sum solution");
    } 

    public static void main(String[] args) {
        TwoSum1 p = new TwoSum1();
        int[] result = p.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}