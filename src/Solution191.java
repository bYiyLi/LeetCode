public class Solution191 {
    public static void main(String[] args) {

        System.out.println(hammingWeight(11));
    }
    public static int hammingWeight(int n) {
        int res =0 ;
        for (int i =0 ;i<32;i++){
            if ((n&1)==1){
                res++ ;
            }
            n>>=1;
        }
        return res;
    }
}
