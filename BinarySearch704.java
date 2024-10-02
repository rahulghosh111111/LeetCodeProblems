public class BinarySearch704 {
    public int search(int[] nums, int target) {
        // Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
             return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch704 obj = new BinarySearch704();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(obj.search(nums, target));

    }
}
