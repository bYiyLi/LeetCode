public class Solution1694 {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
    }
    public static String reformatNumber(String number) {
        StringBuilder builder = new StringBuilder();
        final char[] chars = number.toCharArray();
        int n = 0;
        for (char aChar : chars) {
            if (aChar>='0'&&aChar<='9'){
                if (n==3){
                    builder.append('-');
                    n=0;
                }
                builder.append(aChar);
                ++n;
            }
        }
        if (builder.length()%4==0) {
            builder.insert(builder.length()-2,'-');
        }
        if (builder.length()%4==1) {
            builder.deleteCharAt(builder.length()-2);
            builder.insert(builder.length()-2,'-');
        }
        return builder.toString();
    }
}
