import java.util.Arrays;

public class Soltion1013 {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{3,3,6,5,-2,2,5,1,-9,4}));
    }
    public static boolean canThreePartsEqualSum(int[] arr) {
        int avg=0;
        int all =0;
        for (int i : arr) {
            all+=i;
        }
        avg=all/3;
        if (avg*3!=all){
            return false;
        }
        all=0;
        int n=0;
        for (int i=0;i< arr.length;i++) {
            all+=arr[i];
            if (all==avg) {
                all = 0;
                n++;
                if (n==2&&i<arr.length-1){
                    return true;
                }
            }
        }
        if(avg==0){
            return n>=3;
        }
        return false;
    }

}
