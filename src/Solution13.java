
import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    private static final Map<String,Integer> map = new HashMap<>();
    private static final String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    static {
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
    }
    public static int romanToInt(String s) {
        StringBuilder builder = new StringBuilder().append(s);
        int now=0;
        for (String s1 : str) {
            while (builder.toString().startsWith(s1)){
                now+=map.get(s1);
                builder.delete(0,s1.length());
            }
        }
        return now;

    }


}
