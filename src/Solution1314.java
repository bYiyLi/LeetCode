public class Solution1314 {
    public static void main(String[] args) {

    }
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                int all = 0;
                for (int l = Math.max(0,i-k); l < mat.length&&l<i+k; l++) {
                    for (int m = Math.max(0,j-k); m <mat[0].length&&m<j+k ; m++) {
                        all+=mat[l][m];
                    }
                }
                res[i][j]=all;
            }
        }
        return res;
    }
}
