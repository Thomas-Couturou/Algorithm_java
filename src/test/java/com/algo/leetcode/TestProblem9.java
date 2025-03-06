package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem9 {
    @Test
    public void testProblem9(){
        assertTrue(Problem9_Palindrome_Number.isPalindrome(121));
        assertFalse(Problem9_Palindrome_Number.isPalindrome(-121));
        assertFalse(Problem9_Palindrome_Number.isPalindrome(10));
    }
}
