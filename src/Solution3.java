import java.util.*;

public class Solution3 {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        List<LinkedHashSet<Character>> list = new ArrayList<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int n=0;n<s.length();n++){
            if (set.contains(s.charAt(n))){
                list.add(set);
                set=new LinkedHashSet<>();
                for(int t=n;t>=0;t--){
                    if (set.contains(s.charAt(t))){
                        break;
                    }
                    set.add(s.charAt(t));
                }
            }
            set.add(s.charAt(n));
        }
        list.add(set);

        int max = 0;
        for (Set<Character> characters : list) {
            if (max < characters.size()){
                max = characters.size();
            }
        }
        return max;

    }
}
