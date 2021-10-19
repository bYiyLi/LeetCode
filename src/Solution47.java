import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution47 {
    Map<Integer,Integer> map = new HashMap<>();
    int n ;
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,null,0);
        return res;
    }
    public void dfs(List<List<Integer>> res,List<Integer> list,int n){
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            final Integer value = item.getValue();
            if (value>0){
                if (n==0){
                    list = new ArrayList<>();
                }
                final List<Integer> now = new ArrayList<>(List.copyOf(list));
                item.setValue(value - 1);
                now.add(item.getKey());
                if (n!=this.n-1){
                    dfs(res,now,n+1);
                }
                item.setValue(value);
                if (n==this.n-1){
                    res.add(now);
                }
            }
        }
    }
}
