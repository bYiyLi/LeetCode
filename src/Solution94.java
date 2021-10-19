import java.util.*;

// Definition for a binary tree node.


public class Solution94 {
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
        System.out.println(inorderTraversal(new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null))));
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode now = root;
        List<Integer> re = new ArrayList<>();
        while (Objects.nonNull(now)){
            while (Objects.nonNull(now.left)){
                stack.addLast(now);
                TreeNode t = now.left;
                now.left=null;
                now = t;
            }
            re.add(now.val);
            if (Objects.nonNull(now.right)){
                now=now.right;
            }else if(!stack.isEmpty()){
                now = stack.removeLast();
            }else {
                now = null;
            }
        }
        return re;
    }
}
