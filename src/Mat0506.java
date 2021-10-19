public class Mat0506 {
    public static void main(String[] args) {
        System.out.println(convertInteger(826966453,
                -729934991));
    }
    public static int convertInteger(int A, int B) {
        int res = 0 ;

        for (int i = 0; i < 32; i++) {
            if ((A&1)!=(B&1)){
                res++;
            }
            A>>=1;
            B>>=1;
        }
        return res;
    }
}
