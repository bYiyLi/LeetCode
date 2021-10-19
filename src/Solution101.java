import java.util.Objects;

public class Solution101 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }
        public boolean isSymmetric(TreeNode t1,TreeNode t2) {
            if (Objects.isNull(t1)!=Objects.isNull(t2)){
                return false;
            }
            if (Objects.isNull(t1)){
                return true;
            }
            if (t1.val!=t2.val){
                return false;
            }
            return isSymmetric(t1.left,t2.right)&&isSymmetric(t1.right,t2.left);
        }
}
