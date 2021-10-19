public class Solution787 {
    public static void main(String[] args) {
        System.out.println(findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,0));
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[n][k+1];
        int tem =dfs(dp,flights,src,dst,k);
        return (tem == Integer.MAX_VALUE)?-1:tem;
    }
    static int dfs(int[][] dp,int[][] flights,int from,int to,int k){
        if (from==to){
            return 0;
        }
        if (k<0){
            return Integer.MAX_VALUE;
        }
        if (dp[from][k]!=0){
            return dp[from][k];
        }
        int res = Integer.MAX_VALUE;
        for (int[] flight : flights) {
            if (flight[0]==from) {
                final int dfs = dfs(dp,flights, flight[1], to, k - 1);
                if (dfs!=Integer.MAX_VALUE){
                    res = Math.min(res,dfs+flight[2]);
                }
            }
        }
        dp[from][k] = res;
        return res;
    }
}
