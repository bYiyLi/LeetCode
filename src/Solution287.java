import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
