import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution113 {
    public static void main(String[] args) {
        System.out.println(pathSum(new Solution100.TreeNode(1,new Solution100.TreeNode(2),null),3));
    }
    public static List<List<Integer>> pathSum(Solution100.TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();;
        dfs(res,list,root,targetSum);
        return res;
    }
     static void dfs(List<List<Integer>> res,List<Integer> list,Solution100.TreeNode root,int targetSum){
        if (Objects.isNull(root)){
            if (list.stream().mapToInt(i->i).sum()==targetSum) {
                res.add(list);
                return;
            }
        }
        list.add(root.val);
        dfs(res,list,root.left,targetSum);
        dfs(res,list,root.right,targetSum);
        list.remove(list.size()-1);
    }
}
