public class N_thTribonacciNumber1137 {
    
        public int tribonacci(int n) {
            if(n==0){
                return 0;
            }else if(n==1){
                return 1;
            }else if(n==2){
                return 1;
            }else{
                    int FT=0;
                    int ST=1;
                    int TT=1;
                for(int i=1;i<=n;i++){
                    
                    int FoT = FT+ST+TT;
                    FT=ST;
                    ST=TT;
                    TT=FoT;
                }
                return FT;
            }
        }
        public static void main(String[] args) {
            N_thTribonacciNumber1137 p = new N_thTribonacciNumber1137();
            System.out.println(p.tribonacci(25));
        }
}
