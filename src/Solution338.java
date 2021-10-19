public class Solution338 {
    public static void main(String[] args) {

    }
    public int[] countBits(int n) {
        int [] re = new int[n+1];
        for (int i = 0; i <=n; i++) {
            int tem = i;
            for (int t = 0 ;t<32;t++){
                if ((tem&1)==1){
                    re[i]++;
                }
                tem>>=1;
            }
        }
        return re;
    }


}
