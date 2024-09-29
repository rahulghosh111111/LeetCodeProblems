public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while ( start < end){
            int h = Math.min(height[start],height[end]);
            int width = end - start;
            int curr = h * width;
            max = Math.max(curr, max);
            if(height[start]<height[end]){ 
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ContainerWithMostWater11 p = new ContainerWithMostWater11();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(p.maxArea(height));    
    }
}
