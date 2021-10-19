import java.util.*;
import java.util.stream.Collectors;

public class Offer033 {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(item -> {
            final char[] chars = item.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
        })).values());
    }
}
