import java.util.ArrayList;
import java.util.List;

public class Solution1441 {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,2,3},3));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int size=0;
        for (int i = 1; i <=n && size<target.length; i++) {
            if (i==target[size]){
                size++;
                list.add("Push");
            }else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
