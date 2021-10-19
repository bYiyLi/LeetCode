public class Solution680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("deeee"));
    }
    static boolean tf =true;
    public static boolean validPalindrome1(String s){
        if (s.length()==1){
            return true;
        }
        int l = 0;
        int r = s.length()-1;
        while (l<r){
            if (s.charAt(l)!=s.charAt(r)){
                if (tf){
                    tf =false;
                    return validPalindrome1(s.substring(l+1,r+1))||validPalindrome1(s.substring(l,r));
                }else {
                    return false;
                }
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        tf =true;
        return validPalindrome1(s);
    }
}
