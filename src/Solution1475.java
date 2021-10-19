public class Solution1475 {
    public static void main(String[] args) {
        System.out.println(finalPrices(new int[]{1,2,3,4,5}));
    }
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int n =0 ;
            for (int j = i+1;j<prices.length;j++){
                if (prices[i]>=prices[j]){
                    n=j;
                    break;
                }
            }
            if (n>0){
                prices[i]=prices[i]-prices[n];
            }
        }
        return prices;
    }
}
