public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }

}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
// Another solution



// class IncreasingTripletSubsequence334 {
//     public boolean increasingTriplet(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 for(int k = j+1; k<nums.length ; k++)
//                 if((nums[i] < nums[j]) && (nums[j] < nums[k])){
//                     return true;
//                 }    
//             }
//         }
//         return false;
//     }
// }
