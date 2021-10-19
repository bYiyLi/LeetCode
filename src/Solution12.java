import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    private static final Map<Integer,String> map = new HashMap<>();
    private static  int[] str = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static {
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
    }
    public static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        for (int s:str){

            final int i1 = num / s;
            builder.append( map.get(s).repeat(i1));
            num = num % s;
        }
        return builder.toString();
    }
}
