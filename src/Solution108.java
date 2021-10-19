import java.util.Arrays;

public class Solution108 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0){
            return null;
        }
        if (nums.length==1){
            return new TreeNode(nums[0]);
        }
        if (nums.length==2){
            return new TreeNode(nums[0],null,new TreeNode(nums[1]));
        }
        final int i = nums.length / 2 ;
        final TreeNode treeNode = new TreeNode(nums[i]);
        int [] l = new int[i];
        System.arraycopy(nums,0,l,0,l.length);
        treeNode.left=sortedArrayToBST(l);
        int [] r = new int[nums.length-i-1];
        System.arraycopy(nums,i+1,r,0,r.length);
        treeNode.right=sortedArrayToBST(r);
        return treeNode;
    }
}
