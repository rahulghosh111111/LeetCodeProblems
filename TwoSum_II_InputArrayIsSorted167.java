public class TwoSum_II_InputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};    }

    public static void main(String[] args) {    
        TwoSum_II_InputArrayIsSorted167 p = new TwoSum_II_InputArrayIsSorted167();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = p.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
