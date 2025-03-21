package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2529 {
    @Test
    public void testProblem2529(){
        assertEquals(Problem2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer.maximumCount(new int[]{-2,-1,-1,1,2,3}), 3);
        assertEquals(Problem2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer.maximumCount(new int[]{-3,-2,-1,0,0,1,2}), 3);
        assertEquals(Problem2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer.maximumCount(new int[]{5,20,66,1314}), 4);
    }
}
