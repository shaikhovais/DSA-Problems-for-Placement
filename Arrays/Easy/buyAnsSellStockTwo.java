
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        //Our simple logic is that whenever the price is greater than the price at previous day, 
        //we make the transaction and add the profit to our 'profit' variable
        
        int profit = 0;
        
        for(int currentDay = 1; currentDay < prices.length; currentDay++) {
            int previousDay = currentDay - 1;
            if(prices[currentDay] > prices[previousDay]) {
                profit += prices[currentDay] - prices[previousDay];
            }
        }
        
        return profit;
    }
}

//Time complexity : O(n) because we are iterating over the complete price array
//Space complexity : O(1) 
