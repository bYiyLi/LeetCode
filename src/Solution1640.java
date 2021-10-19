import java.util.HashSet;
import java.util.Set;

public class Solution1640
{
    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{91,4,64,78},new int[][]{{78},{4,64},{91}}));
    }
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Set<String> stringSet = new HashSet<>();
        for (int[] piece : pieces) {
            StringBuilder builder = new StringBuilder();
            for (int i : piece) {
                builder.append(i).append('-');
            }
            stringSet.add(builder.toString());
        }
        final int length = arr.length;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(arr[i]).append('-');
            if (stringSet.contains(builder.toString())){
                stringSet.remove(builder.toString());
                builder.delete(0,builder.length());
            }
        }
        return builder.length()==0;
    }
}
