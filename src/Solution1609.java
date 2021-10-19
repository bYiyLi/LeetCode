import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Solution1609 {
    public static void main(String[] args) {
        System.out.println(isEvenOddTree(new Solution100.TreeNode(1,new Solution100.TreeNode(10),

                new Solution100.TreeNode(4))));
    }
    public  static boolean isEvenOddTree(Solution100.TreeNode root) {
        Deque<Solution100.TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        boolean tf = true;
        while (!deque.isEmpty()){
            Deque<Solution100.TreeNode> tem = new ArrayDeque<>();
            int N ;
            if (tf){
                N= Integer.MIN_VALUE;
            }else {
                N=Integer.MAX_VALUE;
            }
            while (!deque.isEmpty()) {
                final Solution100.TreeNode now = deque.removeFirst();
                if (tf) {
                    if (now.val % 2 == 0) {
                        return false;
                    }
                    if (now.val <= N) {
                        return false;
                    }
                } else {
                    if (now.val % 2 == 1) {
                        return false;
                    }
                    if (now.val>= N) {
                        return false;
                    }
                }

                if (Objects.nonNull(now.left)) {
                    tem.addLast(root.left);
                }
                if (Objects.nonNull(now.right)) {
                    tem.addLast(root.right);
                }
                N=now.val;
            }
            deque = tem;
            tf=!tf;
        }
        return true;
    }
}
