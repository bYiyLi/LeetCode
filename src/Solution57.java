import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution57 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{}, new int[]{2, 5})));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int r = newInterval[0];
        int i=0;
        for ( ; i < intervals.length; i++) {
            int [] interval = intervals[i];
            if (newInterval[0]>interval[1]){
                list.add(interval);
            }else {
                r=Math.min(interval[0],r);
                break;
            }
        }
        int l = newInterval[1];
        for (;i<intervals.length;i++){
            final int[] interval = intervals[i];
            if (newInterval[1]<interval[0]){
                break;
            }else {
                l=Math.max(l,interval[1]);
            }
        }
        list.add(new int[]{r,l});
        for (;i<intervals.length;i++){
            final int[] interval = intervals[i];
           list.add(interval);
        }
        final int[][] res = new int[list.size()][];
        for (int j = 0; j < res.length; j++) {
            res[j]=list.get(j);
        }
        return res;
    }
}
