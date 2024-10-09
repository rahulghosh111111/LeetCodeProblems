public class MinimumAddToMakeParenthesesValid921 {
    public int minAddToMakeValid(String s) {
        int open =0, mismatch=0;
        for(int i=0; i<s.length(); i++)
        {
         if(s.charAt(i)=='(')
         open++;
         else
         {
            if(open>0)
            open--;
            else
            mismatch++;
         }
        } 
         return open+mismatch;   
    }

    public static void main(String[] args) {
        MinimumAddToMakeParenthesesValid921 obj = new MinimumAddToMakeParenthesesValid921();
        obj.minAddToMakeValid("(((");
        System.out.println(obj.minAddToMakeValid("(((") );
    }

}
