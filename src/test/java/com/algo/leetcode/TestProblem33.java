package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem33 {
    @Test
    public void testProblem33(){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = Problem33_Search_in_Rotated_Sorted_Array.search(nums, target);
        assertEquals(result, 4);
    }

    @Test
    public void testProblem33_2(){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int result = Problem33_Search_in_Rotated_Sorted_Array.search(nums, target);
        assertEquals(result, -1);
    }

    @Test
    public void testProblem33_3(){
        int[] nums = {1};
        int target = 0;
        int result = Problem33_Search_in_Rotated_Sorted_Array.search(nums, target);
        assertEquals(result, -1);
    }
}
