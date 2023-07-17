/*
 * Problem Link :https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
 */

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int lowPrice = prices[0];
    int highPrice = prices[0];
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (lowPrice > prices[i]) {
        lowPrice = prices[i];
        highPrice = prices[i];
      } else if (highPrice < prices[i]) {
        highPrice = prices[i];
      }

      maxProfit = Math.max(maxProfit, highPrice - lowPrice);
    }

    return maxProfit;
  }

  public int maxProfitOptimalSolution(int[] prices) {
    int buyPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buyPrice) {
        buyPrice = prices[i];
      }

      maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
    }

    return maxProfit;
  }
}