import java.util.ArrayList;
import java.util.List;

public class Solution467 {
    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString("cab"));
    }
    public static int findSubstringInWraproundString(String p) {
        final char[] chars = p.toCharArray();
        int[] cDp = new int[26];
        int now=chars[0];
        cDp[now-'a']=1;
        int tem = 1;
        for (int t = 1; t<chars.length;t++){
            if (now+1==chars[t] || (chars[t]=='a'&&now=='z')){
                tem++;
            }else {
                tem=1;
            }
            now = chars[t];
            cDp[chars[t]-'a']=Math.max(cDp[chars[t]-'a'],tem);
        }
        int res = 0;
        for (int t : cDp){
            res+=t;
        }
        return res;
    }
}
