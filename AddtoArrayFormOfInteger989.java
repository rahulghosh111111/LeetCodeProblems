import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormOfInteger989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while(p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = num[p];
            }
            int d = k%10;  //last digit from k
            int sum = numval + d + carry;
            int digit = sum%10;
            carry = sum / 10;
            ans .add(digit);
            p--;     //moving the pointer
            k=k/10; //removing the last digit from k
        }
        if (carry > 0)
        {
            ans.add(carry);   // adding carry to thr arraylist 
        }
        Collections.reverse(ans);  //reversing the ans array list

        return ans;
    }

    public static void main(String[] args) {
        AddtoArrayFormOfInteger989 p = new AddtoArrayFormOfInteger989();
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(p.addToArrayForm(num, k));
    }
}
