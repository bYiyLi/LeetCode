public class Solution714 {
//[1,3,7,5,10,3]
//        3
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,7,5,10,3},3));
    }
    public static int maxProfit(int[] prices, int fee) {
        int min = prices[0];
        int max = prices[0];
        int all = 0;
        int []tem =new int[prices.length+1];
        System.arraycopy(prices,0,tem,0,prices.length);
        prices=tem;
        for (int i = 1; i < prices.length; i++) {
            if (max>prices[i]){
                if (max-prices[i]>fee&&max-min>fee){
                    all += max-min-fee;
                    min=prices[i];
                    max=prices[i];
                }else {
                    if (min>prices[i]){
                        min=prices[i];
                        max=prices[i];
                    }
                }
            }else {
                max=Math.max(prices[i],max);
            }
        }
        return all;
    }
}
