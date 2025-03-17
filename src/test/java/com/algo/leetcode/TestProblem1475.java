package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1475 {
    @Test
    public void testProblem1475() {
        int[] prices = new int[] {8, 4, 6, 2, 3};
        int[] expected = new int[] {4, 2, 4, 2, 3};
        int[] result = Problem1475_Final_Prices_With_a_Special_Discount_in_a_Shop.finalPrices(prices);
        for (int i = 0; i < prices.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testProblem1475_2() {
        int[] prices = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        int[] result = Problem1475_Final_Prices_With_a_Special_Discount_in_a_Shop.finalPrices(prices);
        for (int i = 0; i < prices.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testProblem1475_3() {
        int[] prices = new int[] {10, 1, 1, 6};
        int[] expected = new int[] {9, 0, 1, 6};
        int[] result = Problem1475_Final_Prices_With_a_Special_Discount_in_a_Shop.finalPrices(prices);
        for (int i = 0; i < prices.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
