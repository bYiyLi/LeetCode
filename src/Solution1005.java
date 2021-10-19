import java.util.Arrays;

public class Solution1005 {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3},1));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }
        int all = 0;
        for (int num : nums) {
            all+=num;
        }
        return all;
    }
}
