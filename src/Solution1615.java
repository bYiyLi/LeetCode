import java.util.*;
import java.util.stream.Collectors;

public class Solution1615 {
    public static void main(String[] args) {
        System.out.println(maximalNetworkRank(5,new int[][]{{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}}));
    }

    public static int maximalNetworkRank(int n, int[][] roads) {
        int[] counter = new int[n];
        int[][] connected = new int[n][n];
        for (int[] r : roads) {
            ++counter[r[0]];
            ++counter[r[1]];
            connected[r[0]][r[1]] = connected[r[1]][r[0]] = 1;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                ans = Math.max(ans, counter[i] + counter[j] - connected[i][j]);
            }
        }
        return ans;
    }
}
