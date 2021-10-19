import java.util.Arrays;

public class Offer008 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        for (int n = 1;n<nums.length;n++){
            nums[n] += nums[n-1];
        }
        int res = Integer.MAX_VALUE;
        for (int n = 0;n<nums.length;n++){
            if (nums[n]<target){
                continue;
            }
            int tem = 0;
            while (nums[n]-nums[tem]>=target){
                tem++;
            }
            res=Math.min(res,n-tem+1);
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}
