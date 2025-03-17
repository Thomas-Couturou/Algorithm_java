package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1800 {
    @Test
    public void testProblem1800() {
        assertEquals(Problem1800_Maximum_Ascending_Subarray_Sum.maxAscendingSum(new int[] {10, 20, 30, 5, 10, 50}), 65);
        assertEquals(Problem1800_Maximum_Ascending_Subarray_Sum.maxAscendingSum(new int[] {10, 20, 30, 40, 50}), 150);
        assertEquals(Problem1800_Maximum_Ascending_Subarray_Sum.maxAscendingSum(new int[] {12, 17, 15, 13, 10, 11, 12}), 33);
    }
}
