import java.util.Arrays;

public class Solution976 {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{3,2,3,4}));
    }
    public static int largestPerimeter(int[] nums) {
        if (nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        int c = nums[nums.length-3];
        if (c==0){
            return 0;
        }
        if (a+b>c&&a+c>b&&b+c>a){
            return a+b+c;
        }else {
            nums[nums.length-1]=0;
            return largestPerimeter(nums);
        }
    }
}
