import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution1711 {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,1,1,3,3,3,7}));
    }
    public static int countPairs(int[] deliciousness) {
        int res =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : deliciousness) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (final Map.Entry<Integer, Integer> item : map.entrySet()) {
            final Integer value = item.getValue();
            final Integer key = item.getKey();
            for (int w = 0; w < 32; w++) {
                final int k2 = (1 << w) - key;
                if (map.containsKey(k2)) {
                    final Integer v2 = map.get((1 << w) - key);
                    if (key.equals(k2)) {
                        int tem = 0;
                        for (int n = 1; n < value; n++) {
                            tem += n;
                        }
                        res += tem;
                    } else {
                        res += value * v2;
                    }
                }
            }
            item.setValue(0);
        }





//        for (int i = 0; i < deliciousness.length; i++) {
//            for (int j=i+1;j<deliciousness.length;j++){
//                final int all = deliciousness[i] + deliciousness[j];
//                for (int e=0;e<32;e++){
//                    if (all == (1<<e)){
//                        res++;
//                        break;
//                    }
//                }
//            }
//        }
        return res;
    }
}

