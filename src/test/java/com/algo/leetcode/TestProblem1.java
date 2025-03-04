package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1 {
    @Test
    public void testProblem1(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problem1_two_sum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testProblem1_2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = Problem1_two_sum.twoSumWithHashMap(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testProblem1_3(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = Problem1_two_sum.twoSumWithHashMap(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testProblem1WithHashMap(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problem1_two_sum.twoSumWithHashMap(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testProblem1WithHashMap_2(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = Problem1_two_sum.twoSumWithHashMap(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testProblem1WithHashMap_3(){
        int[] nums = {3,3};
        int target = 6;
        int[] result = Problem1_two_sum.twoSumWithHashMap(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}
