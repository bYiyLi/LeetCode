import java.util.HashMap;
import java.util.Map;

public class SolutionMst0101 {
    public static void main(String[] args) {

    }
    public boolean isUnique(String astr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < astr.length(); i++) {
            map.put((int)astr.charAt(i),map.getOrDefault((int)astr.charAt(i),0)+1);
        }
        for (Integer value : map.values()) {
            if (value>1){
                return false;
            }
        }
        return true;
    }
}
