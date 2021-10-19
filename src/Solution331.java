import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution331 {
    public static void main(String[] args) {
        System.out.println(isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }
    //"9,3,4,#,#,1,#,#,2,#,6,#,#"
    public static boolean isValidSerialization(String preorder) {
        final String[] chars = preorder.split(",");
        Deque<String> queue = new LinkedList<>();
        for (String aChar : chars) {
            while (aChar.equals("#") && queue.size()>1){
                final String f = queue.removeLast();
                final String s = queue.removeLast();
                if (!(f.equals("#")&&!s.equals("#"))){
                    queue.addLast(s);
                    queue.addLast(f);
                    break;
                }
            }
            queue.addLast(aChar);
        }
        return queue.size()==1&&queue.peek().equals("#");
    }
}
