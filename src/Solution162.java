public class Solution162 {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,3,1}));
    }
    public static int findPeakElement(int[] nums) {
        int [] arr = new int[nums.length+2];
        arr[0] = Integer.MIN_VALUE;
        arr[arr.length-1] = Integer.MIN_VALUE;
        System.arraycopy(nums,0,arr,1,nums.length);
        for (int i = 1; i<arr.length-1;i++){
            if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i-1;
            }
        }
        return 0;
    }
}
