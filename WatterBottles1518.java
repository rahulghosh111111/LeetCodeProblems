public class WatterBottles1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {
        WatterBottles1518 p = new WatterBottles1518();
        System.out.println(p.numWaterBottles(9, 3));
    }
}
