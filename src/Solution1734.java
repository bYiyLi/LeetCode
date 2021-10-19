import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1734 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{3, 1})));
    }
    public static int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] perm = new int[n];
        perm[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
//        int[] dp = new int[encoded.length+1];
//        for (int n=1;n<encoded.length+1;n++){
//            dp[0] = n;
//            Set<Integer> set =new HashSet<>();
//            int size =0;
//            for (int i = 1; i < dp.length; i++) {
//                dp[i]=dp[i-1]^encoded[i-1];
//                if (dp[i]<=0||dp[i]>encoded.length+1){
//                    break;
//                }
//                if (set.contains(dp[i])) {
//                    break;
//                }
//                size++;
//                set.add(dp[i]);
//            }
//            if (size==dp.length-1){
//                break;
//            }
//            set.clear();
//        }
//        return dp;
    }
}
