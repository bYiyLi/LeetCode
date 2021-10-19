import java.util.HashMap;
import java.util.Map;

public class Solution1742 {
    public static void main(String[] args) {

    }
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit ; i++) {
            int tem = i;
            int t =0;
            while (tem != 0){
                t+=tem%10;
                tem/=10;
            }
            map.put(t,map.getOrDefault(t,0)+1);
        }
        return map.values().stream().max(Integer::compareTo).get();
    }
}
