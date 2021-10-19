import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1358 {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    public static int numberOfSubstrings(String s) {
        final char[] chars = s.toCharArray();
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        Deque<Integer> c = new ArrayDeque<>();
        final int length = chars.length;
        for (int i = 0; i < length; i++) {
            switch (chars[i]){
                case 'a':a.addLast(i);break;
                case 'b':b.addLast(i);break;
                case 'c':c.addLast(i);break;
                default:
            }
        }
        int res = 0;
        while (!a.isEmpty()&&!b.isEmpty()&&!c.isEmpty()){
            int max = Math.max(Math.max(a.getFirst(),b.getFirst()),c.getFirst());
            if (a.getFirst()>b.getFirst()){
                if (b.getFirst()>c.getFirst()){
                    c.removeFirst();
                }else {
                    b.removeFirst();
                }
            }else {
                if (a.getFirst()>c.getFirst()){
                    c.removeFirst();
                }else {
                    a.removeFirst();
                }
            }
            res+= chars.length-max;
        }
        return res;



//        int a = -1;
//        int b = -1;
//        int c = -1;
//        for (int i = 0;i<chars.length;i++){
//            if (chars[i]=='a'&&a==-1){
//                a=i;
//            }else if(chars[i]=='b'&&b==-1){
//                b=i;
//            }else if (chars[i]=='c'&&c==-1){
//                c=i;
//            }
//            if (a!=-1&&b!=-1&&c!=-1){
//                int max = Math.max(Math.max(a,b),c);
//                int min = Math.min(Math.min(a,b),c);
//                return chars.length-max+numberOfSubstrings(s.substring(min+1));
//            }
//        }
//        return 0;
    }
}
