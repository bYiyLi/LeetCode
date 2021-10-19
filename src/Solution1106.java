import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1106 {
    public static void main(String[] args) {
        System.out.println(parseBoolExpr("|(&(t,f,t),!(t))"));
    }
    public static boolean parseBoolExpr(String expression) {
        Deque<Character> deque =new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)){
                case ')':{
                    Deque<Character> op = new ArrayDeque<>();
                    while (deque.getLast()!='('){
                        final Character character = deque.removeLast();
                        if (character!=','){
                            op.addLast(character);
                        }
                    }
                    deque.removeLast();
                    switch (deque.removeLast()){
                        case '|':{
                            char tf = 'f';
                            while (!op.isEmpty()){
                                if (op.removeLast()=='t') {
                                    tf='t';
                                    break;
                                }
                            }
                            deque.addLast(tf);
                            break;
                        }
                        case '!':{
                            if (op.removeLast()=='f') {
                                deque.addLast('t');
                            }else {
                                deque.addLast('f');
                            }
                            break;
                        }
                        case '&':{
                            char tf = 't';
                            while (!op.isEmpty()){
                                if (op.removeLast()=='f') {
                                    tf='f';
                                    break;
                                }
                            }
                            deque.addLast(tf);
                            break;
                        }
                        default:
                    }
                    break;
                }
                default:{
                    deque.addLast(expression.charAt(i));
                }
            }
        }
        return deque.getLast()=='t';
    }
}
