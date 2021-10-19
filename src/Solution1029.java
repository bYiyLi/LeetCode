import java.util.*;

public class Solution1029 {
    public static void main(String[] args) {
        System.out.println(twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}));
    }
    public static int twoCitySchedCost(int[][] costs) {


        int[][] map = new int[costs.length][2];
        for (int i = 0; i < costs.length; i++) {
            map[i][0] = costs[i][0]-costs[i][1];
            map[i][1] = i;
        }
        Arrays.sort(map, Comparator.comparingInt(f -> f[0]));
        int res = 0;
        int n = 0;
        for (int[] value : map) {
            if (n>=costs.length/2){
                res+=costs[value[1]][1];
            }else {
                res+=costs[value[1]][0];
            }
            n++;
        }
        return res;
    }
}
