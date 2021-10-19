import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(i->i[0]));
        int r = intervals[0][0];
        int l = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (l>=intervals[i][0]){
                l=Math.max(intervals[i][1],l);
            }else {
                list.add(new int[]{r,l});
                r=intervals[i][0];
                l=intervals[i][1];
            }
        }
        list.add(new int[]{r,l});
        int [][] res= new int[list.size()][];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
