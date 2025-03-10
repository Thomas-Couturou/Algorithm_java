package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem22 {
    @Test
    public void testProblem22(){
        List<String> result = Problem22_Generate_Parentheses.generateParenthesis(3);
        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        assertEquals(expected, result);
    }

    @Test
    public void testProblem22_2(){
        List<String> result = Problem22_Generate_Parentheses.generateParenthesis(1);
        List<String> expected = new ArrayList<>();
        expected.add("()");
        assertEquals(expected, result);
    }
}
