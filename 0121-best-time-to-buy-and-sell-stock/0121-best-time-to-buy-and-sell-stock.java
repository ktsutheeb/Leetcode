class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // If no prices are given, no profit can be made.
        }
        
        int minPrice = prices[0]; // Start with the first price as the minimum price
        int maxProfit = 0; // Initialize the maximum profit as 0
        
        // Loop through the prices array to find the max profit
        for (int i = 1; i < prices.length; i++) {
            // Calculate the potential profit if we sell at the current price
            int profit = prices[i] - minPrice;
            
            // Update the maxProfit if the current profit is greater than the previous one
            maxProfit = Math.max(maxProfit, profit);
            
            // Update minPrice if the current price is lower than the previous minPrice
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return maxProfit; // Return the maximum profit
    }
}
