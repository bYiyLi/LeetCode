import java.util.Arrays;

public class Mst1610 {
    public static void main(String[] args) {

    }
    public int maxAliveYear(int[] birth, int[] death) {
        int [] dp =new int[101];
        for (int i = 0; i < dp.length; i++) {
            int all=0;
            for (int i1 = 0; i1 < birth.length; i1++) {
                if (i+1900>=birth[i1]&&i+1900<=death[i1]){
                    all++;
                }
            }
            dp[i]=all;
        }
        int res= 0;
        int tem = 0;
        for (int i = 0; i < dp.length; i++) {
            if (tem<dp[i]){
                tem=dp[i];
                res=i;
            }
        }
        return res+1900;
    }
}
