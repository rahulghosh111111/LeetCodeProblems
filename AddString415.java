public class AddString415 {
    public String addStrings(String num1, String num2) {
        String total = "";
         int elde = 0;
         if (num1.length() > num2.length()) {
             while (num1.length() > num2.length())
                 num2 = 0 + num2;
         } else if (num2.length() > num1.length()) {
             while (num2.length() > num1.length())
                 num1 = 0 + num1;
         }
         for (int i = num1.length() - 1; i >= 0; i--) {
             int bas1 = (int) num1.charAt(i) - '0';
             int bas2 = (int) num2.charAt(i) - '0';
             if (elde != 0)
                 total = (bas1 + bas2 + elde) % 10 + total;
             else {
                 total = (bas1 + bas2) % 10 + total;
                 elde = 0;
             }
             if (bas1 + bas2 + elde >= 10)
                 elde = (bas1 + bas2 + elde) / 10;
             else
                 elde = 0;
         }
         if (elde != 0)
             total = elde + total;
         return total;
     }
     public static void main(String[] args) {
         String num1 = "11";
         String num2 = "123";
         AddString415 obj = new AddString415();
         System.out.println(obj.addStrings(num1, num2));
     }
}
