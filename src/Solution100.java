import java.util.Objects;

public class Solution100 {

    static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }


    }

    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(Objects.isNull(p)!=Objects.isNull(q)){
            return false;
        }
        if(Objects.isNull(q)){
            return true;
        }
        boolean b = p.val == q.val;
        if (!b){
            return false;
        }
        if (Objects.isNull(p.left)==Objects.isNull(q.left)){
            if (Objects.nonNull(p.left)){
                b=isSameTree(q.left,p.left);
            }
        }else {
            return false;
        }
        if (!b){
            return false;
        }
        if (Objects.isNull(p.right)==Objects.isNull(q.right)){
            if (Objects.nonNull(p.right)){
                b=isSameTree(q.right,p.right);
            }
        }else {
            return false;
        }
        return b;
    }
}
