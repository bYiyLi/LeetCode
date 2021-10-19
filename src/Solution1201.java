import java.util.*;

public class Solution1201 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1000000000,2,3,4));
    }
    public static int nthUglyNumber(int n, int a, int b, int c) {
        long res = 0 ;
        int al = 1;
        int bl = 1;
        int cl = 1;
        for (int t =1;t<=n;t++){
            final long aT = al * a;
            final long bT = bl * b;
            final long cT = cl * c;
            long tem = 0;
            if (aT>bT){
                if (bT>cT){
                    tem=cT;
                    cl++;
                }else {
                    tem=bT;
//                    set.add(bT);
                    bl++;
                }
            }else {
                if (aT>cT){
                    tem=cT;
                    cl++;
                }else {
                    tem=aT;
                    al++;
                }
            }
            if (tem == res){
                t--;
            }else {
                res = tem;
            }
        }
        return (int)res;
    }
}
