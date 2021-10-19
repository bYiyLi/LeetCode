import java.util.ArrayDeque;
import java.util.Deque;

public class Solution71 {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
    public static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<String>();
       // path = "/a/./b/../../c/"
        for (String s : path.split("/")) {
            switch (s){
                case "..":{
                    if (!stack.isEmpty()){
                        stack.removeLast();
                    }
                    break;
                }
                case ".":
                case "": {
                    break;
                }
                default:{
                    stack.addLast(s);
                }
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuilder builder =new StringBuilder();
        while (!stack.isEmpty()){
            builder.append("/").append(stack.removeFirst());
        }

        return builder.toString();
    }
}
