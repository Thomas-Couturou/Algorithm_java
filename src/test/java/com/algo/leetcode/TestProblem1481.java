package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1481 {
    @Test
    public void testProblem1481(){
        assertEquals(Problem1481_Least_Number_of_Unique_Integers_after_K_Removals.findLeastNumOfUniqueInts(new int[]{5,5,4}, 1), 1);
        assertEquals(Problem1481_Least_Number_of_Unique_Integers_after_K_Removals.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3), 2);
    }
}
