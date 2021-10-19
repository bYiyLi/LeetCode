import java.util.Arrays;
import java.util.Comparator;

public class Solution1037 {
    public static void main(String[] args) {
        System.out.println(isBoomerang(new int[][]{{1,1},{2,3},{3,2}}));
    }
    public static boolean isBoomerang(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(i->i[0]));
        return   (points[1][0] - points[0][0])*
                (points[2][1]-points[0][1]) ==
                (points[1][1]-points[0][1])
                        * (points[2][0]-points[0][0]);
    }
}
