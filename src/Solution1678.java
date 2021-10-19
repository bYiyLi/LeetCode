public class Solution1678 {
    public static void main(String[] args) {

    }
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        final char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='G'){
                builder.append("G");
                continue;
            }
            if (i<chars.length-1){
                if (chars[i+1]==')') {
                    builder.append("o");
                    i++;
                }else {
                    builder.append("al");
                    i+=3;
                }
            }
        }
        return builder.toString();
    }
}
