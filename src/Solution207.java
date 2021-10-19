import java.util.HashSet;
import java.util.Set;

public class Solution207 {
    public static void main(String[] args) {
        System.out.println(canFinish(2,new int[][]{{1,0}}));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] ints  = new int[numCourses];
        int [] use  = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            ints[prerequisite[1]]+=1;
        }
        boolean res = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]==0){
                Set<Integer> set = new HashSet<>();
                set.add(i);
                use[i]=1;
                if (!dfs(prerequisites,i,set,use)) {
                    return false;
                }
                set.remove(i);
                res=true;
            }
        }
        for (int i : use) {
            if (i==0){
                return false;
            }
        }
        return res;
    }
    public static boolean dfs(int[][] prerequisites, int now, Set<Integer> set,int [] use){
        use[now]=1;
        for (int[] prerequisite : prerequisites) {
            if (prerequisite[0]==now){
                if (set.contains(prerequisite[1])){
                    return false;
                }
                set.add(prerequisite[1]);
                boolean dfs = dfs(prerequisites, prerequisite[1], set,use);
                if (!dfs){
                    return false;
                }
                set.remove(prerequisite[1]);
            }
        }
        return true;
    }
}
