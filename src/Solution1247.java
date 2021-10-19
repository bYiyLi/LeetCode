public class Solution1247 {
    public static void main(String[] args) {
        System.out.println(minimumSwap("xxyyxyxyxx","xyyxyxxxyx"));
    }
    public static int minimumSwap(String s1, String s2) {
        int res=0;
        final char[] chars1 = s1.toCharArray();
        final char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            a:{
                if (chars1[i]!=chars2[i]){
                    for (int j = i+1; j < chars1.length; j++) {
                        if (chars1[i]==chars1[j]&&chars2[i]==chars2[j]){
                            res++;
                            final char c = chars1[i];
                            chars1[i]=chars2[j];
                            chars2[j]=c;
                            break a;
                        }
                    }
                    for (int j = i+1; j < chars1.length; j++) {
                        if (chars2[i]==chars1[j]&&chars1[i]==chars2[j]){
                            res+=2;
                            final char c = chars1[i];
                            chars1[i]=chars1[j];
                            chars1[j]=c;
                            break a;
                        }
                    }
                    return -1;
                }
            }
        }
        return res;
    }
}
