package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem209 {
    @Test
    public void testProblem209(){
        assertEquals(Problem209_Minimum_Size_Subarray_Sum.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}), 2);
        assertEquals(Problem209_Minimum_Size_Subarray_Sum.minSubArrayLen(4, new int[] {1, 4, 4}), 1);
        assertEquals(Problem209_Minimum_Size_Subarray_Sum.minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}), 0);
    }
}
