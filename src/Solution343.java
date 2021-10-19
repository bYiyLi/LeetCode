import java.util.ArrayList;
import java.util.List;

public class Solution343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(8));
    }
    public static int integerBreak(int n) {
        int res = 0;
        for (int i = 1; i <= n/2 +1; i++) {
            int now=1;
            int t = n;
            boolean tf = true;
            while (tf || t - i > 0){
                now*=i;
                t-=i;
                tf=false;
            }
            now*=t;
            res=Math.max(res,now);
        }
        return res;
    }

}
