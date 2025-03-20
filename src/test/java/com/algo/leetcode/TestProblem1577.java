package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1577 {
    @Test
    public void testProblem1577(){
        assertEquals(Problem1577_Number_of_Ways_Where_Square_Equal_Product_Two_Numbers.numTriplets(new int[]{7,4}, new int[]{5,2,8,9}), 1);
        assertEquals(Problem1577_Number_of_Ways_Where_Square_Equal_Product_Two_Numbers.numTriplets(new int[]{1,1}, new int[]{1,1,1}), 9);
        assertEquals(Problem1577_Number_of_Ways_Where_Square_Equal_Product_Two_Numbers.numTriplets(new int[]{7,7,8,3}, new int[]{1,2,9,7}), 2);
    }
}
