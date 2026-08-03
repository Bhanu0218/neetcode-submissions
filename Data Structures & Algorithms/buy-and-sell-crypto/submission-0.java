class Solution {
    public int maxProfit(int[] prices) {

        int length = prices.length;

        int maxProfit = 0;

        for(int i=0; i<length-1; i++) {
            for(int j=i+1; j<length; j++) {
                if(prices[i] > prices[j]) {
                    continue;
                } else if (prices[i] < prices[j]) {
                    int profit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
        }
        return maxProfit;
    }
}
