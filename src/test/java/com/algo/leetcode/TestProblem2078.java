package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2078 {
    @Test
    public void testProblem2078(){
        assertEquals(Problem2078_Two_Furthest_Houses_With_Different_Colors.maxDistance(new int[] {1, 1, 1, 6, 1, 1, 1}), 3);
        assertEquals(Problem2078_Two_Furthest_Houses_With_Different_Colors.maxDistance(new int[] {1, 8, 3, 8, 3}), 4);
        assertEquals(Problem2078_Two_Furthest_Houses_With_Different_Colors.maxDistance(new int[] {0, 1}), 1);
    }
}
