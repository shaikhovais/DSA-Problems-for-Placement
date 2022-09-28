
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        //This will store the maximum profit
        int profit = 0;
        
        int buyingPrice = prices[0];
        for(int i = 1; i < prices.length; i++) {
            //If the current price is smaller than buyingprice, than we update the buyingprice
            buyingPrice = Math.min(buyingPrice, prices[i]);
            //We compare and store the maximum profit
            profit = Math.max(profit, (prices[i] - buyingPrice));
        }
        
        return profit;
    }
}

//Time complexity : O(n) because we are iterating over the complete price array
//Space complexity : O(1) 
