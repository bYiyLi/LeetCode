import java.util.ArrayDeque;
import java.util.Deque;

public class Solution20 {
    public static void main(String[] args) {
        System.out.println(isValid("[]"));
    }
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.addLast('*');
        for (int n =0;n<s.length();n++){
            final char c = s.charAt(n);
            switch (c){
                case '(':
                case '[':
                case '{' :{
                    stack.addLast(c);
                    break;
                }
                case ')':{
                    if (stack.removeLast()!='(') {
                        return false;
                    }
                    break;
                }
                case ']':{
                    if (stack.removeLast()!='[') {
                        return false;
                    }
                    break;
                }
                case '}' :{
                    if (stack.removeLast()!='{') {
                        return false;
                    }
                    break;
                }
                default:{
                    return false;
                }
            }
        }
        return stack.size()==1;
    }
}
