public class Offer009 {
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int r = 0;
        int all = 1;
        for (int i = 0; i < nums.length; i++) {
            if ((all*=nums[i])>=k) {
                do {
                    if (r>i){
                        break;
                    }
                    r++;
                }while ((all /= nums[r-1]) >= k);
            }
            res+=(i-r+1);
        }
        return res;
    }
}
