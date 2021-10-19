public class Solution4 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1=0;
        int i2=0;
        int[] all = new int[nums1.length+nums2.length];
        int ia=0;
        while (i1<nums1.length&&i2<nums2.length){
            if (nums1[i1]<nums2[i2]){
                all[ia]=nums1[i1];
                i1++;
            }else {
                all[ia]=nums2[i2];
                i2++;
            }
            ia++;
        }
        while (i1<nums1.length){
            all[ia]=nums1[i1];
            ia++;
            i1++;
        }
        while (i2<nums2.length){
            all[ia]=nums2[i2];
            ia++;
            i2++;
        }

        if (all.length<=1){
            return all[0];
        }
        if (all.length%2 == 0){
            return (double) (all[all.length/2-1]+all[all.length/2])/2;
        }else {
            return all[all.length/2];
        }

    }
}
