package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem1952 {
    @Test
    public void testProblem1952(){
        assertFalse(Problem1952_Three_Divisors.isThree(2));
        assertTrue(Problem1952_Three_Divisors.isThree(4));
    }
}
