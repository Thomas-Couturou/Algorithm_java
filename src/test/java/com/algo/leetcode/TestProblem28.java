package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem28 {
    @Test
    public void testProblem28(){
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = Problem28_Find_the_Index_of_the_First_Occurrence_in_a_String.strStr(haystack, needle);
        assertEquals(result, 0);
    }

    @Test
    public void testProblem28_2(){
        String haystack = "leetcode";
        String needle = "leeto";
        int result = Problem28_Find_the_Index_of_the_First_Occurrence_in_a_String.strStr(haystack, needle);
        assertEquals(result, -1);
    }
}
