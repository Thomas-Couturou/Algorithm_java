package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem5 {
    @Test
    public void testProblem5(){
        assertEquals(Problem5_Longest_Palindromic_Substring.longestPalindrome("babad"), "bab");
        assertEquals(Problem5_Longest_Palindromic_Substring.longestPalindrome("cbbd"), "bb");
        assertEquals(Problem5_Longest_Palindromic_Substring.longestPalindrome("a"), "a");
        assertEquals(Problem5_Longest_Palindromic_Substring.longestPalindrome("ccc"), "ccc");
    }
}
