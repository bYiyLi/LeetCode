public class Solution1567 {
    public static void main(String[] args) {
        System.out.println(getMaxLen(new int[]{1000000000,1000000000}));
    }
    static int [][] dp ;
    public static int getMaxLen(int[] nums) {
        int res = 0;
        dp = new int[nums.length][3];
        for (int i = 0; i < nums.length; i++) {
            res=Math.max(res,dfs(nums,i,0,1));
        }
        return res;
    }
    public static int dfs(int[] nums,int index,int max,int n){
        if (index>nums.length-1){
            return n>0?max:-1;
        }
        if (n==0){
            return -1;
        }
        if (dp[index][n+1]!=0){
            return dp[index][n+1];
        }
        final int dfs = dfs(nums, index+1,max+1, n * Integer.compare(nums[index], 0));
        final int i = Math.max(dfs, n > 0 ? max : -1);
        dp[index][n+1] = i;
        return i;
    }

}
