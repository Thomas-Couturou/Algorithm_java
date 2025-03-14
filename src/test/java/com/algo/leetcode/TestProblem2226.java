package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2226 {
    @Test
    public void testProblem2226() {
         assertEquals(Problem2226_Maximum_Candies_Allocated_to_K_Children.maximumCandies(new int[] {5, 8, 6}, 3), 5);
         assertEquals(Problem2226_Maximum_Candies_Allocated_to_K_Children.maximumCandies(new int[] {2, 5}, 11), 0);
    }
}
