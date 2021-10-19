import java.util.HashSet;

public class Solution560 {
    public static void main(String[] args) {

    }
    public int subarraySum(int[] nums, int k) {
        int res=0;
        HashSet<Integer> set = new HashSet();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
            set.add(nums[i]);
        }
        for (int num : nums) {
            if (set.contains(num + k)) {
                res++;
            }
        }
        return res;
    }
}
