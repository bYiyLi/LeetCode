public class Solution1824 {
    public static int minSideJumps(int[] obstacles) {
        int[][] dp=new int[4][obstacles.length];
        dp[1][obstacles.length-1]=obstacles[obstacles.length-1]==1?Integer.MAX_VALUE:0;
        dp[2][obstacles.length-1]=obstacles[obstacles.length-1]==2?Integer.MAX_VALUE:0;
        dp[3][obstacles.length-1]=obstacles[obstacles.length-1]==3?Integer.MAX_VALUE:0;

        for (int i = obstacles.length-2;i>=0;--i){
            for (int n=1;n<4;n++){
                if (obstacles[i]==n){
                    dp[n][i]=Integer.MAX_VALUE;
                    continue;
                }
                if (dp[n][i+1]==Integer.MAX_VALUE){
                    dp[n][i]=Math.min(Math.min(dp[1][i]==Integer.MAX_VALUE?Integer.MAX_VALUE:dp[1][i+1]
                            ,dp[2][i]==Integer.MAX_VALUE?Integer.MAX_VALUE:dp[2][i+1]),
                            dp[3][i]==Integer.MAX_VALUE?Integer.MAX_VALUE:dp[3][i+1])+1;
                }else {
                    dp[n][i]=dp[n][i+1];
                }
            }
        }
        return dp[2][0];
    }
//    public static int minSideJumps(int[] obstacles) {
//        dp=new int[4][obstacles.length];
//        return dfs(obstacles,0,2);
//    }
//    static int[][] dp;
//    public static int dfs(int[] obstacles,int index,int n){
//        if (obstacles[index]==n){
//            return Integer.MAX_VALUE;
//        }
//        if (dp[n][index]!=0){
//            return dp[n][index];
//        }
//        for (int t = index;t<obstacles.length-1;t++){
//            if (obstacles[index+1]==n){
//                int i = (n + 1) % 3 == 0 ? 3 : (n + 1) % 3;
//                final int d1 = dfs(obstacles, index, i);
//                i = (n - 1) % 3 == 0 ? 3 : (n - 1) % 3;
//                final int d2 = dfs(obstacles, index,i);
//                dp[n][index] = 1+Math.min(d1,d2);
//                return dp[n][index];
//            }
//            index++;
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        final long l = System.currentTimeMillis();
        System.out.println(minSideJumps(new int[]{0,1,2,3,0}));
        System.out.println(System.currentTimeMillis()-l);
    }
}
