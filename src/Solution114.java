import java.util.*;

public class Solution114 {
    public static void main(String[] args) {
        flatten(new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null)));
    }
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
    public static void flatten(TreeNode root) {
        if (Objects.isNull(root)){
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(root);
        List<Integer> list = new ArrayList<>();
        TreeNode newRoot = new TreeNode();
        TreeNode newNow = newRoot;
        while (!stack.isEmpty()){
            TreeNode now = stack.removeLast();
            newNow.right=new TreeNode(now.val);
            newNow=newNow.right;
            if (Objects.nonNull(now.right)){
                stack.addLast(now.right);
            }
            if (Objects.nonNull(now.left)){
                stack.addLast(now.left);
            }
        }
        root.left=null;
        root.right=newRoot.right;
    }
}
