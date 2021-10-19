import java.util.Arrays;

public class Solution283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,0,1});
    }
    public static void moveZeroes(int[] nums) {
        int zero = nums.length;
        for (int i = 0; i < zero; i++) {
            if (nums[i]==0){
                System.arraycopy(nums,i+1,nums,i,--zero -i);
                i--;
                nums[zero]=0;
            }
        }
        System.out.println();
    }
}
