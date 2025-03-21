class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        int maxp=0;
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-prices[min];
            maxp=Math.max(maxp,profit);
            if(prices[i]<prices[min])
            {
                min=i;
            }
        }
        return maxp;
    }
}