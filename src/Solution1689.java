public class Solution1689 {
    public static void main(String[] args) {

    }
    public static int minPartitions(String n) {
        int res = 0;
        for (char c : n.toCharArray()) {
            res = Math.max(res,c);
        }
        return res - '0';
    }
}
