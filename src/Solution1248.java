import java.util.ArrayList;
import java.util.List;

public class Solution1248 {
    public static void main(String[] args) {

    }
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        List<Integer> index = new ArrayList<>();
        index.add(-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==1){
                index.add(i);
            }
        }
        index.add(nums.length);
        for (int i = 1; i+k < index.size(); i++) {
            res+=(index.get(i)-index.get(i-1)) * (index.get(k+i)-index.get(k+i-1));
        }
        return res;
    }
}
