import java.util.Arrays;
import java.util.Comparator;

public class Solution1859 {
    public String sortSentence(String s) {

        final String[] s1 = s.split(" ");
        Arrays.sort(s1, Comparator.comparingInt(f -> f.charAt(f.length() - 1)));
        StringBuilder builder = new StringBuilder();
        for (String s2 : s1) {
            builder.append(s2, 0, s2.length()-1).append(' ');
        }
        return builder.substring(0,builder.length()-1);
    }

    public static void main(String[] args) {

    }
}
