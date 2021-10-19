public class Solution231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }
    public static boolean isPowerOfTwo(int n) {
        return n>0&&(n&n-1)==0;
    }
}
