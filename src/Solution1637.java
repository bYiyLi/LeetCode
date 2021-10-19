import java.util.Arrays;
import java.util.Comparator;

public class Solution1637 {
    public static void main(String[] args) {

    }
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt((int[] f) -> f[0]));
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            res = Math.max(res,points[i][0]-points[i-1][0]);
        }
        return res;
    }
}
