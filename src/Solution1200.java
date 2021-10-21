import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public static void main(String[] args) {
        minimumAbsDifference(new int[]{1,2,3,4});
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-arr[i-1]<min){
                res.clear();
                min = arr[i]-arr[i-1];
                res.add(List.of(arr[i-1],arr[i]));
            } else if (arr[i]-arr[i-1]==min) {
                res.add(List.of(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}
