import java.lang.reflect.Array;
import java.util.*;

public class MST0808 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutation("qqe")).toString());
    }
    public static String[] permutation(String S) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<String> res = new ArrayList<>();
        dfs(map,new StringBuilder(),res);
        String[] r = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i]=res.get(i);
        }
        return r;
    }
    public static void dfs(Map<Character,Integer> map,StringBuilder builder,List<String> res){
        boolean tf = false;
        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            final Integer value = character.getValue();
            if (value>0){
                character.setValue(value-1);
                builder.append(character.getKey());
                dfs(map,builder,res);
                builder.deleteCharAt(builder.length()-1);
                character.setValue(value);
                tf = true;
            }
        }
        if (!tf){
            res.add(builder.toString());
        }
    }
}
