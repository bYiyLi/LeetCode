public class Solution1252 {
    public static void main(String[] args) {
        System.out.println(oddCells(2,3,new int[][]{{0,1},{1,1}}));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int [][] ints = new int[m][n];
        for (int[] anInt : indices) {
            for (int t = 0 ; t<n;t++){
                ints[anInt[0]][t]+=1;
            }
            for (int t = 0 ; t<m;t++){
                ints[t][anInt[1]]+=1;
            }
        }
        int res = 0;
        for (int[] anInt : ints) {
            for (int i : anInt) {
                if (i%2==1){
                    res++;
                }
            }
        }
        return res;
    }
}
