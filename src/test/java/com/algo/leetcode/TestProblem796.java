package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem796 {
    @Test
    public void testProblem796(){
        assertTrue(Problem796_Rotate_String.rotateString("abcde", "cdeab"));
        assertFalse(Problem796_Rotate_String.rotateString("abcde", "abced"));
    }
}
