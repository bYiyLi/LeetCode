public class Offer005 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new String[]{"a","aa","aaa"}));
    }
    public static int maxProduct(String[] words) {
        int res =0;
        final int length = words.length;
        int [] db = new int[length];
        for (int i = 0; i < length ; i++) {
            for (char c : words[i].toCharArray()) {
                db[i] |=1 << (c - 'a');
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if ((db[i]&db[j])==0){
                    res=Math.max(words[i].length()*words[j].length(),res);
                }
            }
        }
        return res;
    }
}
