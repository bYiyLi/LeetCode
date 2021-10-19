public class SolutionMst0501 {
    public static void main(String[] args) {

    }
    public int insertBits(int N, int M, int i, int j) {
        int res = 0;
        int now=0;
        while (N!=0){
            if (now>=i&&now<=j){
                if ((N&1)==1){
                    res+=1<<now;
                }
                M>>=1;
            }else {
                if ((N&1)==1) {
                    res+=1<<now;
                }
            }
            N>>=1;
            now++;
        }
        return res;
    }
}
