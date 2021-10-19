import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution32 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()()"));
    }
    public static int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.addLast(-1);
        int max = 0;
        int now = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '('){
                stack.addLast(i);
            }else{
                stack.removeLast();
                if (stack.size()>0){
                    now=i-stack.getLast();
                }else {
                    now=0;
                    stack.addLast(i);
                }
                max=Math.max(max,now);
            }
        }
        return max;
    }
}
