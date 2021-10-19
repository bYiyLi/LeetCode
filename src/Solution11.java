public class Solution11 {
    public static void main(String[] args) {
        final long l = System.currentTimeMillis();
        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}))
                ;
        System.out.println(System.currentTimeMillis()-l);
    }
    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max = area(height,l,r);
        while (l<r){
            final int area = area(height, l + 1, r);
            if (max<=area){
                max=area;
            }
            final int area1 = area(height, l, r - 1);
            if (max<= area1){
                max=area1;
            }
            if (height[l]>height[r]){
                r--;
            }else {
                l++;
            }
        }
        return max;
    }
    public static int area(int [] height,int l,int r){
        return (r-l)*Math.min(height[l],height[r]);
    }
}
