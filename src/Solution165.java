import java.util.ArrayList;
import java.util.List;

public class Solution165 {
    public static void main(String[] args) {
        System.out.println(printVertically("HOW ARE YOU"));
    }
    public static List<String> printVertically(String s) {
        final String[] strList = s.split(" ");
        List<String> res = new ArrayList<>();
        int n = 0 ;
        while (true){
            StringBuilder builder = new StringBuilder();
            for (String value : strList) {
                if (value.length() > n) {
                    builder.append(value.charAt(n));
                }
            }
            if (builder.length() == 0){
                return res;
            }
            n++;
            res.add(builder.toString());
        }
    }

    public static int compareVersion(String version1, String version2) {
        final String[] split1 = version1.split("\\.");
        final String[] split2 = version2.split("\\.");
        int length = Math.min(split1.length,split2.length);
        for (int n = 0;n<length;n++){
            final Integer a = Integer.valueOf(split1[n]);
            final Integer b = Integer.valueOf(split2[n]);
            if (a>b){
                return 1;
            }else if (a<b){
                return -1;
            }
        }
        if (split1.length>length){
            for (int n =length;n<split1.length;n++){
                final Integer a = Integer.valueOf(split1[n]);
                if (a>0){
                    return 1;
                }
            }
        }
        if (split2.length>length){
            for (int n =length;n<split2.length;n++){
                final Integer a = Integer.valueOf(split2[n]);
                if (a>0){
                    return -1;
                }
            }
        }

        return 0;
    }
}
