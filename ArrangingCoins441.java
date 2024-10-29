public class ArrangingCoins441 {
    public int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            i ++;
            n -= i;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        ArrangingCoins441 p = new ArrangingCoins441();
        System.out.println(p.arrangeCoins(5));
    }
}
