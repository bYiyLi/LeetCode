public class Solution1413 {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{1,-2,-3}));
    }
    public static int minStartValue(int[] nums) {
        int res = 0;
        int all = 0;
        for (int num : nums) {
            if (num+all<=0){
                res-=all+num;
                all=0;
            }else {
                all+=num;
            }

        }
        return res+1;
    }
}
