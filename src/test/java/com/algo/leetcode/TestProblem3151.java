package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem3151 {
    @Test
    public void testProblem3151(){
        assertTrue(Problem3151_Special_Array_I.isArraySpecial(new int[]{1}));
        assertTrue(Problem3151_Special_Array_I.isArraySpecial(new int[]{2,1,4}));
        assertFalse(Problem3151_Special_Array_I.isArraySpecial(new int[]{4,3,1,6}));
    }
}
