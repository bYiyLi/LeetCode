public class Solution1800 {
    public static void main(String[] args) {

    }
    public int maxAscendingSum(int[] nums) {
        int res = 0;
        int now = nums[0];
        for (int n =1;n<nums.length;n++){
            if (nums[n]-nums[n-1]>0){
                now+=nums[n];
            }else {
                res=Math.max(res,now);
                now=nums[n];
            }
        }
        res=Math.max(res,now);
        return res;
    }
}
