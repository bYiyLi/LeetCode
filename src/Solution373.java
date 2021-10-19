import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution373 {


    public Solution373(Solution373 solution373) {

    }

    static interface Fun{
        void newA(Solution373 a);
    }
    void asdf(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        final Fun asdf =  Solution373::new;
        asdf.newA(null);
//        System.out.println(kSmallestPairs(new int[]{1,2,3,4,5,6},new int[]{3,5,7,9},3));
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]> (k, (f,s)->(s[0]+s[1])-(f[0]+f[1]));
        for (int n:nums1){
            for (int i : nums2) {
                queue.add(new int[]{n,i});
                if (queue.size()>k){
                    queue.remove();
                }
            }
        }
        return queue.stream().sorted(Comparator.comparingInt(f -> (f[1] + f[0]))).limit(k).map(item -> List.of(item[0], item[1])).collect(Collectors.toList());
    }
}
