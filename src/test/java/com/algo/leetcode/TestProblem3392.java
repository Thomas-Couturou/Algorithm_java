package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3392 {
    @Test
    public void testProblem3392(){
        assertEquals(Problem3392_Count_Subarrays_of_Length_Three_With_a_Condition.countSubarrays(new int[]{1,2,1,4,1}), 1);
        assertEquals(Problem3392_Count_Subarrays_of_Length_Three_With_a_Condition.countSubarrays(new int[]{1,1,1}), 0);
    }
}
