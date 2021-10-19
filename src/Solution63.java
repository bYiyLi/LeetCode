public class Solution63 {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int y = obstacleGrid.length;
        final int x = obstacleGrid[0].length;
        if (obstacleGrid[y-1][x-1]==1){
            return 0;
        }
        obstacleGrid[y-1][x-1] = 1;
        for (int n=y-2;n>=0;--n){
            if (obstacleGrid[n][x-1]==1) {
                obstacleGrid[n][x-1]=0;
            }else {
                obstacleGrid[n][x-1]=obstacleGrid[n+1][x-1];
            }
        }
        for (int n=x-2;n>=0;--n){
            if (obstacleGrid[y-1][n]==1) {
                obstacleGrid[y-1][n]=0;
            }else {
                obstacleGrid[y-1][n]=obstacleGrid[y-1][n+1];
            }
        }
        for (int i = 0; i < obstacleGrid.length-1; i++) {
            for (int j = 0; j < obstacleGrid[0].length-1; j++) {
                if (obstacleGrid[i][j]==0){
                    obstacleGrid[i][j]=1;
                }else {
                    obstacleGrid[i][j]=0;
                }
            }
        }
        for (int i = obstacleGrid.length-2;i>=0;--i){
            for (int j = obstacleGrid[0].length-2; j >=0; --j) {
                if (obstacleGrid[i][j]!=0){
                    obstacleGrid[i][j]=obstacleGrid[i+1][j]+obstacleGrid[i][j+1];
                }
            }
        }
        return obstacleGrid[0][0];

//        int [][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
//        return dfs(obstacleGrid,0,0,   dp );
    }
   static   int dfs(int[][] obstacleGrid,int x,int y,  int [][] dp ){
        if (x>obstacleGrid.length-1||y>obstacleGrid[0].length-1||obstacleGrid[x][y]==1){
            return 0;
        }
        if (x==obstacleGrid.length-1&&y==obstacleGrid[0].length-1){
            return 1;
        }
        if (dp[x][y]!=0){
            return dp[x][y];
        }

        final int d1 = dfs(obstacleGrid, x + 1, y,dp);
        final int d2 = dfs(obstacleGrid, x, y+1,dp);
       dp[x][y]=d1+d2;
        return d1+d2;
    }
}
