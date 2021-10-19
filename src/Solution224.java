import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution224 {

    public static void main(String[] args) {
        System.out.println(calculate("2147483647"));
    }

    public static int calculate(String s) {
        Deque<String> sStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            switch (c){
                case ' ':{
                    break;
                }
                case '+':
                case '-':
                case '(':{
                    sStack.addLast(c+"");
                    break;
                }
                case ')':{
                    Deque<String> op = new ArrayDeque<>();
                    while (!sStack.getLast().equals("(")){
                        op.addLast(sStack.removeLast());
                    }
                    sStack.removeLast();
                    int now = 0;
                    while (!op.isEmpty()){
                        final String last = op.removeLast();
                        switch (last){
                            case "+":{
                                now = now + Integer.parseInt(op.removeLast());
                                break;
                            }
                            case "-":{
                                now =now - Integer.parseInt(op.removeLast())  ;
                                break;
                            }
                            default:{
                                now=Integer.parseInt(last);
                            }
                        }
                    }
                    sStack.addLast(now+"");
                    break;
                }
                default:{
                    int now = s.charAt(i)-'0';
                    while (i+1<s.length()&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'){
                        now = now *10 - '0' + s.charAt(i+1);
                        i++;
                    }
                    sStack.addLast(now+"");
                }
            }
        }
        int now = 0;
        while (!sStack.isEmpty()){
            final String last = sStack.removeFirst();
            switch (last){
                case "+":{
                    now = now + Integer.parseInt(sStack.removeFirst());
                    break;
                }
                case "-":{
                    now = now- Integer.parseInt(sStack.removeFirst())  ;
                    break;
                }
                default:{
                    now=Integer.parseInt(last);
                }
            }
        }
        return now;
    }
}
