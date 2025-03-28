package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem53 {
    @Test
    public void testProblem53(){
        assertEquals(Problem53_Maximum_Subarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        assertEquals(Problem53_Maximum_Subarray.maxSubArray(new int[]{1}), 1);
        assertEquals(Problem53_Maximum_Subarray.maxSubArray(new int[]{5,4,-1,7,8}), 23);
    }
}
