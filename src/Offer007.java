import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer007 {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        final int length = nums.length;
        for (int i = 0; i < length-2; i++) {
            int r = i+1;
            int l = length-1;
            int tar = -nums[i];
            while (r<l){
                final int i1 = nums[r] + nums[l];
                if (i1 == tar){
                    list.add(List.of(nums[i],nums[r],nums[l]));
                    while (r+1<length&&nums[r]==nums[r+1]){
                        r++;
                    }
                    while (l+1<length&&nums[l]==nums[l+1]){
                        l--;
                    }
                    r++;
                    l--;
                }else if (i1>tar){
                    l--;
                }else {
                    r++;
                }
            }
            while (i+1<length&&nums[i]==nums[i+1]){
                i++;
            }
        }
        return list;
    }
}
