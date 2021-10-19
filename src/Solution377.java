import java.util.HashMap;
import java.util.Map;

public class Solution377 {
    public static void main(String[] args) {


    }
    Map<Integer,Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        return dfs(nums,target,0);
    }
    int dfs(int[] nums, int target,int now){
        int res = 0;
        if (target==now){
            return 1;
        }
        if (target<now){
            return 0;
        }
        if (map.containsKey(now)){
            return map.get(now);
        }
        for (int n:nums){
            res+=dfs(nums,target,now+n);
        }
        map.put(now,res);
        return res;
    }
}
