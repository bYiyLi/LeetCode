import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MST1624 {

    public static void main(String[] args) {

    }
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;

        while (l<r){
            final int i = nums[l] + nums[r];
            if (i==target){
                List<Integer> list = new ArrayList<>();
                list.add(nums[l]);
                list.add(nums[r]);
                res.add(list);
                l++;
                r--;
            }else if(i > target){
                r--;
            }else if (i<target){
                l++;
            }
        }
        return res;
    }
}
