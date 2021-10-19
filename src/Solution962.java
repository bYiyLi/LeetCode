import java.util.ArrayDeque;
import java.util.Deque;

public class Solution962 {
    public static void main(String[] args) {
        System.out.println(maxWidthRamp(new int[]{9,8,1,0,1,9,4,0,4,1}));
    }
    public static int maxWidthRamp(int[] nums) {
        Deque<Integer> deque1=new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (deque1.isEmpty()||nums[deque1.getLast()]>nums[i]){
                deque1.addLast(i);
            }
        }
        if (deque1.size()==nums.length){
            return 0;
        }
        int max = 0;
        while (!deque1.isEmpty()){
            final int last = deque1.removeFirst();
            for (int i = last+1; i < nums.length; i++) {
                if (nums[last]<=nums[i]){
                    max=Math.max(max,i-last);
                }
            }
        }
        return max;
    }

}
