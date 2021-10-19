import java.util.Arrays;
import java.util.Map;

public class Solution462 {
    public static void main(String[] args) {

    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        final int i = nums.length / 2;
        int res = 0;
        for (int num : nums) {
            res+= Math.abs(num-nums[i]);
        }
        return res;
    }
}
