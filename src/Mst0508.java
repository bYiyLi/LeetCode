public class Mst0508 {
    public static void main(String[] args) {

    }
    public int[] drawLine(int length, int w, int x1, int x2, int y) {
        int [] res = new int[length];
        for (int n = x1;n<x2;n++){
                final int q = n / 32;
                final int i = n % 32;
                res[q]|=(1<<31)>>i;
        }
        return res;
    }
}
