public class Solution1219 {
    public static void main(String[] args) {
        System.out.println(getMaximumGold(new int[][]{{0,6,0},{5,8,7},{0,9,0}}));
    }
    public static int getMaximumGold(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                res=Math.max(res,maxdfs(grid,i,j));
            }
        }
        return res;
    }
    public  static int maxdfs(int[][] grid,int i,int j){
        if (i<0||j<0||grid.length-1<i||grid[0].length-1<j||grid[i][j]==0){
            return 0;
        }
        final int i1 = grid[i][j];
        final int i2 = grid[i][j];
        grid[i][j]=0;
        final int max = Math.max(Math.max(maxdfs(grid, i + 1, j), maxdfs(grid, i - 1, j)), Math.max(maxdfs(grid, i, j + 1), maxdfs(grid, i, j - 1)));
        grid[i][j] = i2;
        return i1+max;
    }
}
