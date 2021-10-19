public class Solution392 {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        final char[] charsS = s.toCharArray();
        final char[] charsT = t.toCharArray();
        int index = 0;
        for (char c : charsS) {
            if (index>=charsT.length){
                return false;
            }
            a:{
                for (;index<charsT.length;index++){
                    if (charsT[index]==c){
                        break a;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
