import java.util.Deque;

public class Solution1614 {
    public int maxDepth(String s) {
        int n = 0;
        int res = 0;
        for (char c:s.toCharArray()){
            if (c=='('){
                n++;
            }
            if (c==')'){
                n--;
            }
            res = Math.max(res,n);
        }
        return res;
    }
}
