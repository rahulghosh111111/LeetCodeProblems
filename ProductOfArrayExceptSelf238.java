public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];

        int product = 1;
        for(int i=n-1;i>=0;i--){
            product = product * nums[i];
            right[i] = product;
        }

        int[] ans = new int[n];
        int left = 1;
        for(int i=0; i<n-1;i++){
            int val = left * right[i+1];
            ans[i] = val;
            left = left* nums[i];

        } 
        ans[n-1]=left;
        return ans;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf238 obj = new ProductOfArrayExceptSelf238();
        int[] nums = {1,2,3,4};
        int[] ans = obj.productExceptSelf(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
            
        }
        
    }   
}
