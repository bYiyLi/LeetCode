import java.math.BigDecimal;

public class Solution1491 {
    public static void main(String[] args) {
        System.out.println(average(new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}));
    }
    public static double average(int[] salary) {
        double all = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : salary) {
            all+=i;
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        return (all-min-max) / (salary.length-2);
    }
}
