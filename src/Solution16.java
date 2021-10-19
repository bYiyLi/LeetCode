public class Solution16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,1,-1,-1,3},-1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        long res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if( Math.abs(res-target) > Math.abs((nums[i]+nums[j]+nums[k])-target)){
                        res=(nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }
        return (int)res;
    }
}
