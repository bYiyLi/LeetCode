import java.util.Objects;

public class Solution110 {
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
    public boolean isBalanced(TreeNode root) {
        if (Objects.isNull(root)){
            return true;
        }
        if (Math.abs(nodeSize(root.left)-nodeSize(root.right))>1){
            return false;
        }
        return isBalanced(root.right)&&isBalanced(root.left);
    }

    public int nodeSize(TreeNode root){
        if (Objects.isNull(root)){
            return 0;
        }
        return 1+Math.max(nodeSize(root.left),nodeSize(root.right));
    }




}
