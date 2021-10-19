import java.util.Objects;

public class Solution1022 {
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
    public int sumRootToLeaf(TreeNode root) {
       return sumRootToLeaf(0,root);
    }
    public int sumRootToLeaf(int n,TreeNode root) {
        if (Objects.isNull(root)){
            return n;
        }
       return sumRootToLeaf(n<<1+root.val,root.left)+sumRootToLeaf(n<<1+root.val,root.right);
    }
}
