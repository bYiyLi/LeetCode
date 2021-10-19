public class Solution926 {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("100111111100101110 11"));
    }
    public static int minFlipsMonoIncr(String s) {
        int f = 0;
        int l = s.length() - 1;
        while (f < s.length() && s.charAt(f) == '0') {
            f++;
        }
        while (l >= 0 && s.charAt(l) == '1') {
            l--;
        }
        int a = 0;
        int b = 0;
        for (int i = f; i <= l; i++) {
            if (s.charAt(i) == '0') {
                a++;
            } else {
                b++;
            }
        }
        return Math.min(a, b);
    }
    }
