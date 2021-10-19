public class Solution136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,2}));
    }
    public static int singleNumber(int[] nums) {
        int n = nums[0];
        for (int i = 1; i < nums.length; i++) {
            n^=nums[i];
        }
        return n;
    }
}
