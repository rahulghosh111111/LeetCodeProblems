public class NumberOf1_Bits191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOf1_Bits191 p = new NumberOf1_Bits191();
        System.out.println(p.hammingWeight(11));
    }
}
