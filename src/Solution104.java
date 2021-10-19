import java.util.Objects;

public class Solution104 {

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
    public int maxDepth(TreeNode root) {
        if (Objects.isNull(root)){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right),maxDepth(root.left));
    }
}
