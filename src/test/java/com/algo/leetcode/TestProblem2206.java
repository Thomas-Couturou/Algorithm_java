package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem2206 {
    @Test
    public void testProblem2206() {
        assertTrue(Problem2206_Divide_Array_Into_Equal_Pairs.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
        assertFalse(Problem2206_Divide_Array_Into_Equal_Pairs.divideArray(new int[] {1, 2, 3, 4}));
    }
}
