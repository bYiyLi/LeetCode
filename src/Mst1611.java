import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Mst1611 {
    public static void main(String[] args) {

    }
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k==0){
            return new int[]{};
        }
        Set<Integer> set = new HashSet<>();
        set.add(shorter);
        set.add(longer);
        for (int i = 1; i < k; i++) {
            Set<Integer> tem = new HashSet<>();
            for (Integer integer : set) {
                tem.add(integer+shorter);
                tem.add(integer+longer);
            }
            set=tem;
        }
        int[] res =new int[set.size()];
        int n = 0;
        for (Integer integer : set) {
            res[n]=integer;
            n++;
        }
        return res;
    }
}
