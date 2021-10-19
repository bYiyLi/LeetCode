import java.util.ArrayList;
import java.util.List;

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","aaa"));
    }
    public static boolean isMatch(String s, String p) {
        if (s.equals(p)){
            return true;
        }
        if (p.isEmpty()){
            return false;
        }
        if (p.equals(".*")){
            return true;
        }else if(p.startsWith(".*")){
            if (s.indexOf(p.charAt(2))>0){
                return isMatch(s.substring(s.indexOf(p.charAt(2))),p.substring(2));
            }
            return false;
        }
        if (p.length()>1&&p.charAt(1) == '*'){
            if (p.length()>2&&p.charAt(0)==p.charAt(2)){
                return isMatch(s, String.valueOf(p.charAt(0)) + p.charAt(0) + "*" + p.substring(3));
            }
            return isMatch(reC(s,p.charAt(0)),p.substring(2));
        }

        if (p.charAt(0) == '.'){
            return isMatch(s.substring(1),p.substring(1));
        }

        if (s.isEmpty()){
            return false;
        }
        if (p.charAt(0) == s.charAt(0)){
            return isMatch(s.substring(1), p.substring(1));
        }
        return false;
    }

    private static String reC(String s, char charAt) {
        while (s.startsWith(String.valueOf(charAt))){
            s=s.substring(1);
        }
        return s;
    }
}
