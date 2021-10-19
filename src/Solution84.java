import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution84 {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{1,1}));
    }
    public static int largestRectangleArea(int[] heights) {
//        Deque<Integer> stack = new ArrayDeque<Integer>();
//        stack.addFirst(0);
//        int[] tem = new int[heights.length+2];
//        System.arraycopy(heights, 0, tem, 1, heights.length);
//        int max = 0;
//        for (int n =1;n<tem.length;n++){
//            while (tem[stack.getFirst()]>tem[n]){
//                final Integer ft = stack.getFirst();
//                int first = ft;
//                while (tem[first-1]>tem[ft]){first--;}
//                final int i = (n - first) * Math.max(tem[n], tem[ft]);
//                max = Math.max(i,max);
//                stack.removeFirst();
//            }
//            stack.addFirst(n);
//        }
//        return max;
        int[] tem = heights;
        int max = 0;
        for (int n=0;n<tem.length;n++){
            int f=n;
            int l=n;
            while (f-1>=0&&tem[f-1]>=tem[n]){f--;}
            while (l+1<tem.length&&tem[l+1]>=tem[n]){l++;}
            max=Math.max(max,(l-f+1)*tem[n]);
        }
        return max;
    }
}
