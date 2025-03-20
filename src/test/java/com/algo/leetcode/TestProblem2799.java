package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2799 {
    @Test
    public void testProblem2799(){
        assertEquals(Problem2799_Count_Complete_Subarray_in_an_Array.countCompleteSubarrays(new int[]{1,3,1,2,2}), 4);
        assertEquals(Problem2799_Count_Complete_Subarray_in_an_Array.countCompleteSubarrays(new int[]{5,5,5,5}), 10);
    }
}
