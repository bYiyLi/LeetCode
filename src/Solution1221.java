import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
    public static int balancedStringSplit(String s) {
        int tf =0;
        int re = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                tf--;
            }else {
                tf++;
            }
            if (tf==0){
                re++;
            }
        }
        return re;
    }
}
