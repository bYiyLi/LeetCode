import java.util.HashMap;
import java.util.Map;

public class LCP39 {
    public static void main(String[] args) {

    }
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int[] ints : source) {
            for (int anInt : ints) {
                map.put(anInt,map.getOrDefault(anInt,0)+1);
            }
        }
        int res = 0;
        for (int[] ints : target) {
            for (int anInt : ints) {
                if (map.containsKey(anInt)){
                    final Integer integer = map.get(anInt);
                    if (integer>0){
                        map.put(anInt,integer-1);
                    }else {
                        map.remove(anInt);
                        res++;
                    }
                }else {
                    res++;
                }
            }
        }
        return res;
    }
}
