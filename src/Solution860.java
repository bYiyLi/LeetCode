import java.util.ArrayList;

public class Solution860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }
    public static boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> list = new ArrayList();
        for (int item:bills){
            list.sort(Integer::compareTo);
            int now = item-5;
            int in = list.size()-1;
            while (now>0){
                if (list.isEmpty()){
                    return false;
                }
                while (in>=0&&list.get(in)>now){in--;}
                if (in>=0){
                    now -=list.remove(in);
                    in--;
                }else {
                    return false;
                }
            }
            list.add(item);
        }
        return true;
    }
}
