import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int lowest = prices[0];

        for(int i=0; i<prices.length; i++){
            profit = Math.max((prices[i]-lowest),profit);
            lowest = Math.min(prices[i],lowest);
        }
        if(profit<0){
            return 0;
        }
        else{
            return profit;
        }
    }
}