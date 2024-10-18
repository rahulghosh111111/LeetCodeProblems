public class DivideTwoIntegers29 {
    
        public int divide(int dividend, int divisor) {
            int n = 0;
            long c = 0;
            long sign = 1;
            if (divisor == 1) return dividend;
            if ((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0)) sign = -1;
            long dd = Math.abs((long) dividend);
            long dr = Math.abs((long) divisor);
            for (int i = 30; i >= 0; i--) {
                if (dd >= (dr << i)) {
                    c += (1 << i);
                    dd -= (dr << i);
                }
            }
            return (int) (c * sign);
        }
        public static void main(String[] args) {
            DivideTwoIntegers29 p = new DivideTwoIntegers29();
            System.out.println(p.divide(10, 3));
        }
    }

