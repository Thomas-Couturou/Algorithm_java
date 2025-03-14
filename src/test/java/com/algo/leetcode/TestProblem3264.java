package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3264 {
    @Test
    public void testProblem3264() {
        int[] nums = Problem3264_Final_Array_State_After_K_Multiplication.getFinalState(new int[] {2, 1, 3, 5, 6}, 5, 2);
        int[] expected = new int[] {8,4,6,5,6};
        for(int i=0; i<nums.length; i++){
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void testProblem3264_2() {
        int[] nums = Problem3264_Final_Array_State_After_K_Multiplication.getFinalState(new int[] {1, 2}, 3, 4);
        int[] expected = new int[] {16, 8};
        for(int i=0; i<nums.length; i++){
            assertEquals(expected[i], nums[i]);
        }
    }
}
