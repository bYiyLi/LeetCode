import java.util.*;

public class Solution1079 {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAC"));
    }
    public static int numTilePossibilities(String tiles) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < tiles.length(); i++) {
            map.put(tiles.charAt(i),map.getOrDefault(tiles.charAt(i),0)+1);
        }
        return dfs(map);
    }
    public static int dfs(HashMap<Character,Integer> map){
        int res = 0;
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue()>0){
                res++;
                final Integer value = item.getValue();
                item.setValue(value-1);
                res+=dfs(map);
                item.setValue(value);
            }
        }
        return res;
    }

}
