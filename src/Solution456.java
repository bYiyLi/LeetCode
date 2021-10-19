import java.util.ArrayDeque;
import java.util.Deque;

public class Solution456 {
    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{1,7,3,4}));
    }
    public static boolean  find132pattern(int[] nums) {
        int max = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i]<max){
                return true;
            }
            while (!stack.isEmpty() && stack.getLast()<nums[i]){
               max = stack.removeLast();
            }
            stack.addLast(nums[i]);
        }
        return false;
    }
}
