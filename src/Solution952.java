public class Solution952 {
    public static void main(String[] args) {
        System.out.println(diStringMatch("III"));
    }
    public static int[] diStringMatch(String s) {
        int r = 0;
        int l = s.length();
        int [] re = new int[s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='I') {
                re[i]=r;
                r++;
            }else {
                re[i]=l;
                l--;
            }
        }
        re[s.length()]=r;
        return re;
    }
}
