import java.util.HashMap;
import java.util.Map;

public class Solution1566 {
    public static void main(String[] args) {
        /**
         * [3,2,2,1,2,2,1,1,1,2,3,2,2]
         * 3
         * 2
         */
        System.out.println(containsPattern(new int[]{3,2,2,1,2,2,1,1,1,2,3,2,2},3,2));
    }
    public static boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i <=arr.length-(m*k); i++) {
            a:{
                int[] base =new int[m];
                System.arraycopy(arr, i, base, 0, m);
                for (int t=0;t<m*k;t++){
                    final int i1 = t + i;
                    if (arr[i1]!=base[t%m]) {
                        break a;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
