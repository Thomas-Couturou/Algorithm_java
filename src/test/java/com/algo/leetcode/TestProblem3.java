package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3 {
    @Test
    public void testProblem3(){
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring(""), 0);
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring(" "), 1);
        assertEquals(Problem3_Longest_Substring_Without_Repeating_Characters.lengthOfLongestSubstring("abba"), 2);
    }
}
