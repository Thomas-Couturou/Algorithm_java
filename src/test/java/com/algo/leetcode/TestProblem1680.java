package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1680 {
    @Test
    public void testProblem1680(){
        assertEquals(Problem1680_Concatenation_of_Consecutive_Binary_Numbers.concatenatedBinary(1), 1);
        assertEquals(Problem1680_Concatenation_of_Consecutive_Binary_Numbers.concatenatedBinary(3), 27);
        assertEquals(Problem1680_Concatenation_of_Consecutive_Binary_Numbers.concatenatedBinary(12), 505379714);
    }
}
