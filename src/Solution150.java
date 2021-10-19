import java.util.ArrayDeque;
import java.util.Deque;

public class Solution150 {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
    public static int evalRPN(String[] tokens) {
        Deque<String> deque = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token){
                case "*":{
                    deque.addLast(String.valueOf(Integer.parseInt(deque.removeLast())*Integer.parseInt(deque.removeLast())));
                    break;
                }
                case "+":{
                    deque.addLast(String.valueOf(Integer.parseInt(deque.removeLast())+Integer.parseInt(deque.removeLast())));
                    break;
                }
                case "-":{
                    final int i = Integer.parseInt(deque.removeLast());
                    deque.addLast(String.valueOf(Integer.parseInt(deque.removeLast())-i));
                    break;
                }
                case "/":{
                    final int i = Integer.parseInt(deque.removeLast());
                    deque.addLast(String.valueOf(Integer.parseInt(deque.removeLast())/i));
                    break;
                }
                default:{
                    deque.addLast(token);
                }
            }
        }
        return Integer.parseInt(deque.removeLast());
    }
}
