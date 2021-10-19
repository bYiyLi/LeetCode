import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1403 {
    public static void main(String[] args) {

    }
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        long all = 0;
        for (int num : nums) {
            all+=num;
        }
        int tem = 0;
        List<Integer> res= new ArrayList<>();
        for (int i = nums.length-1; i>=0 ; --i) {
            tem+=nums[i];
            res.add(nums[i]);
            if (tem>all/2){
                break;
            }
        }
        return res;
    }
}
