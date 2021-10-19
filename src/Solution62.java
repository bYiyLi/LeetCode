public class Solution62 {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for (int t =0;t<n;t++){
            dp[m-1][t]=1;
        }
        for (int t =0;t<m;t++){
            dp[t][n-1]=1;
        }
        for (int y=m-2;y>=0;--y){
            for (int x = n-2;x>=0;--x){
                dp[y][x] =  dp[y+1][x]+ dp[y][x+1];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {

    }
}
