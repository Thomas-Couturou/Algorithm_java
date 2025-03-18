package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2401 {
    @Test
    public void testProblem2401(){
        assertEquals(Problem2401_Longest_Nice_Subarray.longestNiceSubarray(new int[] {1, 3, 8, 48, 10}), 3);
        assertEquals(Problem2401_Longest_Nice_Subarray.longestNiceSubarray(new int[] {3, 1, 5, 11, 13}), 1);
    }
}
