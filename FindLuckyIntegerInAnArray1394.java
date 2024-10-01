import java.util.Arrays;

public class FindLuckyIntegerInAnArray1394 {
     public int findLucky(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        // Count occurrences of each element
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num]++;
            }
        }

        int max = -1; 

        //maximum lucky integer
        for (int i = 1; i <= n; i++) {
            if (freq[i] == i) {
                max = Math.max(max, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        FindLuckyIntegerInAnArray1394 obj = new FindLuckyIntegerInAnArray1394();
        System.out.println(obj.findLucky(new int[]{2,2,3,4}));
    }
}
