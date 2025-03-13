package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem41 {
    @Test
    public void testProblem41() {
        int[] nums = new int[] {1, 2, 0};
        int result = Problem41_First_Missing_Positive.firstMissingPositive(nums);
        assertEquals(3, result);
    }

    @Test
    public void testProblem41_2() {
        int[] nums = new int[] {3, 4, -1, 1};
        int result = Problem41_First_Missing_Positive.firstMissingPositive(nums);
        assertEquals(2, result);
    }

    @Test
    public void testProblem41_3() {
        int[] nums = new int[] {7, 8, 9, 11, 12};
        int result = Problem41_First_Missing_Positive.firstMissingPositive(nums);
        assertEquals(1, result);
    }
}
