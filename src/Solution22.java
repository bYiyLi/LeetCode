import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        final ArrayList<String> res = new ArrayList<>();
        dfs(res,new StringBuilder(),n,n);
        return res;
    }
    public static void dfs(ArrayList<String> res,StringBuilder now,int r,int l){
        if (r==l&&l==0){
            res.add(now.toString());
            return;
        }
        if (r==l){
            now.append('(');
            dfs(res, now, r-1, l);
            return;
        }
        if (r>0){
            now.append('(');
            dfs(res, now, r-1, l);
            now.deleteCharAt(now.length()-1);
        }

        if (l>0){
            now.append(')');
            dfs(res, now, r, l-1);
            now.deleteCharAt(now.length()-1);
        }
    }
}
