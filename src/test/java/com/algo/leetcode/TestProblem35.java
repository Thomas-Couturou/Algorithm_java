package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem35 {
    @Test
    public void testProblem35(){
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = Problem35_Search_Insert_Position.searchInsert(nums, target);
        assertEquals(result, 2);
    }

    @Test
    public void testProblem35_2(){
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = Problem35_Search_Insert_Position.searchInsert(nums, target);
        assertEquals(result, 1);
    }

    @Test
    public void testProblem35_3(){
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = Problem35_Search_Insert_Position.searchInsert(nums, target);
        assertEquals(result, 4);
    }
}
