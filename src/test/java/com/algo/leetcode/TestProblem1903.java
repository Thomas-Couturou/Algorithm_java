package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1903 {
    @Test
    public void testProblem1903(){
        assertEquals(Problem1903_Largest_Odd_Number_in_String.largestOddNumber("52"), "5");
        assertEquals(Problem1903_Largest_Odd_Number_in_String.largestOddNumber("4206"), "");
        assertEquals(Problem1903_Largest_Odd_Number_in_String.largestOddNumber("35427"), "35427");
    }
}
