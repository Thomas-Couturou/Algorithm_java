package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem58 {
    @Test
    public void testProblem58(){
        assertEquals(Problem58_Length_of_Last_Word.lengthOfLastWord("Hello World"), 5);
        assertEquals(Problem58_Length_of_Last_Word.lengthOfLastWord("   fly me   to   the moon  "), 4);
        assertEquals(Problem58_Length_of_Last_Word.lengthOfLastWord("luffy is still joyboy"), 6);
    }
}
