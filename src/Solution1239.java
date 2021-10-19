import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1239 {
    public static void main(String[] args) {
        System.out.println(maxLength(new ArrayList<String>(Arrays.asList("cha","r","act","ers"))));
    }
    public static int maxLength(List<String> arr) {
        return dfs(arr,0,0);
    }
    public static int dfs(List<String> arr,int index,int tf){
        final int size = arr.size();
        if (index>=size){
            return 0;
        }
        final String s = arr.get(index);
        final char[] chars = s.toCharArray();
        final int d1 = dfs(arr, index + 1, tf);
        boolean t = false;
        for (char aChar : chars) {
            final int i = 1 << (aChar - 'a');
            if ((i & tf) == i) {
                t = true;
            }
            tf = (1 << (aChar - 'a') | tf);
        }
        if (t){
            for (char aChar : chars) {
                tf &= ((1 << 31) - 1) ^ (1 << (aChar - 'a')) ;
            }
            return d1;
        }else{
            final int d2 = dfs(arr, index + 1, tf) + chars.length;
            return Math.max(d2,d1);
        }
    }
}
