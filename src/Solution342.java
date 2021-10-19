public class Solution342 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfFour(int n) {
        int r = 1;
        for (int i = 0; i < 16; i++) {
            if (r==n){
                return true;
            }
            r<<=2;
        }
        return false;
    }
}
