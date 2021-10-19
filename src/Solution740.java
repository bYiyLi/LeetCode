import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution740 {
    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{2,2,3,3,3,4}));
    }
    static int []dp=new int[1000007];
    static int []num=new int[1000007];

    public static int deleteAndEarn(int[] nums) {
        for (int n=0;n<10007;n++){
            num[n]=dp[n]=0;
        }
        for (int n : nums) {
            num[n]++;
        }
        dp[dp.length-1]=0;
        dp[dp.length-2]=0;
        for (int n =dp.length-3;n>=0;--n){
            dp[n]=Math.max(n*num[n]+dp[n+2],dp[n+1]);
        }
        return dp[0];
    }
}
