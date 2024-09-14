 class palindeome9 {
    
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            if (x == 0) {
                return true;
            }
            if (x % 10 == 0) {
                return false;
            }
            int revertedNumber = 0;
            while (x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x = x / 10;
            }
            if (x == revertedNumber || x == revertedNumber / 10) {
                return true;
            } else {
                return false;


            }


        }
        public static void main(String[] args) {
            palindeome9 p = new palindeome9();
            System.out.println(p.isPalindrome(121));
        }

    
}