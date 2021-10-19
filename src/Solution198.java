public class Solution198 {
    public static void main(String[] args) {

        System.out.println(rob(new int[]{0,0,0,0}));
    }
    public static int rob(int[] nums) {
        dp=new int[nums.length];
        return dfs(nums,0);
    }
    static int[] dp ;
    public static int dfs (int[] nums, int index){
        if (index==nums.length-1){
            return nums[nums.length-1];
        }
        if (index==nums.length-2){
            return Math.max(nums[nums.length-2],nums[nums.length-1]);
        }
        if (nums[index]==0){
            return dfs(nums,index+1);
        }
        if (dp[index]!=0){
            return dp[index];
        }
        final int max = Math.max(dfs(nums, index + 1), nums[index]+dfs(nums, index + 2));
        dp[index]=max;
        return max;
    }
}
