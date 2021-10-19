public class Solution19 {
    public static void main(String[] args) {
        System.out.println(minimumOperations("rrryyyrryyyrr"));
    }
    public static int minimumOperations(String leaves) {
        final char[] chars = leaves.toCharArray();
//        return dfs(chars,0,0);
        int a =  (chars[0]=='r'?0:1) + (chars[1]=='r'?0:1) +(chars[2]=='r'?0:1);
        int b = (chars[0]=='r'?0:1) + (chars[2]=='y'?0:1);
        int c = (chars[0]=='r'?0:1) +(chars[1]=='y'?0:1)+ (chars[2]=='r'?0:1);
        for (int i = 3; i < chars.length; i++) {
            if (chars[i]=='r'){
                c=Math.min(b,c);
                b=1+Math.min(a,b);
            }else {
                c=Math.min(b,c)+1;
                b=Math.min(a,b);
                a++;
            }
        }
        return c;
    }
    private static int dfs(char[] chars,int index,int size){
        if (index==chars.length){
            if (vail(chars)){
                return size;
            }else {
                return Integer.MAX_VALUE;
            }
        }
        final int d1 = dfs(chars, index + 1, size);
        final char aChar = chars[index];
        if (aChar=='y'){
            chars[index]='r';
        }else {
            chars[index]='y';
        }
        final int d2 = dfs(chars, index + 1, size+1);
        chars[index] = aChar;
        return Math.min(d1,d2);
    }
    private static boolean vail(char[] chars){
        int index=0;
        int tf = 0;
        while (index<chars.length&&chars[index]=='r'){
            index++;
            tf|=1;
        }

        while (index<chars.length&&chars[index]=='y'){
            index++;
            tf|=(1<<1);
        }
        while (index<chars.length&&chars[index]=='r'){
            index++;
            tf|=(1<<2);
        }
        return tf==7 && index==chars.length;
    }

}
