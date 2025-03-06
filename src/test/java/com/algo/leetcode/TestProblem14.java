package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem14 {
    @Test
    public void testProblem14(){
        assertEquals(Problem14_Longest_Common_Prefix.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
        assertEquals(Problem14_Longest_Common_Prefix.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
    }
}
