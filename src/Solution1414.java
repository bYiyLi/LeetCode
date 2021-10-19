import java.util.ArrayList;
import java.util.List;

public class Solution1414 {
    public static void main(String[] args) {

    }
    public int findMinFibonacciNumbers(int k) {
        int a = 1;
        int b = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while (b<k){
            int t = b;
            b+=a;
            a=t;
            list.add(a);
        }
        int index=list.size()-1;
        int res=0;
        while (k!=0){
            if (list.get(index)<=k){
                k-=list.get(index);
                res++;
            }else {
                index--;
            }
        }
        return res;
    }
}
