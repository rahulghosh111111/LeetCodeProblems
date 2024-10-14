import java.util.*;
class MaximalScoreAfterApplying_K_Operations2530 {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int x : nums)
            pq.offer(x);
        long score = 0;
        while (!pq.isEmpty() && k > 0) {
            score += pq.peek();
            int x = (int) Math.ceil(pq.poll() / 3.0);
            pq.add(x);
            k--;
        }
        return score;
    }
    public static void main(String[] args) {
        int[] nums = {10,10,10,10,10};
        int k = 5;
        System.out.println(new MaximalScoreAfterApplying_K_Operations2530().maxKelements(nums, k));
    }
}