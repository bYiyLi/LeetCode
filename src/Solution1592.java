import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution1592 {
    public static void main(String[] args) {
        System.out.println(reorderSpaces(" practice   makes   perfect"));
    }
    public static String reorderSpaces(String text) {
        if (text.isBlank()){
            return text;
        }
        final char[] chars = text.toCharArray();
        int pa = 0;
        Deque<String> list  = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' '){
                final String s = builder.toString();
                if (!s.isBlank()){
                    list.addLast(s);
                }
                builder.delete(0,builder.length());
                pa++;
            }else {
                builder.append(aChar);
            }
        }
        final String s = builder.toString();
        if (!s.isBlank()){
            list.addLast(s);
        }
        builder.delete(0,builder.length());
        int n;
        int y;
        if (list.size()-1 == 0){
            n = 0;
            y = pa;
        }else {
            n = pa/(list.size()-1);
            y = pa%(list.size()-1);
        }
         ;



        builder.append(list.removeFirst());
        while (!list.isEmpty()){
            builder.append(" ".repeat(n));
            builder.append(list.removeFirst());
        }
        builder.append(" ".repeat(y));
        return builder.toString();
    }
}
