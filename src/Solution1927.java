public class Solution1927 {
    public static void main(String[] args) {
        System.out.println(sumGame("?3295???"));
    }
    public static boolean sumGame(String num) {
        int lq=0;
        int lall=0;
        int rq=0;
        int rall=0;
        for (int i = 0; i < num.length(); i++) {
            if (i<num.length()/2){
                if (num.charAt(i)=='?'){
                    lall++;
                }else {
                    lq+=num.charAt(i)-'0';
                }
            }else {
                if (num.charAt(i)=='?'){
                    rall++;
                }else {
                    rq+=num.charAt(i)-'0';
                }
            }
        }
        if (lq>rq){
            lq=lq-rq;
            rq=0;
        }else {
            rq=rq-lq;
            lq=0;
        }
        if (lall>rall){
            lall=lall-rall;
            rall=0;
        }else {
            rall=rall-lall;
            lall=0;
        }

        if (lq+lall+rq+rall==0){
            return false;
        }
        if (lq+lall==0||rq+rall==0){
            return true;
        }
        lq=lq+rq;
        lall=lall+rall;
        if (lall%2==1){
            return true;
        }
        return lall/2*9!=lq;
    }
}
