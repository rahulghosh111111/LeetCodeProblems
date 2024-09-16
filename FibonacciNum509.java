public class FibonacciNum509 {
        public int fib(int n) {
            if(n==0){
                return 0;
            }else if(n==1){
                return 1;
            }
            int FT = 0;                    //FT,ST,TT = FirstTerm,SecondTerm,ThirdTerm
            int ST = 1;
            for(int i=1;i<=n ;i++){
                int TT = FT + ST ;
                FT = ST;
                ST = TT;
            }
            return FT;
        }
        public static void main(String[] args) {
            FibonacciNum509 p = new FibonacciNum509();
            System.out.println(p.fib(2));
        }
    }

