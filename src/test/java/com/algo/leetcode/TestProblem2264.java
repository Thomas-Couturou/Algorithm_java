package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2264 {
    @Test
    public void testProblem2264(){
        assertEquals(Problem2264_Largest_3_Same_Digit_Number_in_String.largestGoodInteger("6777133339"), "777");
        assertEquals(Problem2264_Largest_3_Same_Digit_Number_in_String.largestGoodInteger("2300019"), "000");
        assertEquals(Problem2264_Largest_3_Same_Digit_Number_in_String.largestGoodInteger("42352338"), "");
    }
}
