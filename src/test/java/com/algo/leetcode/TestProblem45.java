package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem45 {
    @Test
    public void testProblem45() {
        int[] nums = new int[] {2, 3, 1, 1, 4};
        int result = Problem45_Jump_Game_II.jump(nums);
        assertEquals(2, result);
    }

    @Test
    public void testProblem45_2() {
        int[] nums = new int[] {2, 3, 0, 1, 4};
        int result = Problem45_Jump_Game_II.jump(nums);
        assertEquals(2, result);
    }
}
