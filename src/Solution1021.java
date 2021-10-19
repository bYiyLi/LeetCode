import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1021 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
    public static String removeOuterParentheses(String s) {
        if (s.length()<1){
            return "";
        }
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        for (int n = 0;n<s.length();n++){
            if (s.charAt(n)=='('){
                deque.addLast(n);
            }else {
                final Integer i = deque.removeLast();
                if (deque.isEmpty()){
                    builder.append(s.substring(i+1,n));
                }
            }
        }
        return builder.toString();
    }
}
