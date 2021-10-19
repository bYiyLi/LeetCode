import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
    public static int trap(int[] height) {
        int re = 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (int n=0;n<height.length;n++){
            while (!stack.isEmpty()&&height[stack.getLast()]<height[n]){
                final Integer last = stack.removeLast();
                if (!stack.isEmpty()){
                    re+=(Math.min(height[n],height[stack.getLast()])-height[last])*(n-stack.getLast()-1);
                }
            }
            stack.addLast(n);
        }
        return re;
    }
}
