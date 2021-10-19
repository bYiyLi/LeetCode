import java.util.HashMap;
import java.util.Map;

public class Solution1217 {
    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{2,2,2,3,3}));
    }
    public static int minCostToMoveChips(int[] position) {
        Map<Integer,Integer> map =new HashMap<>();
        for (int i : position) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for (Integer integer : map.keySet()) {
            int tem = 0;
            for (Integer now : map.keySet()) {
                if (Math.abs(now-integer)%2!=0){
                    tem+= map.get(now);
                }
            }
            min = Math.min(min,tem);
        }
        return min;
    }
}
