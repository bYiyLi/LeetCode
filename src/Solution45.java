public class Solution45 {
    public static void main(String[] args) {

        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
    public static int jump(int[] nums) {
        int index = 0;
        int jumpSize=0;
        while (index<nums.length-1){
            jumpSize++;
            int max = 0;
            int maxN = 0;
            for (int n=1;n<=nums[index];n++){
                if (index+n>= nums.length-1){
                    return jumpSize;
                }
                if (nums[index+n]+index+n>=max){
                    maxN=n;
                    max=nums[index+n]+index+n;
                }
            }
            index=maxN+index;
        }
        return jumpSize;
    }
}
