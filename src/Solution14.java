import java.math.BigDecimal;
import java.util.*;

public class Solution14 {
    public static void main(String[] args) {
//        System.out.println('A'='a'-32);

    }
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int res = 0;
        while(haystack.length()>=needle.length()){
            if(haystack.startsWith(needle)){
                return res;
            }
            res++;
            haystack = haystack.substring(1);
        }
        return -1;
    }
    public int diameterOfBinaryTree(Solution100.TreeNode root) {
        if (Objects.isNull(root)){
            return 0;
        }
        int l = treeD(root.left);
        int r = treeD(root.right);
        return Math.max(Math.max(l+r,diameterOfBinaryTree(root.left)),diameterOfBinaryTree(root.right));
    }
    public int treeD(Solution100.TreeNode root){
        if (Objects.isNull(root)){
            return 0;
        }
        Deque<Solution100.TreeNode> deque = new ArrayDeque<>();
        int res = 0;
        deque.addLast(root);
        while (!deque.isEmpty()){
            res++;
            Deque<Solution100.TreeNode> tem = new ArrayDeque<>();
            while(!deque.isEmpty()){
                final Solution100.TreeNode last = deque.getLast();
                if (Objects.nonNull(last.left)){
                    tem.addLast(last.left);
                }
                if (Objects.nonNull(last.right)){
                    tem.addLast(last.right);
                }
            }
            deque = tem;
        }
        return res;
    }

}
