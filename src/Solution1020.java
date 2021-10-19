public class Solution1020 {
    public static void main(String[] args) {
        System.out.println(numEnclaves(new int[][]{{0,0,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}}));

    }
    public static int numEnclaves(int[][] grid) {
        int res = 0;
        for (int y = 0; y < grid.length; y++) {
            if (grid[y][0]==1){
                dfs(grid,0,y);
            }
            if (grid[y][grid[0].length-1]==1){
                dfs(grid,grid[0].length-1,y);
            }
        }
        for (int x = 0; x < grid[0].length; x++) {
            if (grid[0][x]==1){
                dfs(grid,x,0);
            }
            if (grid[grid.length-1][x]==1){
                dfs(grid,x,grid.length-1);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                if (grid[i][i1]==1){
                    res++;
                }
            }
        }
        return res;
    }
    static void dfs(int[][] grid,int x,int y){
        grid[y][x]=0;
        if (x>0&&grid[y][x-1]==1){
            dfs(grid,x-1,y);
        }
        if (y>0&&grid[y-1][x]==1){
            dfs(grid,x,y-1);
        }
        if (y<grid.length-1&&grid[y+1][x]==1){
            dfs(grid,x,y+1);
        }
        if (x<grid[0].length-1&&grid[y][x+1]==1){
            dfs(grid,x+1,y);
        }
    }
}
