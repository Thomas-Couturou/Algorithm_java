package com.algo.leetcode;

public class Problem1475_Final_Prices_With_a_Special_Discount_in_a_Shop {
    public static int[] finalPrices(int[] prices) {
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
