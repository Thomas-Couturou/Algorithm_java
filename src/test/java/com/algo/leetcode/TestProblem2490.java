package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestProblem2490 {
    @Test
    public void testProblem2490(){
        assertTrue(Problem2490_Circular_Sentence.isCircularSentence("leetcode exercises sound delightful"));
        assertTrue(Problem2490_Circular_Sentence.isCircularSentence("eetcode"));
        assertFalse(Problem2490_Circular_Sentence.isCircularSentence("Leetcode is cool"));
    }
}
