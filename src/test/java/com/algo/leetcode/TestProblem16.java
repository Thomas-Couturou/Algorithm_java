package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem16 {
    @Test
    public void testProblem16(){
        assertEquals(Problem16_3Sum_Closest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1), 2);
        assertEquals(Problem16_3Sum_Closest.threeSumClosest(new int[]{0, 0, 0}, 1), 0);
    }
}
