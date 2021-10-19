import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution888 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2,5}, new int[]{2,5})));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int allA=0;
        for (int aliceSize : aliceSizes) {
            allA+=aliceSize;
        }
        int allB=0;
        Set<Integer> set = new HashSet<>();
        for (int bobSize : bobSizes) {
            allB+=bobSize;
            set.add(bobSize);
        }
        final int i = (allA - allB) / 2;
        if (i*2!=allA-allB){
            return new int[0];
        }
        for (int aliceSize : aliceSizes) {
            if (set.contains(aliceSize-i)){
                return new int[]{aliceSize,aliceSize-i};
            }
        }
        return new int[0];


    }
}
