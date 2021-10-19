import java.util.Arrays;

public class Solution1561 {
    public static void main(String[] args) {
        System.out.println(
                maxCoins(new int[]{2,4,1,2,7,8})
        );
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l = piles.length;
        int n = l/3;
        int res =0;
        for (int i = l-2; i >= n; i-=2) {
            res+=piles[i];
        }
        return res;
    }
}
