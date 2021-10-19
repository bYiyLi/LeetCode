public class Solution5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public  static String longestPalindrome(String s) {
        String re="";
        for (int n=0;n<s.length();n++){
            final String f = fun(s, n);
            if (f.length()>re.length()){
                re=f;
            }
        }
        return re;
    }
    public static String fun(String s,int index){
        int f=index;
        int l=index;
        while (f-1>=0&&s.charAt(f-1) == s.charAt(index)){
            f--;
        }
        while (l+1<s.length()&&s.charAt(l+1)==s.charAt(index)){
            l++;
        }
        while (f>=0&&l<s.length()){
            if (s.charAt(f)!=s.charAt(l)){
                return s.substring(f+1,l);
            }
            f--;
            l++;
        }

        return s.substring(f+1,l);
    }

}
