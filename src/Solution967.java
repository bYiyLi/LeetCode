import java.util.*;

public class Solution967 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsSameConsecDiff(2,2)));
    }
    public static int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> list = new HashSet<>();
        for (int now  = 1;now<=9;now++){
            dfs(list,now,n-1,k);
        }
        int [] res = new  int[list.size()];
        int tem =0;
        for (Integer integer : list) {
            res[tem]=integer;
            tem++;
        }
        return res;
    }
    final static void dfs(Set<Integer> list,int now, int n , int k){
        if (n==0){
            list.add(now);
            return;
        }
        final int i = now % 10;
        if (i-k>=0){
            dfs(list,now*10+i-k,n-1,k);
        }
        if (i+k<10){
            dfs(list,now*10+i+k,n-1,k);
        }
    }
}
