import java.util.*;
class MinimumStringLengthAfterRemovingSubstrings2696 {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur_char = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(cur_char);
                continue;
            }

            if (cur_char == 'B' && stack.peek() == 'A') {
                stack.pop();
            } else if (cur_char == 'D' && stack.peek() == 'C') {
                stack.pop();
            } else {
                stack.push(cur_char);
            }
        }

        return stack.size();
    }
    public static void main(String[] args) {
        MinimumStringLengthAfterRemovingSubstrings2696 p = new MinimumStringLengthAfterRemovingSubstrings2696();
        String s = "ABFCACDB";
        System.out.println(p.minLength(s));

    }
}