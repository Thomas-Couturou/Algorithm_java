package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem26 {
    @Test
    public void testProblem26(){
        int[] nums = {1, 1, 2};
        int result = Problem26_Remove_Duplicates_From_Sorted_Array.removeDuplicates(nums);
        assertEquals(result, 2);
        assertEquals(nums[0], 1);
        assertEquals(nums[1], 2);
    }

    @Test
    public void testProblem26_2(){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = Problem26_Remove_Duplicates_From_Sorted_Array.removeDuplicates(nums);
        assertEquals(result, 5);
        assertEquals(nums[0], 0);
        assertEquals(nums[1], 1);
        assertEquals(nums[2], 2);
        assertEquals(nums[3], 3);
        assertEquals(nums[4], 4);
    }
}
