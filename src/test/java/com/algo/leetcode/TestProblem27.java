package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem27 {
    @Test
    public void testProblem27(){
        int[] nums = {3, 2, 2, 3};
        int result = Problem27_Remove_Element.removeElement(nums, 3);
        assertEquals(result, 2);
        assertEquals(nums[0], 2);
        assertEquals(nums[1], 2);
    }

    @Test
    public void testProblem27_2(){
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int result = Problem27_Remove_Element.removeElement(nums, 2);
        assertEquals(result, 5);
        assertEquals(nums[0], 0);
        assertEquals(nums[1], 1);
        assertEquals(nums[2], 3);
        assertEquals(nums[3], 0);
        assertEquals(nums[4], 4);
    }

}
