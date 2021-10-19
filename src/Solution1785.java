import java.util.Arrays;

public class Solution1785 {
    public static void main(String[] args) {
        System.out.println(minElements(new int[]{1,-1,1},3,-4));
    }
    public static int minElements(int[] nums, int limit, int goal) {
        long all = 0;
        for (int num : nums) {
            all+=num;
        }
        int res = 0;
        long abs = Math.abs(all - goal);
        final int lim = Math.abs(limit);
        res= (int) (abs/lim);
        if (abs%lim!=0){
            res++;
        }
        return res;
    }

}
