public class Solution8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("18446744073709551617"));
    }
    public static int myAtoi(String s) {
        int n =0;
        if(s.length()<=n){
            return 0;
        }
        while (n<s.length()){
            final char c = s.charAt(n);
            if (c != ' '){
                break;
            }
            n++;
        }
        if(s.length()<=n){
            return 0;
        }
        boolean tf =true;
        if (s.charAt(n)== '-'){
            n++;
            tf=false;
        }
        if(s.length()<=n){
            return 0;
        }else if (s.charAt(n)== '+'){
            n++;
        }
        long l=0;
        long up=0;
        while (n<s.length()){
            final char c = s.charAt(n);
            if (c>='0'&&c<='9'){
                up=l;
                l=l*10+c-'0';
                n++;
            }else {
                break;
            }
            if (up>l){
                return tf?2147483647:-2147483648;
            }
        }
        if (!tf){
            l=-l;
        }
        if((int)l!=l){
            return tf?2147483647:-2147483648;
        }
        return (int)l;
    }
}
