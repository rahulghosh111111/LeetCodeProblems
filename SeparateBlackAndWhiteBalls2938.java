import java.util.*;
public class SeparateBlackAndWhiteBalls2938 {
public long minimumSteps(String s) {
    var i = 0;
    var res = 0L;

    for (var j = 0; j < s.length(); j++) {
        if (s.charAt(j) == '0') {
            res += j - i;
            i++;
        }
    }
    return res;
}
    public static void main(String[] args) {
        SeparateBlackAndWhiteBalls2938 p = new SeparateBlackAndWhiteBalls2938();
        System.out.println(p.minimumSteps("101"));
        System.out.println(p.minimumSteps("100"));
        System.out.println(p.minimumSteps("0111"));

    }
}