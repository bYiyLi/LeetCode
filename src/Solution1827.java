public class Solution1827 {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,5,2,4,1}));
    }
    public static int minOperations(int[] nums) {
        int all=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<=nums[i-1]){
                all+=nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return all;
    }
}
