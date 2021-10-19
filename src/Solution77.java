import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution77 {
    public static void main(String[] args) {
        System.out.println(combine(3,2));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
            combine(1,n,k,new ArrayList<>(),list);
//        }
        return list;
    }
    public static void combine(int start,int n, int k,List<Integer> now,List<List<Integer>> list) {
        if (k==0){
            list.add(now);
        }
        for (int i = start; i <= n; i++) {
            final ArrayList<Integer> integers = new ArrayList<>(List.copyOf(now));
            integers.add(i);
            combine(i+1,n,k-1,integers,list);
        }
    }

}
