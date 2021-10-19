public class Solution1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(669));
    }
    public static int maximum69Number (int num) {
        final String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='6'){
                if (i + 1<s.length()) {
                    final String substring = s.substring(0, i);
                    final String substring1 = s.substring(i + 1);
                    return Integer.parseInt( substring+ 9 + substring1);
                }else {
                    return Integer.parseInt(s.substring(0, i) + 9);
                }
            }
        }
        return num;
    }
}
