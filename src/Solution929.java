import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution929 {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
    }
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            final String[] split = email.split("@");
            StringBuilder builder = new StringBuilder();
            for (char c : split[0].toCharArray()) {
                if (c=='.'){
                    continue;
                }
                if (c=='+'){
                    break;
                }
                builder.append(c);
            }
            builder.append(split[1]);
            set.add(builder.toString());
        }
        return set.size();
    }
}
