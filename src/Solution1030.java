import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1030 {
    interface a{
        void v(Solution1030 t);
    }
    int tt = 0;
    void aaa(){
        System.out.println("==="+this.tt);
    }

    public Solution1030 setTt(int tt) {
        this.tt = tt;
        return this;
    }

    public static void main(String[] args) {
        a aa=Solution1030::aaa;
        aa.v(null);

//        final Comparator<Integer> integerComparator = Integer::compareTo;
//        final Comparator<Integer> compare = Integer::compare;
//        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 2, 0, 1)));
    }


    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int index = 0;
        for(int i = 0 ; i < R ; i ++){
            for(int j = 0 ; j < C ; j ++) {
                int[] xy = {i,j};
                res[index++] = xy;
            }
        }
        final Comparator<Integer> integerComparator = Integer::compareTo;
        final Comparator<Integer> compare = Integer::compare;

        Arrays.sort(res, Comparator.comparingInt(a -> (Math.abs(a[0]-r0) + Math.abs(a[1])-c0)));
        Arrays.sort(res, Comparator.comparingInt(o -> Math.abs(o[0] - r0) + Math.abs(o[1] - c0)));
        return res;
    }
}
