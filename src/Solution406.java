import java.util.Arrays;

public class Solution406 {
    public static void main(String[] args) {
        System.out.println(reconstructQueue(new int[][]{{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}}));
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(int[] f,int[] s)->{
            if (f[0]-s[0]<0){
                return 1;
            }else if (f[0]==s[0]){
                return f[1]-s[1];
            }
            return -1;
        });
        int [][] re =new int[people.length][];
        int size=0;
        for (int [] item:people){
            final int i = item[1];
            if (size>i){
                System.arraycopy(re,i,re,i+1,size-i);
            }
            re[i]=item;
            size++;
        }
        return re;
    }
}
