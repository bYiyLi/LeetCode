public class Offer006 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1,2,4,6,10},8));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int r=0;
        int l=numbers.length-1;

        while (r<l){
            final int i = numbers[r] + numbers[l];
            if (i==target){
                return new int[]{r,l};
            }else if(i>target){
                l--;
            }else {
                r++;
            }
        }
        return new int[]{};
    }
}
