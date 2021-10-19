import java.util.HashMap;
import java.util.Map;

public class Solution395 {
    public static void main(String[] args) {
        final long l = System.currentTimeMillis();
        System.out.println(longestSubstring("aaaaaaaaaaaabcdefghijklmnopqrstuvwzyz"
                ,3));
        System.out.println(System.currentTimeMillis()-l);
    }
    public static int longestSubstring(String s, int k) {
        final char[] chars = s.toCharArray();
        return dfs(chars,0,chars.length-1,k);
    }
    static int dfs( char[] chars, int r, int l,int k){
        if (r>l){
            return 0;
        }
        Map<Character,Integer>map = new HashMap<>();
        Map<Character,Integer>tf = new HashMap<>();
        for (int t =r;t<=l;t++){
            map.put(chars[t],map.getOrDefault(chars[t],0)+1);
            if (!tf.containsKey(chars[t])){
                tf.put(chars[t],t);
            }
        }
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue()>0&&item.getValue()<k){
                final Character key = item.getKey();
                final Integer c = tf.get(key);
                return Math.max(dfs(chars,r,c-1,k),dfs(chars,c+1,l,k));
            }
        }
        return l-r+1;
    }
}
