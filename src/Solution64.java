public class Solution64 {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        final int x = grid.length;
        final int y = grid[0].length;

        for (int t = y-2;t>=0;--t){
            grid[x-1][t]+=grid[x-1][t+1];
        }
        for (int t = x-2;t>=0;--t){
            grid[t][y-1]+=grid[t+1][y-1];
        }
        for (int i = x-2;i>=0;--i){
            for (int j = y -2;j>=0;--j){
                grid[i][j]+=Math.min(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];
    }
}
