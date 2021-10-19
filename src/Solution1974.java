public class Solution1974 {
    public static void main(String[] args) {
        System.out.println(minTimeToType("az"));
    }
    public static int minTimeToType(String word) {
        int index = 0;
        int all = 0;
        for (int i = 0; i < word.length(); i++) {
            final int newIndex = word.charAt(i) - 'a';
            all += Math.min(Math.abs(newIndex-index),26 - (Math.abs(newIndex-index)))+1;
            index = newIndex;
        }
        return all;
    }
}
