public class Solution1903 {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("14206"));
    }
    public static String largestOddNumber(String num) {
        for (int i = num.length()-1; i>=0; --i) {
            if (num.charAt(i)%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
