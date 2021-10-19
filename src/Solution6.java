import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(convert("AB",2));
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        List[] bu = new List[numRows];
        for (int n =0;n<numRows;n++){
            bu[n] = new ArrayList<Character>();
        }
        int now = 0 ;
        boolean tf =true;
        int index = 0;
        while (index < s.length()){
            bu[now].add(s.charAt(index));
            if (tf){
                now++;
            }else {
                now--;
            }
            if (now == 0){
                tf = true;
            }else if (now == numRows-1){
                tf = false;
            }
            index++;
        }
        StringBuilder builder = new StringBuilder();
        for (List list : bu) {
            index =0 ;
            while (index<list.size()){
                builder.append(list.get(index));
                index ++ ;
            }
        }
        return builder.toString();
    }
}
