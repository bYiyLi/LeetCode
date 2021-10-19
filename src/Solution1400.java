import java.util.HashMap;
import java.util.Map;

public class Solution1400 {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String s, int k) {
        Map<Character,Integer> map  = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int n = 0;
        for (Integer value : map.values()) {
            if (value==1){
                n++;
            }
        }
        return n>k;

    }
}
