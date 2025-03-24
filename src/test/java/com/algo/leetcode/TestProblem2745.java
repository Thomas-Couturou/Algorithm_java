package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2745 {
    @Test
    public void testProblem2745(){
        assertEquals(Problem2745_Construct_the_Longest_New_String.longestString(2, 5, 1), 12);
        assertEquals(Problem2745_Construct_the_Longest_New_String.longestString(3, 2, 2), 14);
    }
}
