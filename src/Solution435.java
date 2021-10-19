import java.util.Arrays;

public class Solution435 {
    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{2,5},{5,9},{3,5},{3,4},{2,3},{1,4}}));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(int [] f,int [] s)->{
            if (f[0]-s[0]>0){
                return 1;
            }else if (f[0]==s[0]){
                return f[1]-s[1];
            }
            return -1;
        });
        int re = 0;
        int min = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0]>=min){
                min = interval[1];
            }else {
                min=Math.min(min,interval[1]);
                re++;
            }
        }
        return re;
    }
}
