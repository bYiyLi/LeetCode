import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;




public class BSTIterator173 {

   // Definition for a binary tree node.
    public class TreeNode {
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
    Deque<TreeNode> list = new ArrayDeque<>();
    public int next() {
        TreeNode last = list.removeLast();
        while (Objects.nonNull(last.left)){
            TreeNode tem =last.left;
            list.addLast(last);
            last.left=null;
            last=tem;
        }
        int re =last.val;
        if (Objects.nonNull(last.right)){
            list.addLast(last.right);
        }
        return  re;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
    public BSTIterator173(TreeNode root) {
        list.addLast(root);
    }
}
