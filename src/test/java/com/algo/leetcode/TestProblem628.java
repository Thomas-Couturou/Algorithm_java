package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem628 {
    @Test
    public void testProblem628(){
        assertEquals(Problem628_Maximum_Product_of_Three_Numbers.maximumProduct(new int[]{1,2,3}), 6);
        assertEquals(Problem628_Maximum_Product_of_Three_Numbers.maximumProduct(new int[]{1,2,3,4}), 24);
        assertEquals(Problem628_Maximum_Product_of_Three_Numbers.maximumProduct(new int[]{-1,-2,-3}), -6);
    }
}
