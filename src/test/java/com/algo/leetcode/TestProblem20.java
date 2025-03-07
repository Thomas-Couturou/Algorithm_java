package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem20 {
    @Test
    public void testProblem20(){
        assertTrue(Problem20_Valid_Parentheses.isValid("()"));
        assertTrue(Problem20_Valid_Parentheses.isValid("()[]{}"));
        assertFalse(Problem20_Valid_Parentheses.isValid("(]"));
        assertFalse(Problem20_Valid_Parentheses.isValid("([)]"));
        assertFalse(Problem20_Valid_Parentheses.isValid("]"));
    }

}
