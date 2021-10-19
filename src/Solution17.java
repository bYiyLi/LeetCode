import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    static   Map<Integer,char[]> map = new HashMap<>();

    static {
        map.put(2, new char[]{'a', 'b', 'c'});
        map.put(3, new char[]{'d', 'e', 'f'});
        map.put(4, new char[]{'g', 'h', 'i'});
        map.put(5, new char[]{'j', 'k', 'l'});
        map.put(6, new char[]{'m', 'n', 'o'});
        map.put(7, new char[]{'p', 'q', 'r','s'});
        map.put(8, new char[]{'t', 'u', 'v'});
        map.put(9, new char[]{'w', 'x', 'y','z'});
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list  = new ArrayList<>();
        List<char[]> tl= new ArrayList<>();
        for (int n=0;n<digits.length();n++){
            final int i = digits.charAt(n) - '0';
            tl.add(map.get(i));
        }

        return listToStr(tl,0);
    }
    public static List<String> listToStr(List<char[]> list,int index){
        if (index>=list.size()){
            return List.of();
        }
        final char[] chars = list.get(index);
        List<String> r = new ArrayList<>();
        for (char c : chars){
            final List<String> list1 = listToStr(list, index+1);
            if (list1.isEmpty()){
                r.add(c+"");
            }else {
                for (String s : list1) {
                    r.add(c+s);
                }
            }
        }
        return r;
    }
}
