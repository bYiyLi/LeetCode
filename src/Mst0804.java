import java.util.*;

public class Mst0804 {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<List<Integer>> tem= new ArrayList<>();
        res.add(new ArrayList<>());
        for (int num : nums) {
            for (List<Integer> re : res) {
                List<Integer> list = new ArrayList<>(List.copyOf(re));
                list.add(num);
                tem.add(list);
            }
            res.addAll(tem);
            tem.clear();
        }
        return res;
    }

}
