import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    public static void main(String[] args) {

    }

    String[] s=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(s[c-'a']);
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}
