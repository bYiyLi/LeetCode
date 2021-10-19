import java.util.HashSet;
import java.util.Set;

public class Solution997 {
    public static void main(String[] args) {
        System.out.println(findJudge(3,new int[][]{{1,2},{2,3}}));
    }
    public static int findJudge(int n, int[][] trust) {
        Set<Integer> set = new HashSet<>();
        for (int[] ints : trust) {
            set.add(ints[1]);
        }
        for (int[] ints : trust) {
            set.remove(ints[0]);
        }
        if (set.size()==1){
            return set.iterator().next();
        }
        return -1;
    }
}
