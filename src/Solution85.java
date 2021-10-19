import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution85 {
    public static void main(String[] args) {
        /**
         * [["1","0","1","0","0"],
         * ["1","0","1","1","1"],
         * ["1","1","1","1","1"],
         * ["1","0","0","1","0"]]
         */
        System.out.println(maximalRectangle(new char[][]{{'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                                                        {'1','1','1','1','1'},
                                                         {'1','1','1','1','1'}}));
    }
    public static int maximalRectangle(char[][] matrix) {
        if(matrix.length<1||matrix[0].length<1){
            return 0;
        }
        int [] now = new int[matrix[0].length+2];
        for (int i = 0; i < matrix[0].length; i++) {
            now[i+1]=matrix[0][i]-'0';
        }
        int n=0;
        int max = 0;
        while (n<matrix.length){
            max = Math.max(max,maxArea(now));
            if (n+1>=matrix.length){
                break;
            }
            n++;
            for (int i =0;i<matrix[0].length;i++){
                if (matrix[n][i] == '1'){
                    now[i+1]++;
                }else {
                    now[i+1] = 0;
                }
            }
        }
        return max;
    }
    public  static int maxArea(int[] list){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(0);
        int max =0;
        for (int i=1;i<list.length;i++){
            while (!stack.isEmpty() && list[stack.getLast()]>list[i]){
                final int integer = stack.removeLast();
                int tem = integer-1;
                while (list[tem]>list[integer]){
                    tem--;
                }
                max=Math.max(max,(i-tem-1)*list[integer]);
            }
            stack.addLast(i);
        }
        return max;
    }
}
