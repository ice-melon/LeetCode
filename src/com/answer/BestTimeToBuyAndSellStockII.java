package com.answer;

/**
 * Created by chiang on 14-11-2.
 */
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        boolean hasMoney = true;
        int profit = 0;
        int buyPrice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (hasMoney) {
                if (prices[i + 1] > prices[i]) {
                    hasMoney = false;
                    buyPrice = prices[i];
                }
            }else {
                if (prices[i + 1] < prices[i]) {
                    profit += prices[i] - buyPrice;
                    hasMoney = true;
                }
            }
        }

        //
        if (!hasMoney){
            profit += prices[prices.length - 1] - buyPrice;
        }

        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int d = prices[i] - prices[i - 1];
            if (d > 0) {
                profit += d;
            }
        }
        return profit;
    }
}
