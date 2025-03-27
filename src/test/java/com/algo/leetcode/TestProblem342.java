package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem342 {
    @Test
    public void testProblem342(){
        assertTrue(Problem342_Power_of_Four.isPowerOfFour(16));
        assertFalse(Problem342_Power_of_Four.isPowerOfFour(5));
        assertTrue(Problem342_Power_of_Four.isPowerOfFour(1));
    }
}
