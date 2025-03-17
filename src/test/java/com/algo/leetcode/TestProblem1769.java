package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1769 {
    @Test
    public void testProblem1769() {
        String s = "110";
        int[] expected = new int[] {1, 1, 3};
        int[] result = Problem1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box.minOperations(s);
        for (int i = 0; i < s.length(); i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void testProblem1769_2() {
        String s = "001011";
        int[] expected = new int[] {11, 8, 5, 4, 3, 4};
        int[] result = Problem1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box.minOperations(s);
        for (int i = 0; i < s.length(); i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
