public class PowerofTwo231 {
        public boolean isPowerOfTwo(int n) {
            if(n<1){
                return false;
            }else if(n == 1){
                return true;
            }else{
                while(n%2 == 0){
                    n = n/2;
                }
                if(n == 1){
                    return true;
                }
                else{
                    return false;
                }
            }
    
        }

        public static void main(String[] args) {
            PowerofTwo231 p = new PowerofTwo231();
            System.out.println(p.isPowerOfTwo(16));
        }
    }

