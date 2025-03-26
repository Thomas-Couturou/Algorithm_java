package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem686 {
    @Test
    public void testProblem686(){
        assertEquals(Problem686_Repeated_String_Match.repeatedStringMatch("abcd", "cdabcdab"), 3);
        assertEquals(Problem686_Repeated_String_Match.repeatedStringMatch("a", "aa"), 2);
    }
}
