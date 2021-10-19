import java.util.HashSet;
import java.util.Set;

public class MST1621 {
    public static void main(String[] args) {
        System.out.println(findSwapValues(new int[]{4, 1, 2, 1, 1, 2},new int[]{3, 6, 3, 3}));
    }
    public static int[] findSwapValues(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        int al1 = 0;
        for (int i : array1) {
            set.add(i);
            al1+=i;
        }
        int al2 = 0;
        for (int i : array2) {
            al2+=i;
        }
        int i = (al1 + al2) / 2;
        if (i * 2 != al1+al2){
            return new int[2];
        }
        i = (al2 - al1) / 2;
        for (int t : array2) {
            if (set.contains( t - i)){
                return new int[]{t-i,t};
            }
        }
        return new int[2];
    }
}
