public class MinimumNumberOfSwapsToMakeTheStringBalanced1963 {
    public int minSwaps(String s) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') 
                size++;
            else if (size > 0) 
                size--;
        }
        return (size + 1) / 2;
    }
    public static void main(String[] args) {
        MinimumNumberOfSwapsToMakeTheStringBalanced1963 obj = new MinimumNumberOfSwapsToMakeTheStringBalanced1963();
        System.out.println(obj.minSwaps("][]["));
        System.out.println(obj.minSwaps("]]][[["));

    }
}
